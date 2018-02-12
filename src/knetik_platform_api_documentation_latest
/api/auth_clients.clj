(ns knetik-platform-api-documentation-latest
.api.auth-clients
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-client-with-http-info
  "Create a new client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([] (create-client-with-http-info nil))
  ([{:keys [client-resource ]}]
   (call-api "/auth/clients" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    client-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-client
  "Create a new client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([] (create-client nil))
  ([optional-params]
   (:data (create-client-with-http-info optional-params))))

(defn delete-client-with-http-info
  "Delete a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  [client-key ]
  (call-api "/auth/clients/{client_key}" :delete
            {:path-params   {"client_key" client-key }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-client
  "Delete a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  [client-key ]
  (:data (delete-client-with-http-info client-key)))

(defn get-client-with-http-info
  "Get a single client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  [client-key ]
  (call-api "/auth/clients/{client_key}" :get
            {:path-params   {"client_key" client-key }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-client
  "Get a single client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  [client-key ]
  (:data (get-client-with-http-info client-key)))

(defn get-client-grant-types-with-http-info
  "List available client grant types
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  []
  (call-api "/auth/clients/grant-types" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-client-grant-types
  "List available client grant types
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  []
  (:data (get-client-grant-types-with-http-info)))

(defn get-clients-with-http-info
  "List and search clients
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([] (get-clients-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/auth/clients" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-clients
  "List and search clients
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([] (get-clients nil))
  ([optional-params]
   (:data (get-clients-with-http-info optional-params))))

(defn set-client-grant-types-with-http-info
  "Set grant types for a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([client-key ] (set-client-grant-types-with-http-info client-key nil))
  ([client-key {:keys [grant-list ]}]
   (call-api "/auth/clients/{client_key}/grant-types" :put
             {:path-params   {"client_key" client-key }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    grant-list
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-client-grant-types
  "Set grant types for a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([client-key ] (set-client-grant-types client-key nil))
  ([client-key optional-params]
   (:data (set-client-grant-types-with-http-info client-key optional-params))))

(defn set-client-redirect-uris-with-http-info
  "Set redirect uris for a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([client-key ] (set-client-redirect-uris-with-http-info client-key nil))
  ([client-key {:keys [redirect-list ]}]
   (call-api "/auth/clients/{client_key}/redirect-uris" :put
             {:path-params   {"client_key" client-key }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    redirect-list
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-client-redirect-uris
  "Set redirect uris for a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([client-key ] (set-client-redirect-uris client-key nil))
  ([client-key optional-params]
   (:data (set-client-redirect-uris-with-http-info client-key optional-params))))

(defn update-client-with-http-info
  "Update a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([client-key ] (update-client-with-http-info client-key nil))
  ([client-key {:keys [client-resource ]}]
   (call-api "/auth/clients/{client_key}" :put
             {:path-params   {"client_key" client-key }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    client-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-client
  "Update a client
  <b>Permissions Needed:</b> CLIENTS_ADMIN"
  ([client-key ] (update-client client-key nil))
  ([client-key optional-params]
   (:data (update-client-with-http-info client-key optional-params))))

