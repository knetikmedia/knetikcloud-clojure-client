(ns knetik-platform-api-documentation-latest
.api.util-health
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-health-with-http-info
  "Get health info"
  []
  (call-api "/health" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-health
  "Get health info"
  []
  (:data (get-health-with-http-info)))

