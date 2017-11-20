(ns knetik-platform-api-documentation-latest
.api.store-coupons
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-coupon-item-with-http-info
  "Create a coupon item
  SKUs have to be unique in the entire store."
  ([] (create-coupon-item-with-http-info nil))
  ([{:keys [cascade coupon-item ]}]
   (call-api "/store/coupons" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    coupon-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-coupon-item
  "Create a coupon item
  SKUs have to be unique in the entire store."
  ([] (create-coupon-item nil))
  ([optional-params]
   (:data (create-coupon-item-with-http-info optional-params))))

(defn create-coupon-template-with-http-info
  "Create a coupon template
  Coupon Templates define a type of coupon and the properties they have."
  ([] (create-coupon-template-with-http-info nil))
  ([{:keys [coupon-template-resource ]}]
   (call-api "/store/coupons/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    coupon-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-coupon-template
  "Create a coupon template
  Coupon Templates define a type of coupon and the properties they have."
  ([] (create-coupon-template nil))
  ([optional-params]
   (:data (create-coupon-template-with-http-info optional-params))))

(defn delete-coupon-item-with-http-info
  "Delete a coupon item"
  [id ]
  (call-api "/store/coupons/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-coupon-item
  "Delete a coupon item"
  [id ]
  (:data (delete-coupon-item-with-http-info id)))

(defn delete-coupon-template-with-http-info
  "Delete a coupon template"
  ([id ] (delete-coupon-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/store/coupons/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-coupon-template
  "Delete a coupon template"
  ([id ] (delete-coupon-template id nil))
  ([id optional-params]
   (:data (delete-coupon-template-with-http-info id optional-params))))

(defn get-coupon-item-with-http-info
  "Get a single coupon item"
  [id ]
  (call-api "/store/coupons/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-coupon-item
  "Get a single coupon item"
  [id ]
  (:data (get-coupon-item-with-http-info id)))

(defn get-coupon-item-by-sku-with-http-info
  "Get a coupon by sku"
  [sku ]
  (call-api "/store/coupons/skus/{sku}" :get
            {:path-params   {"sku" sku }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-coupon-item-by-sku
  "Get a coupon by sku"
  [sku ]
  (:data (get-coupon-item-by-sku-with-http-info sku)))

(defn get-coupon-template-with-http-info
  "Get a single coupon template
  Coupon Templates define a type of coupon and the properties they have."
  [id ]
  (call-api "/store/coupons/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-coupon-template
  "Get a single coupon template
  Coupon Templates define a type of coupon and the properties they have."
  [id ]
  (:data (get-coupon-template-with-http-info id)))

(defn get-coupon-templates-with-http-info
  "List and search coupon templates"
  ([] (get-coupon-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/store/coupons/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-coupon-templates
  "List and search coupon templates"
  ([] (get-coupon-templates nil))
  ([optional-params]
   (:data (get-coupon-templates-with-http-info optional-params))))

(defn update-coupon-item-with-http-info
  "Update a coupon item"
  ([id ] (update-coupon-item-with-http-info id nil))
  ([id {:keys [cascade coupon-item ]}]
   (call-api "/store/coupons/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    coupon-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-coupon-item
  "Update a coupon item"
  ([id ] (update-coupon-item id nil))
  ([id optional-params]
   (:data (update-coupon-item-with-http-info id optional-params))))

(defn update-coupon-template-with-http-info
  "Update a coupon template"
  ([id ] (update-coupon-template-with-http-info id nil))
  ([id {:keys [coupon-template-resource ]}]
   (call-api "/store/coupons/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    coupon-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-coupon-template
  "Update a coupon template"
  ([id ] (update-coupon-template id nil))
  ([id optional-params]
   (:data (update-coupon-template-with-http-info id optional-params))))

