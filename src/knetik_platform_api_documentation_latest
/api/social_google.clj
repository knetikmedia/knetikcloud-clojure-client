(ns knetik-platform-api-documentation-latest
.api.social-google
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn link-accounts1-with-http-info
  "Link google account
  Links the current user account to a google account, using the acccess token from google. Can also be used to update the access token after it has expired. <br><br><b>Permissions Needed:</b> Non-google user token"
  ([] (link-accounts1-with-http-info nil))
  ([{:keys [google-token ]}]
   (call-api "/social/google/users" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    google-token
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn link-accounts1
  "Link google account
  Links the current user account to a google account, using the acccess token from google. Can also be used to update the access token after it has expired. <br><br><b>Permissions Needed:</b> Non-google user token"
  ([] (link-accounts1 nil))
  ([optional-params]
   (:data (link-accounts1-with-http-info optional-params))))

