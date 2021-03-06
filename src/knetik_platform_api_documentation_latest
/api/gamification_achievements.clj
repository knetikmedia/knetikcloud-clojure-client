(ns knetik-platform-api-documentation-latest
.api.gamification-achievements
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-achievement-with-http-info
  "Create a new achievement definition
  If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user's achievement status must manually be updated via the API. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([] (create-achievement-with-http-info nil))
  ([{:keys [achievement ]}]
   (call-api "/achievements" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    achievement
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-achievement
  "Create a new achievement definition
  If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user's achievement status must manually be updated via the API. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([] (create-achievement nil))
  ([optional-params]
   (:data (create-achievement-with-http-info optional-params))))

(defn create-achievement-template-with-http-info
  "Create an achievement template
  Achievement templates define a type of achievement and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-achievement-template-with-http-info nil))
  ([{:keys [template ]}]
   (call-api "/achievements/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-achievement-template
  "Create an achievement template
  Achievement templates define a type of achievement and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-achievement-template nil))
  ([optional-params]
   (:data (create-achievement-template-with-http-info optional-params))))

(defn delete-achievement-with-http-info
  "Delete an achievement definition
  Will also disable the associated generated rule, if any. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  [name ]
  (call-api "/achievements/{name}" :delete
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-achievement
  "Delete an achievement definition
  Will also disable the associated generated rule, if any. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  [name ]
  (:data (delete-achievement-with-http-info name)))

(defn delete-achievement-template-with-http-info
  "Delete an achievement template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-achievement-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/achievements/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-achievement-template
  "Delete an achievement template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-achievement-template id nil))
  ([id optional-params]
   (:data (delete-achievement-template-with-http-info id optional-params))))

(defn get-achievement-with-http-info
  "Get a single achievement definition
  <b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN or ACHIEVEMENTS_USER"
  [name ]
  (call-api "/achievements/{name}" :get
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-achievement
  "Get a single achievement definition
  <b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN or ACHIEVEMENTS_USER"
  [name ]
  (:data (get-achievement-with-http-info name)))

(defn get-achievement-template-with-http-info
  "Get a single achievement template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN"
  [id ]
  (call-api "/achievements/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-achievement-template
  "Get a single achievement template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN"
  [id ]
  (:data (get-achievement-template-with-http-info id)))

(defn get-achievement-templates-with-http-info
  "List and search achievement templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN"
  ([] (get-achievement-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/achievements/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-achievement-templates
  "List and search achievement templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN"
  ([] (get-achievement-templates nil))
  ([optional-params]
   (:data (get-achievement-templates-with-http-info optional-params))))

(defn get-achievement-triggers-with-http-info
  "Get the list of triggers that can be used to trigger an achievement progress update
  <b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  []
  (call-api "/achievements/triggers" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-achievement-triggers
  "Get the list of triggers that can be used to trigger an achievement progress update
  <b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  []
  (:data (get-achievement-triggers-with-http-info)))

(defn get-achievements-with-http-info
  "Get all achievement definitions in the system
  <b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN or ACHIEVEMENTS_USER"
  ([] (get-achievements-with-http-info nil))
  ([{:keys [filter-tagset filter-name filter-hidden size page order filter-derived ]}]
   (call-api "/achievements" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_tagset" filter-tagset "filter_name" filter-name "filter_hidden" filter-hidden "size" size "page" page "order" order "filter_derived" filter-derived }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-achievements
  "Get all achievement definitions in the system
  <b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN or ACHIEVEMENTS_USER"
  ([] (get-achievements nil))
  ([optional-params]
   (:data (get-achievements-with-http-info optional-params))))

(defn get-derived-achievements-with-http-info
  "Get a list of derived achievements
  Used by other services that depend on achievements.  <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  [name ]
  (call-api "/achievements/derived/{name}" :get
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-derived-achievements
  "Get a list of derived achievements
  Used by other services that depend on achievements.  <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  [name ]
  (:data (get-derived-achievements-with-http-info name)))

(defn get-user-achievement-progress-with-http-info
  "Retrieve progress on a given achievement for a given user
  Assets will not be filled in on the resources returned. Use 'Get a single poll' to retrieve the full resource with assets for a given item as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  [user-id achievement-name ]
  (call-api "/users/{user_id}/achievements/{achievement_name}" :get
            {:path-params   {"user_id" user-id "achievement_name" achievement-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-achievement-progress
  "Retrieve progress on a given achievement for a given user
  Assets will not be filled in on the resources returned. Use 'Get a single poll' to retrieve the full resource with assets for a given item as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  [user-id achievement-name ]
  (:data (get-user-achievement-progress-with-http-info user-id achievement-name)))

(defn get-user-achievements-progress-with-http-info
  "Retrieve progress on achievements for a given user
  Assets will not be filled in on the resources returned. Use 'Get a single poll' to retrieve the full resource with assets for a given item as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([user-id ] (get-user-achievements-progress-with-http-info user-id nil))
  ([user-id {:keys [filter-achievement-derived filter-achievement-tagset filter-achievement-name size page ]}]
   (call-api "/users/{user_id}/achievements" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"filter_achievement_derived" filter-achievement-derived "filter_achievement_tagset" filter-achievement-tagset "filter_achievement_name" filter-achievement-name "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-achievements-progress
  "Retrieve progress on achievements for a given user
  Assets will not be filled in on the resources returned. Use 'Get a single poll' to retrieve the full resource with assets for a given item as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([user-id ] (get-user-achievements-progress user-id nil))
  ([user-id optional-params]
   (:data (get-user-achievements-progress-with-http-info user-id optional-params))))

(defn get-users-achievement-progress-with-http-info
  "Retrieve progress on a given achievement for all users
  Assets will not be filled in on the resources returned. Use 'Get single achievement progress for user' to retrieve the full resource with assets for a given user as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([achievement-name ] (get-users-achievement-progress-with-http-info achievement-name nil))
  ([achievement-name {:keys [filter-achievement-derived filter-achievement-tagset filter-achievement-name size page ]}]
   (call-api "/users/achievements/{achievement_name}" :get
             {:path-params   {"achievement_name" achievement-name }
              :header-params {}
              :query-params  {"filter_achievement_derived" filter-achievement-derived "filter_achievement_tagset" filter-achievement-tagset "filter_achievement_name" filter-achievement-name "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-users-achievement-progress
  "Retrieve progress on a given achievement for all users
  Assets will not be filled in on the resources returned. Use 'Get single achievement progress for user' to retrieve the full resource with assets for a given user as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([achievement-name ] (get-users-achievement-progress achievement-name nil))
  ([achievement-name optional-params]
   (:data (get-users-achievement-progress-with-http-info achievement-name optional-params))))

(defn get-users-achievements-progress-with-http-info
  "Retrieve progress on achievements for all users
  Assets will not be filled in on the resources returned. Use 'Get single achievement progress for user' to retrieve the full resource with assets for a given user as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([] (get-users-achievements-progress-with-http-info nil))
  ([{:keys [filter-achievement-derived filter-achievement-tagset filter-achievement-name size page ]}]
   (call-api "/users/achievements" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_achievement_derived" filter-achievement-derived "filter_achievement_tagset" filter-achievement-tagset "filter_achievement_name" filter-achievement-name "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-users-achievements-progress
  "Retrieve progress on achievements for all users
  Assets will not be filled in on the resources returned. Use 'Get single achievement progress for user' to retrieve the full resource with assets for a given user as needed. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([] (get-users-achievements-progress nil))
  ([optional-params]
   (:data (get-users-achievements-progress-with-http-info optional-params))))

(defn increment-achievement-progress-with-http-info
  "Increment an achievement progress record for a user
  If no progress record yet exists for the user, it will be created. Otherwise it will be updated and the provided value added to the existing progress. May be negative. If progress meets or exceeds the achievement's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([user-id achievement-name ] (increment-achievement-progress-with-http-info user-id achievement-name nil))
  ([user-id achievement-name {:keys [progress ]}]
   (call-api "/users/{user_id}/achievements/{achievement_name}/progress" :post
             {:path-params   {"user_id" user-id "achievement_name" achievement-name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    progress
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn increment-achievement-progress
  "Increment an achievement progress record for a user
  If no progress record yet exists for the user, it will be created. Otherwise it will be updated and the provided value added to the existing progress. May be negative. If progress meets or exceeds the achievement's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([user-id achievement-name ] (increment-achievement-progress user-id achievement-name nil))
  ([user-id achievement-name optional-params]
   (:data (increment-achievement-progress-with-http-info user-id achievement-name optional-params))))

(defn set-achievement-progress-with-http-info
  "Set an achievement progress record for a user
  If no progress record yet exists for the user, it will be created. Otherwise it will be updated and progress set to the provided value. If progress meets or exceeds the achievement's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([user-id achievement-name ] (set-achievement-progress-with-http-info user-id achievement-name nil))
  ([user-id achievement-name {:keys [progress ]}]
   (call-api "/users/{user_id}/achievements/{achievement_name}/progress" :put
             {:path-params   {"user_id" user-id "achievement_name" achievement-name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    progress
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-achievement-progress
  "Set an achievement progress record for a user
  If no progress record yet exists for the user, it will be created. Otherwise it will be updated and progress set to the provided value. If progress meets or exceeds the achievement's max_value it will be marked as earned and a BRE event will be triggered for the <code>BreAchievementEarnedTrigger</code>. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([user-id achievement-name ] (set-achievement-progress user-id achievement-name nil))
  ([user-id achievement-name optional-params]
   (:data (set-achievement-progress-with-http-info user-id achievement-name optional-params))))

(defn update-achievement-with-http-info
  "Update an achievement definition
  The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([name ] (update-achievement-with-http-info name nil))
  ([name {:keys [achievement ]}]
   (call-api "/achievements/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    achievement
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-achievement
  "Update an achievement definition
  The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version. <br><br><b>Permissions Needed:</b> ACHIEVEMENTS_ADMIN"
  ([name ] (update-achievement name nil))
  ([name optional-params]
   (:data (update-achievement-with-http-info name optional-params))))

(defn update-achievement-template-with-http-info
  "Update an achievement template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-achievement-template-with-http-info id nil))
  ([id {:keys [template ]}]
   (call-api "/achievements/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-achievement-template
  "Update an achievement template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-achievement-template id nil))
  ([id optional-params]
   (:data (update-achievement-template-with-http-info id optional-params))))

