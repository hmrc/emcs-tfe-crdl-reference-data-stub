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

val bodyForGetCnCodes_T400: JsValue = circeToPlay(json"""[
  {
    "cnCode": "24029000",
    "cnCodeDescription": "Cigars, cheroots, cigarillos and cigarettes not containing tobacco",
    "exciseProductCode": "T400",
    "exciseProductCodeDescription": "Fine-cut tobacco for the rolling of cigarettes",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "24031910",
    "cnCodeDescription": "Smoking tobacco in immediate packing of a net content not exceeding 500 g",
    "exciseProductCode": "T400",
    "exciseProductCodeDescription": "Fine-cut tobacco for the rolling of cigarettes",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "24031990",
    "cnCodeDescription": "Smoking tobacco, other",
    "exciseProductCode": "T400",
    "exciseProductCodeDescription": "Fine-cut tobacco for the rolling of cigarettes",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "24039100",
    "cnCodeDescription": "‘Homogenised’ or ‘reconstituted’ tobacco",
    "exciseProductCode": "T400",
    "exciseProductCodeDescription": "Fine-cut tobacco for the rolling of cigarettes",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "24039990",
    "cnCodeDescription": "Other manufactured tobacco and tobacco substitutes",
    "exciseProductCode": "T400",
    "exciseProductCodeDescription": "Fine-cut tobacco for the rolling of cigarettes",
    "unitOfMeasureCode": 1
  }
]
""")
