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

val bodyForGetCnCodes_E430: JsValue = circeToPlay(json"""[
  {
    "cnCode": "27101942",
    "cnCodeDescription": "Heavy gas oils for other purposes with a sulphur content not exceeding 0,001% by weight, having a bio-based carbon content of at least 80% by weight",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27101943",
    "cnCodeDescription": "Heavy gas oil with a sulphur content not exceeding 0.001% by weight, not containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27101944",
    "cnCodeDescription": "Other heavy gas oils for other purposes with a sulphur content not exceeding 0,001% by weight.",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27101946",
    "cnCodeDescription": "Heavy gas oil with a sulphur content exceeding 0.001% by weight but not exceeding 0.002%, not containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27101947",
    "cnCodeDescription": "Heavy gas oil with a sulphur content exceeding 0.002% by weight but not exceeding 0.1%, not containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27101948",
    "cnCodeDescription": "Heavy gas oil with a sulphur content exceeding 0.1% by weight, not containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27102011",
    "cnCodeDescription": "Gas oil with a sulphur content not exceeding 0.001% by weight, containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27102016",
    "cnCodeDescription": "Gas oil with a sulphur content exceeding 0.001% by weight but not exceeding 0.1%, containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  },
  {
    "cnCode": "27102019",
    "cnCodeDescription": "Gas oil with a sulphur content exceeding 0.1% by weight, containing biodiesel",
    "exciseProductCode": "E430",
    "exciseProductCodeDescription": "Gasoil, unmarked falling within CN codes 2710 19 42, 2710 19 44, 2710 19 46, 2710 19 47, 2710 19 48, 2710 20 11, 2710 20 16 and 2710 20 19 (Article 20(1)(c) of Directive 2003/96/EC)",
    "unitOfMeasureCode": 2
  }
]
""")
