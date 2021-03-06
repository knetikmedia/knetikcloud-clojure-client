(ns knetik-platform-api-documentation-latest
.api.auth-roles
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-role-with-http-info
  "Create a new role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([] (create-role-with-http-info nil))
  ([{:keys [role-resource ]}]
   (call-api "/auth/roles" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    role-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-role
  "Create a new role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([] (create-role nil))
  ([optional-params]
   (:data (create-role-with-http-info optional-params))))

(defn delete-role-with-http-info
  "Delete a role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([role ] (delete-role-with-http-info role nil))
  ([role {:keys [force ]}]
   (call-api "/auth/roles/{role}" :delete
             {:path-params   {"role" role }
              :header-params {}
              :query-params  {"force" force }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-role
  "Delete a role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([role ] (delete-role role nil))
  ([role optional-params]
   (:data (delete-role-with-http-info role optional-params))))

(defn get-client-roles-with-http-info
  "Get roles for a client
  <b>Permissions Needed:</b> ROLES_ADMIN"
  [client-key ]
  (call-api "/auth/clients/{client_key}/roles" :get
            {:path-params   {"client_key" client-key }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-client-roles
  "Get roles for a client
  <b>Permissions Needed:</b> ROLES_ADMIN"
  [client-key ]
  (:data (get-client-roles-with-http-info client-key)))

(defn get-role-with-http-info
  "Get a single role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  [role ]
  (call-api "/auth/roles/{role}" :get
            {:path-params   {"role" role }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-role
  "Get a single role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  [role ]
  (:data (get-role-with-http-info role)))

(defn get-roles-with-http-info
  "List and search roles
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([] (get-roles-with-http-info nil))
  ([{:keys [filter-name filter-role size page order ]}]
   (call-api "/auth/roles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_name" filter-name "filter_role" filter-role "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-roles
  "List and search roles
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([] (get-roles nil))
  ([optional-params]
   (:data (get-roles-with-http-info optional-params))))

(defn get-user-roles-with-http-info
  "Get roles for a user
  <b>Permissions Needed:</b> ROLES_ADMIN"
  [user-id ]
  (call-api "/auth/users/{user_id}/roles" :get
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-roles
  "Get roles for a user
  <b>Permissions Needed:</b> ROLES_ADMIN"
  [user-id ]
  (:data (get-user-roles-with-http-info user-id)))

(defn set-client-roles-with-http-info
  "Set roles for a client
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([client-key ] (set-client-roles-with-http-info client-key nil))
  ([client-key {:keys [roles-list ]}]
   (call-api "/auth/clients/{client_key}/roles" :put
             {:path-params   {"client_key" client-key }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    roles-list
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-client-roles
  "Set roles for a client
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([client-key ] (set-client-roles client-key nil))
  ([client-key optional-params]
   (:data (set-client-roles-with-http-info client-key optional-params))))

(defn set-permissions-for-role-with-http-info
  "Set permissions for a role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([role ] (set-permissions-for-role-with-http-info role nil))
  ([role {:keys [permissions-list ]}]
   (call-api "/auth/roles/{role}/permissions" :put
             {:path-params   {"role" role }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    permissions-list
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-permissions-for-role
  "Set permissions for a role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([role ] (set-permissions-for-role role nil))
  ([role optional-params]
   (:data (set-permissions-for-role-with-http-info role optional-params))))

(defn set-user-roles-with-http-info
  "Set roles for a user
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([user-id ] (set-user-roles-with-http-info user-id nil))
  ([user-id {:keys [roles-list ]}]
   (call-api "/auth/users/{user_id}/roles" :put
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    roles-list
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-user-roles
  "Set roles for a user
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([user-id ] (set-user-roles user-id nil))
  ([user-id optional-params]
   (:data (set-user-roles-with-http-info user-id optional-params))))

(defn update-role-with-http-info
  "Update a role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([role ] (update-role-with-http-info role nil))
  ([role {:keys [role-resource ]}]
   (call-api "/auth/roles/{role}" :put
             {:path-params   {"role" role }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    role-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-role
  "Update a role
  <b>Permissions Needed:</b> ROLES_ADMIN"
  ([role ] (update-role role nil))
  ([role optional-params]
   (:data (update-role-with-http-info role optional-params))))

