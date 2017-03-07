(ns knetik-platform-api-documentation-latest
.api.configs
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-config-with-http-info
  "Create a new config"
  ([] (create-config-with-http-info nil))
  ([{:keys [config ]}]
   (call-api "/configs" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    config
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-config
  "Create a new config"
  ([] (create-config nil))
  ([optional-params]
   (:data (create-config-with-http-info optional-params))))

(defn delete-config-with-http-info
  "Delete an existing config"
  [name ]
  (call-api "/configs/{name}" :delete
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn delete-config
  "Delete an existing config"
  [name ]
  (:data (delete-config-with-http-info name)))

(defn get-config-with-http-info
  "Get a single config
  Only configs that are public readable will be shown without admin access"
  [name ]
  (call-api "/configs/{name}" :get
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-config
  "Get a single config
  Only configs that are public readable will be shown without admin access"
  [name ]
  (:data (get-config-with-http-info name)))

(defn get-configs-with-http-info
  "List and search configs"
  ([] (get-configs-with-http-info nil))
  ([{:keys [filter-search size page order ]}]
   (call-api "/configs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_search" filter-search "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-configs
  "List and search configs"
  ([] (get-configs nil))
  ([optional-params]
   (:data (get-configs-with-http-info optional-params))))

(defn update-config-with-http-info
  "Update an existing config"
  ([name ] (update-config-with-http-info name nil))
  ([name {:keys [config ]}]
   (call-api "/configs/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    config
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-config
  "Update an existing config"
  ([name ] (update-config name nil))
  ([name optional-params]
   (:data (update-config-with-http-info name optional-params))))

