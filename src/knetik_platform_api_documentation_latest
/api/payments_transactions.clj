(ns knetik-platform-api-documentation-latest
.api.payments-transactions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-transaction-with-http-info
  "Get the details for a single transaction"
  [id ]
  (call-api "/transactions/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-transaction
  "Get the details for a single transaction"
  [id ]
  (:data (get-transaction-with-http-info id)))

(defn get-transactions-with-http-info
  "List and search transactions"
  ([] (get-transactions-with-http-info nil))
  ([{:keys [filter-invoice size page order ]}]
   (call-api "/transactions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_invoice" filter-invoice "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-transactions
  "List and search transactions"
  ([] (get-transactions nil))
  ([optional-params]
   (:data (get-transactions-with-http-info optional-params))))

(defn refund-transaction-with-http-info
  "Refund a payment transaction, in full or in part
  Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds."
  ([id ] (refund-transaction-with-http-info id nil))
  ([id {:keys [request ]}]
   (call-api "/transactions/{id}/refunds" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn refund-transaction
  "Refund a payment transaction, in full or in part
  Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds."
  ([id ] (refund-transaction id nil))
  ([id optional-params]
   (:data (refund-transaction-with-http-info id optional-params))))

