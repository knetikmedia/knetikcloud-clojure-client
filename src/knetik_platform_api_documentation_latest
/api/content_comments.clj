(ns knetik-platform-api-documentation-latest
.api.content-comments
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-comment-with-http-info
  "Add a new comment
  <b>Permissions Needed:</b> COMMENTS_USER or COMMENTS_ADMIN"
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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-comment
  "Add a new comment
  <b>Permissions Needed:</b> COMMENTS_USER or COMMENTS_ADMIN"
  ([] (add-comment nil))
  ([optional-params]
   (:data (add-comment-with-http-info optional-params))))

(defn delete-comment-with-http-info
  "Delete a comment
  <b>Permissions Needed:</b> COMMENTS_USER or COMMENTS_ADMIN"
  [id ]
  (call-api "/comments/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-comment
  "Delete a comment
  <b>Permissions Needed:</b> COMMENTS_USER or COMMENTS_ADMIN"
  [id ]
  (:data (delete-comment-with-http-info id)))

(defn get-comment-with-http-info
  "Return a comment
  <b>Permissions Needed:</b> ANY"
  [id ]
  (call-api "/comments/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-comment
  "Return a comment
  <b>Permissions Needed:</b> ANY"
  [id ]
  (:data (get-comment-with-http-info id)))

(defn get-comments-with-http-info
  "Returns a page of comments
  <b>Permissions Needed:</b> ANY"
  ([context context-id ] (get-comments-with-http-info context context-id nil))
  ([context context-id {:keys [size page ]}]
   (call-api "/comments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"context" context "context_id" context-id "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-comments
  "Returns a page of comments
  <b>Permissions Needed:</b> ANY"
  ([context context-id ] (get-comments context context-id nil))
  ([context context-id optional-params]
   (:data (get-comments-with-http-info context context-id optional-params))))

(defn update-comment-with-http-info
  "Update a comment
  <b>Permissions Needed:</b> COMMENTS_USER or COMMENTS_ADMIN"
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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-comment
  "Update a comment
  <b>Permissions Needed:</b> COMMENTS_USER or COMMENTS_ADMIN"
  ([id ] (update-comment id nil))
  ([id optional-params]
   (:data (update-comment-with-http-info id optional-params))))

