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

val bodyForPostCnCodeInformation_B000_22030010_B000_22060059: JsValue = circeToPlay(json"""{
  "22030010": {
    "cnCode": "22030010",
    "cnCodeDescription": "Beer made from malt in containers holding more than 10 litres",
    "exciseProductCode": "B000",
    "exciseProductCodeDescription": "Beer",
    "unitOfMeasureCode": 3
  },
  "22060059": {
    "cnCode": "22060059",
    "cnCodeDescription": "Other still fermented beverages in containers holding 2 litres or less",
    "exciseProductCode": "B000",
    "exciseProductCodeDescription": "Beer",
    "unitOfMeasureCode": 3
  }
}
""")
