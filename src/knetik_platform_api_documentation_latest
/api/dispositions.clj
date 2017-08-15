(ns knetik-platform-api-documentation-latest
.api.dispositions
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-disposition-with-http-info
  "Add a new disposition"
  ([] (add-disposition-with-http-info nil))
  ([{:keys [disposition ]}]
   (call-api "/dispositions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    disposition
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn add-disposition
  "Add a new disposition"
  ([] (add-disposition nil))
  ([optional-params]
   (:data (add-disposition-with-http-info optional-params))))

(defn delete-disposition-with-http-info
  "Delete a disposition"
  [id ]
  (call-api "/dispositions/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-disposition
  "Delete a disposition"
  [id ]
  (:data (delete-disposition-with-http-info id)))

(defn get-disposition-with-http-info
  "Returns a disposition"
  [id ]
  (call-api "/dispositions/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-disposition
  "Returns a disposition"
  [id ]
  (:data (get-disposition-with-http-info id)))

(defn get-disposition-counts-with-http-info
  "Returns a list of disposition counts"
  ([] (get-disposition-counts-with-http-info nil))
  ([{:keys [filter-context filter-owner ]}]
   (call-api "/dispositions/count" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_context" filter-context "filter_owner" filter-owner }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-disposition-counts
  "Returns a list of disposition counts"
  ([] (get-disposition-counts nil))
  ([optional-params]
   (:data (get-disposition-counts-with-http-info optional-params))))

(defn get-dispositions-with-http-info
  "Returns a page of dispositions"
  ([] (get-dispositions-with-http-info nil))
  ([{:keys [filter-context filter-owner size page order ]}]
   (call-api "/dispositions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_context" filter-context "filter_owner" filter-owner "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dispositions
  "Returns a page of dispositions"
  ([] (get-dispositions nil))
  ([optional-params]
   (:data (get-dispositions-with-http-info optional-params))))

