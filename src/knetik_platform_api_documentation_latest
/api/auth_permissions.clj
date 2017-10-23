(ns knetik-platform-api-documentation-latest
.api.auth-permissions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-permission-with-http-info
  "Create a new permission"
  ([] (create-permission-with-http-info nil))
  ([{:keys [permission-resource ]}]
   (call-api "/auth/permissions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    permission-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-permission
  "Create a new permission"
  ([] (create-permission nil))
  ([optional-params]
   (:data (create-permission-with-http-info optional-params))))

(defn delete-permission-with-http-info
  "Delete a permission"
  ([permission ] (delete-permission-with-http-info permission nil))
  ([permission {:keys [force ]}]
   (call-api "/auth/permissions/{permission}" :delete
             {:path-params   {"permission" permission }
              :header-params {}
              :query-params  {"force" force }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-permission
  "Delete a permission"
  ([permission ] (delete-permission permission nil))
  ([permission optional-params]
   (:data (delete-permission-with-http-info permission optional-params))))

(defn get-permission-with-http-info
  "Get a single permission"
  [permission ]
  (call-api "/auth/permissions/{permission}" :get
            {:path-params   {"permission" permission }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-permission
  "Get a single permission"
  [permission ]
  (:data (get-permission-with-http-info permission)))

(defn get-permissions-with-http-info
  "List and search permissions"
  ([] (get-permissions-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/auth/permissions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-permissions
  "List and search permissions"
  ([] (get-permissions nil))
  ([optional-params]
   (:data (get-permissions-with-http-info optional-params))))

(defn update-permission-with-http-info
  "Update a permission"
  ([permission ] (update-permission-with-http-info permission nil))
  ([permission {:keys [permission-resource ]}]
   (call-api "/auth/permissions/{permission}" :put
             {:path-params   {"permission" permission }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    permission-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-permission
  "Update a permission"
  ([permission ] (update-permission permission nil))
  ([permission optional-params]
   (:data (update-permission-with-http-info permission optional-params))))

