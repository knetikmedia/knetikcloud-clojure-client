(ns knetik-platform-api-documentation-latest
.api.gamification-trivia
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-question-answers-with-http-info
  "Add an answer to a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([question-id ] (add-question-answers-with-http-info question-id nil))
  ([question-id {:keys [answer ]}]
   (call-api "/trivia/questions/{question_id}/answers" :post
             {:path-params   {"question_id" question-id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    answer
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-question-answers
  "Add an answer to a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([question-id ] (add-question-answers question-id nil))
  ([question-id optional-params]
   (:data (add-question-answers-with-http-info question-id optional-params))))

(defn add-question-tag-with-http-info
  "Add a tag to a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([id ] (add-question-tag-with-http-info id nil))
  ([id {:keys [tag ]}]
   (call-api "/trivia/questions/{id}/tags" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    tag
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-question-tag
  "Add a tag to a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([id ] (add-question-tag id nil))
  ([id optional-params]
   (:data (add-question-tag-with-http-info id optional-params))))

(defn add-tag-to-questions-batch-with-http-info
  "Add a tag to a batch of questions
  All questions that dont't have the tag and match filters will have it added. The returned number is the number of questions updated. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (add-tag-to-questions-batch-with-http-info nil))
  ([{:keys [tag filter-search filter-idset filter-category filter-tag filter-tagset filter-type filter-published filter-import-id ]}]
   (call-api "/trivia/questions/tags" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_search" filter-search "filter_idset" filter-idset "filter_category" filter-category "filter_tag" filter-tag "filter_tagset" filter-tagset "filter_type" filter-type "filter_published" filter-published "filter_import_id" filter-import-id }
              :form-params   {}
              :body-param    tag
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn add-tag-to-questions-batch
  "Add a tag to a batch of questions
  All questions that dont't have the tag and match filters will have it added. The returned number is the number of questions updated. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (add-tag-to-questions-batch nil))
  ([optional-params]
   (:data (add-tag-to-questions-batch-with-http-info optional-params))))

(defn create-import-job-with-http-info
  "Create an import job
  Set up a job to import a set of trivia questions from a cvs file at a remote url. the file will be validated asynchronously but will not be processed until started manually with the process endpoint. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (create-import-job-with-http-info nil))
  ([{:keys [request ]}]
   (call-api "/trivia/import" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-import-job
  "Create an import job
  Set up a job to import a set of trivia questions from a cvs file at a remote url. the file will be validated asynchronously but will not be processed until started manually with the process endpoint. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (create-import-job nil))
  ([optional-params]
   (:data (create-import-job-with-http-info optional-params))))

(defn create-question-with-http-info
  "Create a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (create-question-with-http-info nil))
  ([{:keys [question ]}]
   (call-api "/trivia/questions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    question
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-question
  "Create a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (create-question nil))
  ([optional-params]
   (:data (create-question-with-http-info optional-params))))

(defn create-question-template-with-http-info
  "Create a question template
  Question templates define a type of question and the properties they have. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (create-question-template-with-http-info nil))
  ([{:keys [question-template-resource ]}]
   (call-api "/trivia/questions/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    question-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-question-template
  "Create a question template
  Question templates define a type of question and the properties they have. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (create-question-template nil))
  ([optional-params]
   (:data (create-question-template-with-http-info optional-params))))

(defn delete-import-job-with-http-info
  "Delete an import job
  Also deletes all questions that were imported by it. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (call-api "/trivia/import/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-import-job
  "Delete an import job
  Also deletes all questions that were imported by it. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (:data (delete-import-job-with-http-info id)))

(defn delete-question-with-http-info
  "Delete a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (call-api "/trivia/questions/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-question
  "Delete a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (:data (delete-question-with-http-info id)))

(defn delete-question-answers-with-http-info
  "Remove an answer from a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [question-id id ]
  (call-api "/trivia/questions/{question_id}/answers/{id}" :delete
            {:path-params   {"question_id" question-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-question-answers
  "Remove an answer from a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [question-id id ]
  (:data (delete-question-answers-with-http-info question-id id)))

(defn delete-question-template-with-http-info
  "Delete a question template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-question-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/trivia/questions/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn delete-question-template
  "Delete a question template
  If cascade = 'detach', it will force delete the template even if it's attached to other objects. <br><br><b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (delete-question-template id nil))
  ([id optional-params]
   (:data (delete-question-template-with-http-info id optional-params))))

(defn get-import-job-with-http-info
  "Get an import job
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (call-api "/trivia/import/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-import-job
  "Get an import job
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (:data (get-import-job-with-http-info id)))

(defn get-import-jobs-with-http-info
  "Get a list of import job
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-import-jobs-with-http-info nil))
  ([{:keys [filter-vendor filter-category filter-name filter-status size page order ]}]
   (call-api "/trivia/import" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_vendor" filter-vendor "filter_category" filter-category "filter_name" filter-name "filter_status" filter-status "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-import-jobs
  "Get a list of import job
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-import-jobs nil))
  ([optional-params]
   (:data (get-import-jobs-with-http-info optional-params))))

(defn get-question-with-http-info
  "Get a single question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (call-api "/trivia/questions/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-question
  "Get a single question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (:data (get-question-with-http-info id)))

(defn get-question-answer-with-http-info
  "Get an answer for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [question-id id ]
  (call-api "/trivia/questions/{question_id}/answers/{id}" :get
            {:path-params   {"question_id" question-id "id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-question-answer
  "Get an answer for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [question-id id ]
  (:data (get-question-answer-with-http-info question-id id)))

(defn get-question-answers-with-http-info
  "List the answers available for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [question-id ]
  (call-api "/trivia/questions/{question_id}/answers" :get
            {:path-params   {"question_id" question-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-question-answers
  "List the answers available for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [question-id ]
  (:data (get-question-answers-with-http-info question-id)))

(defn get-question-deltas-with-http-info
  "List question deltas in ascending order of updated date
  The 'since' parameter is important to avoid getting a full list of all questions. Implementors should make sure they pass the updated date of the last resource loaded, not the date of the last request, in order to avoid gaps. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-question-deltas-with-http-info nil))
  ([{:keys [since ]}]
   (call-api "/trivia/questions/delta" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"since" since }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-question-deltas
  "List question deltas in ascending order of updated date
  The 'since' parameter is important to avoid getting a full list of all questions. Implementors should make sure they pass the updated date of the last resource loaded, not the date of the last request, in order to avoid gaps. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-question-deltas nil))
  ([optional-params]
   (:data (get-question-deltas-with-http-info optional-params))))

(defn get-question-tags-with-http-info
  "List the tags for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (call-api "/trivia/questions/{id}/tags" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-question-tags
  "List the tags for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id ]
  (:data (get-question-tags-with-http-info id)))

(defn get-question-template-with-http-info
  "Get a single question template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or TRIVIA_ADMIN"
  [id ]
  (call-api "/trivia/questions/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-question-template
  "Get a single question template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or TRIVIA_ADMIN"
  [id ]
  (:data (get-question-template-with-http-info id)))

(defn get-question-templates-with-http-info
  "List and search question templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or TRIVIA_ADMIN"
  ([] (get-question-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/trivia/questions/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-question-templates
  "List and search question templates
  <b>Permissions Needed:</b> TEMPLATE_ADMIN or TRIVIA_ADMIN"
  ([] (get-question-templates nil))
  ([optional-params]
   (:data (get-question-templates-with-http-info optional-params))))

(defn get-questions-with-http-info
  "List and search questions
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-questions-with-http-info nil))
  ([{:keys [size page order filter-search filter-idset filter-category filter-tagset filter-tag filter-type filter-published filter-import-id ]}]
   (call-api "/trivia/questions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order "filter_search" filter-search "filter_idset" filter-idset "filter_category" filter-category "filter_tagset" filter-tagset "filter_tag" filter-tag "filter_type" filter-type "filter_published" filter-published "filter_import_id" filter-import-id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-questions
  "List and search questions
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-questions nil))
  ([optional-params]
   (:data (get-questions-with-http-info optional-params))))

(defn get-questions-count-with-http-info
  "Count questions based on filters
  This is also provided by the list endpoint so you don't need to call this for pagination purposes. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-questions-count-with-http-info nil))
  ([{:keys [filter-search filter-idset filter-category filter-tag filter-tagset filter-type filter-published ]}]
   (call-api "/trivia/questions/count" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_search" filter-search "filter_idset" filter-idset "filter_category" filter-category "filter_tag" filter-tag "filter_tagset" filter-tagset "filter_type" filter-type "filter_published" filter-published }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-questions-count
  "Count questions based on filters
  This is also provided by the list endpoint so you don't need to call this for pagination purposes. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (get-questions-count nil))
  ([optional-params]
   (:data (get-questions-count-with-http-info optional-params))))

(defn process-import-job-with-http-info
  "Start processing an import job
  Will process the CSV file and add new questions asynchronously. The status of the job must be 'VALID'. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id publish-now ]
  (call-api "/trivia/import/{id}/process" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"publish_now" publish-now }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn process-import-job
  "Start processing an import job
  Will process the CSV file and add new questions asynchronously. The status of the job must be 'VALID'. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id publish-now ]
  (:data (process-import-job-with-http-info id publish-now)))

(defn remove-question-tag-with-http-info
  "Remove a tag from a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id tag ]
  (call-api "/trivia/questions/{id}/tags/{tag}" :delete
            {:path-params   {"id" id "tag" tag }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn remove-question-tag
  "Remove a tag from a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  [id tag ]
  (:data (remove-question-tag-with-http-info id tag)))

(defn remove-tag-to-questions-batch-with-http-info
  "Remove a tag from a batch of questions
  ll questions that have the tag and match filters will have it removed. The returned number is the number of questions updated. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([tag ] (remove-tag-to-questions-batch-with-http-info tag nil))
  ([tag {:keys [filter-search filter-idset filter-category filter-tag filter-tagset filter-type filter-published filter-import-id ]}]
   (call-api "/trivia/questions/tags/{tag}" :delete
             {:path-params   {"tag" tag }
              :header-params {}
              :query-params  {"filter_search" filter-search "filter_idset" filter-idset "filter_category" filter-category "filter_tag" filter-tag "filter_tagset" filter-tagset "filter_type" filter-type "filter_published" filter-published "filter_import_id" filter-import-id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn remove-tag-to-questions-batch
  "Remove a tag from a batch of questions
  ll questions that have the tag and match filters will have it removed. The returned number is the number of questions updated. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([tag ] (remove-tag-to-questions-batch tag nil))
  ([tag optional-params]
   (:data (remove-tag-to-questions-batch-with-http-info tag optional-params))))

(defn search-question-tags-with-http-info
  "List and search tags by the beginning of the string
  For performance reasons, search & category filters are mutually exclusive. If category is specified, search filter will be ignored in order to do fast matches for typeahead. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (search-question-tags-with-http-info nil))
  ([{:keys [filter-search filter-category filter-import-id ]}]
   (call-api "/trivia/tags" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_search" filter-search "filter_category" filter-category "filter_import_id" filter-import-id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn search-question-tags
  "List and search tags by the beginning of the string
  For performance reasons, search & category filters are mutually exclusive. If category is specified, search filter will be ignored in order to do fast matches for typeahead. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (search-question-tags nil))
  ([optional-params]
   (:data (search-question-tags-with-http-info optional-params))))

(defn update-import-job-with-http-info
  "Update an import job
  Changes should be made before process is started for there to be any effect. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([id ] (update-import-job-with-http-info id nil))
  ([id {:keys [request ]}]
   (call-api "/trivia/import/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-import-job
  "Update an import job
  Changes should be made before process is started for there to be any effect. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([id ] (update-import-job id nil))
  ([id optional-params]
   (:data (update-import-job-with-http-info id optional-params))))

(defn update-question-with-http-info
  "Update a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([id ] (update-question-with-http-info id nil))
  ([id {:keys [question ]}]
   (call-api "/trivia/questions/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    question
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-question
  "Update a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([id ] (update-question id nil))
  ([id optional-params]
   (:data (update-question-with-http-info id optional-params))))

(defn update-question-answer-with-http-info
  "Update an answer for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([question-id id ] (update-question-answer-with-http-info question-id id nil))
  ([question-id id {:keys [answer ]}]
   (call-api "/trivia/questions/{question_id}/answers/{id}" :put
             {:path-params   {"question_id" question-id "id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    answer
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-question-answer
  "Update an answer for a question
  <b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([question-id id ] (update-question-answer question-id id nil))
  ([question-id id optional-params]
   (:data (update-question-answer-with-http-info question-id id optional-params))))

(defn update-question-template-with-http-info
  "Update a question template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-question-template-with-http-info id nil))
  ([id {:keys [question-template-resource ]}]
   (call-api "/trivia/questions/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    question-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-question-template
  "Update a question template
  <b>Permissions Needed:</b> TEMPLATE_ADMIN"
  ([id ] (update-question-template id nil))
  ([id optional-params]
   (:data (update-question-template-with-http-info id optional-params))))

(defn update-questions-in-bulk-with-http-info
  "Bulk update questions
  Will update all questions that match filters used (or all questions in system if no filters used). Body should match a question resource with only those properties you wish to set. Null values will be ignored. Returned number is how many were updated. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (update-questions-in-bulk-with-http-info nil))
  ([{:keys [question filter-search filter-idset filter-category filter-tagset filter-type filter-published filter-import-id ]}]
   (call-api "/trivia/questions" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_search" filter-search "filter_idset" filter-idset "filter_category" filter-category "filter_tagset" filter-tagset "filter_type" filter-type "filter_published" filter-published "filter_import_id" filter-import-id }
              :form-params   {}
              :body-param    question
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-questions-in-bulk
  "Bulk update questions
  Will update all questions that match filters used (or all questions in system if no filters used). Body should match a question resource with only those properties you wish to set. Null values will be ignored. Returned number is how many were updated. <br><br><b>Permissions Needed:</b> TRIVIA_ADMIN"
  ([] (update-questions-in-bulk nil))
  ([optional-params]
   (:data (update-questions-in-bulk-with-http-info optional-params))))

