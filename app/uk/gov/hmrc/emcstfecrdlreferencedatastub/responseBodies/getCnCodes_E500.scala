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

val bodyForGetCnCodes_E500: JsValue = circeToPlay(json"""[
  {
    "cnCode": "27111211",
    "cnCodeDescription": "Liquefied Propane of a purity not less than 99 % for use as a power or heating fuel",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111219",
    "cnCodeDescription": "Liquefied Propane of a purity not less than 99 % for other purposes",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111291",
    "cnCodeDescription": "Liquefied Propane of a purity less than 99 % for undergoing a specific process",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111293",
    "cnCodeDescription": "Liquefied Propane of a purity less than 99 % for undergoing a chemical transformation",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111294",
    "cnCodeDescription": "Liquefied Propane of a purity exceeding 90% but less than 99%",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111297",
    "cnCodeDescription": "Liquefied propane of a purity not exceeding 90%",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111310",
    "cnCodeDescription": "Liquefied Butanes for undergoing a specific process",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111330",
    "cnCodeDescription": "Liquefied Butanes for undergoing a chemical transformation",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111391",
    "cnCodeDescription": "Liquefied Butanes of a purity exceeding 90 % but of less than 95 %",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111397",
    "cnCodeDescription": "Butanes with a purity not exceeding 90% or at or above 95%, which are not intended for undergoing a specific process",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111400",
    "cnCodeDescription": "Ethylene, propylene, butylenes and butadiene liquefied",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  },
  {
    "cnCode": "27111900",
    "cnCodeDescription": "Petroleum gases etc., liquefied",
    "exciseProductCode": "E500",
    "exciseProductCodeDescription": "Liquified Petroleum gases (LPG) Products falling within CN codes 2711 (except 2711 11, 2711 21 and 2711 29)",
    "unitOfMeasureCode": 1
  }
]
""")
