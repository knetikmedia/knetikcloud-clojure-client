(ns knetik-platform-api-documentation-latest
.api.store-sales
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-catalog-sale-with-http-info
  "Create a sale"
  ([] (create-catalog-sale-with-http-info nil))
  ([{:keys [catalog-sale ]}]
   (call-api "/store/sales" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    catalog-sale
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-catalog-sale
  "Create a sale"
  ([] (create-catalog-sale nil))
  ([optional-params]
   (:data (create-catalog-sale-with-http-info optional-params))))

(defn delete-catalog-sale-with-http-info
  "Delete a sale"
  [id ]
  (call-api "/store/sales/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-catalog-sale
  "Delete a sale"
  [id ]
  (:data (delete-catalog-sale-with-http-info id)))

(defn get-catalog-sale-with-http-info
  "Get a single sale"
  [id ]
  (call-api "/store/sales/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-catalog-sale
  "Get a single sale"
  [id ]
  (:data (get-catalog-sale-with-http-info id)))

(defn get-catalog-sales-with-http-info
  "List and search sales"
  ([] (get-catalog-sales-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/store/sales" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-catalog-sales
  "List and search sales"
  ([] (get-catalog-sales nil))
  ([optional-params]
   (:data (get-catalog-sales-with-http-info optional-params))))

(defn update-catalog-sale-with-http-info
  "Update a sale"
  ([id ] (update-catalog-sale-with-http-info id nil))
  ([id {:keys [catalog-sale ]}]
   (call-api "/store/sales/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    catalog-sale
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-catalog-sale
  "Update a sale"
  ([id ] (update-catalog-sale id nil))
  ([id optional-params]
   (:data (update-catalog-sale-with-http-info id optional-params))))

