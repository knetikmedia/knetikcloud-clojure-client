(ns knetik-platform-api-documentation-latest
.api.amazon-web-services-s-
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-download-url-with-http-info
  "Get a temporary signed S3 URL for download
  To give access to files in your own S3 account, you will need to grant KnetikcCloud access to the file by adjusting your bucket policy accordingly. See S3 documentation for details."
  ([] (get-download-url-with-http-info nil))
  ([{:keys [bucket path expiration ]}]
   (call-api "/amazon/s3/downloadurl" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"bucket" bucket "path" path "expiration" expiration }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-download-url
  "Get a temporary signed S3 URL for download
  To give access to files in your own S3 account, you will need to grant KnetikcCloud access to the file by adjusting your bucket policy accordingly. See S3 documentation for details."
  ([] (get-download-url nil))
  ([optional-params]
   (:data (get-download-url-with-http-info optional-params))))

(defn get-signed-s3-url-with-http-info
  "Get a signed S3 URL for upload
  Requires the file name and file content type (i.e., 'video/mpeg'). Make a PUT to the resulting url to upload the file and use the cdn_url to retrieve it after."
  ([] (get-signed-s3-url-with-http-info nil))
  ([{:keys [filename content-type ]}]
   (call-api "/amazon/s3/signedposturl" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filename" filename "content_type" content-type }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-signed-s3-url
  "Get a signed S3 URL for upload
  Requires the file name and file content type (i.e., 'video/mpeg'). Make a PUT to the resulting url to upload the file and use the cdn_url to retrieve it after."
  ([] (get-signed-s3-url nil))
  ([optional-params]
   (:data (get-signed-s3-url-with-http-info optional-params))))

