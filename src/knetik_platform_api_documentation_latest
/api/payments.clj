(ns knetik-platform-api-documentation-latest
.api.payments
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-payment-method-with-http-info
  "Create a new payment method for a user"
  ([user-id ] (create-payment-method-with-http-info user-id nil))
  ([user-id {:keys [payment-method ]}]
   (call-api "/users/{user_id}/payment-methods" :post
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    payment-method
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-payment-method
  "Create a new payment method for a user"
  ([user-id ] (create-payment-method user-id nil))
  ([user-id optional-params]
   (:data (create-payment-method-with-http-info user-id optional-params))))

(defn delete-payment-method-with-http-info
  "Delete an existing payment method for a user"
  [user-id id ]
  (call-api "/users/{user_id}/payment-methods/{id}" :delete
            {:path-params   {"user_id" user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-payment-method
  "Delete an existing payment method for a user"
  [user-id id ]
  (:data (delete-payment-method-with-http-info user-id id)))

(defn get-payment-method-with-http-info
  "Get a single payment method for a user"
  [user-id id ]
  (call-api "/users/{user_id}/payment-methods/{id}" :get
            {:path-params   {"user_id" user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-payment-method
  "Get a single payment method for a user"
  [user-id id ]
  (:data (get-payment-method-with-http-info user-id id)))

(defn get-payment-methods-with-http-info
  "Get all payment methods for a user"
  ([user-id ] (get-payment-methods-with-http-info user-id nil))
  ([user-id {:keys [filter-name filter-payment-type filter-payment-method-type-id filter-payment-method-type-name size page order ]}]
   (call-api "/users/{user_id}/payment-methods" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"filter_name" filter-name "filter_payment_type" filter-payment-type "filter_payment_method_type_id" filter-payment-method-type-id "filter_payment_method_type_name" filter-payment-method-type-name "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-payment-methods
  "Get all payment methods for a user"
  ([user-id ] (get-payment-methods user-id nil))
  ([user-id optional-params]
   (:data (get-payment-methods-with-http-info user-id optional-params))))

(defn payment-authorization-with-http-info
  "Authorize payment of an invoice for later capture"
  ([] (payment-authorization-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/authorizations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn payment-authorization
  "Authorize payment of an invoice for later capture"
  ([] (payment-authorization nil))
  ([optional-params]
   (:data (payment-authorization-with-http-info optional-params))))

(defn payment-capture-with-http-info
  "Capture an existing invoice payment authorization"
  [id ]
  (call-api "/payment/authorizations/{id}/capture" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn payment-capture
  "Capture an existing invoice payment authorization"
  [id ]
  (:data (payment-capture-with-http-info id)))

(defn update-payment-method-with-http-info
  "Update an existing payment method for a user"
  ([user-id id ] (update-payment-method-with-http-info user-id id nil))
  ([user-id id {:keys [payment-method ]}]
   (call-api "/users/{user_id}/payment-methods/{id}" :put
             {:path-params   {"user_id" user-id "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    payment-method
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-payment-method
  "Update an existing payment method for a user"
  ([user-id id ] (update-payment-method user-id id nil))
  ([user-id id optional-params]
   (:data (update-payment-method-with-http-info user-id id optional-params))))

