(ns knetik-platform-api-documentation-latest
.api.gamification-metrics
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-metric-with-http-info
  "Add a metric
  Post a new score/stat for an activity occurrence without ending the occurrence itself"
  ([] (add-metric-with-http-info nil))
  ([{:keys [metric ]}]
   (call-api "/metrics" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    metric
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-metric
  "Add a metric
  Post a new score/stat for an activity occurrence without ending the occurrence itself"
  ([] (add-metric nil))
  ([optional-params]
   (:data (add-metric-with-http-info optional-params))))

