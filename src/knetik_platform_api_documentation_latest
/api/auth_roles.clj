(ns knetik-platform-api-documentation-latest
.api.auth-roles
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-role-with-http-info
  "Create a new role"
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
              :auth-names    ["OAuth2"]})))

(defn create-role
  "Create a new role"
  ([] (create-role nil))
  ([optional-params]
   (:data (create-role-with-http-info optional-params))))

(defn delete-role-with-http-info
  "Delete a role"
  ([role ] (delete-role-with-http-info role nil))
  ([role {:keys [force ]}]
   (call-api "/auth/roles/{role}" :delete
             {:path-params   {"role" role }
              :header-params {}
              :query-params  {"force" force }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn delete-role
  "Delete a role"
  ([role ] (delete-role role nil))
  ([role optional-params]
   (:data (delete-role-with-http-info role optional-params))))

(defn get-client-roles-with-http-info
  "Get roles for a client"
  [client-key ]
  (call-api "/auth/clients/{client_key}/roles" :get
            {:path-params   {"client_key" client-key }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-client-roles
  "Get roles for a client"
  [client-key ]
  (:data (get-client-roles-with-http-info client-key)))

(defn get-role-with-http-info
  "Get a single role"
  [role ]
  (call-api "/auth/roles/{role}" :get
            {:path-params   {"role" role }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-role
  "Get a single role"
  [role ]
  (:data (get-role-with-http-info role)))

(defn get-roles-with-http-info
  "List and search roles"
  ([] (get-roles-with-http-info nil))
  ([{:keys [filter-name filter-role size page order ]}]
   (call-api "/auth/roles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_name" filter-name "filter_role" filter-role "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-roles
  "List and search roles"
  ([] (get-roles nil))
  ([optional-params]
   (:data (get-roles-with-http-info optional-params))))

(defn get-user-roles-with-http-info
  "Get roles for a user"
  [user-id ]
  (call-api "/auth/users/{user_id}/roles" :get
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-user-roles
  "Get roles for a user"
  [user-id ]
  (:data (get-user-roles-with-http-info user-id)))

(defn set-client-roles-with-http-info
  "Set roles for a client"
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
              :auth-names    ["OAuth2"]})))

(defn set-client-roles
  "Set roles for a client"
  ([client-key ] (set-client-roles client-key nil))
  ([client-key optional-params]
   (:data (set-client-roles-with-http-info client-key optional-params))))

(defn set-permissions-for-role-with-http-info
  "Set permissions for a role"
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
              :auth-names    ["OAuth2"]})))

(defn set-permissions-for-role
  "Set permissions for a role"
  ([role ] (set-permissions-for-role role nil))
  ([role optional-params]
   (:data (set-permissions-for-role-with-http-info role optional-params))))

(defn set-user-roles-with-http-info
  "Set roles for a user"
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
              :auth-names    ["OAuth2"]})))

(defn set-user-roles
  "Set roles for a user"
  ([user-id ] (set-user-roles user-id nil))
  ([user-id optional-params]
   (:data (set-user-roles-with-http-info user-id optional-params))))

(defn update-role-with-http-info
  "Update a role"
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
              :auth-names    ["OAuth2"]})))

(defn update-role
  "Update a role"
  ([role ] (update-role role nil))
  ([role optional-params]
   (:data (update-role-with-http-info role optional-params))))

