(ns knetik-platform-api-documentation-latest
.api.reporting-subscriptions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-subscription-reports-with-http-info
  "Get a list of available subscription reports in most recent first order
  <b>Permissions Needed:</b> SUBSCRIPTIONS_ADMIN"
  ([] (get-subscription-reports-with-http-info nil))
  ([{:keys [size page ]}]
   (call-api "/reporting/subscription" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-subscription-reports
  "Get a list of available subscription reports in most recent first order
  <b>Permissions Needed:</b> SUBSCRIPTIONS_ADMIN"
  ([] (get-subscription-reports nil))
  ([optional-params]
   (:data (get-subscription-reports-with-http-info optional-params))))

