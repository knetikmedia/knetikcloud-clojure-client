(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-rules
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-bre-rule-with-http-info
  "Create a rule
  Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/"
  ([] (create-bre-rule-with-http-info nil))
  ([{:keys [bre-rule ]}]
   (call-api "/bre/rules" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-rule
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-bre-rule
  "Create a rule
  Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/"
  ([] (create-bre-rule nil))
  ([optional-params]
   (:data (create-bre-rule-with-http-info optional-params))))

(defn delete-bre-rule-with-http-info
  "Delete a rule
  May fail if there are existing rules against it. Cannot delete core rules"
  [id ]
  (call-api "/bre/rules/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-bre-rule
  "Delete a rule
  May fail if there are existing rules against it. Cannot delete core rules"
  [id ]
  (:data (delete-bre-rule-with-http-info id)))

(defn get-bre-expression-as-string-with-http-info
  "Returns a string representation of the provided expression"
  ([] (get-bre-expression-as-string-with-http-info nil))
  ([{:keys [expression ]}]
   (call-api "/bre/rules/expression-as-string" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    expression
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-bre-expression-as-string
  "Returns a string representation of the provided expression"
  ([] (get-bre-expression-as-string nil))
  ([optional-params]
   (:data (get-bre-expression-as-string-with-http-info optional-params))))

(defn get-bre-rule-with-http-info
  "Get a single rule"
  [id ]
  (call-api "/bre/rules/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-bre-rule
  "Get a single rule"
  [id ]
  (:data (get-bre-rule-with-http-info id)))

(defn get-bre-rules-with-http-info
  "List rules"
  ([] (get-bre-rules-with-http-info nil))
  ([{:keys [filter-name filter-enabled filter-system filter-trigger filter-action filter-condition size page ]}]
   (call-api "/bre/rules" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_name" filter-name "filter_enabled" filter-enabled "filter_system" filter-system "filter_trigger" filter-trigger "filter_action" filter-action "filter_condition" filter-condition "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-bre-rules
  "List rules"
  ([] (get-bre-rules nil))
  ([optional-params]
   (:data (get-bre-rules-with-http-info optional-params))))

(defn set-bre-rule-with-http-info
  "Enable or disable a rule
  This is helpful for turning off systems rules which cannot be deleted or modified otherwise"
  ([id ] (set-bre-rule-with-http-info id nil))
  ([id {:keys [enabled ]}]
   (call-api "/bre/rules/{id}/enabled" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    enabled
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-bre-rule
  "Enable or disable a rule
  This is helpful for turning off systems rules which cannot be deleted or modified otherwise"
  ([id ] (set-bre-rule id nil))
  ([id optional-params]
   (:data (set-bre-rule-with-http-info id optional-params))))

(defn update-bre-rule-with-http-info
  "Update a rule
  Cannot update system rules"
  ([id ] (update-bre-rule-with-http-info id nil))
  ([id {:keys [bre-rule ]}]
   (call-api "/bre/rules/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-rule
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-bre-rule
  "Update a rule
  Cannot update system rules"
  ([id ] (update-bre-rule id nil))
  ([id optional-params]
   (:data (update-bre-rule-with-http-info id optional-params))))

