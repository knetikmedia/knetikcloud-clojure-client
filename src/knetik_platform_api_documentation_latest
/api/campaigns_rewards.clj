(ns knetik-platform-api-documentation-latest
.api.campaigns-rewards
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-reward-set-with-http-info
  "Create a reward set
  <b>Permissions Needed:</b> REWARDS_ADMIN"
  ([] (create-reward-set-with-http-info nil))
  ([{:keys [reward-set-resource ]}]
   (call-api "/rewards" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    reward-set-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-reward-set
  "Create a reward set
  <b>Permissions Needed:</b> REWARDS_ADMIN"
  ([] (create-reward-set nil))
  ([optional-params]
   (:data (create-reward-set-with-http-info optional-params))))

(defn delete-reward-set-with-http-info
  "Delete a reward set
  <b>Permissions Needed:</b> REWARDS_ADMIN"
  [id ]
  (call-api "/rewards/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-reward-set
  "Delete a reward set
  <b>Permissions Needed:</b> REWARDS_ADMIN"
  [id ]
  (:data (delete-reward-set-with-http-info id)))

(defn get-reward-set-with-http-info
  "Get a single reward set
  <b>Permissions Needed:</b> ANY"
  [id ]
  (call-api "/rewards/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-reward-set
  "Get a single reward set
  <b>Permissions Needed:</b> ANY"
  [id ]
  (:data (get-reward-set-with-http-info id)))

(defn get-reward-sets-with-http-info
  "List and search reward sets
  <b>Permissions Needed:</b> ANY"
  ([] (get-reward-sets-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/rewards" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-reward-sets
  "List and search reward sets
  <b>Permissions Needed:</b> ANY"
  ([] (get-reward-sets nil))
  ([optional-params]
   (:data (get-reward-sets-with-http-info optional-params))))

(defn update-reward-set-with-http-info
  "Update a reward set
  <b>Permissions Needed:</b> REWARDS_ADMIN"
  ([id ] (update-reward-set-with-http-info id nil))
  ([id {:keys [reward-set-resource ]}]
   (call-api "/rewards/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    reward-set-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-reward-set
  "Update a reward set
  <b>Permissions Needed:</b> REWARDS_ADMIN"
  ([id ] (update-reward-set id nil))
  ([id optional-params]
   (:data (update-reward-set-with-http-info id optional-params))))

