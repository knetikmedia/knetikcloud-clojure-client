(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-events
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn send-bre-event-with-http-info
  "Fire a new event, based on an existing trigger
  Parameters within the event must match names and types from the trigger. Actual rule execution is asynchornous.  Returns request id, which will be used as the event id. <br><br><b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_USER"
  ([] (send-bre-event-with-http-info nil))
  ([{:keys [bre-event ]}]
   (call-api "/bre/events" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-event
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-bre-event
  "Fire a new event, based on an existing trigger
  Parameters within the event must match names and types from the trigger. Actual rule execution is asynchornous.  Returns request id, which will be used as the event id. <br><br><b>Permissions Needed:</b> BRE_RULE_ENGINE_EVENTS_USER"
  ([] (send-bre-event nil))
  ([optional-params]
   (:data (send-bre-event-with-http-info optional-params))))

