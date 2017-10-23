(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-variables
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-bre-variable-types-with-http-info
  "Get a list of variable types available
  Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing."
  []
  (call-api "/bre/variable-types" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-bre-variable-types
  "Get a list of variable types available
  Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing."
  []
  (:data (get-bre-variable-types-with-http-info)))

(defn get-bre-variable-values-with-http-info
  "List valid values for a type
  Used to lookup users to fill in a user constant for example. Only types marked as enumerable are suppoorted here."
  ([name ] (get-bre-variable-values-with-http-info name nil))
  ([name {:keys [filter-name size page ]}]
   (call-api "/bre/variable-types/{name}/values" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"filter_name" filter-name "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-bre-variable-values
  "List valid values for a type
  Used to lookup users to fill in a user constant for example. Only types marked as enumerable are suppoorted here."
  ([name ] (get-bre-variable-values name nil))
  ([name optional-params]
   (:data (get-bre-variable-values-with-http-info name optional-params))))

