(ns knetik-platform-api-documentation-latest
.api.activities
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-user-with-http-info
  "Add a user to an occurrence
  If called with no body, defaults to the user making the call."
  ([activity-occurrence-id ] (add-user-with-http-info activity-occurrence-id nil))
  ([activity-occurrence-id {:keys [test bypass-restrictions user-id ]}]
   (call-api "/activity-occurrences/{activity_occurrence_id}/users" :post
             {:path-params   {"activity_occurrence_id" activity-occurrence-id }
              :header-params {}
              :query-params  {"test" test "bypass_restrictions" bypass-restrictions }
              :form-params   {}
              :body-param    user-id
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-user
  "Add a user to an occurrence
  If called with no body, defaults to the user making the call."
  ([activity-occurrence-id ] (add-user activity-occurrence-id nil))
  ([activity-occurrence-id optional-params]
   (:data (add-user-with-http-info activity-occurrence-id optional-params))))

(defn create-activity-with-http-info
  "Create an activity
  <b>Permissions Needed:</b> ACTIVITIES_ADMIN"
  ([] (create-activity-with-http-info nil))
  ([{:keys [activity-resource ]}]
   (call-api "/activities" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    activity-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-activity
  "Create an activity
  <b>Permissions Needed:</b> ACTIVITIES_ADMIN"
  ([] (create-activity nil))
  ([optional-params]
   (:data (create-activity-with-http-info optional-params))))

(defn create-activity-occurrence-with-http-info
  "Create a new activity occurrence. Ex: start a game
  Has to enforce extra rules if not used as an admin. <br><br><b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  ([] (create-activity-occurrence-with-http-info nil))
  ([{:keys [test activity-occurrence-resource ]}]
   (call-api "/activity-occurrences" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"test" test }
              :form-params   {}
              :body-param    activity-occurrence-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-activity-occurrence
  "Create a new activity occurrence. Ex: start a game
  Has to enforce extra rules if not used as an admin. <br><br><b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  ([] (create-activity-occurrence nil))
  ([optional-params]
   (:data (create-activity-occurrence-with-http-info optional-params))))

(defn create-activity-template-with-http-info
  "Create a activity template
  Activity Templates define a type of activity and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-activity-template-with-http-info nil))
  ([{:keys [activity-template-resource ]}]
   (call-api "/activities/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    activity-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-activity-template
  "Create a activity template
  Activity Templates define a type of activity and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-activity-template nil))
  ([optional-params]
   (:data (create-activity-template-with-http-info optional-params))))

(defn delete-activity-with-http-info
  "Delete an activity
  <b>Permissions Needed:</b> ACTIVITIES_ADMIN"
  [id ]
  (call-api "/activities/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-activity
  "Delete an activity
  <b>Permissions Needed:</b> ACTIVITIES_ADMIN"
  [id ]
  (:data (delete-activity-with-http-info id)))

(defn delete-activity-template-with-http-info
  "Delete a activity template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-activity-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/activities/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-activity-template
  "Delete a activity template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-activity-template id nil))
  ([id optional-params]
   (:data (delete-activity-template-with-http-info id optional-params))))

(defn get-activities-with-http-info
  "List activity definitions
  <b>Permissions Needed:</b> ANY"
  ([] (get-activities-with-http-info nil))
  ([{:keys [filter-template filter-name filter-id size page order ]}]
   (call-api "/activities" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_template" filter-template "filter_name" filter-name "filter_id" filter-id "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-activities
  "List activity definitions
  <b>Permissions Needed:</b> ANY"
  ([] (get-activities nil))
  ([optional-params]
   (:data (get-activities-with-http-info optional-params))))

(defn get-activity-with-http-info
  "Get a single activity
  <b>Permissions Needed:</b> ANY"
  [id ]
  (call-api "/activities/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-activity
  "Get a single activity
  <b>Permissions Needed:</b> ANY"
  [id ]
  (:data (get-activity-with-http-info id)))

(defn get-activity-occurrence-details-with-http-info
  "Load a single activity occurrence details
  <b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  [activity-occurrence-id ]
  (call-api "/activity-occurrences/{activity_occurrence_id}" :get
            {:path-params   {"activity_occurrence_id" activity-occurrence-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-activity-occurrence-details
  "Load a single activity occurrence details
  <b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  [activity-occurrence-id ]
  (:data (get-activity-occurrence-details-with-http-info activity-occurrence-id)))

(defn get-activity-template-with-http-info
  "Get a single activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACTIVITIES_ADMIN"
  [id ]
  (call-api "/activities/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-activity-template
  "Get a single activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACTIVITIES_ADMIN"
  [id ]
  (:data (get-activity-template-with-http-info id)))

(defn get-activity-templates-with-http-info
  "List and search activity templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACTIVITIES_ADMIN"
  ([] (get-activity-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/activities/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-activity-templates
  "List and search activity templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ACTIVITIES_ADMIN"
  ([] (get-activity-templates nil))
  ([optional-params]
   (:data (get-activity-templates-with-http-info optional-params))))

(defn list-activity-occurrences-with-http-info
  "List activity occurrences
  <b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  ([] (list-activity-occurrences-with-http-info nil))
  ([{:keys [filter-activity filter-status filter-event filter-challenge size page order ]}]
   (call-api "/activity-occurrences" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_activity" filter-activity "filter_status" filter-status "filter_event" filter-event "filter_challenge" filter-challenge "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn list-activity-occurrences
  "List activity occurrences
  <b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  ([] (list-activity-occurrences nil))
  ([optional-params]
   (:data (list-activity-occurrences-with-http-info optional-params))))

(defn remove-user-with-http-info
  "Remove a user from an occurrence"
  ([activity-occurrence-id user-id ] (remove-user-with-http-info activity-occurrence-id user-id nil))
  ([activity-occurrence-id user-id {:keys [ban bypass-restrictions ]}]
   (call-api "/activity-occurrences/{activity_occurrence_id}/users/{user_id}" :delete
             {:path-params   {"activity_occurrence_id" activity-occurrence-id "user_id" user-id }
              :header-params {}
              :query-params  {"ban" ban "bypass_restrictions" bypass-restrictions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn remove-user
  "Remove a user from an occurrence"
  ([activity-occurrence-id user-id ] (remove-user activity-occurrence-id user-id nil))
  ([activity-occurrence-id user-id optional-params]
   (:data (remove-user-with-http-info activity-occurrence-id user-id optional-params))))

(defn set-activity-occurrence-results-with-http-info
  "Sets the status of an activity occurrence to FINISHED and logs metrics
  In addition to user permissions requirements there is security based on the core_settings.results_trust setting. <br><br><b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  ([activity-occurrence-id ] (set-activity-occurrence-results-with-http-info activity-occurrence-id nil))
  ([activity-occurrence-id {:keys [activity-occurrence-results ]}]
   (call-api "/activity-occurrences/{activity_occurrence_id}/results" :post
             {:path-params   {"activity_occurrence_id" activity-occurrence-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    activity-occurrence-results
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-activity-occurrence-results
  "Sets the status of an activity occurrence to FINISHED and logs metrics
  In addition to user permissions requirements there is security based on the core_settings.results_trust setting. <br><br><b>Permissions Needed:</b> ACTIVITIES_USER or ACTIVITIES_ADMIN"
  ([activity-occurrence-id ] (set-activity-occurrence-results activity-occurrence-id nil))
  ([activity-occurrence-id optional-params]
   (:data (set-activity-occurrence-results-with-http-info activity-occurrence-id optional-params))))

(defn set-activity-occurrence-settings-with-http-info
  "Sets the settings of an activity occurrence
  <b>Permissions Needed:</b> ACTIVITIES_USER and host or ACTIVITIES_ADMIN"
  ([activity-occurrence-id ] (set-activity-occurrence-settings-with-http-info activity-occurrence-id nil))
  ([activity-occurrence-id {:keys [settings ]}]
   (call-api "/activity-occurrences/{activity_occurrence_id}/settings" :put
             {:path-params   {"activity_occurrence_id" activity-occurrence-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    settings
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-activity-occurrence-settings
  "Sets the settings of an activity occurrence
  <b>Permissions Needed:</b> ACTIVITIES_USER and host or ACTIVITIES_ADMIN"
  ([activity-occurrence-id ] (set-activity-occurrence-settings activity-occurrence-id nil))
  ([activity-occurrence-id optional-params]
   (:data (set-activity-occurrence-settings-with-http-info activity-occurrence-id optional-params))))

(defn set-user-status-with-http-info
  "Set a user's status within an occurrence"
  ([activity-occurrence-id user-id ] (set-user-status-with-http-info activity-occurrence-id user-id nil))
  ([activity-occurrence-id user-id {:keys [status ]}]
   (call-api "/activity-occurrences/{activity_occurrence_id}/users/{user_id}/status" :put
             {:path-params   {"activity_occurrence_id" activity-occurrence-id "user_id" user-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    status
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-user-status
  "Set a user's status within an occurrence"
  ([activity-occurrence-id user-id ] (set-user-status activity-occurrence-id user-id nil))
  ([activity-occurrence-id user-id optional-params]
   (:data (set-user-status-with-http-info activity-occurrence-id user-id optional-params))))

(defn update-activity-with-http-info
  "Update an activity
  <b>Permissions Needed:</b> ACTIVITIES_ADMIN"
  ([id ] (update-activity-with-http-info id nil))
  ([id {:keys [activity-resource ]}]
   (call-api "/activities/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    activity-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-activity
  "Update an activity
  <b>Permissions Needed:</b> ACTIVITIES_ADMIN"
  ([id ] (update-activity id nil))
  ([id optional-params]
   (:data (update-activity-with-http-info id optional-params))))

(defn update-activity-occurrence-status-with-http-info
  "Update the status of an activity occurrence
  If setting to 'FINISHED' reward will be run based on current metrics that have been recorded already. Alternatively, see results endpoint to finish and record all metrics at once. Can be called by non-host participants if non_host_status_control is true. <br><br><b>Permissions Needed:</b> ACTIVITIES_USER and host or ACTIVITIES_ADMIN"
  ([activity-occurrence-id ] (update-activity-occurrence-status-with-http-info activity-occurrence-id nil))
  ([activity-occurrence-id {:keys [activity-occurrence-status ]}]
   (call-api "/activity-occurrences/{activity_occurrence_id}/status" :put
             {:path-params   {"activity_occurrence_id" activity-occurrence-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    activity-occurrence-status
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-activity-occurrence-status
  "Update the status of an activity occurrence
  If setting to 'FINISHED' reward will be run based on current metrics that have been recorded already. Alternatively, see results endpoint to finish and record all metrics at once. Can be called by non-host participants if non_host_status_control is true. <br><br><b>Permissions Needed:</b> ACTIVITIES_USER and host or ACTIVITIES_ADMIN"
  ([activity-occurrence-id ] (update-activity-occurrence-status activity-occurrence-id nil))
  ([activity-occurrence-id optional-params]
   (:data (update-activity-occurrence-status-with-http-info activity-occurrence-id optional-params))))

(defn update-activity-template-with-http-info
  "Update an activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-activity-template-with-http-info id nil))
  ([id {:keys [activity-template-resource ]}]
   (call-api "/activities/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    activity-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-activity-template
  "Update an activity template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-activity-template id nil))
  ([id optional-params]
   (:data (update-activity-template-with-http-info id optional-params))))

