(ns knetik-platform-api-documentation-latest
.api.templates-properties
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-template-property-type-with-http-info
  "Get details for a template property type"
  [type ]
  (call-api "/templates/properties/{type}" :get
            {:path-params   {"type" type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-template-property-type
  "Get details for a template property type"
  [type ]
  (:data (get-template-property-type-with-http-info type)))

(defn get-template-property-types-with-http-info
  "List template property types"
  []
  (call-api "/templates/properties" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-template-property-types
  "List template property types"
  []
  (:data (get-template-property-types-with-http-info)))

