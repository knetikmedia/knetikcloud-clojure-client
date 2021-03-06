(ns knetik-platform-api-documentation-latest
.api.campaigns-challenges
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-challenge-with-http-info
  "Create a challenge
  Challenges do not run on their own.  They must be added to a campaign before events will spawn. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([] (create-challenge-with-http-info nil))
  ([{:keys [challenge-resource ]}]
   (call-api "/challenges" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    challenge-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-challenge
  "Create a challenge
  Challenges do not run on their own.  They must be added to a campaign before events will spawn. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([] (create-challenge nil))
  ([optional-params]
   (:data (create-challenge-with-http-info optional-params))))

(defn create-challenge-activity-with-http-info
  "Create a challenge activity
  <b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([challenge-id ] (create-challenge-activity-with-http-info challenge-id nil))
  ([challenge-id {:keys [challenge-activity-resource validate-settings ]}]
   (call-api "/challenges/{challenge_id}/activities" :post
             {:path-params   {"challenge_id" challenge-id }
              :header-params {}
              :query-params  {"validate_settings" validate-settings }
              :form-params   {}
              :body-param    challenge-activity-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-challenge-activity
  "Create a challenge activity
  <b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([challenge-id ] (create-challenge-activity challenge-id nil))
  ([challenge-id optional-params]
   (:data (create-challenge-activity-with-http-info challenge-id optional-params))))

(defn create-challenge-activity-template-with-http-info
  "Create a challenge activity template
  Challenge Activity Templates define a type of challenge activity and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-challenge-activity-template-with-http-info nil))
  ([{:keys [challenge-activity-template-resource ]}]
   (call-api "/challenge-activities/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    challenge-activity-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-challenge-activity-template
  "Create a challenge activity template
  Challenge Activity Templates define a type of challenge activity and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-challenge-activity-template nil))
  ([optional-params]
   (:data (create-challenge-activity-template-with-http-info optional-params))))

(defn create-challenge-template-with-http-info
  "Create a challenge template
  Challenge Templates define a type of challenge and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-challenge-template-with-http-info nil))
  ([{:keys [challenge-template-resource ]}]
   (call-api "/challenges/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    challenge-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-challenge-template
  "Create a challenge template
  Challenge Templates define a type of challenge and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-challenge-template nil))
  ([optional-params]
   (:data (create-challenge-template-with-http-info optional-params))))

(defn delete-challenge-with-http-info
  "Delete a challenge
  <b>Permissions Needed:</b> CHALLENGES_ADMIN"
  [id ]
  (call-api "/challenges/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-challenge
  "Delete a challenge
  <b>Permissions Needed:</b> CHALLENGES_ADMIN"
  [id ]
  (:data (delete-challenge-with-http-info id)))

(defn delete-challenge-activity-with-http-info
  "Delete a challenge activity
  A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  [id challenge-id ]
  (call-api "/challenges/{challenge_id}/activities/{id}" :delete
            {:path-params   {"id" id "challenge_id" challenge-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-challenge-activity
  "Delete a challenge activity
  A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  [id challenge-id ]
  (:data (delete-challenge-activity-with-http-info id challenge-id)))

(defn delete-challenge-activity-template-with-http-info
  "Delete a challenge activity template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-challenge-activity-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/challenge-activities/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-challenge-activity-template
  "Delete a challenge activity template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-challenge-activity-template id nil))
  ([id optional-params]
   (:data (delete-challenge-activity-template-with-http-info id optional-params))))

(defn delete-challenge-event-with-http-info
  "Delete a challenge event
  <b>Permissions Needed:</b> CHALLENGES_ADMIN"
  [id ]
  (call-api "/challenges/events/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-challenge-event
  "Delete a challenge event
  <b>Permissions Needed:</b> CHALLENGES_ADMIN"
  [id ]
  (:data (delete-challenge-event-with-http-info id)))

(defn delete-challenge-template-with-http-info
  "Delete a challenge template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-challenge-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/challenges/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-challenge-template
  "Delete a challenge template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-challenge-template id nil))
  ([id optional-params]
   (:data (delete-challenge-template-with-http-info id optional-params))))

(defn get-challenge-with-http-info
  "Retrieve a challenge
  <b>Permissions Needed:</b> ANY"
  [id ]
  (call-api "/challenges/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-challenge
  "Retrieve a challenge
  <b>Permissions Needed:</b> ANY"
  [id ]
  (:data (get-challenge-with-http-info id)))

(defn get-challenge-activities-with-http-info
  "List and search challenge activities
  <b>Permissions Needed:</b> ANY"
  ([challenge-id ] (get-challenge-activities-with-http-info challenge-id nil))
  ([challenge-id {:keys [size page order ]}]
   (call-api "/challenges/{challenge_id}/activities" :get
             {:path-params   {"challenge_id" challenge-id }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-challenge-activities
  "List and search challenge activities
  <b>Permissions Needed:</b> ANY"
  ([challenge-id ] (get-challenge-activities challenge-id nil))
  ([challenge-id optional-params]
   (:data (get-challenge-activities-with-http-info challenge-id optional-params))))

(defn get-challenge-activity-with-http-info
  "Get a single challenge activity
  A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. <br><br><b>Permissions Needed:</b> ANY"
  [id challenge-id ]
  (call-api "/challenges/{challenge_id}/activities/{id}" :get
            {:path-params   {"id" id "challenge_id" challenge-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-challenge-activity
  "Get a single challenge activity
  A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. <br><br><b>Permissions Needed:</b> ANY"
  [id challenge-id ]
  (:data (get-challenge-activity-with-http-info id challenge-id)))

(defn get-challenge-activity-template-with-http-info
  "Get a single challenge activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  [id ]
  (call-api "/challenge-activities/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-challenge-activity-template
  "Get a single challenge activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  [id ]
  (:data (get-challenge-activity-template-with-http-info id)))

(defn get-challenge-activity-templates-with-http-info
  "List and search challenge activity templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  ([] (get-challenge-activity-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/challenge-activities/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-challenge-activity-templates
  "List and search challenge activity templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  ([] (get-challenge-activity-templates nil))
  ([optional-params]
   (:data (get-challenge-activity-templates-with-http-info optional-params))))

(defn get-challenge-event-with-http-info
  "Retrieve a single challenge event details
  <b>Permissions Needed:</b> ANY"
  [id ]
  (call-api "/challenges/events/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-challenge-event
  "Retrieve a single challenge event details
  <b>Permissions Needed:</b> ANY"
  [id ]
  (:data (get-challenge-event-with-http-info id)))

(defn get-challenge-events-with-http-info
  "Retrieve a list of challenge events
  <b>Permissions Needed:</b> ANY"
  ([] (get-challenge-events-with-http-info nil))
  ([{:keys [filter-start-date filter-end-date filter-campaigns filter-challenge size page order ]}]
   (call-api "/challenges/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_start_date" filter-start-date "filter_end_date" filter-end-date "filter_campaigns" filter-campaigns "filter_challenge" filter-challenge "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-challenge-events
  "Retrieve a list of challenge events
  <b>Permissions Needed:</b> ANY"
  ([] (get-challenge-events nil))
  ([optional-params]
   (:data (get-challenge-events-with-http-info optional-params))))

(defn get-challenge-template-with-http-info
  "Get a single challenge template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  [id ]
  (call-api "/challenges/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-challenge-template
  "Get a single challenge template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  [id ]
  (:data (get-challenge-template-with-http-info id)))

(defn get-challenge-templates-with-http-info
  "List and search challenge templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  ([] (get-challenge-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/challenges/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-challenge-templates
  "List and search challenge templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CHALLENGES_ADMIN"
  ([] (get-challenge-templates nil))
  ([optional-params]
   (:data (get-challenge-templates-with-http-info optional-params))))

(defn get-challenges-with-http-info
  "Retrieve a list of challenges
  <b>Permissions Needed:</b> ANY"
  ([] (get-challenges-with-http-info nil))
  ([{:keys [filter-active-campaign filter-start-date filter-end-date size page order ]}]
   (call-api "/challenges" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_active_campaign" filter-active-campaign "filter_start_date" filter-start-date "filter_end_date" filter-end-date "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-challenges
  "Retrieve a list of challenges
  <b>Permissions Needed:</b> ANY"
  ([] (get-challenges nil))
  ([optional-params]
   (:data (get-challenges-with-http-info optional-params))))

(defn update-challenge-with-http-info
  "Update a challenge
  If the challenge is a copy, changes will propagate to all the related challenges. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([id ] (update-challenge-with-http-info id nil))
  ([id {:keys [challenge-resource ]}]
   (call-api "/challenges/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    challenge-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-challenge
  "Update a challenge
  If the challenge is a copy, changes will propagate to all the related challenges. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([id ] (update-challenge id nil))
  ([id optional-params]
   (:data (update-challenge-with-http-info id optional-params))))

(defn update-challenge-activity-with-http-info
  "Update a challenge activity
  A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([id challenge-id ] (update-challenge-activity-with-http-info id challenge-id nil))
  ([id challenge-id {:keys [challenge-activity-resource validate-settings ]}]
   (call-api "/challenges/{challenge_id}/activities/{id}" :put
             {:path-params   {"id" id "challenge_id" challenge-id }
              :header-params {}
              :query-params  {"validateSettings" validate-settings }
              :form-params   {}
              :body-param    challenge-activity-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-challenge-activity
  "Update a challenge activity
  A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. <br><br><b>Permissions Needed:</b> CHALLENGES_ADMIN"
  ([id challenge-id ] (update-challenge-activity id challenge-id nil))
  ([id challenge-id optional-params]
   (:data (update-challenge-activity-with-http-info id challenge-id optional-params))))

(defn update-challenge-activity-template-with-http-info
  "Update an challenge activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-challenge-activity-template-with-http-info id nil))
  ([id {:keys [challenge-activity-template-resource ]}]
   (call-api "/challenge-activities/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    challenge-activity-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-challenge-activity-template
  "Update an challenge activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-challenge-activity-template id nil))
  ([id optional-params]
   (:data (update-challenge-activity-template-with-http-info id optional-params))))

(defn update-challenge-template-with-http-info
  "Update a challenge template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-challenge-template-with-http-info id nil))
  ([id {:keys [challenge-template-resource ]}]
   (call-api "/challenges/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    challenge-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-challenge-template
  "Update a challenge template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-challenge-template id nil))
  ([id optional-params]
   (:data (update-challenge-template-with-http-info id optional-params))))

