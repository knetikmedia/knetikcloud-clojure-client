(ns knetik-platform-api-documentation-latest
.api.payments-fatt-merchant
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-or-update-fatt-merchant-payment-method-with-http-info
  "Create or update a FattMerchant payment method for a user
  Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints."
  ([] (create-or-update-fatt-merchant-payment-method-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/fattmerchant/payment-methods" :put
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-or-update-fatt-merchant-payment-method
  "Create or update a FattMerchant payment method for a user
  Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints."
  ([] (create-or-update-fatt-merchant-payment-method nil))
  ([optional-params]
   (:data (create-or-update-fatt-merchant-payment-method-with-http-info optional-params))))

