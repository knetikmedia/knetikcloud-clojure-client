(ns knetik-platform-api-documentation-latest
.api.users-friendships
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-friend-with-http-info
  "Add a friend
  As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  [user-id id ]
  (call-api "/users/{user_id}/friends/{id}" :post
            {:path-params   {"user_id" user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn add-friend
  "Add a friend
  As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  [user-id id ]
  (:data (add-friend-with-http-info user-id id)))

(defn get-friends-with-http-info
  "Get friends list
  <b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  ([user-id ] (get-friends-with-http-info user-id nil))
  ([user-id {:keys [filter-username filter-user-id size page ]}]
   (call-api "/users/{user_id}/friends" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"filter_username" filter-username "filter_user_id" filter-user-id "size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-friends
  "Get friends list
  <b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  ([user-id ] (get-friends user-id nil))
  ([user-id optional-params]
   (:data (get-friends-with-http-info user-id optional-params))))

(defn get-invite-token-with-http-info
  "Returns the invite token
  This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)flow instead if confirmation is required"
  [user-id ]
  (call-api "/users/{user_id}/invite-token" :get
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-invite-token
  "Returns the invite token
  This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)flow instead if confirmation is required"
  [user-id ]
  (:data (get-invite-token-with-http-info user-id)))

(defn get-invites-with-http-info
  "Get pending invites
  Invites that the specified user received. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  ([user-id ] (get-invites-with-http-info user-id nil))
  ([user-id {:keys [size page ]}]
   (call-api "/users/{user_id}/invites" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-invites
  "Get pending invites
  Invites that the specified user received. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  ([user-id ] (get-invites user-id nil))
  ([user-id optional-params]
   (:data (get-invites-with-http-info user-id optional-params))))

(defn redeem-friendship-token-with-http-info
  "Redeem friendship token
  Immediately connects the requested user with the user mapped by the provided invite token. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  ([user-id ] (redeem-friendship-token-with-http-info user-id nil))
  ([user-id {:keys [token ]}]
   (call-api "/users/{user_id}/friends/tokens" :post
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    token
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn redeem-friendship-token
  "Redeem friendship token
  Immediately connects the requested user with the user mapped by the provided invite token. <br><br><b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  ([user-id ] (redeem-friendship-token user-id nil))
  ([user-id optional-params]
   (:data (redeem-friendship-token-with-http-info user-id optional-params))))

(defn remove-or-decline-friend-with-http-info
  "Remove or decline a friend
  <b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  [user-id id ]
  (call-api "/users/{user_id}/friends/{id}" :delete
            {:path-params   {"user_id" user-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-or-decline-friend
  "Remove or decline a friend
  <b>Permissions Needed:</b> FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)"
  [user-id id ]
  (:data (remove-or-decline-friend-with-http-info user-id id)))

