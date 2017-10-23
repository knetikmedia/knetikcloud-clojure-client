(ns knetik-platform-api-documentation-latest
.api.messaging
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn send-raw-email-with-http-info
  "Send a raw email to one or more users"
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
  "Send a raw email to one or more users"
  ([] (send-raw-email nil))
  ([optional-params]
   (:data (send-raw-email-with-http-info optional-params))))

(defn send-raw-push-with-http-info
  "Send a raw push notification
  Sends a raw push notification message to one or more users. User's without registered mobile device for the application will be skipped."
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
  Sends a raw push notification message to one or more users. User's without registered mobile device for the application will be skipped."
  ([] (send-raw-push nil))
  ([optional-params]
   (:data (send-raw-push-with-http-info optional-params))))

(defn send-raw-sms-with-http-info
  "Send a raw SMS
  Sends a raw SMS text message to one or more users. User's without registered mobile numbers will be skipped."
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
  Sends a raw SMS text message to one or more users. User's without registered mobile numbers will be skipped."
  ([] (send-raw-sms nil))
  ([optional-params]
   (:data (send-raw-sms-with-http-info optional-params))))

(defn send-templated-email-with-http-info
  "Send a templated email to one or more users"
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
  "Send a templated email to one or more users"
  ([] (send-templated-email nil))
  ([optional-params]
   (:data (send-templated-email-with-http-info optional-params))))

(defn send-templated-push-with-http-info
  "Send a templated push notification
  Sends a templated push notification message to one or more users. User's without registered mobile device for the application will be skipped."
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
  Sends a templated push notification message to one or more users. User's without registered mobile device for the application will be skipped."
  ([] (send-templated-push nil))
  ([optional-params]
   (:data (send-templated-push-with-http-info optional-params))))

(defn send-templated-sms-with-http-info
  "Send a new templated SMS
  Sends a templated SMS text message to one or more users. User's without registered mobile numbers will be skipped."
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
  Sends a templated SMS text message to one or more users. User's without registered mobile numbers will be skipped."
  ([] (send-templated-sms nil))
  ([optional-params]
   (:data (send-templated-sms-with-http-info optional-params))))

