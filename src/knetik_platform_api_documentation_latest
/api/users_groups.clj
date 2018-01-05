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
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

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
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-group
  "Create a group"
  ([] (create-group nil))
  ([optional-params]
   (:data (create-group-with-http-info optional-params))))

(defn create-group-member-template-with-http-info
  "Create an group member template
  GroupMember Templates define a type of group member and the properties they have"
  ([] (create-group-member-template-with-http-info nil))
  ([{:keys [group-member-template-resource ]}]
   (call-api "/users/groups/members/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    group-member-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-group-member-template
  "Create an group member template
  GroupMember Templates define a type of group member and the properties they have"
  ([] (create-group-member-template nil))
  ([optional-params]
   (:data (create-group-member-template-with-http-info optional-params))))

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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-group-template
  "Create a group template
  Group Templates define a type of group and the properties they have"
  ([] (create-group-template nil))
  ([optional-params]
   (:data (create-group-template-with-http-info optional-params))))

(defn delete-group-with-http-info
  "Removes a group from the system
  All groups listing this as the parent are also removed and users are in turn removed from this and those groups. This may result in users no longer being in this group's parent if they were not added to it directly as well."
  [unique-name ]
  (call-api "/users/groups/{unique_name}" :delete
            {:path-params   {"unique_name" unique-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-group
  "Removes a group from the system
  All groups listing this as the parent are also removed and users are in turn removed from this and those groups. This may result in users no longer being in this group's parent if they were not added to it directly as well."
  [unique-name ]
  (:data (delete-group-with-http-info unique-name)))

(defn delete-group-member-template-with-http-info
  "Delete an group member template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-group-member-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/users/groups/members/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-group-member-template
  "Delete an group member template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-group-member-template id nil))
  ([id optional-params]
   (:data (delete-group-member-template-with-http-info id optional-params))))

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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

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
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-group
  "Loads a specific group's details"
  [unique-name ]
  (:data (get-group-with-http-info unique-name)))

(defn get-group-ancestors-with-http-info
  "Get group ancestors
  Returns a list of ancestor groups in reverse order (parent, then grandparent, etc"
  [unique-name ]
  (call-api "/users/groups/{unique_name}/ancestors" :get
            {:path-params   {"unique_name" unique-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-group-ancestors
  "Get group ancestors
  Returns a list of ancestor groups in reverse order (parent, then grandparent, etc"
  [unique-name ]
  (:data (get-group-ancestors-with-http-info unique-name)))

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
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-group-member
  "Get a user from a group"
  [unique-name user-id ]
  (:data (get-group-member-with-http-info unique-name user-id)))

(defn get-group-member-template-with-http-info
  "Get a single group member template"
  [id ]
  (call-api "/users/groups/members/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-group-member-template
  "Get a single group member template"
  [id ]
  (:data (get-group-member-template-with-http-info id)))

(defn get-group-member-templates-with-http-info
  "List and search group member templates"
  ([] (get-group-member-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/users/groups/members/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-group-member-templates
  "List and search group member templates"
  ([] (get-group-member-templates nil))
  ([optional-params]
   (:data (get-group-member-templates-with-http-info optional-params))))

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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

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
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-group-templates
  "List and search group templates"
  ([] (get-group-templates nil))
  ([optional-params]
   (:data (get-group-templates-with-http-info optional-params))))

(defn get-groups-for-user-with-http-info
  "List groups a user is in"
  ([user-id ] (get-groups-for-user-with-http-info user-id nil))
  ([user-id {:keys [filter-children ]}]
   (call-api "/users/{user_id}/groups" :get
             {:path-params   {"user_id" user-id }
              :header-params {}
              :query-params  {"filter_children" filter-children }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-groups-for-user
  "List groups a user is in"
  ([user-id ] (get-groups-for-user user-id nil))
  ([user-id optional-params]
   (:data (get-groups-for-user-with-http-info user-id optional-params))))

(defn list-groups-with-http-info
  "List and search groups"
  ([] (list-groups-with-http-info nil))
  ([{:keys [filter-template filter-member-count filter-name filter-unique-name filter-parent filter-status size page order ]}]
   (call-api "/users/groups" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_template" filter-template "filter_member_count" filter-member-count "filter_name" filter-name "filter_unique_name" filter-unique-name "filter_parent" filter-parent "filter_status" filter-status "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn list-groups
  "List and search groups"
  ([] (list-groups nil))
  ([optional-params]
   (:data (list-groups-with-http-info optional-params))))

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
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-group-member
  "Removes a user from a group"
  [unique-name user-id ]
  (:data (remove-group-member-with-http-info unique-name user-id)))

(defn update-group-with-http-info
  "Update a group
  If adding/removing/changing parent, user membership in group/new parent groups may be modified. The parent being removed will remove members from this sub group unless they were added explicitly to the parent and the new parent will gain members unless they were already a part of it."
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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-group
  "Update a group
  If adding/removing/changing parent, user membership in group/new parent groups may be modified. The parent being removed will remove members from this sub group unless they were added explicitly to the parent and the new parent will gain members unless they were already a part of it."
  ([unique-name ] (update-group unique-name nil))
  ([unique-name optional-params]
   (:data (update-group-with-http-info unique-name optional-params))))

(defn update-group-member-properties-with-http-info
  "Change a user's order"
  [unique-name user-id order ]
  (call-api "/users/groups/{unique_name}/members/{user_id}/order" :put
            {:path-params   {"unique_name" unique-name "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    order
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn update-group-member-properties
  "Change a user's order"
  [unique-name user-id order ]
  (:data (update-group-member-properties-with-http-info unique-name user-id order)))

(defn update-group-member-properties1-with-http-info
  "Change a user's membership properties"
  [unique-name user-id properties ]
  (call-api "/users/groups/{unique_name}/members/{user_id}/properties" :put
            {:path-params   {"unique_name" unique-name "user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    properties
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn update-group-member-properties1
  "Change a user's membership properties"
  [unique-name user-id properties ]
  (:data (update-group-member-properties1-with-http-info unique-name user-id properties)))

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
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn update-group-member-status
  "Change a user's status"
  [unique-name user-id status ]
  (:data (update-group-member-status-with-http-info unique-name user-id status)))

(defn update-group-member-template-with-http-info
  "Update an group member template"
  ([id ] (update-group-member-template-with-http-info id nil))
  ([id {:keys [group-member-template-resource ]}]
   (call-api "/users/groups/members/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    group-member-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-group-member-template
  "Update an group member template"
  ([id ] (update-group-member-template id nil))
  ([id optional-params]
   (:data (update-group-member-template-with-http-info id optional-params))))

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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-group-template
  "Update a group template"
  ([id ] (update-group-template id nil))
  ([id optional-params]
   (:data (update-group-template-with-http-info id optional-params))))

