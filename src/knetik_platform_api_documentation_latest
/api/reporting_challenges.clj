(ns knetik-platform-api-documentation-latest
.api.reporting-challenges
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-challenge-event-leaderboard-with-http-info
  "Retrieve a challenge event leaderboard details
  Lists all leaderboard entries with additional user details. <br><br><b>Permissions Needed:</b> REPORTING_CHALLENGES_ADMIN"
  ([] (get-challenge-event-leaderboard-with-http-info nil))
  ([{:keys [filter-event size page order ]}]
   (call-api "/reporting/events/leaderboard" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_event" filter-event "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-challenge-event-leaderboard
  "Retrieve a challenge event leaderboard details
  Lists all leaderboard entries with additional user details. <br><br><b>Permissions Needed:</b> REPORTING_CHALLENGES_ADMIN"
  ([] (get-challenge-event-leaderboard nil))
  ([optional-params]
   (:data (get-challenge-event-leaderboard-with-http-info optional-params))))

(defn get-challenge-event-participants-with-http-info
  "Retrieve a challenge event participant details
  Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation. <br><br><b>Permissions Needed:</b> REPORTING_CHALLENGES_ADMIN"
  ([] (get-challenge-event-participants-with-http-info nil))
  ([{:keys [filter-event size page order ]}]
   (call-api "/reporting/events/participants" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_event" filter-event "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-challenge-event-participants
  "Retrieve a challenge event participant details
  Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation. <br><br><b>Permissions Needed:</b> REPORTING_CHALLENGES_ADMIN"
  ([] (get-challenge-event-participants nil))
  ([optional-params]
   (:data (get-challenge-event-participants-with-http-info optional-params))))

