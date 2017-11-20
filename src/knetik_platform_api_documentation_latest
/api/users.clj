(ns knetik-platform-api-documentation-latest
.api.users
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-user-tag-with-http-info
  "Add a tag to a user"
  [user-id tag ]
  (call-api "/users/{user_id}/tags" :post
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    tag
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn add-user-tag
  "Add a tag to a user"
  [user-id tag ]
  (:data (add-user-tag-with-http-info user-id tag)))

(defn create-user-template-with-http-info
  "Create a user template
  User Templates define a type of user and the properties they have"
  ([] (create-user-template-with-http-info nil))
  ([{:keys [user-template-resource ]}]
   (call-api "/users/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    user-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-user-template
  "Create a user template
  User Templates define a type of user and the properties they have"
  ([] (create-user-template nil))
  ([optional-params]
   (:data (create-user-template-with-http-info optional-params))))

(defn delete-user-template-with-http-info
  "Delete a user template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-user-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/users/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-user-template
  "Delete a user template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-user-template id nil))
  ([id optional-params]
   (:data (delete-user-template-with-http-info id optional-params))))

(defn get-user-with-http-info
  "Get a single user
  Additional private info is included as USERS_ADMIN"
  [id ]
  (call-api "/users/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user
  "Get a single user
  Additional private info is included as USERS_ADMIN"
  [id ]
  (:data (get-user-with-http-info id)))

(defn get-user-tags-with-http-info
  "List tags for a user"
  [user-id ]
  (call-api "/users/{user_id}/tags" :get
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-tags
  "List tags for a user"
  [user-id ]
  (:data (get-user-tags-with-http-info user-id)))

(defn get-user-template-with-http-info
  "Get a single user template"
  [id ]
  (call-api "/users/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-template
  "Get a single user template"
  [id ]
  (:data (get-user-template-with-http-info id)))

(defn get-user-templates-with-http-info
  "List and search user templates"
  ([] (get-user-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/users/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-templates
  "List and search user templates"
  ([] (get-user-templates nil))
  ([optional-params]
   (:data (get-user-templates-with-http-info optional-params))))

(defn get-users-with-http-info
  "List and search users
  Additional private info is included as USERS_ADMIN"
  ([] (get-users-with-http-info nil))
  ([{:keys [filter-displayname filter-email filter-firstname filter-fullname filter-lastname filter-username filter-tag filter-group filter-role filter-last-activity filter-id-list filter-search size page order ]}]
   (call-api "/users" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_displayname" filter-displayname "filter_email" filter-email "filter_firstname" filter-firstname "filter_fullname" filter-fullname "filter_lastname" filter-lastname "filter_username" filter-username "filter_tag" filter-tag "filter_group" filter-group "filter_role" filter-role "filter_last_activity" filter-last-activity "filter_id_list" filter-id-list "filter_search" filter-search "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-users
  "List and search users
  Additional private info is included as USERS_ADMIN"
  ([] (get-users nil))
  ([optional-params]
   (:data (get-users-with-http-info optional-params))))

(defn password-reset-with-http-info
  "Choose a new password after a reset
  Finish resetting a user's password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security."
  ([id ] (password-reset-with-http-info id nil))
  ([id {:keys [new-password-request ]}]
   (call-api "/users/{id}/password-reset" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    new-password-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn password-reset
  "Choose a new password after a reset
  Finish resetting a user's password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security."
  ([id ] (password-reset id nil))
  ([id optional-params]
   (:data (password-reset-with-http-info id optional-params))))

(defn register-user-with-http-info
  "Register a new user
  Password should be in plain text and will be encrypted on receipt. Use SSL for security"
  ([] (register-user-with-http-info nil))
  ([{:keys [user-resource ]}]
   (call-api "/users" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    user-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn register-user
  "Register a new user
  Password should be in plain text and will be encrypted on receipt. Use SSL for security"
  ([] (register-user nil))
  ([optional-params]
   (:data (register-user-with-http-info optional-params))))

(defn remove-user-tag-with-http-info
  "Remove a tag from a user"
  [user-id tag ]
  (call-api "/users/{user_id}/tags/{tag}" :delete
            {:path-params   {"user_id" user-id "tag" tag }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-user-tag
  "Remove a tag from a user"
  [user-id tag ]
  (:data (remove-user-tag-with-http-info user-id tag)))

(defn set-password-with-http-info
  "Set a user's password
  Password should be in plain text and will be encrypted on receipt. Use SSL for security."
  ([id ] (set-password-with-http-info id nil))
  ([id {:keys [password ]}]
   (call-api "/users/{id}/password" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    password
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn set-password
  "Set a user's password
  Password should be in plain text and will be encrypted on receipt. Use SSL for security."
  ([id ] (set-password id nil))
  ([id optional-params]
   (:data (set-password-with-http-info id optional-params))))

(defn start-password-reset-with-http-info
  "Reset a user's password
  A reset code will be generated and a 'forgot_password' BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit"
  [id ]
  (call-api "/users/{id}/password-reset" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn start-password-reset
  "Reset a user's password
  A reset code will be generated and a 'forgot_password' BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit"
  [id ]
  (:data (start-password-reset-with-http-info id)))

(defn submit-password-reset-with-http-info
  "Reset a user's password without user id
  A reset code will be generated and a 'forgot_password' BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit.  Must submit their email, username, or mobile phone number"
  ([] (submit-password-reset-with-http-info nil))
  ([{:keys [password-reset ]}]
   (call-api "/users/password-reset" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    password-reset
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn submit-password-reset
  "Reset a user's password without user id
  A reset code will be generated and a 'forgot_password' BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit.  Must submit their email, username, or mobile phone number"
  ([] (submit-password-reset nil))
  ([optional-params]
   (:data (submit-password-reset-with-http-info optional-params))))

(defn update-user-with-http-info
  "Update a user
  Password will not be edited on this endpoint, use password specific endpoints."
  ([id ] (update-user-with-http-info id nil))
  ([id {:keys [user-resource ]}]
   (call-api "/users/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    user-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-user
  "Update a user
  Password will not be edited on this endpoint, use password specific endpoints."
  ([id ] (update-user id nil))
  ([id optional-params]
   (:data (update-user-with-http-info id optional-params))))

(defn update-user-template-with-http-info
  "Update a user template"
  ([id ] (update-user-template-with-http-info id nil))
  ([id {:keys [user-template-resource ]}]
   (call-api "/users/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    user-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-user-template
  "Update a user template"
  ([id ] (update-user-template id nil))
  ([id optional-params]
   (:data (update-user-template-with-http-info id optional-params))))

