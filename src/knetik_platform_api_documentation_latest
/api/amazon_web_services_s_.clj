(ns knetik-platform-api-documentation-latest
.api.amazon-web-services-s-
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-signed-s3-url-with-http-info
  "Get a signed S3 URL
  Requires the file name and file content type (i.e., 'video/mpeg')"
  ([] (get-signed-s3-url-with-http-info nil))
  ([{:keys [filename content-type ]}]
   (call-api "/amazon/s3/signedposturl" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filename" filename "content_type" content-type }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-signed-s3-url
  "Get a signed S3 URL
  Requires the file name and file content type (i.e., 'video/mpeg')"
  ([] (get-signed-s3-url nil))
  ([optional-params]
   (:data (get-signed-s3-url-with-http-info optional-params))))

