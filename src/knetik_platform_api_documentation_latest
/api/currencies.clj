(ns knetik-platform-api-documentation-latest
.api.currencies
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-currency-with-http-info
  "Create a currency"
  ([] (create-currency-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/currencies" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    currency
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-currency
  "Create a currency"
  ([] (create-currency nil))
  ([optional-params]
   (:data (create-currency-with-http-info optional-params))))

(defn delete-currency-with-http-info
  "Delete a currency"
  [code ]
  (call-api "/currencies/{code}" :delete
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn delete-currency
  "Delete a currency"
  [code ]
  (:data (delete-currency-with-http-info code)))

(defn get-currencies-with-http-info
  "List and search currencies"
  ([] (get-currencies-with-http-info nil))
  ([{:keys [filter-enabled-currencies filter-type size page order ]}]
   (call-api "/currencies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_enabled_currencies" filter-enabled-currencies "filter_type" filter-type "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-currencies
  "List and search currencies"
  ([] (get-currencies nil))
  ([optional-params]
   (:data (get-currencies-with-http-info optional-params))))

(defn get-currency-with-http-info
  "Get a single currency"
  [code ]
  (call-api "/currencies/{code}" :get
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-currency
  "Get a single currency"
  [code ]
  (:data (get-currency-with-http-info code)))

(defn update-currency-with-http-info
  "Update a currency"
  ([code ] (update-currency-with-http-info code nil))
  ([code {:keys [currency ]}]
   (call-api "/currencies/{code}" :put
             {:path-params   {"code" code }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    currency
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-currency
  "Update a currency"
  ([code ] (update-currency code nil))
  ([code optional-params]
   (:data (update-currency-with-http-info code optional-params))))

