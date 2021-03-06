(ns knetik-platform-api-documentation-latest
.api.util-version
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-version-with-http-info
  "Get current version info
  <b>Permissions Needed:</b> ANY"
  []
  (call-api "/version" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-version
  "Get current version info
  <b>Permissions Needed:</b> ANY"
  []
  (:data (get-version-with-http-info)))

