(ns knetik-platform-api-documentation-latest
.api.store-shopping-carts
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-custom-discount-with-http-info
  "Adds a custom discount to the cart"
  ([id ] (add-custom-discount-with-http-info id nil))
  ([id {:keys [custom-discount ]}]
   (call-api "/carts/{id}/custom-discounts" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    custom-discount
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn add-custom-discount
  "Adds a custom discount to the cart"
  ([id ] (add-custom-discount id nil))
  ([id optional-params]
   (:data (add-custom-discount-with-http-info id optional-params))))

(defn add-discount-to-cart-with-http-info
  "Adds a discount coupon to the cart"
  ([id ] (add-discount-to-cart-with-http-info id nil))
  ([id {:keys [sku-request ]}]
   (call-api "/carts/{id}/discounts" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    sku-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn add-discount-to-cart
  "Adds a discount coupon to the cart"
  ([id ] (add-discount-to-cart id nil))
  ([id optional-params]
   (:data (add-discount-to-cart-with-http-info id optional-params))))

(defn add-item-to-cart-with-http-info
  "Add an item to the cart
  Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment"
  ([id ] (add-item-to-cart-with-http-info id nil))
  ([id {:keys [cart-item-request ]}]
   (call-api "/carts/{id}/items" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    cart-item-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn add-item-to-cart
  "Add an item to the cart
  Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment"
  ([id ] (add-item-to-cart id nil))
  ([id optional-params]
   (:data (add-item-to-cart-with-http-info id optional-params))))

(defn create-cart-with-http-info
  "Create a cart
  You don't have to have a user to create a cart but the API requires authentication to checkout"
  ([] (create-cart-with-http-info nil))
  ([{:keys [owner currency-code ]}]
   (call-api "/carts" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"owner" owner "currency_code" currency-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-cart
  "Create a cart
  You don't have to have a user to create a cart but the API requires authentication to checkout"
  ([] (create-cart nil))
  ([optional-params]
   (:data (create-cart-with-http-info optional-params))))

(defn get-cart-with-http-info
  "Returns the cart with the given GUID"
  [id ]
  (call-api "/carts/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-cart
  "Returns the cart with the given GUID"
  [id ]
  (:data (get-cart-with-http-info id)))

(defn get-carts-with-http-info
  "Get a list of carts"
  ([] (get-carts-with-http-info nil))
  ([{:keys [filter-owner-id size page order ]}]
   (call-api "/carts" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_owner_id" filter-owner-id "size" size "page" page "order" order }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-carts
  "Get a list of carts"
  ([] (get-carts nil))
  ([optional-params]
   (:data (get-carts-with-http-info optional-params))))

(defn get-shippable-with-http-info
  "Returns whether a cart requires shipping"
  [id ]
  (call-api "/carts/{id}/shippable" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-shippable
  "Returns whether a cart requires shipping"
  [id ]
  (:data (get-shippable-with-http-info id)))

(defn get-shipping-countries-with-http-info
  "Get the list of available shipping countries per vendor
  Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable."
  [id ]
  (call-api "/carts/{id}/countries" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-shipping-countries
  "Get the list of available shipping countries per vendor
  Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable."
  [id ]
  (:data (get-shipping-countries-with-http-info id)))

(defn remove-discount-from-cart-with-http-info
  "Removes a discount coupon from the cart"
  [id code ]
  (call-api "/carts/{id}/discounts/{code}" :delete
            {:path-params   {"id" id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn remove-discount-from-cart
  "Removes a discount coupon from the cart"
  [id code ]
  (:data (remove-discount-from-cart-with-http-info id code)))

(defn set-cart-currency-with-http-info
  "Sets the currency to use for the cart
  May be disallowed by site settings."
  ([id ] (set-cart-currency-with-http-info id nil))
  ([id {:keys [currency-code ]}]
   (call-api "/carts/{id}/currency" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    currency-code
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-cart-currency
  "Sets the currency to use for the cart
  May be disallowed by site settings."
  ([id ] (set-cart-currency id nil))
  ([id optional-params]
   (:data (set-cart-currency-with-http-info id optional-params))))

(defn set-cart-owner-with-http-info
  "Sets the owner of a cart if none is set already"
  ([id ] (set-cart-owner-with-http-info id nil))
  ([id {:keys [user-id ]}]
   (call-api "/carts/{id}/owner" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    user-id
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-cart-owner
  "Sets the owner of a cart if none is set already"
  ([id ] (set-cart-owner id nil))
  ([id optional-params]
   (:data (set-cart-owner-with-http-info id optional-params))))

(defn update-item-in-cart-with-http-info
  "Changes the quantity of an item already in the cart
  A quantity of zero will remove the item from the cart altogether."
  ([id ] (update-item-in-cart-with-http-info id nil))
  ([id {:keys [cart-item-request ]}]
   (call-api "/carts/{id}/items" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    cart-item-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-item-in-cart
  "Changes the quantity of an item already in the cart
  A quantity of zero will remove the item from the cart altogether."
  ([id ] (update-item-in-cart id nil))
  ([id optional-params]
   (:data (update-item-in-cart-with-http-info id optional-params))))

(defn update-shipping-address-with-http-info
  "Modifies or sets the order shipping address"
  ([id ] (update-shipping-address-with-http-info id nil))
  ([id {:keys [cart-shipping-address-request ]}]
   (call-api "/carts/{id}/shipping-address" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    cart-shipping-address-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-shipping-address
  "Modifies or sets the order shipping address"
  ([id ] (update-shipping-address id nil))
  ([id optional-params]
   (:data (update-shipping-address-with-http-info id optional-params))))

