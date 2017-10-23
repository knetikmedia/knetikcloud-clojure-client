(ns knetik-platform-api-documentation-latest
.api.payments-xsolla
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-xsolla-token-url-with-http-info
  "Create a payment token that should be used to forward the user to Xsolla so they can complete payment"
  ([] (create-xsolla-token-url-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/xsolla/payment" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-xsolla-token-url
  "Create a payment token that should be used to forward the user to Xsolla so they can complete payment"
  ([] (create-xsolla-token-url nil))
  ([optional-params]
   (:data (create-xsolla-token-url-with-http-info optional-params))))

