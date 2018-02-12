(ns knetik-platform-api-documentation-latest
.api.gamification-leaderboards
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-leaderboard-with-http-info
  "Retrieves leaderboard details and paginated entries
  The context type identifies the type of entity (i.e., 'activity') being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource. <br><br><b>Permissions Needed:</b> ANY"
  ([context-type context-id ] (get-leaderboard-with-http-info context-type context-id nil))
  ([context-type context-id {:keys [size page order ]}]
   (call-api "/leaderboards/{context_type}/{context_id}" :get
             {:path-params   {"context_type" context-type "context_id" context-id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-leaderboard
  "Retrieves leaderboard details and paginated entries
  The context type identifies the type of entity (i.e., 'activity') being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource. <br><br><b>Permissions Needed:</b> ANY"
  ([context-type context-id ] (get-leaderboard context-type context-id nil))
  ([context-type context-id optional-params]
   (:data (get-leaderboard-with-http-info context-type context-id optional-params))))

(defn get-leaderboard-rank-with-http-info
  "Retrieves a specific user entry with rank
  The context type identifies the type of entity (i.e., 'activity') being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. <br><br><b>Permissions Needed:</b> ANY"
  [context-type context-id id ]
  (call-api "/leaderboards/{context_type}/{context_id}/users/{id}/rank" :get
            {:path-params   {"context_type" context-type "context_id" context-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-leaderboard-rank
  "Retrieves a specific user entry with rank
  The context type identifies the type of entity (i.e., 'activity') being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. <br><br><b>Permissions Needed:</b> ANY"
  [context-type context-id id ]
  (:data (get-leaderboard-rank-with-http-info context-type context-id id)))

(defn get-leaderboard-strategies-with-http-info
  "Get a list of available leaderboard strategy names
  <b>Permissions Needed:</b> ANY"
  []
  (call-api "/leaderboards/strategies" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-leaderboard-strategies
  "Get a list of available leaderboard strategy names
  <b>Permissions Needed:</b> ANY"
  []
  (:data (get-leaderboard-strategies-with-http-info)))

