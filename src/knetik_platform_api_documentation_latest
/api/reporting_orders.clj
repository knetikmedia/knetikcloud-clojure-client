(ns knetik-platform-api-documentation-latest
.api.reporting-orders
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-invoice-reports-with-http-info
  "Retrieve invoice counts aggregated by time ranges"
  ([currency-code ] (get-invoice-reports-with-http-info currency-code nil))
  ([currency-code {:keys [granularity filter-payment-status filter-fulfillment-status start-date end-date size page ]}]
   (call-api "/reporting/orders/count/{currency_code}" :get
             {:path-params   {"currency_code" currency-code }
              :header-params {}
              :query-params  {"granularity" granularity "filter_payment_status" filter-payment-status "filter_fulfillment_status" filter-fulfillment-status "start_date" start-date "end_date" end-date "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-invoice-reports
  "Retrieve invoice counts aggregated by time ranges"
  ([currency-code ] (get-invoice-reports currency-code nil))
  ([currency-code optional-params]
   (:data (get-invoice-reports-with-http-info currency-code optional-params))))

