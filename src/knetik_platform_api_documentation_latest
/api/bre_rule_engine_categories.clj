(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-categories
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-bre-category-template-with-http-info
  "Create a BRE category template
  Templates define a type of BRE category and the properties they have"
  ([] (create-bre-category-template-with-http-info nil))
  ([{:keys [template ]}]
   (call-api "/bre/categories/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-bre-category-template
  "Create a BRE category template
  Templates define a type of BRE category and the properties they have"
  ([] (create-bre-category-template nil))
  ([optional-params]
   (:data (create-bre-category-template-with-http-info optional-params))))

(defn delete-bre-category-template-with-http-info
  "Delete a BRE category template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-bre-category-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/bre/categories/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn delete-bre-category-template
  "Delete a BRE category template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-bre-category-template id nil))
  ([id optional-params]
   (:data (delete-bre-category-template-with-http-info id optional-params))))

(defn get-bre-categories-with-http-info
  "List categories"
  ([] (get-bre-categories-with-http-info nil))
  ([{:keys [size page ]}]
   (call-api "/bre/categories" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-bre-categories
  "List categories"
  ([] (get-bre-categories nil))
  ([optional-params]
   (:data (get-bre-categories-with-http-info optional-params))))

(defn get-bre-category-with-http-info
  "Get a single category"
  [name ]
  (call-api "/bre/categories/{name}" :get
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-bre-category
  "Get a single category"
  [name ]
  (:data (get-bre-category-with-http-info name)))

(defn get-bre-category-template-with-http-info
  "Get a single BRE category template"
  [id ]
  (call-api "/bre/categories/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-bre-category-template
  "Get a single BRE category template"
  [id ]
  (:data (get-bre-category-template-with-http-info id)))

(defn get-bre-category-templates-with-http-info
  "List and search BRE category templates"
  ([] (get-bre-category-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/bre/categories/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-bre-category-templates
  "List and search BRE category templates"
  ([] (get-bre-category-templates nil))
  ([optional-params]
   (:data (get-bre-category-templates-with-http-info optional-params))))

(defn update-bre-category-with-http-info
  "Update a category"
  ([name ] (update-bre-category-with-http-info name nil))
  ([name {:keys [category ]}]
   (call-api "/bre/categories/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    category
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-bre-category
  "Update a category"
  ([name ] (update-bre-category name nil))
  ([name optional-params]
   (:data (update-bre-category-with-http-info name optional-params))))

(defn update-bre-category-template-with-http-info
  "Update a BRE category template"
  ([id ] (update-bre-category-template-with-http-info id nil))
  ([id {:keys [template ]}]
   (call-api "/bre/categories/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-bre-category-template
  "Update a BRE category template"
  ([id ] (update-bre-category-template id nil))
  ([id optional-params]
   (:data (update-bre-category-template-with-http-info id optional-params))))

