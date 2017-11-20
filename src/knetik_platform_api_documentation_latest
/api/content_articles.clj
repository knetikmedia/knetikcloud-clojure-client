(ns knetik-platform-api-documentation-latest
.api.content-articles
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-article-with-http-info
  "Create a new article
  Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end."
  ([] (create-article-with-http-info nil))
  ([{:keys [article-resource ]}]
   (call-api "/content/articles" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    article-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-article
  "Create a new article
  Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end."
  ([] (create-article nil))
  ([optional-params]
   (:data (create-article-with-http-info optional-params))))

(defn create-article-template-with-http-info
  "Create an article template
  Article Templates define a type of article and the properties they have"
  ([] (create-article-template-with-http-info nil))
  ([{:keys [article-template-resource ]}]
   (call-api "/content/articles/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    article-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-article-template
  "Create an article template
  Article Templates define a type of article and the properties they have"
  ([] (create-article-template nil))
  ([optional-params]
   (:data (create-article-template-with-http-info optional-params))))

(defn delete-article-with-http-info
  "Delete an existing article"
  [id ]
  (call-api "/content/articles/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-article
  "Delete an existing article"
  [id ]
  (:data (delete-article-with-http-info id)))

(defn delete-article-template-with-http-info
  "Delete an article template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-article-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/content/articles/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-article-template
  "Delete an article template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-article-template id nil))
  ([id optional-params]
   (:data (delete-article-template-with-http-info id optional-params))))

(defn get-article-with-http-info
  "Get a single article"
  [id ]
  (call-api "/content/articles/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-article
  "Get a single article"
  [id ]
  (:data (get-article-with-http-info id)))

(defn get-article-template-with-http-info
  "Get a single article template"
  [id ]
  (call-api "/content/articles/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-article-template
  "Get a single article template"
  [id ]
  (:data (get-article-template-with-http-info id)))

(defn get-article-templates-with-http-info
  "List and search article templates"
  ([] (get-article-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/content/articles/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-article-templates
  "List and search article templates"
  ([] (get-article-templates nil))
  ([optional-params]
   (:data (get-article-templates-with-http-info optional-params))))

(defn get-articles-with-http-info
  "List and search articles
  Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use 'Get a single article' to retrieve the full resource with assets for a given item as needed."
  ([] (get-articles-with-http-info nil))
  ([{:keys [filter-active-only filter-category filter-tagset filter-tag-intersection filter-tag-exclusion filter-title size page order ]}]
   (call-api "/content/articles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_active_only" filter-active-only "filter_category" filter-category "filter_tagset" filter-tagset "filter_tag_intersection" filter-tag-intersection "filter_tag_exclusion" filter-tag-exclusion "filter_title" filter-title "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-articles
  "List and search articles
  Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use 'Get a single article' to retrieve the full resource with assets for a given item as needed."
  ([] (get-articles nil))
  ([optional-params]
   (:data (get-articles-with-http-info optional-params))))

(defn update-article-with-http-info
  "Update an existing article"
  ([id ] (update-article-with-http-info id nil))
  ([id {:keys [article-resource ]}]
   (call-api "/content/articles/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    article-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-article
  "Update an existing article"
  ([id ] (update-article id nil))
  ([id optional-params]
   (:data (update-article-with-http-info id optional-params))))

(defn update-article-template-with-http-info
  "Update an article template"
  ([id ] (update-article-template-with-http-info id nil))
  ([id {:keys [article-template-resource ]}]
   (call-api "/content/articles/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    article-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-article-template
  "Update an article template"
  ([id ] (update-article-template id nil))
  ([id optional-params]
   (:data (update-article-template-with-http-info id optional-params))))

