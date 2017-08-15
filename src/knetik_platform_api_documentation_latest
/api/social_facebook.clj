(ns knetik-platform-api-documentation-latest
.api.social-facebook
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn link-accounts-with-http-info
  "Link facebook account
  Links the current user account to a facebook account, using the acccess token from facebook. Can also be used to update the access token after it has expired."
  ([] (link-accounts-with-http-info nil))
  ([{:keys [facebook-token ]}]
   (call-api "/social/facebook/users" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    facebook-token
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn link-accounts
  "Link facebook account
  Links the current user account to a facebook account, using the acccess token from facebook. Can also be used to update the access token after it has expired."
  ([] (link-accounts nil))
  ([optional-params]
   (:data (link-accounts-with-http-info optional-params))))

