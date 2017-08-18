(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-expressions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-bre-expressions-with-http-info
  "Get a list of 'lookup' type expressions
  These are expression types that take a second expression as input and produce a value. These can be used in addition to the standard types, like parameter, global and constant (see BRE documentation for details)."
  []
  (call-api "/bre/expressions/lookup" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-bre-expressions
  "Get a list of 'lookup' type expressions
  These are expression types that take a second expression as input and produce a value. These can be used in addition to the standard types, like parameter, global and constant (see BRE documentation for details)."
  []
  (:data (get-bre-expressions-with-http-info)))

