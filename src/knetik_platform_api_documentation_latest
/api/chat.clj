(ns knetik-platform-api-documentation-latest
.api.chat
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn acknowledge-chat-message-with-http-info
  "Acknowledge number of messages in a thread
  <b>Permissions Needed:</b> owner"
  ([id ] (acknowledge-chat-message-with-http-info id nil))
  ([id {:keys [read-count ]}]
   (call-api "/chat/threads/{id}/acknowledge" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    read-count
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn acknowledge-chat-message
  "Acknowledge number of messages in a thread
  <b>Permissions Needed:</b> owner"
  ([id ] (acknowledge-chat-message id nil))
  ([id optional-params]
   (:data (acknowledge-chat-message-with-http-info id optional-params))))

(defn add-chat-message-blacklist-with-http-info
  "Add a user to a chat message blacklist
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [blacklisted-user-id id ]
  (call-api "/chat/users/{id}/blacklist/{blacklisted_user_id}" :post
            {:path-params   {"blacklisted_user_id" blacklisted-user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn add-chat-message-blacklist
  "Add a user to a chat message blacklist
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [blacklisted-user-id id ]
  (:data (add-chat-message-blacklist-with-http-info blacklisted-user-id id)))

(defn delete-chat-message-with-http-info
  "Delete a message
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [id ]
  (call-api "/chat/messages/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-chat-message
  "Delete a message
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [id ]
  (:data (delete-chat-message-with-http-info id)))

(defn edit-chat-message-with-http-info
  "Edit your message
  <b>Permissions Needed:</b> owner"
  ([id ] (edit-chat-message-with-http-info id nil))
  ([id {:keys [chat-message-resource ]}]
   (call-api "/chat/messages/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    chat-message-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn edit-chat-message
  "Edit your message
  <b>Permissions Needed:</b> owner"
  ([id ] (edit-chat-message id nil))
  ([id optional-params]
   (:data (edit-chat-message-with-http-info id optional-params))))

(defn get-chat-message-with-http-info
  "Get a message
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [id ]
  (call-api "/chat/messages/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-chat-message
  "Get a message
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [id ]
  (:data (get-chat-message-with-http-info id)))

(defn get-chat-message-blacklist-with-http-info
  "Get a list of blocked users for chat messaging
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [id ]
  (call-api "/chat/users/{id}/blacklist" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-chat-message-blacklist
  "Get a list of blocked users for chat messaging
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [id ]
  (:data (get-chat-message-blacklist-with-http-info id)))

(defn get-chat-threads-with-http-info
  "List your threads
  <b>Permissions Needed:</b> owner"
  ([] (get-chat-threads-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/chat/threads" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-chat-threads
  "List your threads
  <b>Permissions Needed:</b> owner"
  ([] (get-chat-threads nil))
  ([optional-params]
   (:data (get-chat-threads-with-http-info optional-params))))

(defn get-direct-messages-with-http-info
  "List messages with a user
  <b>Permissions Needed:</b> owner"
  ([id ] (get-direct-messages-with-http-info id nil))
  ([id {:keys [size page order ]}]
   (call-api "/chat/users/{id}/messages" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-direct-messages
  "List messages with a user
  <b>Permissions Needed:</b> owner"
  ([id ] (get-direct-messages id nil))
  ([id optional-params]
   (:data (get-direct-messages-with-http-info id optional-params))))

(defn get-thread-messages-with-http-info
  "List messages in a thread
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  ([id ] (get-thread-messages-with-http-info id nil))
  ([id {:keys [size page order ]}]
   (call-api "/chat/threads/{id}/messages" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-thread-messages
  "List messages in a thread
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  ([id ] (get-thread-messages id nil))
  ([id optional-params]
   (:data (get-thread-messages-with-http-info id optional-params))))

(defn get-topic-messages-with-http-info
  "List messages in a topic
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  ([id ] (get-topic-messages-with-http-info id nil))
  ([id {:keys [size page order ]}]
   (call-api "/chat/topics/{id}/messages" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-topic-messages
  "List messages in a topic
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  ([id ] (get-topic-messages id nil))
  ([id optional-params]
   (:data (get-topic-messages-with-http-info id optional-params))))

(defn remove-chat-blacklist-with-http-info
  "Remove a user from a blacklist
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [blacklisted-user-id id ]
  (call-api "/chat/users/{id}/blacklist/{blacklisted_user_id}" :delete
            {:path-params   {"blacklisted_user_id" blacklisted-user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-chat-blacklist
  "Remove a user from a blacklist
  <b>Permissions Needed:</b> CHAT_ADMIN or owner"
  [blacklisted-user-id id ]
  (:data (remove-chat-blacklist-with-http-info blacklisted-user-id id)))

(defn send-chat-message-with-http-info
  "Send a message
  <b>Permissions Needed:</b> ANY"
  ([] (send-chat-message-with-http-info nil))
  ([{:keys [chat-message-resource ]}]
   (call-api "/chat/messages" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    chat-message-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-chat-message
  "Send a message
  <b>Permissions Needed:</b> ANY"
  ([] (send-chat-message nil))
  ([optional-params]
   (:data (send-chat-message-with-http-info optional-params))))

