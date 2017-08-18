(ns knetik-platform-api-documentation-latest
.api.store-bundles
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-bundle-item-with-http-info
  "Create a bundle item
  The SKU for the bundle itself must be unique and there can only be one SKU.  Extra notes for price_override:  The price of all the items (multiplied by the quantity) must equal the price of the bundle.  With individual prices set, items will be processed individually and can be refunded as such.  However, if all prices are set to null, the price of the bundle will be used and will be treated as one item."
  ([] (create-bundle-item-with-http-info nil))
  ([{:keys [cascade bundle-item ]}]
   (call-api "/store/bundles" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    bundle-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-bundle-item
  "Create a bundle item
  The SKU for the bundle itself must be unique and there can only be one SKU.  Extra notes for price_override:  The price of all the items (multiplied by the quantity) must equal the price of the bundle.  With individual prices set, items will be processed individually and can be refunded as such.  However, if all prices are set to null, the price of the bundle will be used and will be treated as one item."
  ([] (create-bundle-item nil))
  ([optional-params]
   (:data (create-bundle-item-with-http-info optional-params))))

(defn create-bundle-template-with-http-info
  "Create a bundle template
  Bundle Templates define a type of bundle and the properties they have."
  ([] (create-bundle-template-with-http-info nil))
  ([{:keys [bundle-template-resource ]}]
   (call-api "/store/bundles/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bundle-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-bundle-template
  "Create a bundle template
  Bundle Templates define a type of bundle and the properties they have."
  ([] (create-bundle-template nil))
  ([optional-params]
   (:data (create-bundle-template-with-http-info optional-params))))

(defn delete-bundle-item-with-http-info
  "Delete a bundle item"
  [id ]
  (call-api "/store/bundles/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-bundle-item
  "Delete a bundle item"
  [id ]
  (:data (delete-bundle-item-with-http-info id)))

(defn delete-bundle-template-with-http-info
  "Delete a bundle template"
  ([id ] (delete-bundle-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/store/bundles/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-bundle-template
  "Delete a bundle template"
  ([id ] (delete-bundle-template id nil))
  ([id optional-params]
   (:data (delete-bundle-template-with-http-info id optional-params))))

(defn get-bundle-item-with-http-info
  "Get a single bundle item"
  [id ]
  (call-api "/store/bundles/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-bundle-item
  "Get a single bundle item"
  [id ]
  (:data (get-bundle-item-with-http-info id)))

(defn get-bundle-template-with-http-info
  "Get a single bundle template
  Bundle Templates define a type of bundle and the properties they have."
  [id ]
  (call-api "/store/bundles/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-bundle-template
  "Get a single bundle template
  Bundle Templates define a type of bundle and the properties they have."
  [id ]
  (:data (get-bundle-template-with-http-info id)))

(defn get-bundle-templates-with-http-info
  "List and search bundle templates"
  ([] (get-bundle-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/store/bundles/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-bundle-templates
  "List and search bundle templates"
  ([] (get-bundle-templates nil))
  ([optional-params]
   (:data (get-bundle-templates-with-http-info optional-params))))

(defn update-bundle-item-with-http-info
  "Update a bundle item"
  ([id ] (update-bundle-item-with-http-info id nil))
  ([id {:keys [cascade bundle-item ]}]
   (call-api "/store/bundles/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    bundle-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-bundle-item
  "Update a bundle item"
  ([id ] (update-bundle-item id nil))
  ([id optional-params]
   (:data (update-bundle-item-with-http-info id optional-params))))

(defn update-bundle-template-with-http-info
  "Update a bundle template"
  ([id ] (update-bundle-template-with-http-info id nil))
  ([id {:keys [bundle-template-resource ]}]
   (call-api "/store/bundles/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bundle-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-bundle-template
  "Update a bundle template"
  ([id ] (update-bundle-template id nil))
  ([id optional-params]
   (:data (update-bundle-template-with-http-info id optional-params))))

