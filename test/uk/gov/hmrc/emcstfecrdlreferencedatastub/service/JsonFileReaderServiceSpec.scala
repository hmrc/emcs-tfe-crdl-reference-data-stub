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

package uk.gov.hmrc.emcstfecrdlreferencedatastub.service

import org.mockito.Mockito.{reset, when}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.mockito.MockitoSugar.mock
import play.api.libs.json.Json

import java.io.FileNotFoundException
import org.scalatest.BeforeAndAfterEach
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.CnInformationItem

import scala.util.{Failure, Success}

class JsonFileReaderServiceSpec extends AnyWordSpec with Matchers with BeforeAndAfterEach {
  private val pathStem = "resources/responseBodies"

  private val validJson = """{ "key": "value" }"""
  val mockFileReader: FileReader = mock[FileReader]

  override def beforeEach(): Unit = {
    reset(mockFileReader)
  }

  "JsonFileReaderServiceSpec.maybeFetchCNCodeInfoJsonForPost" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/cn-code-information_B000-22030010_B000-22060059.json"))
        .thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val cnInformationItems = List(CnInformationItem("B000", "22030010"), CnInformationItem("B000", "22060059"))
      val result = service.maybeFetchCNCodeInfoJsonForPost(cnInformationItems = cnInformationItems)
      result shouldBe Success(Some(Json.parse(validJson)))
    }

    "return None when JSON file doesn't exist for given parameters" in {
      when(mockFileReader.read(s"$pathStem/cn-code-information_bad-bad_bad-bad.json"))
        .thenReturn(Failure(new FileNotFoundException("Simulated missing file")))
      val service = new JsonFileReaderService(mockFileReader)
      val cnInformationItems = List(CnInformationItem("bad", "bad"), CnInformationItem( "bad", "bad"))
      val result = service.maybeFetchCNCodeInfoJsonForPost(cnInformationItems = cnInformationItems)
      result shouldBe Success(None)
    }
  }

  "JsonFileReaderServiceSpec.maybeFetchCNCodeJsonForGet" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/cn-codes_B000.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchCNCodeJsonForGet(exciseProductCode = "B000")
      result shouldBe Success(Some(Json.parse(validJson)))
    }

    "return None when JSON file doesn't exist for given parameters" in {
      when(mockFileReader.read(s"$pathStem/cn-codes_bad.json"))
        .thenReturn(Failure(new FileNotFoundException("Simulated missing file")))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchCNCodeJsonForGet(exciseProductCode = "bad")
      result shouldBe Success(None)
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchExciseProductCodesJson" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/epc-codes.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchExciseProductCodesJson()
      result shouldBe Success(Some(Json.parse(validJson)))
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchMemberStatesAndCountriesJson" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/member-states-and-countries.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchMemberStatesAndCountriesJson()
      result shouldBe Success(Some(Json.parse(validJson)))
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchMemberStatesJson" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/member-states.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchMemberStatesJson()
      result shouldBe Success(Some(Json.parse(validJson)))
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchPackagingTypesJsonForGet" should {
    "read and parse JSON when maybeIsCountable = None" in {
      when(mockFileReader.read(s"$pathStem/packaging-types.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchPackagingTypesJsonForGet(maybeIsCountable = None)
      result shouldBe Success(Some(Json.parse(validJson)))
    }

    "read and parse JSON when maybeIsCountable = Some(true)" in {
      when(mockFileReader.read(s"$pathStem/packaging-types_isCountable-true.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchPackagingTypesJsonForGet(maybeIsCountable = Some(true))
      result shouldBe Success(Some(Json.parse(validJson)))
    }

    "return None when JSON file doesn't exist for given parameters" in {
      when(mockFileReader.read(s"$pathStem/packaging-types_isCountable-false.json"))
        .thenReturn(Failure(new FileNotFoundException("Simulated missing file")))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchPackagingTypesJsonForGet(maybeIsCountable = Some(false))
      result shouldBe Success(None)
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchPackagingTypesJsonForPost" should {
    "read and parse JSON when packagingTypeCodes has expected values" in {
      when(mockFileReader.read(s"$pathStem/packaging-types_TY-BO.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchPackagingTypesJsonForPost(packagingTypeCodes = List("TY", "BO"))
      result shouldBe Success(Some(Json.parse(validJson)))
    }

    "return None when JSON file doesn't exist for given parameters" in {
      when(mockFileReader.read(s"$pathStem/packaging-types_bad-bad.json"))
        .thenReturn(Failure(new FileNotFoundException("Simulated missing file")))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchPackagingTypesJsonForPost(packagingTypeCodes = List("bad", "bad"))
      result shouldBe Success(None)
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchTypeOfDocumentJson" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/type-of-document.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchTypeOfDocumentJson()
      result shouldBe Success(Some(Json.parse(validJson)))
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchWineOperationsJsonForGet" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/wine-operations.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchWineOperationsJsonForGet()
      result shouldBe Success(Some(Json.parse(validJson)))
    }
  }
  
  "JsonFileReaderServiceSpec.maybeFetchWineOperationsJsonForPost" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/wine-operations_2-3-7-9.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchWineOperationsJsonForPost(filterKeys = List("2", "3", "7", "9"))
      result shouldBe Success(Some(Json.parse(validJson)))
    }

    "return None when JSON file doesn't exist for given parameters" in {
      when(mockFileReader.read(s"$pathStem/wine-operations_bad-bad-bad-bad.json"))
        .thenReturn(Failure(new FileNotFoundException("Simulated missing file")))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchWineOperationsJsonForPost(filterKeys = List("bad", "bad", "bad", "bad"))
      result shouldBe Success(None)
    }
  }

}
