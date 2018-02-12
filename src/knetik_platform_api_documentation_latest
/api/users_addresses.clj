(ns knetik-platform-api-documentation-latest
.api.users-addresses
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-address-with-http-info
  "Create a new address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  ([user-id ] (create-address-with-http-info user-id nil))
  ([user-id {:keys [saved-address-resource ]}]
   (call-api "/users/{user_id}/addresses" :post
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    saved-address-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-address
  "Create a new address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  ([user-id ] (create-address user-id nil))
  ([user-id optional-params]
   (:data (create-address-with-http-info user-id optional-params))))

(defn delete-address-with-http-info
  "Delete an address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  [user-id id ]
  (call-api "/users/{user_id}/addresses/{id}" :delete
            {:path-params   {"user_id" user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-address
  "Delete an address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  [user-id id ]
  (:data (delete-address-with-http-info user-id id)))

(defn get-address-with-http-info
  "Get a single address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  [user-id id ]
  (call-api "/users/{user_id}/addresses/{id}" :get
            {:path-params   {"user_id" user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-address
  "Get a single address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  [user-id id ]
  (:data (get-address-with-http-info user-id id)))

(defn get-addresses-with-http-info
  "List and search addresses
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  ([user-id ] (get-addresses-with-http-info user-id nil))
  ([user-id {:keys [size page order ]}]
   (call-api "/users/{user_id}/addresses" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-addresses
  "List and search addresses
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  ([user-id ] (get-addresses user-id nil))
  ([user-id optional-params]
   (:data (get-addresses-with-http-info user-id optional-params))))

(defn update-address-with-http-info
  "Update an address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  ([user-id id ] (update-address-with-http-info user-id id nil))
  ([user-id id {:keys [saved-address-resource ]}]
   (call-api "/users/{user_id}/addresses/{id}" :put
             {:path-params   {"user_id" user-id "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    saved-address-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-address
  "Update an address
  <b>Permissions Needed:</b> USERS_ADMIN or owner"
  ([user-id id ] (update-address user-id id nil))
  ([user-id id optional-params]
   (:data (update-address-with-http-info user-id id optional-params))))

