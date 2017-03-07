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
             :auth-names    ["OAuth2"]}))

(defn get-bre-variable-types
  "Get a list of variable types available
  Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing."
  []
  (:data (get-bre-variable-types-with-http-info)))

