(ns knetik-platform-api-documentation-latest
.api.search
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn search-count-get-with-http-info
  "Count matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type ]
  (call-api "/search/count/{type}" :get
            {:path-params   {"type" type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-count-get
  "Count matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type ]
  (:data (search-count-get-with-http-info type)))

(defn search-count-post-with-http-info
  "Count matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type ] (search-count-post-with-http-info type nil))
  ([type {:keys [query ]}]
   (call-api "/search/count/{type}" :post
             {:path-params   {"type" type }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-count-post
  "Count matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type ] (search-count-post type nil))
  ([type optional-params]
   (:data (search-count-post-with-http-info type optional-params))))

(defn search-count-with-template-get-with-http-info
  "Count matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type template ]
  (call-api "/search/count/{type}/{template}" :get
            {:path-params   {"type" type "template" template }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-count-with-template-get
  "Count matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type template ]
  (:data (search-count-with-template-get-with-http-info type template)))

(defn search-count-with-template-post-with-http-info
  "Count matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type template ] (search-count-with-template-post-with-http-info type template nil))
  ([type template {:keys [query ]}]
   (call-api "/search/count/{type}/{template}" :post
             {:path-params   {"type" type "template" template }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-count-with-template-post
  "Count matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type template ] (search-count-with-template-post type template nil))
  ([type template optional-params]
   (:data (search-count-with-template-post-with-http-info type template optional-params))))

(defn search-document-get-with-http-info
  "Get document with no template
  This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id ]
  (call-api "/search/documents/{type}/{id}" :get
            {:path-params   {"type" type "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-document-get
  "Get document with no template
  This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id ]
  (:data (search-document-get-with-http-info type id)))

(defn search-document-with-template-get-with-http-info
  "Get document with a template
  This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id template ]
  (call-api "/search/documents/{type}/{template}/{id}" :get
            {:path-params   {"type" type "id" id "template" template }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-document-with-template-get
  "Get document with a template
  This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id template ]
  (:data (search-document-with-template-get-with-http-info type id template)))

(defn search-explain-get-with-http-info
  "Explain matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id ]
  (call-api "/search/explain/{type}/{id}" :get
            {:path-params   {"type" type "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-explain-get
  "Explain matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id ]
  (:data (search-explain-get-with-http-info type id)))

(defn search-explain-post-with-http-info
  "Explain matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type id ] (search-explain-post-with-http-info type id nil))
  ([type id {:keys [query ]}]
   (call-api "/search/explain/{type}/{id}" :post
             {:path-params   {"type" type "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-explain-post
  "Explain matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type id ] (search-explain-post type id nil))
  ([type id optional-params]
   (:data (search-explain-post-with-http-info type id optional-params))))

(defn search-explain-with-template-get-with-http-info
  "Explain matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id template ]
  (call-api "/search/explain/{type}/{template}/{id}" :get
            {:path-params   {"type" type "id" id "template" template }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-explain-with-template-get
  "Explain matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  [type id template ]
  (:data (search-explain-with-template-get-with-http-info type id template)))

(defn search-explain-with-template-post-with-http-info
  "Explain matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type id template ] (search-explain-with-template-post-with-http-info type id template nil))
  ([type id template {:keys [query ]}]
   (call-api "/search/explain/{type}/{template}/{id}" :post
             {:path-params   {"type" type "id" id "template" template }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-explain-with-template-post
  "Explain matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html'>API guide</a>"
  ([type id template ] (search-explain-with-template-post type id template nil))
  ([type id template optional-params]
   (:data (search-explain-with-template-post-with-http-info type id template optional-params))))

(defn search-index-with-http-info
  "Search an index with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  ([type ] (search-index-with-http-info type nil))
  ([type {:keys [query ]}]
   (call-api "/search/index/{type}" :post
             {:path-params   {"type" type }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-index
  "Search an index with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  ([type ] (search-index type nil))
  ([type optional-params]
   (:data (search-index-with-http-info type optional-params))))

(defn search-index-get-with-http-info
  "Search an index with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  [type ]
  (call-api "/search/index/{type}" :get
            {:path-params   {"type" type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-index-get
  "Search an index with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  [type ]
  (:data (search-index-get-with-http-info type)))

(defn search-index-with-template-get-with-http-info
  "Search an index with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  [type template ]
  (call-api "/search/index/{type}/{template}" :get
            {:path-params   {"type" type "template" template }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-index-with-template-get
  "Search an index with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  [type template ]
  (:data (search-index-with-template-get-with-http-info type template)))

(defn search-index-with-template-post-with-http-info
  "Search an index with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  ([type template ] (search-index-with-template-post-with-http-info type template nil))
  ([type template {:keys [query ]}]
   (call-api "/search/index/{type}/{template}" :post
             {:path-params   {"type" type "template" template }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-index-with-template-post
  "Search an index with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html'>API guide</a>"
  ([type template ] (search-index-with-template-post type template nil))
  ([type template optional-params]
   (:data (search-index-with-template-post-with-http-info type template optional-params))))

(defn search-indices-get-with-http-info
  "Get indices
  This is a 1 to 1 mapping of a ElasticSearch call to _cat/indices for indices.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html'>API guide</a>"
  []
  (call-api "/search/indices" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-indices-get
  "Get indices
  This is a 1 to 1 mapping of a ElasticSearch call to _cat/indices for indices.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html'>API guide</a>"
  []
  (:data (search-indices-get-with-http-info)))

(defn search-mappings-get-with-http-info
  "Get mapping with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html'>API guide</a>"
  [type ]
  (call-api "/search/mappings/{type}" :get
            {:path-params   {"type" type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-mappings-get
  "Get mapping with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html'>API guide</a>"
  [type ]
  (:data (search-mappings-get-with-http-info type)))

(defn search-mappings-with-template-get-with-http-info
  "Get mapping with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html'>API guide</a>"
  [type template ]
  (call-api "/search/mappings/{type}/{template}" :get
            {:path-params   {"type" type "template" template }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-mappings-with-template-get
  "Get mapping with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html'>API guide</a>"
  [type template ]
  (:data (search-mappings-with-template-get-with-http-info type template)))

(defn search-validate-get-with-http-info
  "Validate matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  [type ]
  (call-api "/search/validate/{type}" :get
            {:path-params   {"type" type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-validate-get
  "Validate matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  [type ]
  (:data (search-validate-get-with-http-info type)))

(defn search-validate-post-with-http-info
  "Validate matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  ([type ] (search-validate-post-with-http-info type nil))
  ([type {:keys [query ]}]
   (call-api "/search/validate/{type}" :post
             {:path-params   {"type" type }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-validate-post
  "Validate matches with no template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  ([type ] (search-validate-post type nil))
  ([type optional-params]
   (:data (search-validate-post-with-http-info type optional-params))))

(defn search-validate-with-template-get-with-http-info
  "Validate matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  [type template ]
  (call-api "/search/validate/{type}/{template}" :get
            {:path-params   {"type" type "template" template }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn search-validate-with-template-get
  "Validate matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  [type template ]
  (:data (search-validate-with-template-get-with-http-info type template)))

(defn search-validate-with-template-post-with-http-info
  "Validate matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  ([type template ] (search-validate-with-template-post-with-http-info type template nil))
  ([type template {:keys [query ]}]
   (call-api "/search/validate/{type}/{template}" :post
             {:path-params   {"type" type "template" template }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-validate-with-template-post
  "Validate matches with a template
  This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html'>API guide</a>"
  ([type template ] (search-validate-with-template-post type template nil))
  ([type template optional-params]
   (:data (search-validate-with-template-post-with-http-info type template optional-params))))

