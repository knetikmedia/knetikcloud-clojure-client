(ns knetik-platform-api-documentation-latest
.api.store-shipping
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-shipping-item-with-http-info
  "Create a shipping item
  A shipping item represents a shipping option and cost. SKUs have to be unique in the entire store."
  ([] (create-shipping-item-with-http-info nil))
  ([{:keys [cascade shipping-item ]}]
   (call-api "/store/shipping" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    shipping-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-shipping-item
  "Create a shipping item
  A shipping item represents a shipping option and cost. SKUs have to be unique in the entire store."
  ([] (create-shipping-item nil))
  ([optional-params]
   (:data (create-shipping-item-with-http-info optional-params))))

(defn create-shipping-template-with-http-info
  "Create a shipping template
  Shipping Templates define a type of shipping and the properties they have."
  ([] (create-shipping-template-with-http-info nil))
  ([{:keys [shipping-template-resource ]}]
   (call-api "/store/shipping/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    shipping-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-shipping-template
  "Create a shipping template
  Shipping Templates define a type of shipping and the properties they have."
  ([] (create-shipping-template nil))
  ([optional-params]
   (:data (create-shipping-template-with-http-info optional-params))))

(defn delete-shipping-item-with-http-info
  "Delete a shipping item"
  [id ]
  (call-api "/store/shipping/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-shipping-item
  "Delete a shipping item"
  [id ]
  (:data (delete-shipping-item-with-http-info id)))

(defn delete-shipping-template-with-http-info
  "Delete a shipping template"
  ([id ] (delete-shipping-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/store/shipping/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-shipping-template
  "Delete a shipping template"
  ([id ] (delete-shipping-template id nil))
  ([id optional-params]
   (:data (delete-shipping-template-with-http-info id optional-params))))

(defn get-shipping-item-with-http-info
  "Get a single shipping item"
  [id ]
  (call-api "/store/shipping/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-shipping-item
  "Get a single shipping item"
  [id ]
  (:data (get-shipping-item-with-http-info id)))

(defn get-shipping-template-with-http-info
  "Get a single shipping template
  Shipping Templates define a type of shipping and the properties they have."
  [id ]
  (call-api "/store/shipping/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-shipping-template
  "Get a single shipping template
  Shipping Templates define a type of shipping and the properties they have."
  [id ]
  (:data (get-shipping-template-with-http-info id)))

(defn get-shipping-templates-with-http-info
  "List and search shipping templates"
  ([] (get-shipping-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/store/shipping/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-shipping-templates
  "List and search shipping templates"
  ([] (get-shipping-templates nil))
  ([optional-params]
   (:data (get-shipping-templates-with-http-info optional-params))))

(defn update-shipping-item-with-http-info
  "Update a shipping item"
  ([id ] (update-shipping-item-with-http-info id nil))
  ([id {:keys [cascade shipping-item ]}]
   (call-api "/store/shipping/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    shipping-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-shipping-item
  "Update a shipping item"
  ([id ] (update-shipping-item id nil))
  ([id optional-params]
   (:data (update-shipping-item-with-http-info id optional-params))))

(defn update-shipping-template-with-http-info
  "Update a shipping template"
  ([id ] (update-shipping-template-with-http-info id nil))
  ([id {:keys [shipping-template-resource ]}]
   (call-api "/store/shipping/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    shipping-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-shipping-template
  "Update a shipping template"
  ([id ] (update-shipping-template id nil))
  ([id optional-params]
   (:data (update-shipping-template-with-http-info id optional-params))))

