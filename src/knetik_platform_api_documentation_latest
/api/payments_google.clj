(ns knetik-platform-api-documentation-latest
.api.payments-google
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn handle-google-payment-with-http-info
  "Mark an invoice paid with Google
  Mark an invoice paid with Google. Verifies signature from Google and treats the developerPayload field inside the json payload as the id of the invoice to pay. Returns the transaction ID if successful. <br><br><b>Permissions Needed:</b> ANY"
  ([] (handle-google-payment-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/google/payments" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn handle-google-payment
  "Mark an invoice paid with Google
  Mark an invoice paid with Google. Verifies signature from Google and treats the developerPayload field inside the json payload as the id of the invoice to pay. Returns the transaction ID if successful. <br><br><b>Permissions Needed:</b> ANY"
  ([] (handle-google-payment nil))
  ([optional-params]
   (:data (handle-google-payment-with-http-info optional-params))))

