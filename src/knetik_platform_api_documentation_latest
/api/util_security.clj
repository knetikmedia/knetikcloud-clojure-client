(ns knetik-platform-api-documentation-latest
.api.util-security
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-user-location-log-with-http-info
  "Returns the authentication log for a user
  A log entry is recorded everytime a user requests a new token. Standard pagination available"
  ([] (get-user-location-log-with-http-info nil))
  ([{:keys [user-id ]}]
   (call-api "/security/country-log" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"user_id" user-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-user-location-log
  "Returns the authentication log for a user
  A log entry is recorded everytime a user requests a new token. Standard pagination available"
  ([] (get-user-location-log nil))
  ([optional-params]
   (:data (get-user-location-log-with-http-info optional-params))))

(defn get-user-token-details-with-http-info
  "Returns the authentication token details. Use /users endpoint for detailed user's info"
  []
  (call-api "/me" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-user-token-details
  "Returns the authentication token details. Use /users endpoint for detailed user's info"
  []
  (:data (get-user-token-details-with-http-info)))

