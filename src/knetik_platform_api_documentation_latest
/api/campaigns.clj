(ns knetik-platform-api-documentation-latest
.api.campaigns
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-challenge-to-campaign-with-http-info
  "Add a challenge to a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  ([id ] (add-challenge-to-campaign-with-http-info id nil))
  ([id {:keys [challenge-id ]}]
   (call-api "/campaigns/{id}/challenges" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    challenge-id
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-challenge-to-campaign
  "Add a challenge to a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  ([id ] (add-challenge-to-campaign id nil))
  ([id optional-params]
   (:data (add-challenge-to-campaign-with-http-info id optional-params))))

(defn create-campaign-with-http-info
  "Create a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  ([] (create-campaign-with-http-info nil))
  ([{:keys [campaign-resource ]}]
   (call-api "/campaigns" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    campaign-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-campaign
  "Create a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  ([] (create-campaign nil))
  ([optional-params]
   (:data (create-campaign-with-http-info optional-params))))

(defn create-campaign-template-with-http-info
  "Create a campaign template
  Campaign Templates define a type of campaign and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-campaign-template-with-http-info nil))
  ([{:keys [campaign-template-resource ]}]
   (call-api "/campaigns/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    campaign-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-campaign-template
  "Create a campaign template
  Campaign Templates define a type of campaign and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-campaign-template nil))
  ([optional-params]
   (:data (create-campaign-template-with-http-info optional-params))))

(defn delete-campaign-with-http-info
  "Delete a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  [id ]
  (call-api "/campaigns/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-campaign
  "Delete a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  [id ]
  (:data (delete-campaign-with-http-info id)))

(defn delete-campaign-template-with-http-info
  "Delete a campaign template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-campaign-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/campaigns/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-campaign-template
  "Delete a campaign template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-campaign-template id nil))
  ([id optional-params]
   (:data (delete-campaign-template-with-http-info id optional-params))))

(defn get-campaign-with-http-info
  "Returns a single campaign
  <b>Permissions Needed:</b> ANY"
  [id ]
  (call-api "/campaigns/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-campaign
  "Returns a single campaign
  <b>Permissions Needed:</b> ANY"
  [id ]
  (:data (get-campaign-with-http-info id)))

(defn get-campaign-challenges-with-http-info
  "List the challenges associated with a campaign
  <b>Permissions Needed:</b> ANY"
  ([id ] (get-campaign-challenges-with-http-info id nil))
  ([id {:keys [filter-start-date filter-end-date size page order ]}]
   (call-api "/campaigns/{id}/challenges" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"filter_start_date" filter-start-date "filter_end_date" filter-end-date "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-campaign-challenges
  "List the challenges associated with a campaign
  <b>Permissions Needed:</b> ANY"
  ([id ] (get-campaign-challenges id nil))
  ([id optional-params]
   (:data (get-campaign-challenges-with-http-info id optional-params))))

(defn get-campaign-template-with-http-info
  "Get a single campaign template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CAMPAIGNS_ADMIN"
  [id ]
  (call-api "/campaigns/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-campaign-template
  "Get a single campaign template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CAMPAIGNS_ADMIN"
  [id ]
  (:data (get-campaign-template-with-http-info id)))

(defn get-campaign-templates-with-http-info
  "List and search campaign templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CAMPAIGNS_ADMIN"
  ([] (get-campaign-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/campaigns/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-campaign-templates
  "List and search campaign templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or CAMPAIGNS_ADMIN"
  ([] (get-campaign-templates nil))
  ([optional-params]
   (:data (get-campaign-templates-with-http-info optional-params))))

(defn get-campaigns-with-http-info
  "List and search campaigns
  <b>Permissions Needed:</b> ANY"
  ([] (get-campaigns-with-http-info nil))
  ([{:keys [filter-active size page order ]}]
   (call-api "/campaigns" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_active" filter-active "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-campaigns
  "List and search campaigns
  <b>Permissions Needed:</b> ANY"
  ([] (get-campaigns nil))
  ([optional-params]
   (:data (get-campaigns-with-http-info optional-params))))

(defn remove-challenge-from-campaign-with-http-info
  "Remove a challenge from a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  [campaign-id id ]
  (call-api "/campaigns/{campaign_id}/challenges/{id}" :delete
            {:path-params   {"campaign_id" campaign-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-challenge-from-campaign
  "Remove a challenge from a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  [campaign-id id ]
  (:data (remove-challenge-from-campaign-with-http-info campaign-id id)))

(defn update-campaign-with-http-info
  "Update a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  ([id ] (update-campaign-with-http-info id nil))
  ([id {:keys [campaign-resource ]}]
   (call-api "/campaigns/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    campaign-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-campaign
  "Update a campaign
  <b>Permissions Needed:</b> CAMPAIGNS_ADMIN"
  ([id ] (update-campaign id nil))
  ([id optional-params]
   (:data (update-campaign-with-http-info id optional-params))))

(defn update-campaign-template-with-http-info
  "Update an campaign template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-campaign-template-with-http-info id nil))
  ([id {:keys [campaign-template-resource ]}]
   (call-api "/campaigns/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    campaign-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-campaign-template
  "Update an campaign template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-campaign-template id nil))
  ([id optional-params]
   (:data (update-campaign-template-with-http-info id optional-params))))

