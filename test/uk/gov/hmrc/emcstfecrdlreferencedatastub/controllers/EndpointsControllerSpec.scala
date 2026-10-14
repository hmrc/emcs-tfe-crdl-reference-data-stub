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

class EndpointsControllerSpec extends AnyWordSpec with Matchers {
  private val urlStem = "/emcs-tfe-reference-data/oracle"

  private val controller = new EndpointsController(Helpers.stubControllerComponents())

  "POST cn-code-information" should {
    "return 200 for a valid request" in {
      val request = FakeRequest[CnInformationRequest](
        "POST",
        s"$urlStem/cn-code-information",
        headers = FakeHeaders(),
        body = CnInformationRequest(
          items = List(CnInformationItem("B000", "22030010"), CnInformationItem("B000", "22060059"))
        )
      )
      val result = controller.postCNCodeInfo()(request)
      status(result) shouldBe Status.OK
    }
  }

  "GET packaging-types" should {
    "return 200 for a valid request when isCountable isn't specified" in {
      val request = FakeRequest("GET", s"$urlStem/packaging-types")
      val result = controller.getPackagingTypes(isCountable = None)(request)
      status(result) shouldBe Status.OK
    }

    "return 200 for a valid request when isCountable is true" in {
      val request = FakeRequest("GET", s"$urlStem/packaging-types?isCountable=true")
      val result = controller.getPackagingTypes(isCountable = Some(true))(request)
      status(result) shouldBe Status.OK
    }
  }

  "POST packaging-types" should {
    "return 200 for a valid request" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/packaging-types",
        headers = FakeHeaders(),
        body = List("TY", "BO")
      )
      val result = controller.postPackagingTypes()(request)
      status(result) shouldBe Status.OK
    }
  }

  "GET wine-operations" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/wine-operations")
      val result = controller.getWineOperations()(request)
      status(result) shouldBe Status.OK
    }
  }

  "POST wine-operations" should {
    "return 200 for a valid request" in {
      val request = FakeRequest[List[String]](
        "POST",
        s"$urlStem/wine-operations",
        headers = FakeHeaders(),
        body = List("2", "3", "7", "9")
      )
      val result = controller.postWineOperations()(request)
      status(result) shouldBe Status.OK
    }
  }

  "GET member-states" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/member-states")
      val result = controller.getMemberStates()(request)
      status(result) shouldBe Status.OK
    }
  }

  "GET member-states-and-countries" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/member-states-and-countries")
      val result = controller.getMemberStatesAndCountries()(request)
      status(result) shouldBe Status.OK
    }
  }

  "GET type-of-document" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/type-of-document")
      val result = controller.getTypeOfDocument()(request)
      status(result) shouldBe Status.OK
    }
  }

  "GET cn-codes/:exciseProductCode" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/cn-codes/B000")
      val result = controller.getCNCode("B000")(request)
      status(result) shouldBe Status.OK
    }
  }

  "GET epc-codes" should {
    "return 200 for a valid request" in {
      val request = FakeRequest("GET", s"$urlStem/epc-codes")
      val result = controller.getExciseProductCodes()(request)
      status(result) shouldBe Status.OK
    }
  }

}
