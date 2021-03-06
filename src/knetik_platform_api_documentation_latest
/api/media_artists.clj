(ns knetik-platform-api-documentation-latest
.api.media-artists
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-artist-with-http-info
  "Adds a new artist in the system
  Adds a new artist in the system. Use specific media contributions endpoint to add contributions. <br><br><b>Permissions Needed:</b> ANY"
  ([] (add-artist-with-http-info nil))
  ([{:keys [artist-resource ]}]
   (call-api "/media/artists" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    artist-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-artist
  "Adds a new artist in the system
  Adds a new artist in the system. Use specific media contributions endpoint to add contributions. <br><br><b>Permissions Needed:</b> ANY"
  ([] (add-artist nil))
  ([optional-params]
   (:data (add-artist-with-http-info optional-params))))

(defn create-artist-template-with-http-info
  "Create an artist template
  Artist Templates define a type of artist and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-artist-template-with-http-info nil))
  ([{:keys [artist-template-resource ]}]
   (call-api "/media/artists/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    artist-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-artist-template
  "Create an artist template
  Artist Templates define a type of artist and the properties they have. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([] (create-artist-template nil))
  ([optional-params]
   (:data (create-artist-template-with-http-info optional-params))))

(defn delete-artist-with-http-info
  "Removes an artist from the system IF no resources are attached to it
  <b>Permissions Needed:</b> ARTISTS_ADMIN"
  [id ]
  (call-api "/media/artists/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-artist
  "Removes an artist from the system IF no resources are attached to it
  <b>Permissions Needed:</b> ARTISTS_ADMIN"
  [id ]
  (:data (delete-artist-with-http-info id)))

(defn delete-artist-template-with-http-info
  "Delete an artist template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-artist-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/media/artists/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-artist-template
  "Delete an artist template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-artist-template id nil))
  ([id optional-params]
   (:data (delete-artist-template-with-http-info id optional-params))))

(defn get-artist-with-http-info
  "Loads a specific artist details
  <b>Permissions Needed:</b> ANY"
  ([id ] (get-artist-with-http-info id nil))
  ([id {:keys [show-contributions ]}]
   (call-api "/media/artists/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"show_contributions" show-contributions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-artist
  "Loads a specific artist details
  <b>Permissions Needed:</b> ANY"
  ([id ] (get-artist id nil))
  ([id optional-params]
   (:data (get-artist-with-http-info id optional-params))))

(defn get-artist-template-with-http-info
  "Get a single artist template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTISTS_ADMIN"
  [id ]
  (call-api "/media/artists/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-artist-template
  "Get a single artist template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTISTS_ADMIN"
  [id ]
  (:data (get-artist-template-with-http-info id)))

(defn get-artist-templates-with-http-info
  "List and search artist templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTISTS_ADMIN"
  ([] (get-artist-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/media/artists/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-artist-templates
  "List and search artist templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or ARTISTS_ADMIN"
  ([] (get-artist-templates nil))
  ([optional-params]
   (:data (get-artist-templates-with-http-info optional-params))))

(defn get-artists-with-http-info
  "Search for artists
  <b>Permissions Needed:</b> ANY"
  ([] (get-artists-with-http-info nil))
  ([{:keys [filter-artists-by-name size page order ]}]
   (call-api "/media/artists" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_artists_by_name" filter-artists-by-name "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-artists
  "Search for artists
  <b>Permissions Needed:</b> ANY"
  ([] (get-artists nil))
  ([optional-params]
   (:data (get-artists-with-http-info optional-params))))

(defn update-artist-with-http-info
  "Modifies an artist details
  <b>Permissions Needed:</b> ARTISTS_ADMIN"
  ([id ] (update-artist-with-http-info id nil))
  ([id {:keys [artist-resource ]}]
   (call-api "/media/artists/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    artist-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-artist
  "Modifies an artist details
  <b>Permissions Needed:</b> ARTISTS_ADMIN"
  ([id ] (update-artist id nil))
  ([id optional-params]
   (:data (update-artist-with-http-info id optional-params))))

(defn update-artist-template-with-http-info
  "Update an artist template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-artist-template-with-http-info id nil))
  ([id {:keys [artist-template-resource ]}]
   (call-api "/media/artists/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    artist-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-artist-template
  "Update an artist template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-artist-template id nil))
  ([id optional-params]
   (:data (update-artist-template-with-http-info id optional-params))))

