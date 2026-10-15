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
import play.api.libs.json.JsValue

val bodyForGetWineOperations: JsValue = circeToPlay(json"""{
  "12": "Other operations",
  "8": "A product harvested during a year other than that indicated in the description has been added to the product",
  "4": "The product has been sweetened",
  "5": "The product has been fortified for distillation",
  "10": "The product has been made on the basis of experimental use of a new oenological practice",
  "0": "The product has undergone none of the following operations",
  "2": "The product has been acidified",
  "7": "A product obtained from a vine variety other than that indicated in the description has been added to the product",
  "3": "The product has been de-acidified",
  "11": "The product has been partially dealcoholised",
  "9": "The product has been made using oak chips",
  "6": "A product originating in a geographical unit other than that indicated in the description has been added to the product",
  "1": "The product has been enriched"
}
""")
