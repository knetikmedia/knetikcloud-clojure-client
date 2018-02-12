(ns knetik-platform-api-documentation-latest
.api.logs
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-user-log-with-http-info
  "Add a user log entry
  <b>Permissions Needed:</b> owner"
  ([] (add-user-log-with-http-info nil))
  ([{:keys [log-entry ]}]
   (call-api "/audit/logs" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    log-entry
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-user-log
  "Add a user log entry
  <b>Permissions Needed:</b> owner"
  ([] (add-user-log nil))
  ([optional-params]
   (:data (add-user-log-with-http-info optional-params))))

(defn get-bre-event-log-with-http-info
  "Get an existing BRE event log entry by id
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  [id ]
  (call-api "/bre/logs/event-log/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-bre-event-log
  "Get an existing BRE event log entry by id
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  [id ]
  (:data (get-bre-event-log-with-http-info id)))

(defn get-bre-event-logs-with-http-info
  "Returns a list of BRE event log entries
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  ([] (get-bre-event-logs-with-http-info nil))
  ([{:keys [filter-start-date filter-event-name filter-event-id size page order filter-rule-id ]}]
   (call-api "/bre/logs/event-log" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_start_date" filter-start-date "filter_event_name" filter-event-name "filter_event_id" filter-event-id "size" size "page" page "order" order "filter_rule_id" filter-rule-id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-bre-event-logs
  "Returns a list of BRE event log entries
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  ([] (get-bre-event-logs nil))
  ([optional-params]
   (:data (get-bre-event-logs-with-http-info optional-params))))

(defn get-bre-forward-log-with-http-info
  "Get an existing forward log entry by id
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  [id ]
  (call-api "/bre/logs/forward-log/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-bre-forward-log
  "Get an existing forward log entry by id
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  [id ]
  (:data (get-bre-forward-log-with-http-info id)))

(defn get-bre-forward-logs-with-http-info
  "Returns a list of forward log entries
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  ([] (get-bre-forward-logs-with-http-info nil))
  ([{:keys [filter-start-date filter-end-date filter-status-code filter-url size page order ]}]
   (call-api "/bre/logs/forward-log" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_start_date" filter-start-date "filter_end_date" filter-end-date "filter_status_code" filter-status-code "filter_url" filter-url "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-bre-forward-logs
  "Returns a list of forward log entries
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_ADMIN"
  ([] (get-bre-forward-logs nil))
  ([optional-params]
   (:data (get-bre-forward-logs-with-http-info optional-params))))

(defn get-user-log-with-http-info
  "Returns a user log entry by id
  <b>Permissions Needed:</b> LOGS_ADMIN or owner"
  [id ]
  (call-api "/audit/logs/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-log
  "Returns a user log entry by id
  <b>Permissions Needed:</b> LOGS_ADMIN or owner"
  [id ]
  (:data (get-user-log-with-http-info id)))

(defn get-user-logs-with-http-info
  "Returns a page of user logs entries
  <b>Permissions Needed:</b> LOGS_ADMIN or owner"
  ([] (get-user-logs-with-http-info nil))
  ([{:keys [filter-user filter-action-name size page order ]}]
   (call-api "/audit/logs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_user" filter-user "filter_action_name" filter-action-name "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-logs
  "Returns a page of user logs entries
  <b>Permissions Needed:</b> LOGS_ADMIN or owner"
  ([] (get-user-logs nil))
  ([optional-params]
   (:data (get-user-logs-with-http-info optional-params))))

