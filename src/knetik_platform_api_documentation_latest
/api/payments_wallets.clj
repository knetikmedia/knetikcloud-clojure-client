(ns knetik-platform-api-documentation-latest
.api.payments-wallets
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-user-wallet-with-http-info
  "Returns the user's wallet for the given currency code
  <b>Permissions Needed:</b> WALLETS_ADMIN or owner"
  [user-id currency-code ]
  (call-api "/users/{user_id}/wallets/{currency_code}" :get
            {:path-params   {"user_id" user-id "currency_code" currency-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-wallet
  "Returns the user's wallet for the given currency code
  <b>Permissions Needed:</b> WALLETS_ADMIN or owner"
  [user-id currency-code ]
  (:data (get-user-wallet-with-http-info user-id currency-code)))

(defn get-user-wallet-transactions-with-http-info
  "Retrieve a user's wallet transactions
  <b>Permissions Needed:</b> WALLETS_ADMIN or owner"
  ([user-id currency-code ] (get-user-wallet-transactions-with-http-info user-id currency-code nil))
  ([user-id currency-code {:keys [filter-type filter-max-date filter-min-date filter-sign size page order ]}]
   (call-api "/users/{user_id}/wallets/{currency_code}/transactions" :get
             {:path-params   {"user_id" user-id "currency_code" currency-code }
              :header-params {}
              :query-params  {"filter_type" filter-type "filter_max_date" filter-max-date "filter_min_date" filter-min-date "filter_sign" filter-sign "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-user-wallet-transactions
  "Retrieve a user's wallet transactions
  <b>Permissions Needed:</b> WALLETS_ADMIN or owner"
  ([user-id currency-code ] (get-user-wallet-transactions user-id currency-code nil))
  ([user-id currency-code optional-params]
   (:data (get-user-wallet-transactions-with-http-info user-id currency-code optional-params))))

(defn get-user-wallets-with-http-info
  "List all of a user's wallets
  <b>Permissions Needed:</b> WALLETS_ADMIN or owner"
  [user-id ]
  (call-api "/users/{user_id}/wallets" :get
            {:path-params   {"user_id" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-user-wallets
  "List all of a user's wallets
  <b>Permissions Needed:</b> WALLETS_ADMIN or owner"
  [user-id ]
  (:data (get-user-wallets-with-http-info user-id)))

(defn get-wallet-balances-with-http-info
  "Retrieves a summation of wallet balances by currency code
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  []
  (call-api "/wallets/totals" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]}))

(defn get-wallet-balances
  "Retrieves a summation of wallet balances by currency code
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  []
  (:data (get-wallet-balances-with-http-info)))

(defn get-wallet-transactions-with-http-info
  "Retrieve wallet transactions across the system
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  ([] (get-wallet-transactions-with-http-info nil))
  ([{:keys [filter-invoice filter-type filter-date filter-sign filter-user-id filter-username filter-details filter-currency-code size page order ]}]
   (call-api "/wallets/transactions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_invoice" filter-invoice "filter_type" filter-type "filter_date" filter-date "filter_sign" filter-sign "filter_user_id" filter-user-id "filter_username" filter-username "filter_details" filter-details "filter_currency_code" filter-currency-code "size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-wallet-transactions
  "Retrieve wallet transactions across the system
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  ([] (get-wallet-transactions nil))
  ([optional-params]
   (:data (get-wallet-transactions-with-http-info optional-params))))

(defn get-wallets-with-http-info
  "Retrieve a list of wallets across the system
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  ([] (get-wallets-with-http-info nil))
  ([{:keys [size page order ]}]
   (call-api "/wallets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"size" size "page" page "order" order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn get-wallets
  "Retrieve a list of wallets across the system
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  ([] (get-wallets nil))
  ([optional-params]
   (:data (get-wallets-with-http-info optional-params))))

(defn update-wallet-balance-with-http-info
  "Updates the balance for a user's wallet
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  ([user-id currency-code ] (update-wallet-balance-with-http-info user-id currency-code nil))
  ([user-id currency-code {:keys [request ]}]
   (call-api "/users/{user_id}/wallets/{currency_code}/balance" :put
             {:path-params   {"user_id" user-id "currency_code" currency-code }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["oauth2_client_credentials_grant" "oauth2_password_grant"]})))

(defn update-wallet-balance
  "Updates the balance for a user's wallet
  <b>Permissions Needed:</b> WALLETS_ADMIN"
  ([user-id currency-code ] (update-wallet-balance user-id currency-code nil))
  ([user-id currency-code optional-params]
   (:data (update-wallet-balance-with-http-info user-id currency-code optional-params))))

