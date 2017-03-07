(ns knetik-platform-api-documentation-latest
.api.users-subscriptions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-user-subscription-details-with-http-info
  "Get details about a user's subscription"
  [user-id inventory-id ]
  (call-api "/users/{user_id}/subscriptions/{inventory_id}" :get
            {:path-params   {"user_id" user-id "inventory_id" inventory-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-user-subscription-details
  "Get details about a user's subscription"
  [user-id inventory-id ]
  (:data (get-user-subscription-details-with-http-info user-id inventory-id)))

(defn get-users-subscription-details-with-http-info
  "Get details about a user's subscriptions"
  [user-id ]
  (call-api "/users/{user_id}/subscriptions" :get
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-users-subscription-details
  "Get details about a user's subscriptions"
  [user-id ]
  (:data (get-users-subscription-details-with-http-info user-id)))

(defn reactivate-user-subscription-with-http-info
  "Reactivate a subscription and charge fee"
  ([user-id inventory-id ] (reactivate-user-subscription-with-http-info user-id inventory-id nil))
  ([user-id inventory-id {:keys [reactivate-subscription-request ]}]
   (call-api "/users/{user_id}/subscriptions/{inventory_id}/reactivate" :post
             {:path-params   {"user_id" user-id "inventory_id" inventory-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    reactivate-subscription-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn reactivate-user-subscription
  "Reactivate a subscription and charge fee"
  ([user-id inventory-id ] (reactivate-user-subscription user-id inventory-id nil))
  ([user-id inventory-id optional-params]
   (:data (reactivate-user-subscription-with-http-info user-id inventory-id optional-params))))

(defn set-subscription-bill-date-with-http-info
  "Set a new date to bill a subscription on"
  [user-id inventory-id bill-date ]
  (call-api "/users/{user_id}/subscriptions/{inventory_id}/bill-date" :put
            {:path-params   {"user_id" user-id "inventory_id" inventory-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    bill-date
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn set-subscription-bill-date
  "Set a new date to bill a subscription on"
  [user-id inventory-id bill-date ]
  (:data (set-subscription-bill-date-with-http-info user-id inventory-id bill-date)))

(defn set-subscription-payment-method-with-http-info
  "Set the payment method to use for a subscription
  May send null to use floating default"
  ([user-id inventory-id ] (set-subscription-payment-method-with-http-info user-id inventory-id nil))
  ([user-id inventory-id {:keys [payment-method-id ]}]
   (call-api "/users/{user_id}/subscriptions/{inventory_id}/payment-method" :put
             {:path-params   {"user_id" user-id "inventory_id" inventory-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    payment-method-id
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-subscription-payment-method
  "Set the payment method to use for a subscription
  May send null to use floating default"
  ([user-id inventory-id ] (set-subscription-payment-method user-id inventory-id nil))
  ([user-id inventory-id optional-params]
   (:data (set-subscription-payment-method-with-http-info user-id inventory-id optional-params))))

(defn set-subscription-status-with-http-info
  "Set the status of a subscription
  The body is a json string (put in quotes) that should match a desired invoice status type. Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases"
  [user-id inventory-id status ]
  (call-api "/users/{user_id}/subscriptions/{inventory_id}/status" :put
            {:path-params   {"user_id" user-id "inventory_id" inventory-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    status
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn set-subscription-status
  "Set the status of a subscription
  The body is a json string (put in quotes) that should match a desired invoice status type. Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases"
  [user-id inventory-id status ]
  (:data (set-subscription-status-with-http-info user-id inventory-id status)))

(defn set-user-subscription-plan-with-http-info
  "Set a new subscription plan for a user"
  ([user-id inventory-id ] (set-user-subscription-plan-with-http-info user-id inventory-id nil))
  ([user-id inventory-id {:keys [plan-id ]}]
   (call-api "/users/{user_id}/subscriptions/{inventory_id}/plan" :put
             {:path-params   {"user_id" user-id "inventory_id" inventory-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    plan-id
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-user-subscription-plan
  "Set a new subscription plan for a user"
  ([user-id inventory-id ] (set-user-subscription-plan user-id inventory-id nil))
  ([user-id inventory-id optional-params]
   (:data (set-user-subscription-plan-with-http-info user-id inventory-id optional-params))))

