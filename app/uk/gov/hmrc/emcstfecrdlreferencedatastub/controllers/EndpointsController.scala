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

import play.api.libs.json.Reads
import play.api.mvc.{Action, AnyContent, ControllerComponents}
import play.api.mvc.Results.InternalServerError
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.{CnInformationItem, CnInformationRequest}
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.ErrorResponse.NoDataReturnedFromDatabaseError
import uk.gov.hmrc.emcstfecrdlreferencedatastub.responseBodies.*
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController

import javax.inject.Inject
import javax.inject.Singleton
import play.api.libs.json.Json as PlayJson

val noDataError = InternalServerError(PlayJson.toJson(NoDataReturnedFromDatabaseError))

@Singleton()
class EndpointsController @Inject()(
  cc: ControllerComponents
) extends BackendController(cc) {

  def postCNCodeInfo: Action[CnInformationRequest] =
    Action(parse.json[CnInformationRequest](using CnInformationRequest.reads)) { implicit request =>
      request.body.items match {
        case List(CnInformationItem("B000", "22030001")) => Ok(bodyForPostCnCodeInformation_B000_22030001)
        case List(CnInformationItem("B000", "22030009")) => Ok(bodyForPostCnCodeInformation_B000_22030009)
        case List(CnInformationItem("B000", "22030010")) => Ok(bodyForPostCnCodeInformation_B000_22030010)
        case List(CnInformationItem("B000", "22030010"), CnInformationItem("B000", "22060059")) =>
          Ok(bodyForPostCnCodeInformation_B000_22030010_B000_22060059)
        case List(CnInformationItem("B000", "22060039")) => Ok(bodyForPostCnCodeInformation_B000_22060039)
        case List(CnInformationItem("B000", "22060059")) => Ok(bodyForPostCnCodeInformation_B000_22060059)
        case List(CnInformationItem("B000", "22060059"), CnInformationItem("W200", "22042108")) =>
          Ok(bodyForPostCnCodeInformation_B000_22060059_W200_22042108)
        case List(CnInformationItem("E420", "27101231")) => Ok(bodyForPostCnCodeInformation_E420_27101231)
        case List(CnInformationItem("E420", "27101231"), CnInformationItem("B000", "22030009")) =>
          Ok(bodyForPostCnCodeInformation_E420_27101231_B000_22030009)
        case List(CnInformationItem("E430", "27102019")) => Ok(bodyForPostCnCodeInformation_E430_27102019)
        case List(CnInformationItem("E500", "27111391")) => Ok(bodyForPostCnCodeInformation_E500_27111391)
        case List(CnInformationItem("I000", "22042189")) => Ok(bodyForPostCnCodeInformation_I000_22042189)
        case List(CnInformationItem("S200", "22089077")) => Ok(bodyForPostCnCodeInformation_S200_22089077)
        case List(CnInformationItem("S500", "10000000")) => Ok(bodyForPostCnCodeInformation_S500_10000000)
        case List(CnInformationItem("T200", "24029000")) => Ok(bodyForPostCnCodeInformation_T200_24029000)
        case List(CnInformationItem("T300", "24021000")) => Ok(bodyForPostCnCodeInformation_T300_24021000)
        case List(CnInformationItem("T400", "24029000")) => Ok(bodyForPostCnCodeInformation_T400_24029000)
        case List(CnInformationItem("W200", "22042108")) => Ok(bodyForPostCnCodeInformation_W200_22042108)
        case List(CnInformationItem("W300", "22041098"), CnInformationItem("W300", "22041098")) =>
          Ok(bodyForPostCnCodeInformation_W300_22041098_W300_22041098)
        case List(CnInformationItem("W300", "22060031"), CnInformationItem("W300", "22041091")) =>
          Ok(bodyForPostCnCodeInformation_W300_22060031_W300_22041091)
        case List(CnInformationItem("W300", "22060039")) => Ok(bodyForPostCnCodeInformation_W300_22060039)
        case _ => noDataError
      }
    }

  def getPackagingTypes(isCountable: Option[Boolean]): Action[AnyContent] =
    Action { implicit request =>
      isCountable match {
        case None => Ok(bodyForGetPackagingTypes)
        case Some(true) => Ok(bodyForGetPackagingTypes_isCountable_true)
        case _ => noDataError
      }
    }

  def postPackagingTypes: Action[List[String]] =
    Action(parse.json[List[String]](using Reads.of[List[String]])) { implicit request =>
      request.body match {
        case List("BO") => Ok(bodyForPostPackagingTypes_BO)
        case List("TY") => Ok(bodyForPostPackagingTypes_TY)
        case List("TY", "BO") => Ok(bodyForPostPackagingTypes_TY_BO)
        case List("VG", "VQ", "VL", "VY", "VR", "VO", "NE") =>
          Ok(bodyForPostPackagingTypes_VG_VQ_VL_VY_VR_VO_NE)
        case _ => noDataError
      }
    }

  def getWineOperations: Action[AnyContent] =
    Action { implicit request =>
      Ok(bodyForGetWineOperations)
    }

  def postWineOperations: Action[List[String]] =
    Action(parse.json[List[String]](using Reads.of[List[String]])) { implicit request =>
      request.body match {
        case List("2", "3", "7", "9") => Ok(bodyForPostWineOperations_2_3_7_9)
        case List("4", "5", "0", "1") => Ok(bodyForPostWineOperations_4_5_0_1)
        case _ => noDataError
      }
    }

  def getMemberStates: Action[AnyContent] =
    Action { implicit request =>
      Ok(bodyForGetMemberStates)
    }

  def getMemberStatesAndCountries: Action[AnyContent] =
    Action { implicit request =>
      Ok(bodyForGetMemberStatesAndCountries)
    }

  def getTransportUnits: Action[AnyContent] =
    Action { implicit request =>
      noDataError // currently no JSON exists for this endpoint as no stub data needed for current tests
    }

  def getTypeOfDocument: Action[AnyContent] =
    Action { implicit request =>
      Ok(bodyForGetTypeOfDocument)
    }

  def getCNCode(exciseProductCode: String): Action[AnyContent] =
    Action { implicit request =>
      exciseProductCode match {
        case "B000" => Ok(bodyForGetCnCodes_B000)
        case "E430" => Ok(bodyForGetCnCodes_E430)
        case "E500" => Ok(bodyForGetCnCodes_E500)
        case "I000" => Ok(bodyForGetCnCodes_I000)
        case "S200" => Ok(bodyForGetCnCodes_S200)
        case "S500" => Ok(bodyForGetCnCodes_S500)
        case "T300" => Ok(bodyForGetCnCodes_T300)
        case "T400" => Ok(bodyForGetCnCodes_T400)
        case "W200" => Ok(bodyForGetCnCodes_W200)
        case "W300" => Ok(bodyForGetCnCodes_W300)
        case _ => noDataError
      }
    }

  def getExciseProductCodes: Action[AnyContent] =
    Action { implicit request =>
      Ok(bodyForGetEpcCodes)
    }
}
