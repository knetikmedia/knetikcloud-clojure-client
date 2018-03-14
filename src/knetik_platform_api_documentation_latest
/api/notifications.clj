(ns knetik-platform-api-documentation-latest
.api.notifications
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-notification-type-with-http-info
  "Create a notification type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([] (create-notification-type-with-http-info nil))
  ([{:keys [notification-type ]}]
   (call-api "/notifications/types" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    notification-type
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-notification-type
  "Create a notification type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([] (create-notification-type nil))
  ([optional-params]
   (:data (create-notification-type-with-http-info optional-params))))

(defn delete-notification-type-with-http-info
  "Delete a notification type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  [id ]
  (call-api "/notifications/types/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-notification-type
  "Delete a notification type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  [id ]
  (:data (delete-notification-type-with-http-info id)))

(defn get-notification-type-with-http-info
  "Get a single notification type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  [id ]
  (call-api "/notifications/types/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-notification-type
  "Get a single notification type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  [id ]
  (:data (get-notification-type-with-http-info id)))

(defn get-notification-types-with-http-info
  "List and search notification types
  Get a list of notification type with optional filtering. <br><br><b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([] (get-notification-types-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/notifications/types" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-notification-types
  "List and search notification types
  Get a list of notification type with optional filtering. <br><br><b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([] (get-notification-types nil))
  ([optional-params]
   (:data (get-notification-types-with-http-info optional-params))))

(defn get-user-notification-info-with-http-info
  "View a user's notification settings for a type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  [type-id user-id ]
  (call-api "/users/{user_id}/notifications/types/{type_id}" :get
            {:path-params   {"type_id" type-id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-notification-info
  "View a user's notification settings for a type
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  [type-id user-id ]
  (:data (get-user-notification-info-with-http-info type-id user-id)))

(defn get-user-notification-info-list-with-http-info
  "View a user's notification settings
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  ([user-id ] (get-user-notification-info-list-with-http-info user-id nil))
  ([user-id {:keys [size page order ]}]
   (call-api "/users/{user_id}/notifications/types" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-notification-info-list
  "View a user's notification settings
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  ([user-id ] (get-user-notification-info-list user-id nil))
  ([user-id optional-params]
   (:data (get-user-notification-info-list-with-http-info user-id optional-params))))

(defn get-user-notifications-with-http-info
  "Get notifications
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  ([id ] (get-user-notifications-with-http-info id nil))
  ([id {:keys [filter-status size page order ]}]
   (call-api "/users/{id}/notifications" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"filter_status" filter-status "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-notifications
  "Get notifications
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  ([id ] (get-user-notifications id nil))
  ([id optional-params]
   (:data (get-user-notifications-with-http-info id optional-params))))

(defn send-notification-with-http-info
  "Send a notification
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([] (send-notification-with-http-info nil))
  ([{:keys [notification ]}]
   (call-api "/notifications" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    notification
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-notification
  "Send a notification
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([] (send-notification nil))
  ([optional-params]
   (:data (send-notification-with-http-info optional-params))))

(defn set-user-notification-status-with-http-info
  "Set notification status
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  ([user-id notification-id ] (set-user-notification-status-with-http-info user-id notification-id nil))
  ([user-id notification-id {:keys [notification ]}]
   (call-api "/users/{user_id}/notifications/{notification_id}/status" :put
             {:path-params   {"user_id" user-id "notification_id" notification-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    notification
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-user-notification-status
  "Set notification status
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  ([user-id notification-id ] (set-user-notification-status user-id notification-id nil))
  ([user-id notification-id optional-params]
   (:data (set-user-notification-status-with-http-info user-id notification-id optional-params))))

(defn silence-direct-notifications-with-http-info
  "Enable or disable direct notifications for a user
  Allows enabling or disabling messages for a given notification type when sent direct to the user. Notifications can still be retrieved by endpoint. For notifications broadcased to a topic, see the topic service to disable messages for the user there. <br><br><b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  [type-id user-id silenced ]
  (call-api "/users/{user_id}/notifications/types/{type_id}/silenced" :put
            {:path-params   {"type_id" type-id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    silenced
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn silence-direct-notifications
  "Enable or disable direct notifications for a user
  Allows enabling or disabling messages for a given notification type when sent direct to the user. Notifications can still be retrieved by endpoint. For notifications broadcased to a topic, see the topic service to disable messages for the user there. <br><br><b>Permissions Needed:</b> NOTIFICATIONS_ADMIN or self"
  [type-id user-id silenced ]
  (:data (silence-direct-notifications-with-http-info type-id user-id silenced)))

(defn update-notification-type-with-http-info
  "Update a notificationType
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([id ] (update-notification-type-with-http-info id nil))
  ([id {:keys [notification-type ]}]
   (call-api "/notifications/types/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    notification-type
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-notification-type
  "Update a notificationType
  <b>Permissions Needed:</b> NOTIFICATIONS_ADMIN"
  ([id ] (update-notification-type id nil))
  ([id optional-params]
   (:data (update-notification-type-with-http-info id optional-params))))

