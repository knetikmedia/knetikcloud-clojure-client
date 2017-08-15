(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-triggers
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-bre-trigger-with-http-info
  "Create a trigger
  Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services"
  ([] (create-bre-trigger-with-http-info nil))
  ([{:keys [bre-trigger-resource ]}]
   (call-api "/bre/triggers" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-trigger-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-bre-trigger
  "Create a trigger
  Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services"
  ([] (create-bre-trigger nil))
  ([optional-params]
   (:data (create-bre-trigger-with-http-info optional-params))))

(defn delete-bre-trigger-with-http-info
  "Delete a trigger
  May fail if there are existing rules against it. Cannot delete core triggers"
  [event-name ]
  (call-api "/bre/triggers/{event_name}" :delete
            {:path-params   {"event_name" event-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-bre-trigger
  "Delete a trigger
  May fail if there are existing rules against it. Cannot delete core triggers"
  [event-name ]
  (:data (delete-bre-trigger-with-http-info event-name)))

(defn get-bre-trigger-with-http-info
  "Get a single trigger"
  [event-name ]
  (call-api "/bre/triggers/{event_name}" :get
            {:path-params   {"event_name" event-name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-bre-trigger
  "Get a single trigger"
  [event-name ]
  (:data (get-bre-trigger-with-http-info event-name)))

(defn get-bre-triggers-with-http-info
  "List triggers"
  ([] (get-bre-triggers-with-http-info nil))
  ([{:keys [filter-system filter-category filter-tags filter-name filter-search size page ]}]
   (call-api "/bre/triggers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_system" filter-system "filter_category" filter-category "filter_tags" filter-tags "filter_name" filter-name "filter_search" filter-search "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-bre-triggers
  "List triggers"
  ([] (get-bre-triggers nil))
  ([optional-params]
   (:data (get-bre-triggers-with-http-info optional-params))))

(defn update-bre-trigger-with-http-info
  "Update a trigger
  May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers"
  ([event-name ] (update-bre-trigger-with-http-info event-name nil))
  ([event-name {:keys [bre-trigger-resource ]}]
   (call-api "/bre/triggers/{event_name}" :put
             {:path-params   {"event_name" event-name }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-trigger-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-bre-trigger
  "Update a trigger
  May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers"
  ([event-name ] (update-bre-trigger event-name nil))
  ([event-name optional-params]
   (:data (update-bre-trigger-with-http-info event-name optional-params))))

