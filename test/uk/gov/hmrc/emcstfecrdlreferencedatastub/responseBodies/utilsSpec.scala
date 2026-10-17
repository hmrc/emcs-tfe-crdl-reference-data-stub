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

package uk.gov.hmrc.emcstfecrdlreferencedatastub.responseBodies

import io.circe.Json
import io.circe.literal.*
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import play.api.libs.json.{JsArray, JsNull, JsNumber, JsObject, JsString, JsTrue, JsValue}
import uk.gov.hmrc.emcstfecrdlreferencedatastub.responseBodies.*

class utilsSpec extends AnyWordSpec with Matchers {
  "circeToPlay" should {
    "convert Circe Json to Play JsValue" in {
      val circeJson =
        json"""{
        "aNull": null,
        "aBoolean": true,
        "aNumber": 12.345,
        "aString": "a string value",
        "anArray": [1, 2, 3],
        "anObject": {
          "innerObject": {
            "anotherBoolean": true
          }
        }
      }"""

      val playJsValue = JsObject(
        Seq(
          "aNull" -> JsNull,
          "aBoolean" -> JsTrue,
          "aNumber" -> JsNumber(12.345),
          "aString" -> JsString("a string value"),
          "anArray" -> JsArray(Seq(JsNumber(1), JsNumber(2), JsNumber(3))),
          "anObject" -> JsObject(
            Seq(
              "innerObject" -> JsObject(
                Seq(
                  "anotherBoolean" -> JsTrue
                )
              )
            )
          )
        )
      )

      circeToPlay(circeJson) shouldBe playJsValue
    }
  }
}
