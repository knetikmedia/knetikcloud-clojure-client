(ns knetik-platform-api-documentation-latest
.api.store-sales
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-catalog-sale-with-http-info
  "Create a sale
  <b>Permissions Needed:</b> SALES_ADMIN"
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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn create-catalog-sale
  "Create a sale
  <b>Permissions Needed:</b> SALES_ADMIN"
  ([] (create-catalog-sale nil))
  ([optional-params]
   (:data (create-catalog-sale-with-http-info optional-params))))

(defn delete-catalog-sale-with-http-info
  "Delete a sale
  <b>Permissions Needed:</b> SALES_ADMIN"
  [id ]
  (call-api "/store/sales/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn delete-catalog-sale
  "Delete a sale
  <b>Permissions Needed:</b> SALES_ADMIN"
  [id ]
  (:data (delete-catalog-sale-with-http-info id)))

(defn get-catalog-sale-with-http-info
  "Get a single sale
  <b>Permissions Needed:</b> SALES_USER or SALES_ADMIN"
  [id ]
  (call-api "/store/sales/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-catalog-sale
  "Get a single sale
  <b>Permissions Needed:</b> SALES_USER or SALES_ADMIN"
  [id ]
  (:data (get-catalog-sale-with-http-info id)))

(defn get-catalog-sales-with-http-info
  "List and search sales
  <b>Permissions Needed:</b> SALES_USER or SALES_ADMIN"
  ([] (get-catalog-sales-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/store/sales" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-catalog-sales
  "List and search sales
  <b>Permissions Needed:</b> SALES_USER or SALES_ADMIN"
  ([] (get-catalog-sales nil))
  ([optional-params]
   (:data (get-catalog-sales-with-http-info optional-params))))

(defn update-catalog-sale-with-http-info
  "Update a sale
  <b>Permissions Needed:</b> SALES_ADMIN"
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
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-catalog-sale
  "Update a sale
  <b>Permissions Needed:</b> SALES_ADMIN"
  ([id ] (update-catalog-sale id nil))
  ([id optional-params]
   (:data (update-catalog-sale-with-http-info id optional-params))))

