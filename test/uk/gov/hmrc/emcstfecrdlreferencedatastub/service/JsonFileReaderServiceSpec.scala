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

import scala.util.{Failure, Success}

class JsonFileReaderServiceSpec extends AnyWordSpec with Matchers with BeforeAndAfterEach {
  private val pathStem = "resources/responseBodies"

  private val validJson = """{ "key": "value" }"""
  private val invalidJson = """{ "key": "valu"""
  val mockFileReader: FileReader = mock[FileReader]

  override def beforeEach(): Unit = {
    reset(mockFileReader)
  }

  "JsonFileReaderServiceSpec.maybeFetchResponseJson" should {
    "read and parse JSON" in {
      when(mockFileReader.read(s"$pathStem/GET_epc-codes.json")).thenReturn(Success(validJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchResponseJson("GET_epc-codes.json")
      result shouldBe Success(Some(Json.parse(validJson)))
    }

    "return None when JSON file doesn't exist for given parameters" in {
      when(mockFileReader.read(s"$pathStem/no-file-exists-with-this-name.json"))
        .thenReturn(Failure(new FileNotFoundException("Simulated missing file")))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchResponseJson("no-file-exists-with-this-name.json")
      result shouldBe Success(None)
    }

    "return Failure when file is invalid JSON" in {
      when(mockFileReader.read(s"$pathStem/GET_epc-codes.json")).thenReturn(Success(invalidJson))
      val service = new JsonFileReaderService(mockFileReader)
      val result = service.maybeFetchResponseJson("GET_epc-codes.json")
      result.isFailure shouldBe true
    }
  }
}
