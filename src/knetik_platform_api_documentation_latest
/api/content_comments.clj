(ns knetik-platform-api-documentation-latest
.api.content-comments
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-comment-with-http-info
  "Add a new comment"
  ([] (add-comment-with-http-info nil))
  ([{:keys [comment-resource ]}]
   (call-api "/comments" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    comment-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn add-comment
  "Add a new comment"
  ([] (add-comment nil))
  ([optional-params]
   (:data (add-comment-with-http-info optional-params))))

(defn delete-comment-with-http-info
  "Delete a comment"
  [id ]
  (call-api "/comments/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-comment
  "Delete a comment"
  [id ]
  (:data (delete-comment-with-http-info id)))

(defn get-comment-with-http-info
  "Return a comment"
  [id ]
  (call-api "/comments/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-comment
  "Return a comment"
  [id ]
  (:data (get-comment-with-http-info id)))

(defn get-comments-with-http-info
  "Returns a page of comments"
  ([context context-id ] (get-comments-with-http-info context context-id nil))
  ([context context-id {:keys [size page ]}]
   (call-api "/comments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"context" context "context_id" context-id "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-comments
  "Returns a page of comments"
  ([context context-id ] (get-comments context context-id nil))
  ([context context-id optional-params]
   (:data (get-comments-with-http-info context context-id optional-params))))

(defn search-comments-with-http-info
  "Search the comment index
  The body is an ElasticSearch query json. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html'>documentation</a> for details on the format and search options"
  ([] (search-comments-with-http-info nil))
  ([{:keys [query size page ]}]
   (call-api "/comments/search" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :body-param    query
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn search-comments
  "Search the comment index
  The body is an ElasticSearch query json. Please see their <a href='https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html'>documentation</a> for details on the format and search options"
  ([] (search-comments nil))
  ([optional-params]
   (:data (search-comments-with-http-info optional-params))))

(defn update-comment-with-http-info
  "Update a comment"
  ([id ] (update-comment-with-http-info id nil))
  ([id {:keys [content ]}]
   (call-api "/comments/{id}/content" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    content
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-comment
  "Update a comment"
  ([id ] (update-comment id nil))
  ([id optional-params]
   (:data (update-comment-with-http-info id optional-params))))

