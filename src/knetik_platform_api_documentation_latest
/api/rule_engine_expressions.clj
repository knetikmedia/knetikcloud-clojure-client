(ns knetik-platform-api-documentation-latest
.api.rule-engine-expressions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-bre-expression-with-http-info
  "Lookup a specific expression
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EXPRESSIONS_USER"
  [type ]
  (call-api "/bre/expressions/{type}" :get
            {:path-params   {"type" type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-bre-expression
  "Lookup a specific expression
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EXPRESSIONS_USER"
  [type ]
  (:data (get-bre-expression-with-http-info type)))

(defn get-bre-expressions-with-http-info
  "Get a list of supported expressions to use in conditions or actions.
  Each resource contains a type and a definition that are read-only, all the other fields must be provided when using the expression in a rule. <br><br><b>Permissions Needed:</b> BRE_RULE_ENGINE_EXPRESSIONS_USER"
  ([] (get-bre-expressions-with-http-info nil))
  ([{:keys [filter-type-group ]}]
   (call-api "/bre/expressions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_type_group" filter-type-group }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-bre-expressions
  "Get a list of supported expressions to use in conditions or actions.
  Each resource contains a type and a definition that are read-only, all the other fields must be provided when using the expression in a rule. <br><br><b>Permissions Needed:</b> BRE_RULE_ENGINE_EXPRESSIONS_USER"
  ([] (get-bre-expressions nil))
  ([optional-params]
   (:data (get-bre-expressions-with-http-info optional-params))))

(defn get-expression-as-text-with-http-info
  "Returns the textual representation of an expression
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EXPRESSIONS_USER"
  ([] (get-expression-as-text-with-http-info nil))
  ([{:keys [expression ]}]
   (call-api "/bre/expressions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    expression
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-expression-as-text
  "Returns the textual representation of an expression
  <b>Permissions Needed:</b> BRE_RULE_ENGINE_EXPRESSIONS_USER"
  ([] (get-expression-as-text nil))
  ([optional-params]
   (:data (get-expression-as-text-with-http-info optional-params))))

