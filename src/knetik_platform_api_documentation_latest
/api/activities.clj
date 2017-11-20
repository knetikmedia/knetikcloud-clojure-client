(ns knetik-platform-api-documentation-latest
.api.activities
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-activity-with-http-info
  "Create an activity"
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
  "Create an activity"
  ([] (create-activity nil))
  ([optional-params]
   (:data (create-activity-with-http-info optional-params))))

(defn create-activity-occurrence-with-http-info
  "Create a new activity occurrence. Ex: start a game
  Has to enforce extra rules if not used as an admin"
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
  Has to enforce extra rules if not used as an admin"
  ([] (create-activity-occurrence nil))
  ([optional-params]
   (:data (create-activity-occurrence-with-http-info optional-params))))

(defn create-activity-template-with-http-info
  "Create a activity template
  Activity Templates define a type of activity and the properties they have"
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
  Activity Templates define a type of activity and the properties they have"
  ([] (create-activity-template nil))
  ([optional-params]
   (:data (create-activity-template-with-http-info optional-params))))

(defn delete-activity-with-http-info
  "Delete an activity"
  [id ]
  (call-api "/activities/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-activity
  "Delete an activity"
  [id ]
  (:data (delete-activity-with-http-info id)))

(defn delete-activity-template-with-http-info
  "Delete a activity template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-activity-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/activities/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-activity-template
  "Delete a activity template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-activity-template id nil))
  ([id optional-params]
   (:data (delete-activity-template-with-http-info id optional-params))))

(defn get-activities-with-http-info
  "List activity definitions"
  ([] (get-activities-with-http-info nil))
  ([{:keys [filter-template filter-name filter-id size page order ]}]
   (call-api "/activities" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_template" filter-template "filter_name" filter-name "filter_id" filter-id "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-activities
  "List activity definitions"
  ([] (get-activities nil))
  ([optional-params]
   (:data (get-activities-with-http-info optional-params))))

(defn get-activity-with-http-info
  "Get a single activity"
  [id ]
  (call-api "/activities/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-activity
  "Get a single activity"
  [id ]
  (:data (get-activity-with-http-info id)))

(defn get-activity-occurrence-details-with-http-info
  "Load a single activity occurrence details"
  [activity-occurrence-id ]
  (call-api "/activity-occurrences/{activity_occurrence_id}" :get
            {:path-params   {"activity_occurrence_id" activity-occurrence-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-activity-occurrence-details
  "Load a single activity occurrence details"
  [activity-occurrence-id ]
  (:data (get-activity-occurrence-details-with-http-info activity-occurrence-id)))

(defn get-activity-template-with-http-info
  "Get a single activity template"
  [id ]
  (call-api "/activities/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-activity-template
  "Get a single activity template"
  [id ]
  (:data (get-activity-template-with-http-info id)))

(defn get-activity-templates-with-http-info
  "List and search activity templates"
  ([] (get-activity-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/activities/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-activity-templates
  "List and search activity templates"
  ([] (get-activity-templates nil))
  ([optional-params]
   (:data (get-activity-templates-with-http-info optional-params))))

(defn list-activity-occurrences-with-http-info
  "List activity occurrences"
  ([] (list-activity-occurrences-with-http-info nil))
  ([{:keys [filter-activity filter-status filter-event filter-challenge size page order ]}]
   (call-api "/activity-occurrences" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_activity" filter-activity "filter_status" filter-status "filter_event" filter-event "filter_challenge" filter-challenge "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn list-activity-occurrences
  "List activity occurrences"
  ([] (list-activity-occurrences nil))
  ([optional-params]
   (:data (list-activity-occurrences-with-http-info optional-params))))

(defn set-activity-occurrence-results-with-http-info
  "Sets the status of an activity occurrence to FINISHED and logs metrics"
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
  "Sets the status of an activity occurrence to FINISHED and logs metrics"
  ([activity-occurrence-id ] (set-activity-occurrence-results activity-occurrence-id nil))
  ([activity-occurrence-id optional-params]
   (:data (set-activity-occurrence-results-with-http-info activity-occurrence-id optional-params))))

(defn update-activity-with-http-info
  "Update an activity"
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
  "Update an activity"
  ([id ] (update-activity id nil))
  ([id optional-params]
   (:data (update-activity-with-http-info id optional-params))))

(defn update-activity-occurrence-with-http-info
  "Updated the status of an activity occurrence
  If setting to 'FINISHED' reward will be run based on current metrics that have been recorded already. Aternatively, see results endpoint to finish and record all metrics at once."
  ([activity-occurrence-id ] (update-activity-occurrence-with-http-info activity-occurrence-id nil))
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

(defn update-activity-occurrence
  "Updated the status of an activity occurrence
  If setting to 'FINISHED' reward will be run based on current metrics that have been recorded already. Aternatively, see results endpoint to finish and record all metrics at once."
  ([activity-occurrence-id ] (update-activity-occurrence activity-occurrence-id nil))
  ([activity-occurrence-id optional-params]
   (:data (update-activity-occurrence-with-http-info activity-occurrence-id optional-params))))

(defn update-activity-template-with-http-info
  "Update an activity template"
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
  "Update an activity template"
  ([id ] (update-activity-template id nil))
  ([id optional-params]
   (:data (update-activity-template-with-http-info id optional-params))))

