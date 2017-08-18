(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-globals
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-bre-global-with-http-info
  "Create a global definition
  Once created you can then use in a custom rule. Note that global definitions cannot be modified or deleted if in use."
  ([] (create-bre-global-with-http-info nil))
  ([{:keys [bre-global-resource ]}]
   (call-api "/bre/globals/definitions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-global-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-bre-global
  "Create a global definition
  Once created you can then use in a custom rule. Note that global definitions cannot be modified or deleted if in use."
  ([] (create-bre-global nil))
  ([optional-params]
   (:data (create-bre-global-with-http-info optional-params))))

(defn delete-bre-global-with-http-info
  "Delete a global
  May fail if there are existing rules against it. Cannot delete core globals"
  [id ]
  (call-api "/bre/globals/definitions/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-bre-global
  "Delete a global
  May fail if there are existing rules against it. Cannot delete core globals"
  [id ]
  (:data (delete-bre-global-with-http-info id)))

(defn get-bre-global-with-http-info
  "Get a single global definition"
  [id ]
  (call-api "/bre/globals/definitions/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-bre-global
  "Get a single global definition"
  [id ]
  (:data (get-bre-global-with-http-info id)))

(defn get-bre-globals-with-http-info
  "List global definitions"
  ([] (get-bre-globals-with-http-info nil))
  ([{:keys [filter-system size page ]}]
   (call-api "/bre/globals/definitions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_system" filter-system "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-bre-globals
  "List global definitions"
  ([] (get-bre-globals nil))
  ([optional-params]
   (:data (get-bre-globals-with-http-info optional-params))))

(defn update-bre-global-with-http-info
  "Update a global definition
  May fail if new parameters mismatch requirements of existing rules. Cannot update core globals"
  ([id ] (update-bre-global-with-http-info id nil))
  ([id {:keys [bre-global-resource ]}]
   (call-api "/bre/globals/definitions/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-global-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-bre-global
  "Update a global definition
  May fail if new parameters mismatch requirements of existing rules. Cannot update core globals"
  ([id ] (update-bre-global id nil))
  ([id optional-params]
   (:data (update-bre-global-with-http-info id optional-params))))

