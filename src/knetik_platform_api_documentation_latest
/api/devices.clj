(ns knetik-platform-api-documentation-latest
.api.devices
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-device-users-with-http-info
  "Add device users
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
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
  "Add device users
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  [user-resources id ]
  (:data (add-device-users-with-http-info user-resources id)))

(defn create-device-with-http-info
  "Create a device
  <b>Permissions Needed:</b> ANY"
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
  "Create a device
  <b>Permissions Needed:</b> ANY"
  [device ]
  (:data (create-device-with-http-info device)))

(defn create-device-template-with-http-info
  "Create a device template
  Device Templates define a type of device and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-device-template-with-http-info nil))
  ([{:keys [device-template-resource ]}]
   (call-api "/devices/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    device-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-device-template
  "Create a device template
  Device Templates define a type of device and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-device-template nil))
  ([optional-params]
   (:data (create-device-template-with-http-info optional-params))))

(defn delete-device-with-http-info
  "Delete a device
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  [id ]
  (call-api "/devices/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-device
  "Delete a device
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  [id ]
  (:data (delete-device-with-http-info id)))

(defn delete-device-template-with-http-info
  "Delete an device template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-device-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/devices/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-device-template
  "Delete an device template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-device-template id nil))
  ([id optional-params]
   (:data (delete-device-template-with-http-info id optional-params))))

(defn delete-device-user-with-http-info
  "Delete a device user
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  [id user-id ]
  (call-api "/devices/{id}/users/{user_id}" :delete
            {:path-params   {"id" id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-device-user
  "Delete a device user
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  [id user-id ]
  (:data (delete-device-user-with-http-info id user-id)))

(defn delete-device-users-with-http-info
  "Delete all device users
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  ([id ] (delete-device-users-with-http-info id nil))
  ([id {:keys [filter-id ]}]
   (call-api "/devices/{id}/users" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"filter_id" filter-id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-device-users
  "Delete all device users
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  ([id ] (delete-device-users id nil))
  ([id optional-params]
   (:data (delete-device-users-with-http-info id optional-params))))

(defn get-device-with-http-info
  "Get a single device
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  [id ]
  (call-api "/devices/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-device
  "Get a single device
  <b>Permissions Needed:</b> DEVICES_ADMIN or owner"
  [id ]
  (:data (get-device-with-http-info id)))

(defn get-device-template-with-http-info
  "Get a single device template
  <b>Permissions Needed:</b> description"
  [id ]
  (call-api "/devices/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-device-template
  "Get a single device template
  <b>Permissions Needed:</b> description"
  [id ]
  (:data (get-device-template-with-http-info id)))

(defn get-device-templates-with-http-info
  "List and search device templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or DEVICES_ADMIN"
  ([] (get-device-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/devices/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-device-templates
  "List and search device templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or DEVICES_ADMIN"
  ([] (get-device-templates nil))
  ([optional-params]
   (:data (get-device-templates-with-http-info optional-params))))

(defn get-devices-with-http-info
  "List and search devices
  Get a list of devices with optional filtering. <br><br><b>Permissions Needed:</b> DEVICES_ADMIN or user"
  ([] (get-devices-with-http-info nil))
  ([{:keys [filter-make filter-model filter-os filter-serial filter-type filter-tag size page order ]}]
   (call-api "/devices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_make" filter-make "filter_model" filter-model "filter_os" filter-os "filter_serial" filter-serial "filter_type" filter-type "filter_tag" filter-tag "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-devices
  "List and search devices
  Get a list of devices with optional filtering. <br><br><b>Permissions Needed:</b> DEVICES_ADMIN or user"
  ([] (get-devices nil))
  ([optional-params]
   (:data (get-devices-with-http-info optional-params))))

(defn update-device-with-http-info
  "Update a device
  <b>Permissions Needed:</b> CUSTOMERS_ADMIN"
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
  "Update a device
  <b>Permissions Needed:</b> CUSTOMERS_ADMIN"
  [device id ]
  (:data (update-device-with-http-info device id)))

(defn update-device-template-with-http-info
  "Update an device template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-device-template-with-http-info id nil))
  ([id {:keys [device-template-resource ]}]
   (call-api "/devices/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    device-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-device-template
  "Update an device template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-device-template id nil))
  ([id optional-params]
   (:data (update-device-template-with-http-info id optional-params))))

