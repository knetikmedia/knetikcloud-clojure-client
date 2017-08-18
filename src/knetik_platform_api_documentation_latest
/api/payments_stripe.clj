(ns knetik-platform-api-documentation-latest
.api.payments-stripe
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-stripe-payment-method-with-http-info
  "Create a Stripe payment method for a user
  Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints."
  ([] (create-stripe-payment-method-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/stripe/payment-methods" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-stripe-payment-method
  "Create a Stripe payment method for a user
  Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints."
  ([] (create-stripe-payment-method nil))
  ([optional-params]
   (:data (create-stripe-payment-method-with-http-info optional-params))))

(defn pay-stripe-invoice-with-http-info
  "Pay with a single use token"
  ([] (pay-stripe-invoice-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/stripe/payments" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn pay-stripe-invoice
  "Pay with a single use token"
  ([] (pay-stripe-invoice nil))
  ([optional-params]
   (:data (pay-stripe-invoice-with-http-info optional-params))))

