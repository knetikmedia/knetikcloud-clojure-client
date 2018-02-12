(ns knetik-platform-api-documentation-latest
.api.util-health
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-health-with-http-info
  "Get health info
  <b>Permissions Needed:</b> ANY"
  []
  (call-api "/health" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-health
  "Get health info
  <b>Permissions Needed:</b> ANY"
  []
  (:data (get-health-with-http-info)))

