(ns knetik-platform-api-documentation-latest
.api.content-articles
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-article-with-http-info
  "Create a new article
  Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.<br><br><b>Permissions:</b> ARTICLES_ADMIN"
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
  Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.<br><br><b>Permissions:</b> ARTICLES_ADMIN"
  ([] (create-article nil))
  ([optional-params]
   (:data (create-article-with-http-info optional-params))))

(defn create-article-template-with-http-info
  "Create an article template
  Article Templates define a type of article and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
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
  Article Templates define a type of article and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-article-template nil))
  ([optional-params]
   (:data (create-article-template-with-http-info optional-params))))

(defn create-template-with-http-info
  "Create a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint ] (create-template-with-http-info type-hint nil))
  ([type-hint {:keys [template ]}]
   (call-api "/templates/{type_hint}" :post
             {:path-params   {"type_hint" type-hint }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-template
  "Create a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint ] (create-template type-hint nil))
  ([type-hint optional-params]
   (:data (create-template-with-http-info type-hint optional-params))))

(defn delete-article-with-http-info
  "Delete an existing article
  <b>Permissions Needed:</b> ARTICLES_ADMIN"
  [id ]
  (call-api "/content/articles/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-article
  "Delete an existing article
  <b>Permissions Needed:</b> ARTICLES_ADMIN"
  [id ]
  (:data (delete-article-with-http-info id)))

(defn delete-article-template-with-http-info
  "Delete an article template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-article-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/content/articles/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-article-template
  "Delete an article template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-article-template id nil))
  ([id optional-params]
   (:data (delete-article-template-with-http-info id optional-params))))

(defn delete-template-with-http-info
  "Delete a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint id ] (delete-template-with-http-info type-hint id nil))
  ([type-hint id {:keys [cascade ]}]
   (call-api "/templates/{type_hint}/{id}" :delete
             {:path-params   {"type_hint" type-hint "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    cascade
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-template
  "Delete a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint id ] (delete-template type-hint id nil))
  ([type-hint id optional-params]
   (:data (delete-template-with-http-info type-hint id optional-params))))

(defn get-article-with-http-info
  "Get a single article
  <b>Permissions Needed:</b> ANY"
  [id ]
  (call-api "/content/articles/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-article
  "Get a single article
  <b>Permissions Needed:</b> ANY"
  [id ]
  (:data (get-article-with-http-info id)))

(defn get-article-template-with-http-info
  "Get a single article template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTICLES_ADMIN"
  [id ]
  (call-api "/content/articles/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-article-template
  "Get a single article template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTICLES_ADMIN"
  [id ]
  (:data (get-article-template-with-http-info id)))

(defn get-article-templates-with-http-info
  "List and search article templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTICLES_ADMIN"
  ([] (get-article-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/content/articles/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-article-templates
  "List and search article templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTICLES_ADMIN"
  ([] (get-article-templates nil))
  ([optional-params]
   (:data (get-article-templates-with-http-info optional-params))))

(defn get-articles-with-http-info
  "List and search articles
  Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use 'Get a single article' to retrieve the full resource with assets for a given item as needed. <br><br><b>Permissions Needed:</b> ANY"
  ([] (get-articles-with-http-info nil))
  ([{:keys [filter-active-only filter-category filter-tagset filter-tag-intersection filter-tag-exclusion filter-title size page order ]}]
   (call-api "/content/articles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_active_only" filter-active-only "filter_category" filter-category "filter_tagset" filter-tagset "filter_tag_intersection" filter-tag-intersection "filter_tag_exclusion" filter-tag-exclusion "filter_title" filter-title "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-articles
  "List and search articles
  Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use 'Get a single article' to retrieve the full resource with assets for a given item as needed. <br><br><b>Permissions Needed:</b> ANY"
  ([] (get-articles nil))
  ([optional-params]
   (:data (get-articles-with-http-info optional-params))))

(defn get-template-with-http-info
  "Get a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  [type-hint id ]
  (call-api "/templates/{type_hint}/{id}" :get
            {:path-params   {"type_hint" type-hint "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-template
  "Get a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  [type-hint id ]
  (:data (get-template-with-http-info type-hint id)))

(defn get-templates-with-http-info
  "List and search templates
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint ] (get-templates-with-http-info type-hint nil))
  ([type-hint {:keys [size page order ]}]
   (call-api "/templates/{type_hint}" :get
             {:path-params   {"type_hint" type-hint }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-templates
  "List and search templates
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint ] (get-templates type-hint nil))
  ([type-hint optional-params]
   (:data (get-templates-with-http-info type-hint optional-params))))

(defn update-article-with-http-info
  "Update an existing article
  <b>Permissions Needed:</b> ARTICLES_ADMIN"
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
  "Update an existing article
  <b>Permissions Needed:</b> ARTICLES_ADMIN"
  ([id ] (update-article id nil))
  ([id optional-params]
   (:data (update-article-with-http-info id optional-params))))

(defn update-article-template-with-http-info
  "Update an article template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
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
  "Update an article template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-article-template id nil))
  ([id optional-params]
   (:data (update-article-template-with-http-info id optional-params))))

(defn update-template-with-http-info
  "Update a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint id ] (update-template-with-http-info type-hint id nil))
  ([type-hint id {:keys [template ]}]
   (call-api "/templates/{type_hint}/{id}" :put
             {:path-params   {"type_hint" type-hint "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-template
  "Update a template
  <b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint id ] (update-template type-hint id nil))
  ([type-hint id optional-params]
   (:data (update-template-with-http-info type-hint id optional-params))))

(defn validate-with-http-info
  "Validate a templated resource
  Error code thrown if invalid.<br><br><b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint ] (validate-with-http-info type-hint nil))
  ([type-hint {:keys [resource ]}]
   (call-api "/templates/{type_hint}/validate" :post
             {:path-params   {"type_hint" type-hint }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn validate
  "Validate a templated resource
  Error code thrown if invalid.<br><br><b>Permissions Needed:</b> TEMPLATES_ADMIN"
  ([type-hint ] (validate type-hint nil))
  ([type-hint optional-params]
   (:data (validate-with-http-info type-hint optional-params))))

