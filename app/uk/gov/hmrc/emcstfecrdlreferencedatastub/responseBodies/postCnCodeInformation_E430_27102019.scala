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

val bodyForPostCnCodeInformation_E430_27102019: JsValue = circeToPlay(json"""{
  "27102019": {
    "cnCode": "27102019",
    "cnCodeDescription": "Gas oil with a sulphur content exceeding 0.1% by weight, containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  }
}
""")
