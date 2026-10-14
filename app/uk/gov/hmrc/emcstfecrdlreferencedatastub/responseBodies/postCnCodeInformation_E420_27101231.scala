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

val bodyForPostCnCodeInformation_E420_27101231: JsValue = circeToPlay(json"""{
  "27101231": {
    "cnCode": "27101231",
    "cnCodeDescription": "Aviation spirit",
    "exciseProductCode": "E420",
    "exciseProductCodeDescription": "Unleaded petrol falling within CN codes 2710 12 31, 2710 12 41, 2710 12 45 and 2710 12 49 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  }
}
""")
