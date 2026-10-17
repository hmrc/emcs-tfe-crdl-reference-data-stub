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

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import play.api.http.Status
import play.api.test.{FakeHeaders, FakeRequest, Helpers}
import play.api.test.Helpers.*
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.{CnInformationItem, CnInformationRequest}
import uk.gov.hmrc.emcstfecrdlreferencedatastub.responseBodies.*
import org.scalatest.concurrent.ScalaFutures.convertScalaFuture
import play.api.mvc.Results.Ok

class EndpointsControllerSpec extends AnyWordSpec with Matchers {
  private val urlStem = "/emcs-tfe-reference-data/oracle"

  private val controller = new EndpointsController(Helpers.stubControllerComponents())

  "POST cn-code-information" should {
    "return 200 for a valid request with (B000, 22030001)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22030001"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_B000_22030001)
    }

    "return 200 for a valid request with (B000, 22030009)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22030009"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_B000_22030009)
    }

    "return 200 for a valid request with (B000, 22030010)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22030010"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_B000_22030010)
    }

    "return 200 for a valid request with (B000, 22030010), (B000, 22060059)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22030010"), CnInformationItem("B000", "22060059"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_B000_22030010_B000_22060059)
    }

    "return 200 for a valid request with (B000, 22060039)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22060039"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_B000_22060039)
    }

    "return 200 for a valid request with (B000, 22060059)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22060059"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_B000_22060059)
    }

    "return 200 for a valid request with (B000, 22060059), (W200, 22042108)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22060059"), CnInformationItem("W200", "22042108"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_B000_22060059_W200_22042108)
    }

    "return 200 for a valid request with (E420, 27101231)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("E420", "27101231"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_E420_27101231)
    }

    "return 200 for a valid request with (E420, 27101231), (B000, 22030009)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("E420", "27101231"), CnInformationItem("B000", "22030009"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_E420_27101231_B000_22030009)
    }

    "return 200 for a valid request with (E430, 27102019)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("E430", "27102019"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_E430_27102019)
    }

    "return 200 for a valid request with (E500, 27111391)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("E500", "27111391"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_E500_27111391)
    }

    "return 200 for a valid request with (I000, 22042189)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("I000", "22042189"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_I000_22042189)
    }

    "return 200 for a valid request with (S200, 22089077)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("S200", "22089077"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_S200_22089077)
    }

    "return 200 for a valid request with (S500, 10000000)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("S500", "10000000"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_S500_10000000)
    }

    "return 200 for a valid request with (T200, 24029000)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("T200", "24029000"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_T200_24029000)
    }

    "return 200 for a valid request with (T300, 24021000)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("T300", "24021000"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_T300_24021000)
    }

    "return 200 for a valid request with (T400, 24029000)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("T400", "24029000"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_T400_24029000)
    }

    "return 200 for a valid request with (W200, 22042108)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("W200", "22042108"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_W200_22042108)
    }

    "return 200 for a valid request with (W300, 22041098), (W300, 22041098)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("W300", "22041098"), CnInformationItem("W300", "22041098"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_W300_22041098_W300_22041098)
    }

    "return 200 for a valid request with (W300, 22060031), (W300, 22041091)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("W300", "22060031"), CnInformationItem("W300", "22041091"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_W300_22060031_W300_22041091)
    }

    "return 200 for a valid request with (W300, 22060039)" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("W300", "22060039"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe Ok(bodyForPostCnCodeInformation_W300_22060039)
    }

    "return error for a valid request with an unknown parameter value" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("bad", "bad"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      result.futureValue shouldBe noDataError
    }
  }

  "GET packaging-types" should {
    "return 200 for a valid request when isCountable isn't specified" in {
      val request = FakeRequest("GET", s"$urlStem/packaging-types")
      val result = controller.getPackagingTypes(isCountable = None)(request)
      result.futureValue shouldBe Ok(bodyForGetPackagingTypes)
    }

    "return 200 for a valid request when isCountable is true" in {
      val request = FakeRequest("GET", s"$urlStem/packaging-types?isCountable=true")
      val result = controller.getPackagingTypes(isCountable = Some(true))(request)
      result.futureValue shouldBe Ok(bodyForGetPackagingTypes_isCountable_true)
    }

    "return error for a valid request with an unknown parameter value" in {
      val request = FakeRequest("GET", s"$urlStem/packaging-types?isCountable=false")
      val result = controller.getPackagingTypes(isCountable = Some(false))(request)
      result.futureValue shouldBe noDataError
    }
  }

  "POST packaging-types" should {
    "return 200 for a valid request with BO" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/packaging-types",
        headers = FakeHeaders(),
        body = List("BO")
      )
      val result = controller.postPackagingTypes()(request)
      result.futureValue shouldBe Ok(bodyForPostPackagingTypes_BO)
    }

    "return 200 for a valid request with TY" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/packaging-types",
        headers = FakeHeaders(),
        body = List("TY")
      )
      val result = controller.postPackagingTypes()(request)
      result.futureValue shouldBe Ok(bodyForPostPackagingTypes_TY)
    }

    "return 200 for a valid request with TY, BO" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/packaging-types",
        headers = FakeHeaders(),
        body = List("TY", "BO")
      )
      val result = controller.postPackagingTypes()(request)
      result.futureValue shouldBe Ok(bodyForPostPackagingTypes_TY_BO)
    }

    "return 200 for a valid request with VG, VQ, VL, VY, VR, VO, NE" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/packaging-types",
        headers = FakeHeaders(),
        body = List("VG", "VQ", "VL", "VY", "VR", "VO", "NE")
      )
      val result = controller.postPackagingTypes()(request)
      result.futureValue shouldBe Ok(bodyForPostPackagingTypes_VG_VQ_VL_VY_VR_VO_NE)
    }

    "return error for a valid request with an unknown parameter value" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/packaging-types",
        headers = FakeHeaders(),
        body = List()
      )
      val result = controller.postPackagingTypes()(request)
      result.futureValue shouldBe noDataError
    }
  }

  "GET wine-operations" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/wine-operations")
      val result = controller.getWineOperations()(request)
      result.futureValue shouldBe Ok(bodyForGetWineOperations)
    }
  }

  "POST wine-operations" should {
    "return 200 for a valid request with 2, 3, 7, 9" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/wine-operations",
        headers = FakeHeaders(),
        body = List("2", "3", "7", "9")
      )
      val result = controller.postWineOperations()(request)
      result.futureValue shouldBe Ok(bodyForPostWineOperations_2_3_7_9)
    }

    "return 200 for a valid request with 4, 5, 0, 1" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/wine-operations",
        headers = FakeHeaders(),
        body = List("4", "5", "0", "1")
      )
      val result = controller.postWineOperations()(request)
      result.futureValue shouldBe Ok(bodyForPostWineOperations_4_5_0_1)
    }

    "return error for a valid request with an unknown parameter value" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/wine-operations",
        headers = FakeHeaders(),
        body = List()
      )
      val result = controller.postWineOperations()(request)
      result.futureValue shouldBe noDataError
    }
  }

  "GET member-states" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/member-states")
      val result = controller.getMemberStates()(request)
      result.futureValue shouldBe Ok(bodyForGetMemberStates)
    }
  }

  "GET member-states-and-countries" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/member-states-and-countries")
      val result = controller.getMemberStatesAndCountries()(request)
      result.futureValue shouldBe Ok(bodyForGetMemberStatesAndCountries)
    }
  }

  "GET transport-units" should {
    "return error for a valid request with an unknown parameter value" in {
      val request = FakeRequest("GET", s"$urlStem/transport-units")
      val result = controller.getTransportUnits()(request)
      result.futureValue shouldBe noDataError
    }
  }

  "GET type-of-document" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/type-of-document")
      val result = controller.getTypeOfDocument()(request)
      result.futureValue shouldBe Ok(bodyForGetTypeOfDocument)
    }
  }

  "GET cn-codes/:exciseProductCode" should {
    "return 200 for a valid request with B000" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/B000")
      val result = controller.getCNCode("B000")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_B000)
    }

    "return 200 for a valid request with E430" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/E430")
      val result = controller.getCNCode("E430")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_E430)
    }

    "return 200 for a valid request with E500" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/E500")
      val result = controller.getCNCode("E500")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_E500)
    }

    "return 200 for a valid request with I000" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/I000")
      val result = controller.getCNCode("I000")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_I000)
    }

    "return 200 for a valid request with S200" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/S200")
      val result = controller.getCNCode("S200")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_S200)
    }

    "return 200 for a valid request with S500" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/S500")
      val result = controller.getCNCode("S500")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_S500)
    }

    "return 200 for a valid request with T300" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/T300")
      val result = controller.getCNCode("T300")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_T300)
    }

    "return 200 for a valid request with T400" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/T400")
      val result = controller.getCNCode("T400")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_T400)
    }

    "return 200 for a valid request with W200" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/W200")
      val result = controller.getCNCode("W200")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_W200)
    }

    "return 200 for a valid request with W300" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/W300")
      val result = controller.getCNCode("W300")(request)
      result.futureValue shouldBe Ok(bodyForGetCnCodes_W300)
    }

    "return error for a valid request with an unknown parameter value" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/bad")
      val result = controller.getCNCode("bad")(request)
      result.futureValue shouldBe noDataError
    }
  }

  "GET epc-codes" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/epc-codes")
      val result = controller.getExciseProductCodes()(request)
      result.futureValue shouldBe Ok(bodyForGetEpcCodes)
    }
  }

}
