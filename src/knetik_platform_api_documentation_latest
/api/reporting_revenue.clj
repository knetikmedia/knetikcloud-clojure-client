(ns knetik-platform-api-documentation-latest
.api.reporting-revenue
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-item-revenue-with-http-info
  "Get item revenue info
  Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range"
  ([currency-code ] (get-item-revenue-with-http-info currency-code nil))
  ([currency-code {:keys [start-date end-date ]}]
   (call-api "/reporting/revenue/item-sales/{currency_code}" :get
             {:path-params   {"currency_code" currency-code }
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-item-revenue
  "Get item revenue info
  Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range"
  ([currency-code ] (get-item-revenue currency-code nil))
  ([currency-code optional-params]
   (:data (get-item-revenue-with-http-info currency-code optional-params))))

(defn get-refund-revenue-with-http-info
  "Get refund revenue info
  Get basic info about revenue loss from refunds (for all item types), summed up within a time range."
  ([currency-code ] (get-refund-revenue-with-http-info currency-code nil))
  ([currency-code {:keys [start-date end-date ]}]
   (call-api "/reporting/revenue/refunds/{currency_code}" :get
             {:path-params   {"currency_code" currency-code }
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-refund-revenue
  "Get refund revenue info
  Get basic info about revenue loss from refunds (for all item types), summed up within a time range."
  ([currency-code ] (get-refund-revenue currency-code nil))
  ([currency-code optional-params]
   (:data (get-refund-revenue-with-http-info currency-code optional-params))))

(defn get-revenue-by-country-with-http-info
  "Get revenue info by country
  Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top"
  ([currency-code ] (get-revenue-by-country-with-http-info currency-code nil))
  ([currency-code {:keys [start-date end-date size page ]}]
   (call-api "/reporting/revenue/countries/{currency_code}" :get
             {:path-params   {"currency_code" currency-code }
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-revenue-by-country
  "Get revenue info by country
  Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top"
  ([currency-code ] (get-revenue-by-country currency-code nil))
  ([currency-code optional-params]
   (:data (get-revenue-by-country-with-http-info currency-code optional-params))))

(defn get-revenue-by-item-with-http-info
  "Get revenue info by item
  Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top"
  ([currency-code ] (get-revenue-by-item-with-http-info currency-code nil))
  ([currency-code {:keys [start-date end-date size page ]}]
   (call-api "/reporting/revenue/products/{currency_code}" :get
             {:path-params   {"currency_code" currency-code }
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-revenue-by-item
  "Get revenue info by item
  Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top"
  ([currency-code ] (get-revenue-by-item currency-code nil))
  ([currency-code optional-params]
   (:data (get-revenue-by-item-with-http-info currency-code optional-params))))

(defn get-subscription-revenue-with-http-info
  "Get subscription revenue info
  Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range"
  ([currency-code ] (get-subscription-revenue-with-http-info currency-code nil))
  ([currency-code {:keys [start-date end-date ]}]
   (call-api "/reporting/revenue/subscription-sales/{currency_code}" :get
             {:path-params   {"currency_code" currency-code }
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-subscription-revenue
  "Get subscription revenue info
  Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range"
  ([currency-code ] (get-subscription-revenue currency-code nil))
  ([currency-code optional-params]
   (:data (get-subscription-revenue-with-http-info currency-code optional-params))))

