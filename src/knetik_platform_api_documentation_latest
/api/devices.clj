(ns knetik-platform-api-documentation-latest
.api.devices
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-device-users-with-http-info
  "Add device users"
  [user-resources id ]
  (call-api "/devices/{id}/users" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user-resources
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn add-device-users
  "Add device users"
  [user-resources id ]
  (:data (add-device-users-with-http-info user-resources id)))

(defn create-device-with-http-info
  "Create a device"
  [device ]
  (call-api "/devices" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    device
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn create-device
  "Create a device"
  [device ]
  (:data (create-device-with-http-info device)))

(defn delete-device-with-http-info
  "Delete a device"
  [id ]
  (call-api "/devices/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-device
  "Delete a device"
  [id ]
  (:data (delete-device-with-http-info id)))

(defn delete-device-user-with-http-info
  "Delete a device user"
  [id user-id ]
  (call-api "/devices/{id}/users/{user_id}" :delete
            {:path-params   {"id" id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-device-user
  "Delete a device user"
  [id user-id ]
  (:data (delete-device-user-with-http-info id user-id)))

(defn delete-device-users-with-http-info
  "Delete all device users"
  ([id ] (delete-device-users-with-http-info id nil))
  ([id {:keys [filter-id ]}]
   (call-api "/devices/{id}/users" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"filter_id" filter-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-device-users
  "Delete all device users"
  ([id ] (delete-device-users id nil))
  ([id optional-params]
   (:data (delete-device-users-with-http-info id optional-params))))

(defn get-device-with-http-info
  "Get a single device"
  [id ]
  (call-api "/devices/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-device
  "Get a single device"
  [id ]
  (:data (get-device-with-http-info id)))

(defn get-devices-with-http-info
  "List and search devices
  Get a list of devices with optional filtering"
  ([] (get-devices-with-http-info nil))
  ([{:keys [filter-make filter-model size page order ]}]
   (call-api "/devices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_make" filter-make "filter_model" filter-model "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-devices
  "List and search devices
  Get a list of devices with optional filtering"
  ([] (get-devices nil))
  ([optional-params]
   (:data (get-devices-with-http-info optional-params))))

(defn update-device-with-http-info
  "Update a device"
  [device id ]
  (call-api "/devices/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    device
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn update-device
  "Update a device"
  [device id ]
  (:data (update-device-with-http-info device id)))

