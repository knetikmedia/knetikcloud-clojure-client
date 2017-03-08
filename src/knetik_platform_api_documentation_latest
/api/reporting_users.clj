(ns knetik-platform-api-documentation-latest
.api.reporting-users
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-user-registrations-with-http-info
  "Get user registration info
  Get user registration counts grouped by time range"
  ([] (get-user-registrations-with-http-info nil))
  ([{:keys [granularity start-date end-date ]}]
   (call-api "/reporting/users/registrations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"granularity" granularity "start_date" start-date "end_date" end-date }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-user-registrations
  "Get user registration info
  Get user registration counts grouped by time range"
  ([] (get-user-registrations nil))
  ([optional-params]
   (:data (get-user-registrations-with-http-info optional-params))))

