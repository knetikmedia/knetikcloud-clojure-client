(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-actions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-bre-actions-with-http-info
  "Get a list of available actions"
  ([] (get-bre-actions-with-http-info nil))
  ([{:keys [filter-category filter-name ]}]
   (call-api "/bre/actions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_category" filter-category "filter_name" filter-name }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-bre-actions
  "Get a list of available actions"
  ([] (get-bre-actions nil))
  ([optional-params]
   (:data (get-bre-actions-with-http-info optional-params))))

