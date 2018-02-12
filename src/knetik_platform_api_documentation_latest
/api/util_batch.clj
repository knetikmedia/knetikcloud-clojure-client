(ns knetik-platform-api-documentation-latest
.api.util-batch
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-batch-with-http-info
  "Get batch result with token
  Tokens expire in 24 hours. <br><br><b>Permissions Needed:</b> ANY"
  [token ]
  (call-api "/batch/{token}" :get
            {:path-params   {"token" token }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-batch
  "Get batch result with token
  Tokens expire in 24 hours. <br><br><b>Permissions Needed:</b> ANY"
  [token ]
  (:data (get-batch-with-http-info token)))

(defn send-batch-with-http-info
  "Request to run API call given the method, content type, path url, and body of request
  Should the request take longer than one of the alloted timeout parameters, a token will be returned instead, which can be used on the token endpoint in this service. <br><br><b>Permissions Needed:</b> ANY"
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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-batch
  "Request to run API call given the method, content type, path url, and body of request
  Should the request take longer than one of the alloted timeout parameters, a token will be returned instead, which can be used on the token endpoint in this service. <br><br><b>Permissions Needed:</b> ANY"
  ([] (send-batch nil))
  ([optional-params]
   (:data (send-batch-with-http-info optional-params))))

