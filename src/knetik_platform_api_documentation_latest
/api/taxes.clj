(ns knetik-platform-api-documentation-latest
.api.taxes
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-country-tax-with-http-info
  "Create a country tax"
  ([] (create-country-tax-with-http-info nil))
  ([{:keys [tax-resource ]}]
   (call-api "/tax/countries" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    tax-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-country-tax
  "Create a country tax"
  ([] (create-country-tax nil))
  ([optional-params]
   (:data (create-country-tax-with-http-info optional-params))))

(defn create-state-tax-with-http-info
  "Create a state tax"
  ([country-code-iso3 ] (create-state-tax-with-http-info country-code-iso3 nil))
  ([country-code-iso3 {:keys [tax-resource ]}]
   (call-api "/tax/countries/{country_code_iso3}/states" :post
             {:path-params   {"country_code_iso3" country-code-iso3 }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    tax-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-state-tax
  "Create a state tax"
  ([country-code-iso3 ] (create-state-tax country-code-iso3 nil))
  ([country-code-iso3 optional-params]
   (:data (create-state-tax-with-http-info country-code-iso3 optional-params))))

(defn delete-country-tax-with-http-info
  "Delete an existing tax"
  [country-code-iso3 ]
  (call-api "/tax/countries/{country_code_iso3}" :delete
            {:path-params   {"country_code_iso3" country-code-iso3 }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-country-tax
  "Delete an existing tax"
  [country-code-iso3 ]
  (:data (delete-country-tax-with-http-info country-code-iso3)))

(defn delete-state-tax-with-http-info
  "Delete an existing state tax"
  [country-code-iso3 state-code ]
  (call-api "/tax/countries/{country_code_iso3}/states/{state_code}" :delete
            {:path-params   {"country_code_iso3" country-code-iso3 "state_code" state-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-state-tax
  "Delete an existing state tax"
  [country-code-iso3 state-code ]
  (:data (delete-state-tax-with-http-info country-code-iso3 state-code)))

(defn get-country-tax-with-http-info
  "Get a single tax"
  [country-code-iso3 ]
  (call-api "/tax/countries/{country_code_iso3}" :get
            {:path-params   {"country_code_iso3" country-code-iso3 }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-country-tax
  "Get a single tax"
  [country-code-iso3 ]
  (:data (get-country-tax-with-http-info country-code-iso3)))

(defn get-country-taxes-with-http-info
  "List and search taxes
  Get a list of taxes"
  ([] (get-country-taxes-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/tax/countries" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-country-taxes
  "List and search taxes
  Get a list of taxes"
  ([] (get-country-taxes nil))
  ([optional-params]
   (:data (get-country-taxes-with-http-info optional-params))))

(defn get-state-tax-with-http-info
  "Get a single state tax"
  [country-code-iso3 state-code ]
  (call-api "/tax/countries/{country_code_iso3}/states/{state_code}" :get
            {:path-params   {"country_code_iso3" country-code-iso3 "state_code" state-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-state-tax
  "Get a single state tax"
  [country-code-iso3 state-code ]
  (:data (get-state-tax-with-http-info country-code-iso3 state-code)))

(defn get-state-taxes-for-countries-with-http-info
  "List and search taxes across all countries
  Get a list of taxes"
  ([] (get-state-taxes-for-countries-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/tax/states" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-state-taxes-for-countries
  "List and search taxes across all countries
  Get a list of taxes"
  ([] (get-state-taxes-for-countries nil))
  ([optional-params]
   (:data (get-state-taxes-for-countries-with-http-info optional-params))))

(defn get-state-taxes-for-country-with-http-info
  "List and search taxes within a country
  Get a list of taxes"
  ([country-code-iso3 ] (get-state-taxes-for-country-with-http-info country-code-iso3 nil))
  ([country-code-iso3 {:keys [size page order ]}]
   (call-api "/tax/countries/{country_code_iso3}/states" :get
             {:path-params   {"country_code_iso3" country-code-iso3 }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-state-taxes-for-country
  "List and search taxes within a country
  Get a list of taxes"
  ([country-code-iso3 ] (get-state-taxes-for-country country-code-iso3 nil))
  ([country-code-iso3 optional-params]
   (:data (get-state-taxes-for-country-with-http-info country-code-iso3 optional-params))))

(defn update-country-tax-with-http-info
  "Create or update a tax"
  ([country-code-iso3 ] (update-country-tax-with-http-info country-code-iso3 nil))
  ([country-code-iso3 {:keys [tax-resource ]}]
   (call-api "/tax/countries/{country_code_iso3}" :put
             {:path-params   {"country_code_iso3" country-code-iso3 }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    tax-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-country-tax
  "Create or update a tax"
  ([country-code-iso3 ] (update-country-tax country-code-iso3 nil))
  ([country-code-iso3 optional-params]
   (:data (update-country-tax-with-http-info country-code-iso3 optional-params))))

(defn update-state-tax-with-http-info
  "Create or update a state tax"
  ([country-code-iso3 state-code ] (update-state-tax-with-http-info country-code-iso3 state-code nil))
  ([country-code-iso3 state-code {:keys [tax-resource ]}]
   (call-api "/tax/countries/{country_code_iso3}/states/{state_code}" :put
             {:path-params   {"country_code_iso3" country-code-iso3 "state_code" state-code }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    tax-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-state-tax
  "Create or update a state tax"
  ([country-code-iso3 state-code ] (update-state-tax country-code-iso3 state-code nil))
  ([country-code-iso3 state-code optional-params]
   (:data (update-state-tax-with-http-info country-code-iso3 state-code optional-params))))

