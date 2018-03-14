(ns knetik-platform-api-documentation-latest
.api.messaging
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn compile-message-template-with-http-info
  "Compile a message template
  Processes a set of input data against the template and returnes the compiled result. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (compile-message-template-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/messaging/templates/compilations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn compile-message-template
  "Compile a message template
  Processes a set of input data against the template and returnes the compiled result. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (compile-message-template nil))
  ([optional-params]
   (:data (compile-message-template-with-http-info optional-params))))

(defn create-message-template-with-http-info
  "Create a message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (create-message-template-with-http-info nil))
  ([{:keys [message-template ]}]
   (call-api "/messaging/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    message-template
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-message-template
  "Create a message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (create-message-template nil))
  ([optional-params]
   (:data (create-message-template-with-http-info optional-params))))

(defn delete-message-template-with-http-info
  "Delete an existing message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  [id ]
  (call-api "/messaging/templates/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-message-template
  "Delete an existing message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  [id ]
  (:data (delete-message-template-with-http-info id)))

(defn get-message-template-with-http-info
  "Get a single message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  [id ]
  (call-api "/messaging/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-message-template
  "Get a single message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  [id ]
  (:data (get-message-template-with-http-info id)))

(defn get-message-templates-with-http-info
  "List and search message templates
  Get a list of message templates with optional filtering. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (get-message-templates-with-http-info nil))
  ([{:keys [filter-tagset filter-tag-intersection filter-tag-exclusion size page order ]}]
   (call-api "/messaging/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_tagset" filter-tagset "filter_tag_intersection" filter-tag-intersection "filter_tag_exclusion" filter-tag-exclusion "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-message-templates
  "List and search message templates
  Get a list of message templates with optional filtering. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (get-message-templates nil))
  ([optional-params]
   (:data (get-message-templates-with-http-info optional-params))))

(defn send-message-with-http-info
  "Send a message
  Sends a message with one or more formats to one or more users. Fill in any message formats desired (email, sms, websockets) and each user will recieve all valid formats. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-message-with-http-info nil))
  ([{:keys [message-resource ]}]
   (call-api "/messaging/message" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    message-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-message
  "Send a message
  Sends a message with one or more formats to one or more users. Fill in any message formats desired (email, sms, websockets) and each user will recieve all valid formats. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-message nil))
  ([optional-params]
   (:data (send-message-with-http-info optional-params))))

(defn send-raw-email-with-http-info
  "Send a raw email to one or more users
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-raw-email-with-http-info nil))
  ([{:keys [raw-email-resource ]}]
   (call-api "/messaging/raw-email" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    raw-email-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-raw-email
  "Send a raw email to one or more users
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-raw-email nil))
  ([optional-params]
   (:data (send-raw-email-with-http-info optional-params))))

(defn send-raw-push-with-http-info
  "Send a raw push notification
  Sends a raw push notification message to one or more users. User's without registered mobile device for the application will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-raw-push-with-http-info nil))
  ([{:keys [raw-push-resource ]}]
   (call-api "/messaging/raw-push" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    raw-push-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-raw-push
  "Send a raw push notification
  Sends a raw push notification message to one or more users. User's without registered mobile device for the application will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-raw-push nil))
  ([optional-params]
   (:data (send-raw-push-with-http-info optional-params))))

(defn send-raw-sms-with-http-info
  "Send a raw SMS
  Sends a raw SMS text message to one or more users. User's without registered mobile numbers will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-raw-sms-with-http-info nil))
  ([{:keys [raw-sms-resource ]}]
   (call-api "/messaging/raw-sms" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    raw-sms-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-raw-sms
  "Send a raw SMS
  Sends a raw SMS text message to one or more users. User's without registered mobile numbers will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-raw-sms nil))
  ([optional-params]
   (:data (send-raw-sms-with-http-info optional-params))))

(defn send-templated-email-with-http-info
  "Send a templated email to one or more users
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-templated-email-with-http-info nil))
  ([{:keys [message-resource ]}]
   (call-api "/messaging/templated-email" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    message-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-templated-email
  "Send a templated email to one or more users
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-templated-email nil))
  ([optional-params]
   (:data (send-templated-email-with-http-info optional-params))))

(defn send-templated-push-with-http-info
  "Send a templated push notification
  Sends a templated push notification message to one or more users. User's without registered mobile device for the application will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-templated-push-with-http-info nil))
  ([{:keys [template-push-resource ]}]
   (call-api "/messaging/templated-push" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template-push-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-templated-push
  "Send a templated push notification
  Sends a templated push notification message to one or more users. User's without registered mobile device for the application will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-templated-push nil))
  ([optional-params]
   (:data (send-templated-push-with-http-info optional-params))))

(defn send-templated-sms-with-http-info
  "Send a new templated SMS
  Sends a templated SMS text message to one or more users. User's without registered mobile numbers will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-templated-sms-with-http-info nil))
  ([{:keys [template-sms-resource ]}]
   (call-api "/messaging/templated-sms" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    template-sms-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-templated-sms
  "Send a new templated SMS
  Sends a templated SMS text message to one or more users. User's without registered mobile numbers will be skipped. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-templated-sms nil))
  ([optional-params]
   (:data (send-templated-sms-with-http-info optional-params))))

(defn send-websocket-with-http-info
  "Send a websocket message
  Sends a websocket message to one or more users. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-websocket-with-http-info nil))
  ([{:keys [websocket-resource ]}]
   (call-api "/messaging/websocket-message" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    websocket-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn send-websocket
  "Send a websocket message
  Sends a websocket message to one or more users. <br><br><b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([] (send-websocket nil))
  ([optional-params]
   (:data (send-websocket-with-http-info optional-params))))

(defn update-message-template-with-http-info
  "Update an existing message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([id ] (update-message-template-with-http-info id nil))
  ([id {:keys [message-template-resource ]}]
   (call-api "/messaging/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    message-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-message-template
  "Update an existing message template
  <b>Permissions Needed:</b> MESSAGING_ADMIN"
  ([id ] (update-message-template id nil))
  ([id optional-params]
   (:data (update-message-template-with-http-info id optional-params))))

