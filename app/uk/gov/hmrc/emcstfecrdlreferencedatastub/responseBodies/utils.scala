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

import io.circe.{Json, JsonNumber, JsonObject}
import play.api.libs.json.JsValue
import play.api.libs.json.{JsArray, JsBoolean, JsNull, JsNumber, JsObject, JsString}

def circeToPlay(json: Json): JsValue = json.fold[JsValue](
  JsNull,
  JsBoolean(_),
  (num: JsonNumber) => JsNumber(BigDecimal(num.toDouble)),
  JsString(_),
  (vec: Vector[Json]) => JsArray(vec.toSeq.map(circeToPlay)),
  (obj: JsonObject) => JsObject(obj.toList.map((k, v) => k -> circeToPlay(v)))
)
