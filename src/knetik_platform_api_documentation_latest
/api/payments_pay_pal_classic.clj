(ns knetik-platform-api-documentation-latest
.api.payments-pay-pal-classic
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-pay-pal-billing-agreement-url-with-http-info
  "Create a PayPal Classic billing agreement for the user
  Returns the token that should be used to forward the user to PayPal so they can accept the agreement."
  ([] (create-pay-pal-billing-agreement-url-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/paypal/classic/agreements/start" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-pay-pal-billing-agreement-url
  "Create a PayPal Classic billing agreement for the user
  Returns the token that should be used to forward the user to PayPal so they can accept the agreement."
  ([] (create-pay-pal-billing-agreement-url nil))
  ([optional-params]
   (:data (create-pay-pal-billing-agreement-url-with-http-info optional-params))))

(defn create-pay-pal-express-checkout-with-http-info
  "Create a payment token for PayPal express checkout
  Returns the token that should be used to forward the user to PayPal so they can complete the checkout."
  ([] (create-pay-pal-express-checkout-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/paypal/classic/checkout/start" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-pay-pal-express-checkout
  "Create a payment token for PayPal express checkout
  Returns the token that should be used to forward the user to PayPal so they can complete the checkout."
  ([] (create-pay-pal-express-checkout nil))
  ([optional-params]
   (:data (create-pay-pal-express-checkout-with-http-info optional-params))))

(defn finalize-pay-pal-billing-agreement-with-http-info
  "Finalizes a billing agreement after the user has accepted through PayPal
  Returns the ID of the new payment method created for the user for the billing agreement."
  ([] (finalize-pay-pal-billing-agreement-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/paypal/classic/agreements/finish" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn finalize-pay-pal-billing-agreement
  "Finalizes a billing agreement after the user has accepted through PayPal
  Returns the ID of the new payment method created for the user for the billing agreement."
  ([] (finalize-pay-pal-billing-agreement nil))
  ([optional-params]
   (:data (finalize-pay-pal-billing-agreement-with-http-info optional-params))))

(defn finalize-pay-pal-checkout-with-http-info
  "Finalizes a payment after the user has completed checkout with PayPal
  The invoice will be marked paid/failed by asynchronous IPN callback."
  ([] (finalize-pay-pal-checkout-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/paypal/classic/checkout/finish" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn finalize-pay-pal-checkout
  "Finalizes a payment after the user has completed checkout with PayPal
  The invoice will be marked paid/failed by asynchronous IPN callback."
  ([] (finalize-pay-pal-checkout nil))
  ([optional-params]
   (:data (finalize-pay-pal-checkout-with-http-info optional-params))))

