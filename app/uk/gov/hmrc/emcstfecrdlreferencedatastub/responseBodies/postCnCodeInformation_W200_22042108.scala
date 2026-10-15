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

val bodyForPostCnCodeInformation_W200_22042108: JsValue = circeToPlay(json"""{
  "22042108": {
    "cnCode": "22042108",
    "cnCodeDescription": "Other varietal wines in bottles with ‘mushroom’ stoppers held in place by ties or fastenings; other varietal wine otherwise put up, with an excess pressure due to carbon dioxide in solution of not less than 1 bar but less than 3 bar measured at a temper...",
    "exciseProductCode": "W200",
    "exciseProductCodeDescription": "Still wine and still fermented beverages other than wine and beer",
    "unitOfMeasureCode": 3
  }
}
""")
