(ns knetik-platform-api-documentation-latest
.api.media-videos
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-user-to-video-whitelist-with-http-info
  "Adds a user to a video's whitelist
  Whitelisted users can view video regardless of privacy setting."
  ([id ] (add-user-to-video-whitelist-with-http-info id nil))
  ([id {:keys [user-id ]}]
   (call-api "/media/videos/{id}/whitelist" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    user-id
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-user-to-video-whitelist
  "Adds a user to a video's whitelist
  Whitelisted users can view video regardless of privacy setting."
  ([id ] (add-user-to-video-whitelist id nil))
  ([id optional-params]
   (:data (add-user-to-video-whitelist-with-http-info id optional-params))))

(defn add-video-with-http-info
  "Adds a new video in the system"
  ([] (add-video-with-http-info nil))
  ([{:keys [video-resource ]}]
   (call-api "/media/videos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    video-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-video
  "Adds a new video in the system"
  ([] (add-video nil))
  ([optional-params]
   (:data (add-video-with-http-info optional-params))))

(defn add-video-comment-with-http-info
  "Add a new video comment"
  ([video-id ] (add-video-comment-with-http-info video-id nil))
  ([video-id {:keys [comment-resource ]}]
   (call-api "/media/videos/{video_id}/comments" :post
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    comment-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-video-comment
  "Add a new video comment"
  ([video-id ] (add-video-comment video-id nil))
  ([video-id optional-params]
   (:data (add-video-comment-with-http-info video-id optional-params))))

(defn add-video-contributor-with-http-info
  "Adds a contributor to a video"
  ([video-id ] (add-video-contributor-with-http-info video-id nil))
  ([video-id {:keys [contribution-resource ]}]
   (call-api "/media/videos/{video_id}/contributors" :post
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    contribution-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-video-contributor
  "Adds a contributor to a video"
  ([video-id ] (add-video-contributor video-id nil))
  ([video-id optional-params]
   (:data (add-video-contributor-with-http-info video-id optional-params))))

(defn add-video-flag-with-http-info
  "Add a new flag"
  ([video-id ] (add-video-flag-with-http-info video-id nil))
  ([video-id {:keys [reason ]}]
   (call-api "/media/videos/{video_id}/moderation" :post
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    reason
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-video-flag
  "Add a new flag"
  ([video-id ] (add-video-flag video-id nil))
  ([video-id optional-params]
   (:data (add-video-flag-with-http-info video-id optional-params))))

(defn add-video-relationships-with-http-info
  "Adds one or more existing videos as related to this one"
  ([video-id ] (add-video-relationships-with-http-info video-id nil))
  ([video-id {:keys [video-relationship-resource ]}]
   (call-api "/media/videos/{video_id}/related" :post
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    video-relationship-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-video-relationships
  "Adds one or more existing videos as related to this one"
  ([video-id ] (add-video-relationships video-id nil))
  ([video-id optional-params]
   (:data (add-video-relationships-with-http-info video-id optional-params))))

(defn create-video-disposition-with-http-info
  "Create a video disposition"
  ([video-id ] (create-video-disposition-with-http-info video-id nil))
  ([video-id {:keys [disposition-resource ]}]
   (call-api "/media/videos/{video_id}/dispositions" :post
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    disposition-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-video-disposition
  "Create a video disposition"
  ([video-id ] (create-video-disposition video-id nil))
  ([video-id optional-params]
   (:data (create-video-disposition-with-http-info video-id optional-params))))

(defn delete-video-with-http-info
  "Deletes a video from the system if no resources are attached to it"
  [id ]
  (call-api "/media/videos/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-video
  "Deletes a video from the system if no resources are attached to it"
  [id ]
  (:data (delete-video-with-http-info id)))

(defn delete-video-comment-with-http-info
  "Delete a video comment"
  [video-id id ]
  (call-api "/media/videos/{video_id}/comments/{id}" :delete
            {:path-params   {"video_id" video-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-video-comment
  "Delete a video comment"
  [video-id id ]
  (:data (delete-video-comment-with-http-info video-id id)))

(defn delete-video-disposition-with-http-info
  "Delete a video disposition"
  [disposition-id ]
  (call-api "/media/videos/{video_id}/dispositions/{disposition_id}" :delete
            {:path-params   {"disposition_id" disposition-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-video-disposition
  "Delete a video disposition"
  [disposition-id ]
  (:data (delete-video-disposition-with-http-info disposition-id)))

(defn delete-video-flag-with-http-info
  "Delete a flag"
  [video-id ]
  (call-api "/media/videos/{video_id}/moderation" :delete
            {:path-params   {"video_id" video-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-video-flag
  "Delete a flag"
  [video-id ]
  (:data (delete-video-flag-with-http-info video-id)))

(defn delete-video-relationship-with-http-info
  "Delete a video's relationship"
  [video-id id ]
  (call-api "/media/videos/{video_id}/related/{id}" :delete
            {:path-params   {"video_id" video-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-video-relationship
  "Delete a video's relationship"
  [video-id id ]
  (:data (delete-video-relationship-with-http-info video-id id)))

(defn get-user-videos-with-http-info
  "Get user videos"
  ([user-id ] (get-user-videos-with-http-info user-id nil))
  ([user-id {:keys [exclude-flagged size page ]}]
   (call-api "/users/{user_id}/videos" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"exclude_flagged" exclude-flagged "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-videos
  "Get user videos"
  ([user-id ] (get-user-videos user-id nil))
  ([user-id optional-params]
   (:data (get-user-videos-with-http-info user-id optional-params))))

(defn get-video-with-http-info
  "Loads a specific video details"
  [id ]
  (call-api "/media/videos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-video
  "Loads a specific video details"
  [id ]
  (:data (get-video-with-http-info id)))

(defn get-video-comments-with-http-info
  "Returns a page of comments for a video"
  ([video-id ] (get-video-comments-with-http-info video-id nil))
  ([video-id {:keys [size page ]}]
   (call-api "/media/videos/{video_id}/comments" :get
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-video-comments
  "Returns a page of comments for a video"
  ([video-id ] (get-video-comments video-id nil))
  ([video-id optional-params]
   (:data (get-video-comments-with-http-info video-id optional-params))))

(defn get-video-dispositions-with-http-info
  "Returns a page of dispositions for a video"
  ([video-id ] (get-video-dispositions-with-http-info video-id nil))
  ([video-id {:keys [size page ]}]
   (call-api "/media/videos/{video_id}/dispositions" :get
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-video-dispositions
  "Returns a page of dispositions for a video"
  ([video-id ] (get-video-dispositions video-id nil))
  ([video-id optional-params]
   (:data (get-video-dispositions-with-http-info video-id optional-params))))

(defn get-video-relationships-with-http-info
  "Returns a page of video relationships"
  ([video-id ] (get-video-relationships-with-http-info video-id nil))
  ([video-id {:keys [size page ]}]
   (call-api "/media/videos/{video_id}/related" :get
             {:path-params   {"video_id" video-id }
              :header-params {}
              :query-params  {"size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-video-relationships
  "Returns a page of video relationships"
  ([video-id ] (get-video-relationships video-id nil))
  ([video-id optional-params]
   (:data (get-video-relationships-with-http-info video-id optional-params))))

(defn get-videos-with-http-info
  "Search videos using the documented filters"
  ([] (get-videos-with-http-info nil))
  ([{:keys [exclude-flagged filter-videos-by-uploader filter-category filter-tagset filter-videos-by-name filter-videos-by-contributor filter-videos-by-author filter-has-author filter-has-uploader filter-related-to filter-friends filter-disposition size page order ]}]
   (call-api "/media/videos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"exclude_flagged" exclude-flagged "filter_videos_by_uploader" filter-videos-by-uploader "filter_category" filter-category "filter_tagset" filter-tagset "filter_videos_by_name" filter-videos-by-name "filter_videos_by_contributor" filter-videos-by-contributor "filter_videos_by_author" filter-videos-by-author "filter_has_author" filter-has-author "filter_has_uploader" filter-has-uploader "filter_related_to" filter-related-to "filter_friends" filter-friends "filter_disposition" filter-disposition "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-videos
  "Search videos using the documented filters"
  ([] (get-videos nil))
  ([optional-params]
   (:data (get-videos-with-http-info optional-params))))

(defn remove-user-from-video-whitelist-with-http-info
  "Removes a user from a video's whitelist
  Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting."
  [video-id id ]
  (call-api "/media/videos/{video_id}/whitelist/{id}" :delete
            {:path-params   {"video_id" video-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-user-from-video-whitelist
  "Removes a user from a video's whitelist
  Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting."
  [video-id id ]
  (:data (remove-user-from-video-whitelist-with-http-info video-id id)))

(defn remove-video-contributor-with-http-info
  "Removes a contributor from a video"
  [video-id id ]
  (call-api "/media/videos/{video_id}/contributors/{id}" :delete
            {:path-params   {"video_id" video-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-video-contributor
  "Removes a contributor from a video"
  [video-id id ]
  (:data (remove-video-contributor-with-http-info video-id id)))

(defn update-video-with-http-info
  "Modifies a video's details"
  ([id ] (update-video-with-http-info id nil))
  ([id {:keys [video-resource ]}]
   (call-api "/media/videos/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    video-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-video
  "Modifies a video's details"
  ([id ] (update-video id nil))
  ([id optional-params]
   (:data (update-video-with-http-info id optional-params))))

(defn update-video-comment-with-http-info
  "Update a video comment"
  ([video-id id ] (update-video-comment-with-http-info video-id id nil))
  ([video-id id {:keys [content ]}]
   (call-api "/media/videos/{video_id}/comments/{id}/content" :put
             {:path-params   {"video_id" video-id "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    content
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-video-comment
  "Update a video comment"
  ([video-id id ] (update-video-comment video-id id nil))
  ([video-id id optional-params]
   (:data (update-video-comment-with-http-info video-id id optional-params))))

(defn update-video-relationship-with-http-info
  "Update a video's relationship details"
  ([video-id relationship-id ] (update-video-relationship-with-http-info video-id relationship-id nil))
  ([video-id relationship-id {:keys [details ]}]
   (call-api "/media/videos/{video_id}/related/{id}/relationship_details" :put
             {:path-params   {"video_id" video-id "relationship_id" relationship-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    details
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-video-relationship
  "Update a video's relationship details"
  ([video-id relationship-id ] (update-video-relationship video-id relationship-id nil))
  ([video-id relationship-id optional-params]
   (:data (update-video-relationship-with-http-info video-id relationship-id optional-params))))

(defn view-video-with-http-info
  "Increment a video's view count"
  [id ]
  (call-api "/media/videos/{id}/views" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn view-video
  "Increment a video's view count"
  [id ]
  (:data (view-video-with-http-info id)))

