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

val bodyForGetMemberStatesAndCountries: JsValue = circeToPlay(json"""[
  {
    "countryCode": "AT",
    "country": "Austria"
  },
  {
    "countryCode": "BE",
    "country": "Belgium"
  },
  {
    "countryCode": "BM",
    "country": "Bermuda"
  },
  {
    "countryCode": "BG",
    "country": "Bulgaria"
  },
  {
    "countryCode": "CX",
    "country": "Christmas Island"
  },
  {
    "countryCode": "HR",
    "country": "Croatia"
  },
  {
    "countryCode": "CY",
    "country": "Cyprus"
  },
  {
    "countryCode": "CZ",
    "country": "Czechia"
  },
  {
    "countryCode": "DK",
    "country": "Denmark"
  },
  {
    "countryCode": "EE",
    "country": "Estonia"
  },
  {
    "countryCode": "FI",
    "country": "Finland"
  },
  {
    "countryCode": "FR",
    "country": "France"
  },
  {
    "countryCode": "DE",
    "country": "Germany"
  },
  {
    "countryCode": "EL",
    "country": "Greece"
  },
  {
    "countryCode": "HU",
    "country": "Hungary"
  },
  {
    "countryCode": "IE",
    "country": "Ireland"
  },
  {
    "countryCode": "IT",
    "country": "Italy"
  },
  {
    "countryCode": "LV",
    "country": "Latvia"
  },
  {
    "countryCode": "LT",
    "country": "Lithuania"
  },
  {
    "countryCode": "LU",
    "country": "Luxembourg"
  },
  {
    "countryCode": "MT",
    "country": "Malta"
  },
  {
    "countryCode": "NL",
    "country": "Netherlands"
  },
  {
    "countryCode": "PL",
    "country": "Poland"
  },
  {
    "countryCode": "PT",
    "country": "Portugal"
  },
  {
    "countryCode": "RO",
    "country": "Romania"
  },
  {
    "countryCode": "BL",
    "country": "Saint Barthélemy"
  },
  {
    "countryCode": "SK",
    "country": "Slovakia"
  },
  {
    "countryCode": "SI",
    "country": "Slovenia"
  },
  {
    "countryCode": "ES",
    "country": "Spain"
  },
  {
    "countryCode": "SE",
    "country": "Sweden"
  },
  {
    "countryCode": "TX",
    "country": "TX"
  },
  {
    "countryCode": "GB",
    "country": "United Kingdom"
  },
  {
    "countryCode": "XI",
    "country": "United Kingdom (Northern Ireland)"
  }
]
""")
