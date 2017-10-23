(ns knetik-platform-api-documentation-latest
.api.util-maintenance
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-maintenance-with-http-info
  "Delete maintenance info"
  []
  (call-api "/maintenance" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-maintenance
  "Delete maintenance info"
  []
  (:data (delete-maintenance-with-http-info)))

(defn get-maintenance-with-http-info
  "Get current maintenance info
  Get current maintenance info. 404 if no maintenance."
  []
  (call-api "/maintenance" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-maintenance
  "Get current maintenance info
  Get current maintenance info. 404 if no maintenance."
  []
  (:data (get-maintenance-with-http-info)))

(defn set-maintenance-with-http-info
  "Set current maintenance info"
  ([] (set-maintenance-with-http-info nil))
  ([{:keys [maintenance ]}]
   (call-api "/maintenance" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    maintenance
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-maintenance
  "Set current maintenance info"
  ([] (set-maintenance nil))
  ([optional-params]
   (:data (set-maintenance-with-http-info optional-params))))

(defn update-maintenance-with-http-info
  "Update current maintenance info"
  ([] (update-maintenance-with-http-info nil))
  ([{:keys [maintenance ]}]
   (call-api "/maintenance" :put
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    maintenance
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-maintenance
  "Update current maintenance info"
  ([] (update-maintenance nil))
  ([optional-params]
   (:data (update-maintenance-with-http-info optional-params))))

