(ns knetik-platform-api-documentation-latest
.api.auth-tokens
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-tokens-with-http-info
  "Delete tokens by username, client id, or both"
  ([] (delete-tokens-with-http-info nil))
  ([{:keys [username client-id ]}]
   (call-api "/auth/tokens" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"username" username "client_id" client-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn delete-tokens
  "Delete tokens by username, client id, or both"
  ([] (delete-tokens nil))
  ([optional-params]
   (:data (delete-tokens-with-http-info optional-params))))

(defn get-token-with-http-info
  "Get a single token by username and client id"
  [username client-id ]
  (call-api "/auth/tokens/{username}/{client_id}" :get
            {:path-params   {"username" username "client_id" client-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-token
  "Get a single token by username and client id"
  [username client-id ]
  (:data (get-token-with-http-info username client-id)))

(defn get-tokens-with-http-info
  "List usernames and client ids
  Token value not shown"
  ([] (get-tokens-with-http-info nil))
  ([{:keys [filter-client-id filter-username size page order ]}]
   (call-api "/auth/tokens" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_client_id" filter-client-id "filter_username" filter-username "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-tokens
  "List usernames and client ids
  Token value not shown"
  ([] (get-tokens nil))
  ([optional-params]
   (:data (get-tokens-with-http-info optional-params))))

