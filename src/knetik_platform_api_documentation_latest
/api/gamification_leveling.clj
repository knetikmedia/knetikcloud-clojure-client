(ns knetik-platform-api-documentation-latest
.api.gamification-leveling
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-level-with-http-info
  "Create a level schema
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  ([] (create-level-with-http-info nil))
  ([{:keys [level ]}]
   (call-api "/leveling" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    level
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-level
  "Create a level schema
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  ([] (create-level nil))
  ([optional-params]
   (:data (create-level-with-http-info optional-params))))

(defn delete-level-with-http-info
  "Delete a level
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  [name ]
  (call-api "/leveling/{name}" :delete
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-level
  "Delete a level
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  [name ]
  (:data (delete-level-with-http-info name)))

(defn get-level-with-http-info
  "Retrieve a level
  <b>Permissions Needed:</b> LEVELING_USER"
  [name ]
  (call-api "/leveling/{name}" :get
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-level
  "Retrieve a level
  <b>Permissions Needed:</b> LEVELING_USER"
  [name ]
  (:data (get-level-with-http-info name)))

(defn get-level-triggers-with-http-info
  "Get the list of triggers that can be used to trigger a leveling progress update
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  []
  (call-api "/leveling/triggers" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-level-triggers
  "Get the list of triggers that can be used to trigger a leveling progress update
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  []
  (:data (get-level-triggers-with-http-info)))

(defn get-levels-with-http-info
  "List and search levels
  Get a list of levels schemas with optional filtering. <br><br><b>Permissions Needed:</b> LEVELING_USER"
  ([] (get-levels-with-http-info nil))
  ([{:keys [filter-name size page order ]}]
   (call-api "/leveling" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_name" filter-name "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-levels
  "List and search levels
  Get a list of levels schemas with optional filtering. <br><br><b>Permissions Needed:</b> LEVELING_USER"
  ([] (get-levels nil))
  ([optional-params]
   (:data (get-levels-with-http-info optional-params))))

(defn get-user-level-with-http-info
  "Get a user's progress for a given level schema
  <b>Permissions Needed:</b> LEVELING_USER or self"
  [user-id name ]
  (call-api "/users/{user_id}/leveling/{name}" :get
            {:path-params   {"user_id" user-id "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-level
  "Get a user's progress for a given level schema
  <b>Permissions Needed:</b> LEVELING_USER or self"
  [user-id name ]
  (:data (get-user-level-with-http-info user-id name)))

(defn get-user-levels-with-http-info
  "Get a user's progress for all level schemas
  Filtering and sorting is based on the LevelingResource object, not the UserLevelingResource that is returned here. <br><br><b>Permissions Needed:</b> LEVELING_USER or self"
  ([user-id ] (get-user-levels-with-http-info user-id nil))
  ([user-id {:keys [filter-name size page order ]}]
   (call-api "/users/{user_id}/leveling" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"filter_name" filter-name "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-levels
  "Get a user's progress for all level schemas
  Filtering and sorting is based on the LevelingResource object, not the UserLevelingResource that is returned here. <br><br><b>Permissions Needed:</b> LEVELING_USER or self"
  ([user-id ] (get-user-levels user-id nil))
  ([user-id optional-params]
   (:data (get-user-levels-with-http-info user-id optional-params))))

(defn increment-progress-with-http-info
  "Update or create a leveling progress record for a user
  If no progress record yet exists for the user, it will be created. Otherwise the provided value will be added to it. May be negative. If progress meets or exceeds the level's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> LEVELING_ADMIN"
  ([user-id name ] (increment-progress-with-http-info user-id name nil))
  ([user-id name {:keys [progress ]}]
   (call-api "/users/{user_id}/leveling/{name}/progress" :post
             {:path-params   {"user_id" user-id "name" name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    progress
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn increment-progress
  "Update or create a leveling progress record for a user
  If no progress record yet exists for the user, it will be created. Otherwise the provided value will be added to it. May be negative. If progress meets or exceeds the level's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> LEVELING_ADMIN"
  ([user-id name ] (increment-progress user-id name nil))
  ([user-id name optional-params]
   (:data (increment-progress-with-http-info user-id name optional-params))))

(defn set-progress-with-http-info
  "Set leveling progress for a user
  If no progress record yet exists for the user, it will be created. Otherwise it will be updated to the provided value. If progress meets or exceeds the level's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> LEVELING_ADMIN"
  ([user-id name ] (set-progress-with-http-info user-id name nil))
  ([user-id name {:keys [progress ]}]
   (call-api "/users/{user_id}/leveling/{name}/progress" :put
             {:path-params   {"user_id" user-id "name" name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    progress
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-progress
  "Set leveling progress for a user
  If no progress record yet exists for the user, it will be created. Otherwise it will be updated to the provided value. If progress meets or exceeds the level's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> LEVELING_ADMIN"
  ([user-id name ] (set-progress user-id name nil))
  ([user-id name optional-params]
   (:data (set-progress-with-http-info user-id name optional-params))))

(defn update-level-with-http-info
  "Update a level
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  ([name ] (update-level-with-http-info name nil))
  ([name {:keys [new-level ]}]
   (call-api "/leveling/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    new-level
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-level
  "Update a level
  <b>Permissions Needed:</b> LEVELING_ADMIN"
  ([name ] (update-level name nil))
  ([name optional-params]
   (:data (update-level-with-http-info name optional-params))))

