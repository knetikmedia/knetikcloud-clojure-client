(ns knetik-platform-api-documentation-latest
.api.search
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-search-index-with-http-info
  "Add a new object to an index
  Mainly intended for internal use."
  ([type id ] (add-search-index-with-http-info type id nil))
  ([type id {:keys [object ]}]
   (call-api "/search/index/{type}/{id}" :post
             {:path-params   {"type" type "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    object
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn add-search-index
  "Add a new object to an index
  Mainly intended for internal use."
  ([type id ] (add-search-index type id nil))
  ([type id optional-params]
   (:data (add-search-index-with-http-info type id optional-params))))

(defn add-search-mappings-with-http-info
  "Register reference mappings
  Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use."
  ([] (add-search-mappings-with-http-info nil))
  ([{:keys [mappings ]}]
   (call-api "/search/mappings" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    mappings
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn add-search-mappings
  "Register reference mappings
  Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use."
  ([] (add-search-mappings nil))
  ([optional-params]
   (:data (add-search-mappings-with-http-info optional-params))))

(defn delete-search-index-with-http-info
  "Delete an object
  Mainly intended for internal use. Requires SEARCH_ADMIN."
  [type id ]
  (call-api "/search/index/{type}/{id}" :delete
            {:path-params   {"type" type "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn delete-search-index
  "Delete an object
  Mainly intended for internal use. Requires SEARCH_ADMIN."
  [type id ]
  (:data (delete-search-index-with-http-info type id)))

(defn delete-search-indexes-with-http-info
  "Delete all objects in an index
  Mainly intended for internal use"
  [type ]
  (call-api "/search/index/{type}" :delete
            {:path-params   {"type" type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn delete-search-indexes
  "Delete all objects in an index
  Mainly intended for internal use"
  [type ]
  (:data (delete-search-indexes-with-http-info type)))

(defn search-index-with-http-info
  "Search an index
  The body is an ElasticSearch query in JSON format. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html'>documentation</a> for details on the format and search options. The searchable object's format depends on on the type. See individual search endpoints on other resources for details on their format."
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
              :auth-names    []})))

(defn search-index
  "Search an index
  The body is an ElasticSearch query in JSON format. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html'>documentation</a> for details on the format and search options. The searchable object's format depends on on the type. See individual search endpoints on other resources for details on their format."
  ([type ] (search-index type nil))
  ([type optional-params]
   (:data (search-index-with-http-info type optional-params))))

