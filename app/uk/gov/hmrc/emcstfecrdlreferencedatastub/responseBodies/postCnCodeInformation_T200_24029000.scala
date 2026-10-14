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

val bodyForPostCnCodeInformation_T200_24029000: JsValue = circeToPlay(json"""{
  "24029000": {
    "cnCode": "24029000",
    "cnCodeDescription": "Cigars, cheroots, cigarillos and cigarettes not containing tobacco",
    "exciseProductCode": "T200",
    "exciseProductCodeDescription": "Cigarettes and products treated as cigarettes",
    "unitOfMeasureCode": 4
  }
}
""")
