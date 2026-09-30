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
import play.api.mvc.{Action, AnyContent, ControllerComponents, Result}
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.CnInformationRequest
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.ErrorResponse.NoDataReturnedFromDatabaseError
import uk.gov.hmrc.emcstfecrdlreferencedatastub.service.JsonFileReaderService
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController

import javax.inject.Inject
import javax.inject.Singleton
import scala.util.{Success, Try}

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

  def postCNCodeInfo: Action[CnInformationRequest] =
    Action(parse.json[CnInformationRequest](using CnInformationRequest.reads)) { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchCNCodeInfoJsonForPost(request.body.items))
    }

  def getPackagingTypes(isCountable: Option[Boolean]): Action[AnyContent] =
    Action { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchPackagingTypesJsonForGet(maybeIsCountable = isCountable))
    }

  def postPackagingTypes: Action[List[String]] =
    Action(parse.json[List[String]](using Reads.of[List[String]])) { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchPackagingTypesJsonForPost(packagingTypeCodes = request.body))
    }

  def getWineOperations: Action[AnyContent] =
    Action { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchWineOperationsJsonForGet())
    }

  def postWineOperations: Action[List[String]] =
    Action(parse.json[List[String]](using Reads.of[List[String]])) { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchWineOperationsJsonForPost(filterKeys = request.body))
    }

  def getMemberStates: Action[AnyContent] =
    Action { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchMemberStatesJson())
    }

  def getMemberStatesAndCountries: Action[AnyContent] =
    Action { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchMemberStatesAndCountriesJson())
    }

  def getTransportUnits: Action[AnyContent] =
    Action { implicit request =>
      okOrError(Success(None)) // no json exists as no stub data needed for current tests
    }

  def getTypeOfDocument: Action[AnyContent] =
    Action { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchTypeOfDocumentJson())
    }

  def getCNCode(exciseProductCode: String): Action[AnyContent] =
    Action { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchCNCodeJsonForGet(exciseProductCode))
    }

  def getExciseProductCodes: Action[AnyContent] =
    Action { implicit request =>
      okOrError(jsonFileReaderService.maybeFetchExciseProductCodesJson())
    }
}
