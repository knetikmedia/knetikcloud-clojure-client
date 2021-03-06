(ns knetik-platform-api-documentation-latest
.api.users-relationships
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-user-relationship-with-http-info
  "Create a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_ADMIN"
  ([] (create-user-relationship-with-http-info nil))
  ([{:keys [relationship ]}]
   (call-api "/users/relationships" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    relationship
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-user-relationship
  "Create a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_ADMIN"
  ([] (create-user-relationship nil))
  ([optional-params]
   (:data (create-user-relationship-with-http-info optional-params))))

(defn delete-user-relationship-with-http-info
  "Delete a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_ADMIN"
  [id ]
  (call-api "/users/relationships/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-user-relationship
  "Delete a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_ADMIN"
  [id ]
  (:data (delete-user-relationship-with-http-info id)))

(defn get-user-relationship-with-http-info
  "Get a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN"
  [id ]
  (call-api "/users/relationships/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-relationship
  "Get a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN"
  [id ]
  (:data (get-user-relationship-with-http-info id)))

(defn get-user-relationships-with-http-info
  "Get a list of user relationships
  <b>Permissions Needed:</b> RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN"
  ([] (get-user-relationships-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/users/relationships" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-relationships
  "Get a list of user relationships
  <b>Permissions Needed:</b> RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN"
  ([] (get-user-relationships nil))
  ([optional-params]
   (:data (get-user-relationships-with-http-info optional-params))))

(defn update-user-relationship-with-http-info
  "Update a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_ADMIN"
  ([id ] (update-user-relationship-with-http-info id nil))
  ([id {:keys [relationship ]}]
   (call-api "/users/relationships/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    relationship
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-user-relationship
  "Update a user relationship
  <b>Permissions Needed:</b> RELATIONSHIPS_ADMIN"
  ([id ] (update-user-relationship id nil))
  ([id optional-params]
   (:data (update-user-relationship-with-http-info id optional-params))))

