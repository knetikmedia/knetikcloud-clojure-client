(ns knetik-platform-api-documentation-latest
.api.store
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-item-template-with-http-info
  "Create an item template
  Item Templates define a type of item and the properties they have."
  ([] (create-item-template-with-http-info nil))
  ([{:keys [item-template-resource ]}]
   (call-api "/store/items/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    item-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-item-template
  "Create an item template
  Item Templates define a type of item and the properties they have."
  ([] (create-item-template nil))
  ([optional-params]
   (:data (create-item-template-with-http-info optional-params))))

(defn create-store-item-with-http-info
  "Create a store item
  SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \"parameters\" field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:<br /> {..., parameters: [[{item: 1, skus: [\"SKU-1\"]}]]}<br /> If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints."
  ([] (create-store-item-with-http-info nil))
  ([{:keys [cascade store-item ]}]
   (call-api "/store/items" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    store-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-store-item
  "Create a store item
  SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \"parameters\" field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:<br /> {..., parameters: [[{item: 1, skus: [\"SKU-1\"]}]]}<br /> If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints."
  ([] (create-store-item nil))
  ([optional-params]
   (:data (create-store-item-with-http-info optional-params))))

(defn delete-item-template-with-http-info
  "Delete an item template"
  ([id ] (delete-item-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/store/items/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-item-template
  "Delete an item template"
  ([id ] (delete-item-template id nil))
  ([id optional-params]
   (:data (delete-item-template-with-http-info id optional-params))))

(defn delete-store-item-with-http-info
  "Delete a store item"
  [id ]
  (call-api "/store/items/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-store-item
  "Delete a store item"
  [id ]
  (:data (delete-store-item-with-http-info id)))

(defn get-behaviors-with-http-info
  "List available item behaviors"
  []
  (call-api "/store/items/behaviors" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-behaviors
  "List available item behaviors"
  []
  (:data (get-behaviors-with-http-info)))

(defn get-item-template-with-http-info
  "Get a single item template
  Item Templates define a type of item and the properties they have."
  [id ]
  (call-api "/store/items/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-item-template
  "Get a single item template
  Item Templates define a type of item and the properties they have."
  [id ]
  (:data (get-item-template-with-http-info id)))

(defn get-item-templates-with-http-info
  "List and search item templates"
  ([] (get-item-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/store/items/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-item-templates
  "List and search item templates"
  ([] (get-item-templates nil))
  ([optional-params]
   (:data (get-item-templates-with-http-info optional-params))))

(defn get-store-item-with-http-info
  "Get a single store item"
  [id ]
  (call-api "/store/items/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-store-item
  "Get a single store item"
  [id ]
  (:data (get-store-item-with-http-info id)))

(defn get-store-items-with-http-info
  "List and search store items
  If called without permission STORE_ADMIN the only items marked displayable, whose start and end date are null or appropriate to the current date, and whose geo policy allows the caller's country will be returned. Similarly skus will be filtered, possibly resulting in an item returned with no skus the user can purchase."
  ([] (get-store-items-with-http-info nil))
  ([{:keys [filter-name-search filter-unique-key filter-published filter-displayable filter-start filter-end filter-start-date filter-stop-date filter-sku filter-price filter-tag filter-items-by-type filter-bundled-skus filter-vendor size page order ]}]
   (call-api "/store/items" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_name_search" filter-name-search "filter_unique_key" filter-unique-key "filter_published" filter-published "filter_displayable" filter-displayable "filter_start" filter-start "filter_end" filter-end "filter_start_date" filter-start-date "filter_stop_date" filter-stop-date "filter_sku" filter-sku "filter_price" filter-price "filter_tag" filter-tag "filter_items_by_type" filter-items-by-type "filter_bundled_skus" filter-bundled-skus "filter_vendor" filter-vendor "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-store-items
  "List and search store items
  If called without permission STORE_ADMIN the only items marked displayable, whose start and end date are null or appropriate to the current date, and whose geo policy allows the caller's country will be returned. Similarly skus will be filtered, possibly resulting in an item returned with no skus the user can purchase."
  ([] (get-store-items nil))
  ([optional-params]
   (:data (get-store-items-with-http-info optional-params))))

(defn quick-buy-with-http-info
  "One-step purchase and pay for a single SKU item from a user's wallet
  Used to create and automatically pay an invoice for a single unit of a single SKU from a user's wallet. SKU must be priced in virtual currency and must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. If invoice price does not match expected price, purchase is aborted"
  ([] (quick-buy-with-http-info nil))
  ([{:keys [quick-buy-request ]}]
   (call-api "/store/quick-buy" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    quick-buy-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn quick-buy
  "One-step purchase and pay for a single SKU item from a user's wallet
  Used to create and automatically pay an invoice for a single unit of a single SKU from a user's wallet. SKU must be priced in virtual currency and must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. If invoice price does not match expected price, purchase is aborted"
  ([] (quick-buy nil))
  ([optional-params]
   (:data (quick-buy-with-http-info optional-params))))

(defn update-item-template-with-http-info
  "Update an item template"
  ([id ] (update-item-template-with-http-info id nil))
  ([id {:keys [item-template-resource ]}]
   (call-api "/store/items/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    item-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-item-template
  "Update an item template"
  ([id ] (update-item-template id nil))
  ([id optional-params]
   (:data (update-item-template-with-http-info id optional-params))))

(defn update-store-item-with-http-info
  "Update a store item"
  ([id ] (update-store-item-with-http-info id nil))
  ([id {:keys [cascade store-item ]}]
   (call-api "/store/items/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    store-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-store-item
  "Update a store item"
  ([id ] (update-store-item id nil))
  ([id optional-params]
   (:data (update-store-item-with-http-info id optional-params))))

