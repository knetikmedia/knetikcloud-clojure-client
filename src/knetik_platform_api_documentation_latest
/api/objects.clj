(ns knetik-platform-api-documentation-latest
.api.objects
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-object-item-with-http-info
  "Create an object"
  ([template-id ] (create-object-item-with-http-info template-id nil))
  ([template-id {:keys [cascade object-item ]}]
   (call-api "/objects/{template_id}" :post
             {:path-params   {"template_id" template-id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    object-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-object-item
  "Create an object"
  ([template-id ] (create-object-item template-id nil))
  ([template-id optional-params]
   (:data (create-object-item-with-http-info template-id optional-params))))

(defn create-object-template-with-http-info
  "Create an object template
  Object templates define a type of entitlement and the properties they have"
  ([] (create-object-template-with-http-info nil))
  ([{:keys [template ]}]
   (call-api "/objects/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-object-template
  "Create an object template
  Object templates define a type of entitlement and the properties they have"
  ([] (create-object-template nil))
  ([optional-params]
   (:data (create-object-template-with-http-info optional-params))))

(defn delete-object-item-with-http-info
  "Delete an object"
  [template-id object-id ]
  (call-api "/objects/{template_id}/{object_id}" :delete
            {:path-params   {"template_id" template-id "object_id" object-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-object-item
  "Delete an object"
  [template-id object-id ]
  (:data (delete-object-item-with-http-info template-id object-id)))

(defn delete-object-template-with-http-info
  "Delete an entitlement template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-object-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/objects/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-object-template
  "Delete an entitlement template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-object-template id nil))
  ([id optional-params]
   (:data (delete-object-template-with-http-info id optional-params))))

(defn get-object-item-with-http-info
  "Get a single object"
  [template-id object-id ]
  (call-api "/objects/{template_id}/{object_id}" :get
            {:path-params   {"template_id" template-id "object_id" object-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-object-item
  "Get a single object"
  [template-id object-id ]
  (:data (get-object-item-with-http-info template-id object-id)))

(defn get-object-items-with-http-info
  "List and search objects"
  ([template-id ] (get-object-items-with-http-info template-id nil))
  ([template-id {:keys [size page order ]}]
   (call-api "/objects/{template_id}" :get
             {:path-params   {"template_id" template-id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-object-items
  "List and search objects"
  ([template-id ] (get-object-items template-id nil))
  ([template-id optional-params]
   (:data (get-object-items-with-http-info template-id optional-params))))

(defn get-object-template-with-http-info
  "Get a single entitlement template"
  [id ]
  (call-api "/objects/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-object-template
  "Get a single entitlement template"
  [id ]
  (:data (get-object-template-with-http-info id)))

(defn get-object-templates-with-http-info
  "List and search entitlement templates"
  ([] (get-object-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/objects/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-object-templates
  "List and search entitlement templates"
  ([] (get-object-templates nil))
  ([optional-params]
   (:data (get-object-templates-with-http-info optional-params))))

(defn update-object-item-with-http-info
  "Update an object"
  ([template-id entitlement-id ] (update-object-item-with-http-info template-id entitlement-id nil))
  ([template-id entitlement-id {:keys [cascade object-item ]}]
   (call-api "/objects/{template_id}/{object_id}" :put
             {:path-params   {"template_id" template-id "entitlement_id" entitlement-id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :body-param    object-item
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-object-item
  "Update an object"
  ([template-id entitlement-id ] (update-object-item template-id entitlement-id nil))
  ([template-id entitlement-id optional-params]
   (:data (update-object-item-with-http-info template-id entitlement-id optional-params))))

(defn update-object-template-with-http-info
  "Update an entitlement template"
  ([id ] (update-object-template-with-http-info id nil))
  ([id {:keys [template ]}]
   (call-api "/objects/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-object-template
  "Update an entitlement template"
  ([id ] (update-object-template id nil))
  ([id optional-params]
   (:data (update-object-template-with-http-info id optional-params))))

