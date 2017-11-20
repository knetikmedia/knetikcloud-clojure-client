(ns knetik-platform-api-documentation-latest
.api.payments-apple
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn verify-apple-receipt-with-http-info
  "Pay invoice with Apple receipt
  Mark an invoice paid using Apple payment receipt. A receipt will only be accepted once and the details of the transaction must match the invoice, including the product_id matching the sku text of the item in the invoice. Returns the transaction ID if successful."
  ([] (verify-apple-receipt-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/apple/receipt" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn verify-apple-receipt
  "Pay invoice with Apple receipt
  Mark an invoice paid using Apple payment receipt. A receipt will only be accepted once and the details of the transaction must match the invoice, including the product_id matching the sku text of the item in the invoice. Returns the transaction ID if successful."
  ([] (verify-apple-receipt nil))
  ([optional-params]
   (:data (verify-apple-receipt-with-http-info optional-params))))

