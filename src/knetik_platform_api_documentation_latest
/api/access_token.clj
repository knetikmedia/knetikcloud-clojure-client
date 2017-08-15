(ns knetik-platform-api-documentation-latest
.api.access-token
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-o-auth-token-with-http-info
  "Get access token"
  ([grant-type client-id ] (get-o-auth-token-with-http-info grant-type client-id nil))
  ([grant-type client-id {:keys [client-secret username password token refresh-token ]}]
   (call-api "/oauth/token" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"grant_type" grant-type "client_id" client-id "client_secret" client-secret "username" username "password" password "token" token "refresh_token" refresh-token }
              :content-types ["application/x-www-form-urlencoded"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-o-auth-token
  "Get access token"
  ([grant-type client-id ] (get-o-auth-token grant-type client-id nil))
  ([grant-type client-id optional-params]
   (:data (get-o-auth-token-with-http-info grant-type client-id optional-params))))

