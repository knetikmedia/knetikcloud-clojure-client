(ns knetik-platform-api-documentation-latest
.api.reporting-usage
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-usage-by-day-with-http-info
  "Returns aggregated endpoint usage information by day
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-day-with-http-info start-date end-date nil))
  ([start-date end-date {:keys [combine-endpoints method url size page ]}]
   (call-api "/reporting/usage/day" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date "combine_endpoints" combine-endpoints "method" method "url" url "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-usage-by-day
  "Returns aggregated endpoint usage information by day
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-day start-date end-date nil))
  ([start-date end-date optional-params]
   (:data (get-usage-by-day-with-http-info start-date end-date optional-params))))

(defn get-usage-by-hour-with-http-info
  "Returns aggregated endpoint usage information by hour
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-hour-with-http-info start-date end-date nil))
  ([start-date end-date {:keys [combine-endpoints method url size page ]}]
   (call-api "/reporting/usage/hour" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date "combine_endpoints" combine-endpoints "method" method "url" url "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-usage-by-hour
  "Returns aggregated endpoint usage information by hour
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-hour start-date end-date nil))
  ([start-date end-date optional-params]
   (:data (get-usage-by-hour-with-http-info start-date end-date optional-params))))

(defn get-usage-by-minute-with-http-info
  "Returns aggregated endpoint usage information by minute
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-minute-with-http-info start-date end-date nil))
  ([start-date end-date {:keys [combine-endpoints method url size page ]}]
   (call-api "/reporting/usage/minute" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date "combine_endpoints" combine-endpoints "method" method "url" url "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-usage-by-minute
  "Returns aggregated endpoint usage information by minute
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-minute start-date end-date nil))
  ([start-date end-date optional-params]
   (:data (get-usage-by-minute-with-http-info start-date end-date optional-params))))

(defn get-usage-by-month-with-http-info
  "Returns aggregated endpoint usage information by month
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-month-with-http-info start-date end-date nil))
  ([start-date end-date {:keys [combine-endpoints method url size page ]}]
   (call-api "/reporting/usage/month" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date "combine_endpoints" combine-endpoints "method" method "url" url "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-usage-by-month
  "Returns aggregated endpoint usage information by month
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-month start-date end-date nil))
  ([start-date end-date optional-params]
   (:data (get-usage-by-month-with-http-info start-date end-date optional-params))))

(defn get-usage-by-year-with-http-info
  "Returns aggregated endpoint usage information by year
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-year-with-http-info start-date end-date nil))
  ([start-date end-date {:keys [combine-endpoints method url size page ]}]
   (call-api "/reporting/usage/year" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"start_date" start-date "end_date" end-date "combine_endpoints" combine-endpoints "method" method "url" url "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-usage-by-year
  "Returns aggregated endpoint usage information by year
  <b>Permissions Needed:</b> USAGE_ADMIN"
  ([start-date end-date ] (get-usage-by-year start-date end-date nil))
  ([start-date end-date optional-params]
   (:data (get-usage-by-year-with-http-info start-date end-date optional-params))))

(defn get-usage-endpoints-with-http-info
  "Returns list of endpoints called (method and url)
  <b>Permissions Needed:</b> USAGE_ADMIN"
  [start-date end-date ]
  (call-api "/reporting/usage/endpoints" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"start_date" start-date "end_date" end-date }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-usage-endpoints
  "Returns list of endpoints called (method and url)
  <b>Permissions Needed:</b> USAGE_ADMIN"
  [start-date end-date ]
  (:data (get-usage-endpoints-with-http-info start-date end-date)))

