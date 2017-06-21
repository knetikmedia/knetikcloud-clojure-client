(ns knetik-platform-api-documentation-latest
.api.users-groups
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-member-to-group-with-http-info
  "Adds a new member to the group"
  [unique-name user ]
  (call-api "/users/groups/{unique_name}/members" :post
            {:path-params   {"unique_name" unique-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn add-member-to-group
  "Adds a new member to the group"
  [unique-name user ]
  (:data (add-member-to-group-with-http-info unique-name user)))

(defn add-members-to-group-with-http-info
  "Adds multiple members to the group"
  [unique-name users ]
  (call-api "/users/groups/{unique_name}/members/batch-add" :post
            {:path-params   {"unique_name" unique-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    users
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn add-members-to-group
  "Adds multiple members to the group"
  [unique-name users ]
  (:data (add-members-to-group-with-http-info unique-name users)))

(defn create-group-with-http-info
  "Create a group"
  ([] (create-group-with-http-info nil))
  ([{:keys [group-resource ]}]
   (call-api "/users/groups" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    group-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-group
  "Create a group"
  ([] (create-group nil))
  ([optional-params]
   (:data (create-group-with-http-info optional-params))))

(defn create-group-template-with-http-info
  "Create a group template
  Group Templates define a type of group and the properties they have"
  ([] (create-group-template-with-http-info nil))
  ([{:keys [group-template-resource ]}]
   (call-api "/users/groups/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    group-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-group-template
  "Create a group template
  Group Templates define a type of group and the properties they have"
  ([] (create-group-template nil))
  ([optional-params]
   (:data (create-group-template-with-http-info optional-params))))

(defn delete-group-with-http-info
  "Removes a group from the system IF no resources are attached to it"
  [unique-name ]
  (call-api "/users/groups/{unique_name}" :delete
            {:path-params   {"unique_name" unique-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn delete-group
  "Removes a group from the system IF no resources are attached to it"
  [unique-name ]
  (:data (delete-group-with-http-info unique-name)))

(defn delete-group-template-with-http-info
  "Delete a group template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-group-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/users/groups/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn delete-group-template
  "Delete a group template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-group-template id nil))
  ([id optional-params]
   (:data (delete-group-template-with-http-info id optional-params))))

(defn get-group-with-http-info
  "Loads a specific group's details"
  [unique-name ]
  (call-api "/users/groups/{unique_name}" :get
            {:path-params   {"unique_name" unique-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-group
  "Loads a specific group's details"
  [unique-name ]
  (:data (get-group-with-http-info unique-name)))

(defn get-group-member-with-http-info
  "Get a user from a group"
  [unique-name user-id ]
  (call-api "/users/groups/{unique_name}/members/{user_id}" :get
            {:path-params   {"unique_name" unique-name "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-group-member
  "Get a user from a group"
  [unique-name user-id ]
  (:data (get-group-member-with-http-info unique-name user-id)))

(defn get-group-members-with-http-info
  "Lists members of the group"
  ([unique-name ] (get-group-members-with-http-info unique-name nil))
  ([unique-name {:keys [size page order ]}]
   (call-api "/users/groups/{unique_name}/members" :get
             {:path-params   {"unique_name" unique-name }
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-group-members
  "Lists members of the group"
  ([unique-name ] (get-group-members unique-name nil))
  ([unique-name optional-params]
   (:data (get-group-members-with-http-info unique-name optional-params))))

(defn get-group-template-with-http-info
  "Get a single group template"
  [id ]
  (call-api "/users/groups/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-group-template
  "Get a single group template"
  [id ]
  (:data (get-group-template-with-http-info id)))

(defn get-group-templates-with-http-info
  "List and search group templates"
  ([] (get-group-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/users/groups/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-group-templates
  "List and search group templates"
  ([] (get-group-templates nil))
  ([optional-params]
   (:data (get-group-templates-with-http-info optional-params))))

(defn get-groups-for-user-with-http-info
  "List groups a user is in"
  [user-id ]
  (call-api "/users/{user_id}/groups" :get
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-groups-for-user
  "List groups a user is in"
  [user-id ]
  (:data (get-groups-for-user-with-http-info user-id)))

(defn remove-group-member-with-http-info
  "Removes a user from a group"
  [unique-name user-id ]
  (call-api "/users/groups/{unique_name}/members/{user_id}" :delete
            {:path-params   {"unique_name" unique-name "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn remove-group-member
  "Removes a user from a group"
  [unique-name user-id ]
  (:data (remove-group-member-with-http-info unique-name user-id)))

(defn update-group-with-http-info
  "Update a group"
  ([unique-name ] (update-group-with-http-info unique-name nil))
  ([unique-name {:keys [group-resource ]}]
   (call-api "/users/groups/{unique_name}" :put
             {:path-params   {"unique_name" unique-name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    group-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-group
  "Update a group"
  ([unique-name ] (update-group unique-name nil))
  ([unique-name optional-params]
   (:data (update-group-with-http-info unique-name optional-params))))

(defn update-group-member-status-with-http-info
  "Change a user's status"
  [unique-name user-id status ]
  (call-api "/users/groups/{unique_name}/members/{user_id}/status" :put
            {:path-params   {"unique_name" unique-name "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    status
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn update-group-member-status
  "Change a user's status"
  [unique-name user-id status ]
  (:data (update-group-member-status-with-http-info unique-name user-id status)))

(defn update-group-template-with-http-info
  "Update a group template"
  ([id ] (update-group-template-with-http-info id nil))
  ([id {:keys [group-template-resource ]}]
   (call-api "/users/groups/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    group-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-group-template
  "Update a group template"
  ([id ] (update-group-template id nil))
  ([id optional-params]
   (:data (update-group-template-with-http-info id optional-params))))

(defn update-groups-with-http-info
  "List and search groups"
  ([] (update-groups-with-http-info nil))
  ([{:keys [filter-template filter-member-count filter-name filter-unique-name filter-parent filter-status size page order ]}]
   (call-api "/users/groups" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_template" filter-template "filter_member_count" filter-member-count "filter_name" filter-name "filter_unique_name" filter-unique-name "filter_parent" filter-parent "filter_status" filter-status "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-groups
  "List and search groups"
  ([] (update-groups nil))
  ([optional-params]
   (:data (update-groups-with-http-info optional-params))))

