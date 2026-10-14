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

val bodyForPostCnCodeInformation_W300_22060031_W300_22041091: JsValue = circeToPlay(json"""{
  "22041091": {
    "cnCode": "22041091",
    "cnCodeDescription": "Asti spumante with a protected designation of origin (PDO)",
    "exciseProductCode": "W300",
    "exciseProductCodeDescription": "Sparkling wine and sparkling fermented beverages other than wine and beer",
    "unitOfMeasureCode": 3
  },
  "22060031": {
    "cnCode": "22060031",
    "cnCodeDescription": "Sparkling cider and perry",
    "exciseProductCode": "W300",
    "exciseProductCodeDescription": "Sparkling wine and sparkling fermented beverages other than wine and beer",
    "unitOfMeasureCode": 3
  }
}
""")
