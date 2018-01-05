(ns knetik-platform-api-documentation-latest
.api.search
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn search-index-with-http-info
  "Search an index with no template
  The body is an ElasticSearch query in JSON format. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html'>documentation</a> for details on the format and search options. The searchable object's format depends on on the type but mostly matches the resource from it's main endpoint. Exceptions include referenced objects (like user) being replaced with the full user resource to allow deeper searching."
  ([type ] (search-index-with-http-info type nil))
  ([type {:keys [query size page ]}]
   (call-api "/search/index/{type}" :post
             {:path-params   {"type" type }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-index
  "Search an index with no template
  The body is an ElasticSearch query in JSON format. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html'>documentation</a> for details on the format and search options. The searchable object's format depends on on the type but mostly matches the resource from it's main endpoint. Exceptions include referenced objects (like user) being replaced with the full user resource to allow deeper searching."
  ([type ] (search-index type nil))
  ([type optional-params]
   (:data (search-index-with-http-info type optional-params))))

(defn search-index-with-template-with-http-info
  "Search an index with a template
  The body is an ElasticSearch query in JSON format. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html'>documentation</a> for details on the format and search options. The searchable object's format depends on on the type but mostly matches the resource from it's main endpoint. Exceptions include referenced objects (like user) being replaced with the full user resource to allow deeper searching."
  ([type template ] (search-index-with-template-with-http-info type template nil))
  ([type template {:keys [query size page ]}]
   (call-api "/search/index/{type}/{template}" :post
             {:path-params   {"type" type "template" template }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn search-index-with-template
  "Search an index with a template
  The body is an ElasticSearch query in JSON format. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html'>documentation</a> for details on the format and search options. The searchable object's format depends on on the type but mostly matches the resource from it's main endpoint. Exceptions include referenced objects (like user) being replaced with the full user resource to allow deeper searching."
  ([type template ] (search-index-with-template type template nil))
  ([type template optional-params]
   (:data (search-index-with-template-with-http-info type template optional-params))))

