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

import play.api.libs.json.{JsValue, Json}

import scala.util.{Failure, Success, Try}

import java.io.FileNotFoundException
import javax.inject.Inject

class JsonFileReaderService @Inject() (fileReader: FileReader):
  def maybeFetchResponseJson(filename: String): Try[Option[JsValue]] = {
    fileReader.read(s"resources/responseBodies/$filename").map(Json.parse) match {
      case Success(parsed) => Success(Some(parsed))
      case Failure(_: FileNotFoundException) => Success(None)
      case Failure(exception) =>
        Failure(new RuntimeException(s"Failed to read or parse JSON file at $filename: $exception"))
    }
  }
