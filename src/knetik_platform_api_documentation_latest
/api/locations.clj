(ns knetik-platform-api-documentation-latest
.api.locations
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-countries-with-http-info
  "Get a list of countries"
  []
  (call-api "/location/countries" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-countries
  "Get a list of countries"
  []
  (:data (get-countries-with-http-info)))

(defn get-country-by-geo-location-with-http-info
  "Get the iso3 code of your country
  Determined by geo ip location"
  []
  (call-api "/location/geolocation/country" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-country-by-geo-location
  "Get the iso3 code of your country
  Determined by geo ip location"
  []
  (:data (get-country-by-geo-location-with-http-info)))

(defn get-country-states-with-http-info
  "Get a list of a country's states"
  [country-code-iso3 ]
  (call-api "/location/countries/{country_code_iso3}/states" :get
            {:path-params   {"country_code_iso3" country-code-iso3 }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-country-states
  "Get a list of a country's states"
  [country-code-iso3 ]
  (:data (get-country-states-with-http-info country-code-iso3)))

(defn get-currency-by-geo-location-with-http-info
  "Get the currency information of your country
  Determined by geo ip location, currency to country mapping and a fallback setting"
  []
  (call-api "/location/geolocation/currency" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-currency-by-geo-location
  "Get the currency information of your country
  Determined by geo ip location, currency to country mapping and a fallback setting"
  []
  (:data (get-currency-by-geo-location-with-http-info)))

