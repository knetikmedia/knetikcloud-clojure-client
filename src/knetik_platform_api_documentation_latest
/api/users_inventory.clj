(ns knetik-platform-api-documentation-latest
.api.users-inventory
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-item-to-user-inventory-with-http-info
  "Adds an item to the user inventory
  The inventory is fulfilled asynchronously UNLESS the invoice is explicitely skipped. Depending on the use case, it might require the client to verify that the entitlement was added after the fact or configure a BRE rule to get a notification in real time"
  ([id ] (add-item-to-user-inventory-with-http-info id nil))
  ([id {:keys [user-inventory-add-request ]}]
   (call-api "/users/{id}/inventory" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    user-inventory-add-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-item-to-user-inventory
  "Adds an item to the user inventory
  The inventory is fulfilled asynchronously UNLESS the invoice is explicitely skipped. Depending on the use case, it might require the client to verify that the entitlement was added after the fact or configure a BRE rule to get a notification in real time"
  ([id ] (add-item-to-user-inventory id nil))
  ([id optional-params]
   (:data (add-item-to-user-inventory-with-http-info id optional-params))))

(defn check-user-entitlement-item-with-http-info
  "Check for access to an item without consuming
  Useful for pre-check and accounts for all various buisness rules"
  ([user-id item-id ] (check-user-entitlement-item-with-http-info user-id item-id nil))
  ([user-id item-id {:keys [sku ]}]
   (call-api "/users/{user_id}/entitlements/{item_id}/check" :get
             {:path-params   {"user_id" user-id "item_id" item-id }
              :header-params {}
              :query-params  {"sku" sku }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn check-user-entitlement-item
  "Check for access to an item without consuming
  Useful for pre-check and accounts for all various buisness rules"
  ([user-id item-id ] (check-user-entitlement-item user-id item-id nil))
  ([user-id item-id optional-params]
   (:data (check-user-entitlement-item-with-http-info user-id item-id optional-params))))

(defn create-entitlement-item-with-http-info
  "Create an entitlement item"
  ([] (create-entitlement-item-with-http-info nil))
  ([{:keys [cascade entitlement-item ]}]
   (call-api "/entitlements" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    entitlement-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-entitlement-item
  "Create an entitlement item"
  ([] (create-entitlement-item nil))
  ([optional-params]
   (:data (create-entitlement-item-with-http-info optional-params))))

(defn create-entitlement-template-with-http-info
  "Create an entitlement template
  Entitlement templates define a type of entitlement and the properties they have"
  ([] (create-entitlement-template-with-http-info nil))
  ([{:keys [template ]}]
   (call-api "/entitlements/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-entitlement-template
  "Create an entitlement template
  Entitlement templates define a type of entitlement and the properties they have"
  ([] (create-entitlement-template nil))
  ([optional-params]
   (:data (create-entitlement-template-with-http-info optional-params))))

(defn delete-entitlement-item-with-http-info
  "Delete an entitlement item"
  [entitlement-id ]
  (call-api "/entitlements/{entitlement_id}" :delete
            {:path-params   {"entitlement_id" entitlement-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-entitlement-item
  "Delete an entitlement item"
  [entitlement-id ]
  (:data (delete-entitlement-item-with-http-info entitlement-id)))

(defn delete-entitlement-template-with-http-info
  "Delete an entitlement template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-entitlement-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/entitlements/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-entitlement-template
  "Delete an entitlement template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-entitlement-template id nil))
  ([id optional-params]
   (:data (delete-entitlement-template-with-http-info id optional-params))))

(defn get-entitlement-item-with-http-info
  "Get a single entitlement item"
  [entitlement-id ]
  (call-api "/entitlements/{entitlement_id}" :get
            {:path-params   {"entitlement_id" entitlement-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-entitlement-item
  "Get a single entitlement item"
  [entitlement-id ]
  (:data (get-entitlement-item-with-http-info entitlement-id)))

(defn get-entitlement-items-with-http-info
  "List and search entitlement items"
  ([] (get-entitlement-items-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/entitlements" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-entitlement-items
  "List and search entitlement items"
  ([] (get-entitlement-items nil))
  ([optional-params]
   (:data (get-entitlement-items-with-http-info optional-params))))

(defn get-entitlement-template-with-http-info
  "Get a single entitlement template"
  [id ]
  (call-api "/entitlements/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-entitlement-template
  "Get a single entitlement template"
  [id ]
  (:data (get-entitlement-template-with-http-info id)))

(defn get-entitlement-templates-with-http-info
  "List and search entitlement templates"
  ([] (get-entitlement-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/entitlements/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-entitlement-templates
  "List and search entitlement templates"
  ([] (get-entitlement-templates nil))
  ([optional-params]
   (:data (get-entitlement-templates-with-http-info optional-params))))

(defn get-user-inventories-with-http-info
  "List the user inventory entries for a given user"
  ([id ] (get-user-inventories-with-http-info id nil))
  ([id {:keys [inactive size page filter-item-name filter-item-id filter-username filter-group filter-date ]}]
   (call-api "/users/{id}/inventory" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"inactive" inactive "size" size "page" page "filter_item_name" filter-item-name "filter_item_id" filter-item-id "filter_username" filter-username "filter_group" filter-group "filter_date" filter-date }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-inventories
  "List the user inventory entries for a given user"
  ([id ] (get-user-inventories id nil))
  ([id optional-params]
   (:data (get-user-inventories-with-http-info id optional-params))))

(defn get-user-inventory-with-http-info
  "Get an inventory entry"
  [user-id id ]
  (call-api "/users/{user_id}/inventory/{id}" :get
            {:path-params   {"user_id" user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-inventory
  "Get an inventory entry"
  [user-id id ]
  (:data (get-user-inventory-with-http-info user-id id)))

(defn get-user-inventory-log-with-http-info
  "List the log entries for this inventory entry"
  ([user-id id ] (get-user-inventory-log-with-http-info user-id id nil))
  ([user-id id {:keys [size page ]}]
   (call-api "/users/{user_id}/inventory/{id}/log" :get
             {:path-params   {"user_id" user-id "id" id }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-inventory-log
  "List the log entries for this inventory entry"
  ([user-id id ] (get-user-inventory-log user-id id nil))
  ([user-id id optional-params]
   (:data (get-user-inventory-log-with-http-info user-id id optional-params))))

(defn get-users-inventory-with-http-info
  "List the user inventory entries for all users"
  ([] (get-users-inventory-with-http-info nil))
  ([{:keys [inactive size page filter-item-name filter-item-id filter-username filter-group filter-date ]}]
   (call-api "/inventories" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"inactive" inactive "size" size "page" page "filter_item_name" filter-item-name "filter_item_id" filter-item-id "filter_username" filter-username "filter_group" filter-group "filter_date" filter-date }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-users-inventory
  "List the user inventory entries for all users"
  ([] (get-users-inventory nil))
  ([optional-params]
   (:data (get-users-inventory-with-http-info optional-params))))

(defn grant-user-entitlement-with-http-info
  "Grant an entitlement"
  [user-id grant-request ]
  (call-api "/users/{user_id}/entitlements" :post
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    grant-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn grant-user-entitlement
  "Grant an entitlement"
  [user-id grant-request ]
  (:data (grant-user-entitlement-with-http-info user-id grant-request)))

(defn update-entitlement-item-with-http-info
  "Update an entitlement item"
  ([entitlement-id ] (update-entitlement-item-with-http-info entitlement-id nil))
  ([entitlement-id {:keys [cascade entitlement-item ]}]
   (call-api "/entitlements/{entitlement_id}" :put
             {:path-params   {"entitlement_id" entitlement-id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    entitlement-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-entitlement-item
  "Update an entitlement item"
  ([entitlement-id ] (update-entitlement-item entitlement-id nil))
  ([entitlement-id optional-params]
   (:data (update-entitlement-item-with-http-info entitlement-id optional-params))))

(defn update-entitlement-template-with-http-info
  "Update an entitlement template"
  ([id ] (update-entitlement-template-with-http-info id nil))
  ([id {:keys [template ]}]
   (call-api "/entitlements/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-entitlement-template
  "Update an entitlement template"
  ([id ] (update-entitlement-template id nil))
  ([id optional-params]
   (:data (update-entitlement-template-with-http-info id optional-params))))

(defn update-user-inventory-behavior-data-with-http-info
  "Set the behavior data for an inventory entry"
  ([user-id id ] (update-user-inventory-behavior-data-with-http-info user-id id nil))
  ([user-id id {:keys [data ]}]
   (call-api "/users/{user_id}/inventory/{id}/behavior-data" :put
             {:path-params   {"user_id" user-id "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    data
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-user-inventory-behavior-data
  "Set the behavior data for an inventory entry"
  ([user-id id ] (update-user-inventory-behavior-data user-id id nil))
  ([user-id id optional-params]
   (:data (update-user-inventory-behavior-data-with-http-info user-id id optional-params))))

(defn update-user-inventory-expires-with-http-info
  "Set the expiration date
  Will change the current grace period for a subscription but not the bill date (possibly even ending before having the chance to re-bill)"
  ([user-id id ] (update-user-inventory-expires-with-http-info user-id id nil))
  ([user-id id {:keys [timestamp ]}]
   (call-api "/users/{user_id}/inventory/{id}/expires" :put
             {:path-params   {"user_id" user-id "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    timestamp
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-user-inventory-expires
  "Set the expiration date
  Will change the current grace period for a subscription but not the bill date (possibly even ending before having the chance to re-bill)"
  ([user-id id ] (update-user-inventory-expires user-id id nil))
  ([user-id id optional-params]
   (:data (update-user-inventory-expires-with-http-info user-id id optional-params))))

(defn update-user-inventory-status-with-http-info
  "Set the status for an inventory entry"
  ([user-id id ] (update-user-inventory-status-with-http-info user-id id nil))
  ([user-id id {:keys [inventory-status ]}]
   (call-api "/users/{user_id}/inventory/{id}/status" :put
             {:path-params   {"user_id" user-id "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    inventory-status
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-user-inventory-status
  "Set the status for an inventory entry"
  ([user-id id ] (update-user-inventory-status user-id id nil))
  ([user-id id optional-params]
   (:data (update-user-inventory-status-with-http-info user-id id optional-params))))

(defn use-user-entitlement-item-with-http-info
  "Use an item"
  ([user-id item-id ] (use-user-entitlement-item-with-http-info user-id item-id nil))
  ([user-id item-id {:keys [sku info ]}]
   (call-api "/users/{user_id}/entitlements/{item_id}/use" :post
             {:path-params   {"user_id" user-id "item_id" item-id }
              :header-params {}
              :query-params  {"sku" sku "info" info }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn use-user-entitlement-item
  "Use an item"
  ([user-id item-id ] (use-user-entitlement-item user-id item-id nil))
  ([user-id item-id optional-params]
   (:data (use-user-entitlement-item-with-http-info user-id item-id optional-params))))

