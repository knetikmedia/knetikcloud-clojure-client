(ns knetik-platform-api-documentation-latest
.api.store-vendors
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-vendor-with-http-info
  "Create a vendor"
  ([] (create-vendor-with-http-info nil))
  ([{:keys [vendor ]}]
   (call-api "/vendors" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    vendor
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-vendor
  "Create a vendor"
  ([] (create-vendor nil))
  ([optional-params]
   (:data (create-vendor-with-http-info optional-params))))

(defn create-vendor-template-with-http-info
  "Create a vendor template
  Vendor Templates define a type of vendor and the properties they have."
  ([] (create-vendor-template-with-http-info nil))
  ([{:keys [vendor-template-resource ]}]
   (call-api "/vendors/templates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    vendor-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-vendor-template
  "Create a vendor template
  Vendor Templates define a type of vendor and the properties they have."
  ([] (create-vendor-template nil))
  ([optional-params]
   (:data (create-vendor-template-with-http-info optional-params))))

(defn delete-vendor-with-http-info
  "Delete a vendor"
  [id ]
  (call-api "/vendors/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-vendor
  "Delete a vendor"
  [id ]
  (:data (delete-vendor-with-http-info id)))

(defn delete-vendor-template-with-http-info
  "Delete a vendor template"
  ([id ] (delete-vendor-template-with-http-info id nil))
  ([id {:keys [cascade ]}]
   (call-api "/vendors/templates/{id}" :delete
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"cascade" cascade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn delete-vendor-template
  "Delete a vendor template"
  ([id ] (delete-vendor-template id nil))
  ([id optional-params]
   (:data (delete-vendor-template-with-http-info id optional-params))))

(defn get-vendor-with-http-info
  "Get a single vendor"
  [id ]
  (call-api "/vendors/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-vendor
  "Get a single vendor"
  [id ]
  (:data (get-vendor-with-http-info id)))

(defn get-vendor-template-with-http-info
  "Get a single vendor template
  Vendor Templates define a type of vendor and the properties they have."
  [id ]
  (call-api "/vendors/templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-vendor-template
  "Get a single vendor template
  Vendor Templates define a type of vendor and the properties they have."
  [id ]
  (:data (get-vendor-template-with-http-info id)))

(defn get-vendor-templates-with-http-info
  "List and search vendor templates"
  ([] (get-vendor-templates-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/vendors/templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-vendor-templates
  "List and search vendor templates"
  ([] (get-vendor-templates nil))
  ([optional-params]
   (:data (get-vendor-templates-with-http-info optional-params))))

(defn get-vendors-with-http-info
  "List and search vendors"
  ([] (get-vendors-with-http-info nil))
  ([{:keys [filter-name size page order ]}]
   (call-api "/vendors" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_name" filter-name "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-vendors
  "List and search vendors"
  ([] (get-vendors nil))
  ([optional-params]
   (:data (get-vendors-with-http-info optional-params))))

(defn update-vendor-with-http-info
  "Update a vendor"
  ([id ] (update-vendor-with-http-info id nil))
  ([id {:keys [vendor ]}]
   (call-api "/vendors/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    vendor
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-vendor
  "Update a vendor"
  ([id ] (update-vendor id nil))
  ([id optional-params]
   (:data (update-vendor-with-http-info id optional-params))))

(defn update-vendor-template-with-http-info
  "Update a vendor template"
  ([id ] (update-vendor-template-with-http-info id nil))
  ([id {:keys [vendor-template-resource ]}]
   (call-api "/vendors/templates/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    vendor-template-resource
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-vendor-template
  "Update a vendor template"
  ([id ] (update-vendor-template id nil))
  ([id optional-params]
   (:data (update-vendor-template-with-http-info id optional-params))))

