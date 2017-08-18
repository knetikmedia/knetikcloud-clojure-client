(ns knetik-platform-api-documentation-latest
.api.media-moderation
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-moderation-report-with-http-info
  "Get a flag report"
  [id ]
  (call-api "/moderation/reports/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-moderation-report
  "Get a flag report"
  [id ]
  (:data (get-moderation-report-with-http-info id)))

(defn get-moderation-reports-with-http-info
  "Returns a page of flag reports
  Context can be either a free-form string or a pre-defined context name"
  ([] (get-moderation-reports-with-http-info nil))
  ([{:keys [exclude-resolved filter-context size page ]}]
   (call-api "/moderation/reports" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"exclude_resolved" exclude-resolved "filter_context" filter-context "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-moderation-reports
  "Returns a page of flag reports
  Context can be either a free-form string or a pre-defined context name"
  ([] (get-moderation-reports nil))
  ([optional-params]
   (:data (get-moderation-reports-with-http-info optional-params))))

(defn update-moderation-report-with-http-info
  "Update a flag report
  Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of 'banned' you will need to pass the reason."
  ([id ] (update-moderation-report-with-http-info id nil))
  ([id {:keys [flag-report-resource ]}]
   (call-api "/moderation/reports/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    flag-report-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-moderation-report
  "Update a flag report
  Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of 'banned' you will need to pass the reason."
  ([id ] (update-moderation-report id nil))
  ([id optional-params]
   (:data (update-moderation-report-with-http-info id optional-params))))

