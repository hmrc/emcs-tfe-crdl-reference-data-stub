/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.emcstfecrdlreferencedatastub.controllers

import play.api.libs.json.{JsValue, Json, Reads}
import play.api.mvc.{Action, AnyContent, ControllerComponents, Request, Result}
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.CnInformationRequest
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.ErrorResponse.NoDataReturnedFromDatabaseError
import uk.gov.hmrc.emcstfecrdlreferencedatastub.service.JsonFileReaderService
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController

import javax.inject.Inject
import javax.inject.Singleton
import scala.annotation.unused
import scala.util.Try

@Singleton()
class EndpointsController @Inject()(
  jsonFileReaderService: JsonFileReaderService,
  cc: ControllerComponents
) extends BackendController(cc) {

  private def okOrError(maybeJsonTry: Try[Option[JsValue]]): Result =
    maybeJsonTry.map { maybeJson =>
      maybeJson
        .map(Ok(_))
        .getOrElse(InternalServerError(Json.toJson(NoDataReturnedFromDatabaseError)))
    }.get

  def genFilename(request: Request[?], bodyParams: List[String]): String = {
    val replacedPath = request.path.stripPrefix("/emcs-tfe-reference-data/oracle/").replace("/", "_")
    val queryParamList = request.queryString.map((k, v) => (k +: v).mkString("-")).toList
    (List(request.method, replacedPath) ++ queryParamList ++ bodyParams).mkString("_") + ".json"
  }

  def makeResponse(request: Request[?], bodyParams: List[String] = List()): Result =
    okOrError(jsonFileReaderService.maybeFetchResponseJson(genFilename(request, bodyParams)))

  def postCNCodeInfo: Action[CnInformationRequest] =
    Action(parse.json[CnInformationRequest](using CnInformationRequest.reads)) { implicit request =>
      makeResponse(request, bodyParams = request.body.items.map(_.toString))
    }

  def getPackagingTypes(@unused isCountable: Option[Boolean]): Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request)
    }

  def postPackagingTypes: Action[List[String]] =
    Action(parse.json[List[String]](using Reads.of[List[String]])) { implicit request =>
      makeResponse(request, bodyParams = request.body)
    }

  def getWineOperations: Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request)
    }

  def postWineOperations: Action[List[String]] =
    Action(parse.json[List[String]](using Reads.of[List[String]])) { implicit request =>
      makeResponse(request, bodyParams = request.body)
    }

  def getMemberStates: Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request)
    }

  def getMemberStatesAndCountries: Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request)
    }

  def getTransportUnits: Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request) // currently no json exists for this endpoint as no stub data needed for current tests
    }

  def getTypeOfDocument: Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request)
    }

  def getCNCode(@unused exciseProductCode: String): Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request) // we don't send params here as exciseProductCode is part of the request.path
    }

  def getExciseProductCodes: Action[AnyContent] =
    Action { implicit request =>
      makeResponse(request)
    }
}
