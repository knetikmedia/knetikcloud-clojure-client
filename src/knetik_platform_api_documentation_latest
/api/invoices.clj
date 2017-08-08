(ns knetik-platform-api-documentation-latest
.api.invoices
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-invoice-with-http-info
  "Create an invoice
  Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor."
  ([] (create-invoice-with-http-info nil))
  ([{:keys [req ]}]
   (call-api "/invoices" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    req
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-invoice
  "Create an invoice
  Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor."
  ([] (create-invoice nil))
  ([optional-params]
   (:data (create-invoice-with-http-info optional-params))))

(defn get-ful-fillment-statuses-with-http-info
  "Lists available fulfillment statuses"
  []
  (call-api "/invoices/fulfillment-statuses" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-ful-fillment-statuses
  "Lists available fulfillment statuses"
  []
  (:data (get-ful-fillment-statuses-with-http-info)))

(defn get-invoice-with-http-info
  "Retrieve an invoice"
  [id ]
  (call-api "/invoices/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-invoice
  "Retrieve an invoice"
  [id ]
  (:data (get-invoice-with-http-info id)))

(defn get-invoice-logs-with-http-info
  "List invoice logs"
  ([id ] (get-invoice-logs-with-http-info id nil))
  ([id {:keys [size page ]}]
   (call-api "/invoices/{id}/logs" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-invoice-logs
  "List invoice logs"
  ([id ] (get-invoice-logs id nil))
  ([id optional-params]
   (:data (get-invoice-logs-with-http-info id optional-params))))

(defn get-invoices-with-http-info
  "Retrieve invoices
  Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user's invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices."
  ([] (get-invoices-with-http-info nil))
  ([{:keys [filter-user filter-email filter-fulfillment-status filter-payment-status filter-item-name filter-external-ref filter-created-date filter-vendor-ids filter-currency filter-shipping-state-name filter-shipping-country-name filter-shipping filter-vendor-name filter-sku size page order ]}]
   (call-api "/invoices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_user" filter-user "filter_email" filter-email "filter_fulfillment_status" filter-fulfillment-status "filter_payment_status" filter-payment-status "filter_item_name" filter-item-name "filter_external_ref" filter-external-ref "filter_created_date" filter-created-date "filter_vendor_ids" filter-vendor-ids "filter_currency" filter-currency "filter_shipping_state_name" filter-shipping-state-name "filter_shipping_country_name" filter-shipping-country-name "filter_shipping" filter-shipping "filter_vendor_name" filter-vendor-name "filter_sku" filter-sku "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-invoices
  "Retrieve invoices
  Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user's invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices."
  ([] (get-invoices nil))
  ([optional-params]
   (:data (get-invoices-with-http-info optional-params))))

(defn get-payment-statuses-with-http-info
  "Lists available payment statuses"
  []
  (call-api "/invoices/payment-statuses" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-payment-statuses
  "Lists available payment statuses"
  []
  (:data (get-payment-statuses-with-http-info)))

(defn pay-invoice-with-http-info
  "Pay an invoice using a saved payment method"
  ([id ] (pay-invoice-with-http-info id nil))
  ([id {:keys [request ]}]
   (call-api "/invoices/{id}/payments" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn pay-invoice
  "Pay an invoice using a saved payment method"
  ([id ] (pay-invoice id nil))
  ([id optional-params]
   (:data (pay-invoice-with-http-info id optional-params))))

(defn set-bundled-invoice-item-fulfillment-status-with-http-info
  "Set the fulfillment status of a bundled invoice item
  This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which."
  [id bundle-sku sku status ]
  (call-api "/invoices/{id}/items/{bundleSku}/bundled-skus/{sku}/fulfillment-status" :put
            {:path-params   {"id" id "bundleSku" bundle-sku "sku" sku }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    status
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn set-bundled-invoice-item-fulfillment-status
  "Set the fulfillment status of a bundled invoice item
  This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which."
  [id bundle-sku sku status ]
  (:data (set-bundled-invoice-item-fulfillment-status-with-http-info id bundle-sku sku status)))

(defn set-external-ref-with-http-info
  "Set the external reference of an invoice"
  ([id ] (set-external-ref-with-http-info id nil))
  ([id {:keys [external-ref ]}]
   (call-api "/invoices/{id}/external-ref" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    external-ref
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-external-ref
  "Set the external reference of an invoice"
  ([id ] (set-external-ref id nil))
  ([id optional-params]
   (:data (set-external-ref-with-http-info id optional-params))))

(defn set-invoice-item-fulfillment-status-with-http-info
  "Set the fulfillment status of an invoice item
  This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which."
  [id sku status ]
  (call-api "/invoices/{id}/items/{sku}/fulfillment-status" :put
            {:path-params   {"id" id "sku" sku }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    status
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn set-invoice-item-fulfillment-status
  "Set the fulfillment status of an invoice item
  This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which."
  [id sku status ]
  (:data (set-invoice-item-fulfillment-status-with-http-info id sku status)))

(defn set-order-notes-with-http-info
  "Set the order notes of an invoice"
  ([id ] (set-order-notes-with-http-info id nil))
  ([id {:keys [order-notes ]}]
   (call-api "/invoices/{id}/order-notes" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    order-notes
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-order-notes
  "Set the order notes of an invoice"
  ([id ] (set-order-notes id nil))
  ([id optional-params]
   (:data (set-order-notes-with-http-info id optional-params))))

(defn set-payment-status-with-http-info
  "Set the payment status of an invoice
  This may trigger fulfillment if setting the status to 'paid'. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which."
  ([id ] (set-payment-status-with-http-info id nil))
  ([id {:keys [request ]}]
   (call-api "/invoices/{id}/payment-status" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-payment-status
  "Set the payment status of an invoice
  This may trigger fulfillment if setting the status to 'paid'. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which."
  ([id ] (set-payment-status id nil))
  ([id optional-params]
   (:data (set-payment-status-with-http-info id optional-params))))

(defn update-billing-info-with-http-info
  "Set or update billing info"
  ([id ] (update-billing-info-with-http-info id nil))
  ([id {:keys [billing-info-request ]}]
   (call-api "/invoices/{id}/billing-address" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    billing-info-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-billing-info
  "Set or update billing info"
  ([id ] (update-billing-info id nil))
  ([id optional-params]
   (:data (update-billing-info-with-http-info id optional-params))))

