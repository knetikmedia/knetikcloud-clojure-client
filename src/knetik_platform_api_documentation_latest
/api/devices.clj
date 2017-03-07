(ns knetik-platform-api-documentation-latest
.api.devices
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-device-with-http-info
  "Create a device"
  [device ]
  (call-api "/devices" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    device
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn create-device
  "Create a device"
  [device ]
  (:data (create-device-with-http-info device)))

(defn delete-device-with-http-info
  "Delete a device"
  [id ]
  (call-api "/devices/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn delete-device
  "Delete a device"
  [id ]
  (:data (delete-device-with-http-info id)))

(defn get-device-with-http-info
  "Get a single device"
  [id ]
  (call-api "/devices/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-device
  "Get a single device"
  [id ]
  (:data (get-device-with-http-info id)))

(defn get-devices-with-http-info
  "List and search devices
  Get a list of devices with optional filtering"
  ([] (get-devices-with-http-info nil))
  ([{:keys [filter-make filter-model size page order ]}]
   (call-api "/devices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_make" filter-make "filter_model" filter-model "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-devices
  "List and search devices
  Get a list of devices with optional filtering"
  ([] (get-devices nil))
  ([optional-params]
   (:data (get-devices-with-http-info optional-params))))

(defn update-device-with-http-info
  "Update a device"
  [device id ]
  (call-api "/devices/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    device
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn update-device
  "Update a device"
  [device id ]
  (:data (update-device-with-http-info device id)))

