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

val bodyForGetMemberStates: JsValue = circeToPlay(json"""[
  {
    "countryCode": "AT",
    "country": "Austria"
  },
  {
    "countryCode": "BE",
    "country": "Belgium"
  },
  {
    "countryCode": "BG",
    "country": "Bulgaria"
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
    "countryCode": "DE",
    "country": "Germany"
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
    "countryCode": "EL",
    "country": "Greece"
  },
  {
    "countryCode": "ES",
    "country": "Spain"
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
    "countryCode": "GB",
    "country": "United Kingdom"
  },
  {
    "countryCode": "HR",
    "country": "Croatia"
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
    "countryCode": "LT",
    "country": "Lithuania"
  },
  {
    "countryCode": "LU",
    "country": "Luxembourg"
  },
  {
    "countryCode": "LV",
    "country": "Latvia"
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
    "countryCode": "SE",
    "country": "Sweden"
  },
  {
    "countryCode": "SI",
    "country": "Slovenia"
  },
  {
    "countryCode": "SK",
    "country": "Slovakia"
  },
  {
    "countryCode": "TX",
    "country": "TX"
  },
  {
    "countryCode": "XI",
    "country": "United Kingdom (Northern Ireland)"
  }
]
""")
