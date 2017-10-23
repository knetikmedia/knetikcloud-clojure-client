(ns knetik-platform-api-documentation-latest
.api.categories
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-category-with-http-info
  "Create a new category"
  ([] (create-category-with-http-info nil))
  ([{:keys [category ]}]
   (call-api "/categories" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    category
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-category
  "Create a new category"
  ([] (create-category nil))
  ([optional-params]
   (:data (create-category-with-http-info optional-params))))

(defn create-category-template-with-http-info
  "Create a category template
  Templates define a type of category and the properties they have"
  ([] (create-category-template-with-http-info nil))
  ([{:keys [template ]}]
   (call-api "/categories/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-category-template
  "Create a category template
  Templates define a type of category and the properties they have"
  ([] (create-category-template nil))
  ([optional-params]
   (:data (create-category-template-with-http-info optional-params))))

(defn delete-category-with-http-info
  "Delete an existing category"
  [id ]
  (call-api "/categories/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-category
  "Delete an existing category"
  [id ]
  (:data (delete-category-with-http-info id)))

(defn delete-category-template-with-http-info
  "Delete a category template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-category-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/categories/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-category-template
  "Delete a category template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-category-template id nil))
  ([id optional-params]
   (:data (delete-category-template-with-http-info id optional-params))))

(defn get-categories-with-http-info
  "List and search categories with optional filters"
  ([] (get-categories-with-http-info nil))
  ([{:keys [filter-search filter-active size page order ]}]
   (call-api "/categories" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_search" filter-search "filter_active" filter-active "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-categories
  "List and search categories with optional filters"
  ([] (get-categories nil))
  ([optional-params]
   (:data (get-categories-with-http-info optional-params))))

(defn get-category-with-http-info
  "Get a single category"
  [id ]
  (call-api "/categories/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-category
  "Get a single category"
  [id ]
  (:data (get-category-with-http-info id)))

(defn get-category-template-with-http-info
  "Get a single category template"
  [id ]
  (call-api "/categories/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-category-template
  "Get a single category template"
  [id ]
  (:data (get-category-template-with-http-info id)))

(defn get-category-templates-with-http-info
  "List and search category templates"
  ([] (get-category-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/categories/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-category-templates
  "List and search category templates"
  ([] (get-category-templates nil))
  ([optional-params]
   (:data (get-category-templates-with-http-info optional-params))))

(defn get-tags-with-http-info
  "List all trivia tags in the system"
  ([] (get-tags-with-http-info nil))
  ([{:keys [size page ]}]
   (call-api "/tags" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-tags
  "List all trivia tags in the system"
  ([] (get-tags nil))
  ([optional-params]
   (:data (get-tags-with-http-info optional-params))))

(defn update-category-with-http-info
  "Update an existing category"
  ([id ] (update-category-with-http-info id nil))
  ([id {:keys [category ]}]
   (call-api "/categories/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    category
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-category
  "Update an existing category"
  ([id ] (update-category id nil))
  ([id optional-params]
   (:data (update-category-with-http-info id optional-params))))

(defn update-category-template-with-http-info
  "Update a category template"
  ([id ] (update-category-template-with-http-info id nil))
  ([id {:keys [template ]}]
   (call-api "/categories/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-category-template
  "Update a category template"
  ([id ] (update-category-template id nil))
  ([id optional-params]
   (:data (update-category-template-with-http-info id optional-params))))

