(ns knetik-platform-api-documentation-latest
.api.store-subscriptions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-subscription-with-http-info
  "Creates a subscription item and associated plans"
  ([] (create-subscription-with-http-info nil))
  ([{:keys [subscription-resource ]}]
   (call-api "/subscriptions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    subscription-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-subscription
  "Creates a subscription item and associated plans"
  ([] (create-subscription nil))
  ([optional-params]
   (:data (create-subscription-with-http-info optional-params))))

(defn create-subscription-template-with-http-info
  "Create a subscription template
  Subscription Templates define a type of subscription and the properties they have."
  ([] (create-subscription-template-with-http-info nil))
  ([{:keys [subscription-template-resource ]}]
   (call-api "/subscriptions/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    subscription-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-subscription-template
  "Create a subscription template
  Subscription Templates define a type of subscription and the properties they have."
  ([] (create-subscription-template nil))
  ([optional-params]
   (:data (create-subscription-template-with-http-info optional-params))))

(defn delete-subscription-with-http-info
  "Delete a subscription plan
  Must not be locked or a migration target"
  [id plan-id ]
  (call-api "/subscriptions/{id}/plans/{plan_id}" :delete
            {:path-params   {"id" id "plan_id" plan-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-subscription
  "Delete a subscription plan
  Must not be locked or a migration target"
  [id plan-id ]
  (:data (delete-subscription-with-http-info id plan-id)))

(defn delete-subscription-template-with-http-info
  "Delete a subscription template"
  ([id ] (delete-subscription-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/subscriptions/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-subscription-template
  "Delete a subscription template"
  ([id ] (delete-subscription-template id nil))
  ([id optional-params]
   (:data (delete-subscription-template-with-http-info id optional-params))))

(defn get-subscription-with-http-info
  "Retrieve a single subscription item and associated plans"
  [id ]
  (call-api "/subscriptions/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-subscription
  "Retrieve a single subscription item and associated plans"
  [id ]
  (:data (get-subscription-with-http-info id)))

(defn get-subscription-template-with-http-info
  "Get a single subscription template
  Subscription Templates define a type of subscription and the properties they have."
  [id ]
  (call-api "/subscriptions/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-subscription-template
  "Get a single subscription template
  Subscription Templates define a type of subscription and the properties they have."
  [id ]
  (:data (get-subscription-template-with-http-info id)))

(defn get-subscription-templates-with-http-info
  "List and search subscription templates"
  ([] (get-subscription-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/subscriptions/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-subscription-templates
  "List and search subscription templates"
  ([] (get-subscription-templates nil))
  ([optional-params]
   (:data (get-subscription-templates-with-http-info optional-params))))

(defn get-subscriptions-with-http-info
  "List available subscription items and associated plans"
  ([] (get-subscriptions-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/subscriptions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-subscriptions
  "List available subscription items and associated plans"
  ([] (get-subscriptions nil))
  ([optional-params]
   (:data (get-subscriptions-with-http-info optional-params))))

(defn process-subscriptions-with-http-info
  "Processes subscriptions and charge dues"
  []
  (call-api "/subscriptions/process" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn process-subscriptions
  "Processes subscriptions and charge dues"
  []
  (:data (process-subscriptions-with-http-info)))

(defn update-subscription-with-http-info
  "Updates a subscription item and associated plans
  Will not remove plans left out"
  ([id ] (update-subscription-with-http-info id nil))
  ([id {:keys [subscription-resource ]}]
   (call-api "/subscriptions/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    subscription-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-subscription
  "Updates a subscription item and associated plans
  Will not remove plans left out"
  ([id ] (update-subscription id nil))
  ([id optional-params]
   (:data (update-subscription-with-http-info id optional-params))))

(defn update-subscription-template-with-http-info
  "Update a subscription template"
  ([id ] (update-subscription-template-with-http-info id nil))
  ([id {:keys [subscription-template-resource ]}]
   (call-api "/subscriptions/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    subscription-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-subscription-template
  "Update a subscription template"
  ([id ] (update-subscription-template id nil))
  ([id optional-params]
   (:data (update-subscription-template-with-http-info id optional-params))))

