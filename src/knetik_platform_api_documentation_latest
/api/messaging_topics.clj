(ns knetik-platform-api-documentation-latest
.api.messaging-topics
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn disable-topic-subscriber-with-http-info
  "Enable or disable messages for a user
  Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options. <br><br><b>Permissions Needed:</b> TOPICS_ADMIN or self"
  [id user-id disabled ]
  (call-api "/messaging/topics/{id}/subscribers/{user_id}/disabled" :put
            {:path-params   {"id" id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    disabled
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn disable-topic-subscriber
  "Enable or disable messages for a user
  Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options. <br><br><b>Permissions Needed:</b> TOPICS_ADMIN or self"
  [id user-id disabled ]
  (:data (disable-topic-subscriber-with-http-info id user-id disabled)))

(defn get-topic-subscriber-with-http-info
  "Get a subscriber to a topic
  <b>Permissions Needed:</b> TOPICS_ADMIN or self"
  [id user-id ]
  (call-api "/messaging/topics/{id}/subscribers/{user_id}" :get
            {:path-params   {"id" id "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-topic-subscriber
  "Get a subscriber to a topic
  <b>Permissions Needed:</b> TOPICS_ADMIN or self"
  [id user-id ]
  (:data (get-topic-subscriber-with-http-info id user-id)))

(defn get-user-topics-with-http-info
  "Get all messaging topics for a given user
  <b>Permissions Needed:</b> TOPICS_ADMIN or self"
  [id ]
  (call-api "/users/{id}/topics" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-topics
  "Get all messaging topics for a given user
  <b>Permissions Needed:</b> TOPICS_ADMIN or self"
  [id ]
  (:data (get-user-topics-with-http-info id)))

