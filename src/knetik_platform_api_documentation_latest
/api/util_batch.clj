(ns knetik-platform-api-documentation-latest
.api.util-batch
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn send-batch-with-http-info
  "Request to run API call given the method, content type, path url, and body of request"
  ([] (send-batch-with-http-info nil))
  ([{:keys [batch ]}]
   (call-api "/batch" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    batch
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn send-batch
  "Request to run API call given the method, content type, path url, and body of request"
  ([] (send-batch nil))
  ([optional-params]
   (:data (send-batch-with-http-info optional-params))))

