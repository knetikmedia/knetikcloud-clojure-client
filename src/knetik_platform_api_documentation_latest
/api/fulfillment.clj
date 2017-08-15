(ns knetik-platform-api-documentation-latest
.api.fulfillment
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-fulfillment-type-with-http-info
  "Create a fulfillment type"
  ([] (create-fulfillment-type-with-http-info nil))
  ([{:keys [type ]}]
   (call-api "/store/fulfillment/types" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    type
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-fulfillment-type
  "Create a fulfillment type"
  ([] (create-fulfillment-type nil))
  ([optional-params]
   (:data (create-fulfillment-type-with-http-info optional-params))))

(defn delete-fulfillment-type-with-http-info
  "Delete a fulfillment type"
  [id ]
  (call-api "/store/fulfillment/types/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-fulfillment-type
  "Delete a fulfillment type"
  [id ]
  (:data (delete-fulfillment-type-with-http-info id)))

(defn get-fulfillment-type-with-http-info
  "Get a single fulfillment type"
  [id ]
  (call-api "/store/fulfillment/types/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fulfillment-type
  "Get a single fulfillment type"
  [id ]
  (:data (get-fulfillment-type-with-http-info id)))

(defn get-fulfillment-types-with-http-info
  "List and search fulfillment types"
  ([] (get-fulfillment-types-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/store/fulfillment/types" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fulfillment-types
  "List and search fulfillment types"
  ([] (get-fulfillment-types nil))
  ([optional-params]
   (:data (get-fulfillment-types-with-http-info optional-params))))

(defn update-fulfillment-type-with-http-info
  "Update a fulfillment type"
  ([id ] (update-fulfillment-type-with-http-info id nil))
  ([id {:keys [fulfillment-type ]}]
   (call-api "/store/fulfillment/types/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    fulfillment-type
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-fulfillment-type
  "Update a fulfillment type"
  ([id ] (update-fulfillment-type id nil))
  ([id optional-params]
   (:data (update-fulfillment-type-with-http-info id optional-params))))

