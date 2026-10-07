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
import uk.gov.hmrc.emcstfecrdlreferencedatastub.models.CnInformationItem

import java.io.FileNotFoundException
import javax.inject.Inject

class JsonFileReaderService @Inject() (fileReader: FileReader) {

  private def maybeFetchResponseJson(pagePath: String): Try[Option[JsValue]] =
    fileReader.read(s"resources/responseBodies/$pagePath").map(Json.parse) match {
      case Success(parsed) => Success(Some(parsed))
      case Failure(_: FileNotFoundException) => Success(None)
      case Failure(exception) =>
        Failure(new RuntimeException(s"Failed to read or parse JSON file at $pagePath: $exception"))
    }

  def maybeFetchCNCodeInfoJsonForPost(cnInformationItems: List[CnInformationItem]): Try[Option[JsValue]] =
    maybeFetchResponseJson(
      s"cn-code-information_${cnInformationItems.map(i => s"${i.productCode}-${i.cnCode}").mkString("_")}.json"
    )

  def maybeFetchCNCodeJsonForGet(exciseProductCode: String): Try[Option[JsValue]] =
    maybeFetchResponseJson(s"cn-codes_$exciseProductCode.json")
  
  def maybeFetchExciseProductCodesJson(): Try[Option[JsValue]] =
    maybeFetchResponseJson("epc-codes.json")

  def maybeFetchMemberStatesAndCountriesJson(): Try[Option[JsValue]] =
    maybeFetchResponseJson("member-states-and-countries.json")

  def maybeFetchMemberStatesJson(): Try[Option[JsValue]] =
    maybeFetchResponseJson("member-states.json")

  def maybeFetchPackagingTypesJsonForGet(maybeIsCountable: Option[Boolean]): Try[Option[JsValue]] =
    maybeFetchResponseJson(
      maybeIsCountable
        .map(isCountable => s"packaging-types_isCountable-$isCountable.json")
        .getOrElse("packaging-types.json")
    )

  def maybeFetchPackagingTypesJsonForPost(packagingTypeCodes: List[String]): Try[Option[JsValue]] =
    maybeFetchResponseJson(s"packaging-types_${packagingTypeCodes.mkString("-")}.json")

  def maybeFetchTypeOfDocumentJson(): Try[Option[JsValue]] =
    maybeFetchResponseJson("type-of-document.json")

  def maybeFetchWineOperationsJsonForGet(): Try[Option[JsValue]] =
    maybeFetchResponseJson("wine-operations.json")

  def maybeFetchWineOperationsJsonForPost(filterKeys: List[String]): Try[Option[JsValue]] =
    maybeFetchResponseJson(s"wine-operations_${filterKeys.mkString("-")}.json")
}
