(ns knetik-platform-api-documentation-latest
.api.payments-optimal
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn silent-post-optimal-with-http-info
  "Initiate silent post with Optimal
  Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details."
  ([] (silent-post-optimal-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/payment/provider/optimal/silent" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn silent-post-optimal
  "Initiate silent post with Optimal
  Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details."
  ([] (silent-post-optimal nil))
  ([optional-params]
   (:data (silent-post-optimal-with-http-info optional-params))))

