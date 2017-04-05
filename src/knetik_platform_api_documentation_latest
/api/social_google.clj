(ns knetik-platform-api-documentation-latest
.api.social-google
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn link-accounts1-with-http-info
  "Link facebook account
  Links the current user account to a facebook account, using the acccess token from facebook. Can also be used to update the access token after it has expired."
  ([] (link-accounts1-with-http-info nil))
  ([{:keys [facebook-token ]}]
   (call-api "/social/google/users" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    facebook-token
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn link-accounts1
  "Link facebook account
  Links the current user account to a facebook account, using the acccess token from facebook. Can also be used to update the access token after it has expired."
  ([] (link-accounts1 nil))
  ([optional-params]
   (:data (link-accounts1-with-http-info optional-params))))

