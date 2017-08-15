(ns knetik-platform-api-documentation-latest
.api.content-polls
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn answer-poll-with-http-info
  "Add your vote to a poll"
  ([id ] (answer-poll-with-http-info id nil))
  ([id {:keys [answer-key ]}]
   (call-api "/media/polls/{id}/response" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    answer-key
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn answer-poll
  "Add your vote to a poll"
  ([id ] (answer-poll id nil))
  ([id optional-params]
   (:data (answer-poll-with-http-info id optional-params))))

(defn create-poll-with-http-info
  "Create a new poll
  Polls are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end."
  ([] (create-poll-with-http-info nil))
  ([{:keys [poll-resource ]}]
   (call-api "/media/polls" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    poll-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-poll
  "Create a new poll
  Polls are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end."
  ([] (create-poll nil))
  ([optional-params]
   (:data (create-poll-with-http-info optional-params))))

(defn create-poll-template-with-http-info
  "Create a poll template
  Poll templates define a type of poll and the properties they have"
  ([] (create-poll-template-with-http-info nil))
  ([{:keys [poll-template-resource ]}]
   (call-api "/media/polls/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    poll-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-poll-template
  "Create a poll template
  Poll templates define a type of poll and the properties they have"
  ([] (create-poll-template nil))
  ([optional-params]
   (:data (create-poll-template-with-http-info optional-params))))

(defn delete-poll-with-http-info
  "Delete an existing poll"
  [id ]
  (call-api "/media/polls/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-poll
  "Delete an existing poll"
  [id ]
  (:data (delete-poll-with-http-info id)))

(defn delete-poll-template-with-http-info
  "Delete a poll template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-poll-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/media/polls/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn delete-poll-template
  "Delete a poll template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects"
  ([id ] (delete-poll-template id nil))
  ([id optional-params]
   (:data (delete-poll-template-with-http-info id optional-params))))

(defn get-poll-with-http-info
  "Get a single poll"
  [id ]
  (call-api "/media/polls/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-poll
  "Get a single poll"
  [id ]
  (:data (get-poll-with-http-info id)))

(defn get-poll-answer-with-http-info
  "Get poll answer"
  [id ]
  (call-api "/media/polls/{id}/response" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-poll-answer
  "Get poll answer"
  [id ]
  (:data (get-poll-answer-with-http-info id)))

(defn get-poll-template-with-http-info
  "Get a single poll template"
  [id ]
  (call-api "/media/polls/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-poll-template
  "Get a single poll template"
  [id ]
  (:data (get-poll-template-with-http-info id)))

(defn get-poll-templates-with-http-info
  "List and search poll templates"
  ([] (get-poll-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/media/polls/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-poll-templates
  "List and search poll templates"
  ([] (get-poll-templates nil))
  ([optional-params]
   (:data (get-poll-templates-with-http-info optional-params))))

(defn get-polls-with-http-info
  "List and search polls
  Get a list of polls with optional filtering. Assets will not be filled in on the resources returned. Use 'Get a single poll' to retrieve the full resource with assets for a given item as needed."
  ([] (get-polls-with-http-info nil))
  ([{:keys [filter-category filter-tagset filter-text size page order ]}]
   (call-api "/media/polls" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_category" filter-category "filter_tagset" filter-tagset "filter_text" filter-text "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-polls
  "List and search polls
  Get a list of polls with optional filtering. Assets will not be filled in on the resources returned. Use 'Get a single poll' to retrieve the full resource with assets for a given item as needed."
  ([] (get-polls nil))
  ([optional-params]
   (:data (get-polls-with-http-info optional-params))))

(defn update-poll-with-http-info
  "Update an existing poll"
  ([id ] (update-poll-with-http-info id nil))
  ([id {:keys [poll-resource ]}]
   (call-api "/media/polls/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    poll-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-poll
  "Update an existing poll"
  ([id ] (update-poll id nil))
  ([id optional-params]
   (:data (update-poll-with-http-info id optional-params))))

(defn update-poll-template-with-http-info
  "Update a poll template"
  ([id ] (update-poll-template-with-http-info id nil))
  ([id {:keys [poll-template-resource ]}]
   (call-api "/media/polls/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    poll-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-poll-template
  "Update a poll template"
  ([id ] (update-poll-template id nil))
  ([id optional-params]
   (:data (update-poll-template-with-http-info id optional-params))))

