(ns knetik-platform-api-documentation-latest
.api.bre-rule-engine-rules
  (:require [knetik-platform-api-documentation-latest
.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-bre-rule-with-http-info
  "Create a rule
  Rules define which actions to run when a given event verifies the specified conditions. Conditions and actions are defined by binding event or context parameters to arguments. Conditions also known as Predicates are logical expressions that result in a boolean. Operators are used to describe rules between arguments to form that condition. There are 3 families of operators: Boolean, Math and String. Math and String operators are functions that transform arguments into numbers or strings...<h1>Boolean Operators</h1><br /><br />1 arg:<br />======<br /><br /><ul>	<li>IS_NULL</li>	<li>IS_NOT_NULL</li>	<li>STRING_IS_EMPTY</li>	<li>NOT </li>	<li>MAP_IS_EMPTY</li></ul><br />2 args:<br />=======<br /><br /><ul>	<li>EQ</li>	<li>NE (Not Equals)</li>	<li>GT (Greater Than)</li>	<li>GOE (Greater Or Equals)</li>	<li>LT (Lesser Than)</li>	<li>LOE (Lesser Or Equals)</li>	<li>OR</li>	<li>AND</li>	<li>XNOR</li>	<li>XOR</li>	<li>CONTAINS_KEY (for maps only)</li>	<li>CONTAINS_VALUE (for maps only)</li>	<li>MATCHES (regex)</li>	<li>MATCHES_IC (regex ignore case)</li>	<li>STARTS_WITH</li>	<li>STARTS_WITH_IC</li>	<li>EQ_IGNORE_CASE</li>	<li>ENDS_WITH</li>	<li>ENDS_WITH_IC</li>	<li>STRING_CONTAINS</li>	<li>STRING_CONTAINS_IC</li>	<li>LIKE (SQL like)</li></ul><br />3 args exceptions:<br />=================<br /><br /><ul>	<li>BETWEEN</li></ul><br />n args:<br />=======<br /><br /><ul>	<li>IN</li>	<li>NOT_INT</li></ul><h1>Math Operators</h1>1 arg:<br />=====<br /><br /><ul>	<li>NEGATE</li>	<li>MAP_SIZE</li>	<li>STRING_LENGTH</li> <li>CEIL</li> <li>ABS</li> <li>FLOOR</li> <li>ROUND</li> <li>RANDOM (no arg)</li> <li>RANDOM2 (seed arg)</li> <li>NUMCAST</li> <li>HOUR</li> <li>MINUTE</li> <li>SECOND</li> <li>MILLISECOND</li> <li>YEAR</li> <li>WEEK</li> <li>YEAR_MONTH</li> <li>YEAR_WEEK</li> <li>DAY_OF_WEEK</li> <li>DAY_OF_MONTH</li> <li>DAY_OF_YEAR</li> <li>WEEK</li> <li>WEEK</li> <li>WEEK</li></ul><br /><br />2 args:<br />======<br /><br /><ul> <li>ADD</li> <li>DIV</li> <li>MULT</li> <li>SUB</li> <li>POWER</li> <li>MOD</li> <li>LOCATE (index of (string, char))</li> <li>DIFF_YEARS</li> <li>DIFF_MONTHS</li> <li>DIFF_WEEKS</li> <li>DIFF_DAYS</li> <li>DIFF_HOURS</li> <li>DIFF_MINUTES</li> <li>DIFF_SECONDS</li></ul><br /><br />2 args:<br />======<br /><br /><ul>	<li>MIN</li>	<li>MAX</li></ul><h1>String Operators</h1>0 arg:<br />=====<br /><br /><ul>	<li>CURRENT_TIME</li></ul><br /><br />1 arg:<br />=====<br /><br /><ul>	<li>CURRENT_TIME</li>	<li>LOWER</li>	<li>UPPER</li>	<li>TRIM</li>	<li>STRING_CAST</li></ul><br /><br />2 args:<br />=====<br /><br /><ul>	<li>CHAR_AT</li>	<li>SUBSTR_1ARG (substr(string, start))</li>	<li>CONCAT</li>	<li>TRIM</li>	<li>STRING_CAST</li></ul><br /><br />3 args:<br />=====<br /><br /><ul>	<li>SUBSTR_2ARGS (substr(string, start, length))</li></ul>"
  ([] (create-bre-rule-with-http-info nil))
  ([{:keys [bre-rule ]}]
   (call-api "/bre/rules" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-rule
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn create-bre-rule
  "Create a rule
  Rules define which actions to run when a given event verifies the specified conditions. Conditions and actions are defined by binding event or context parameters to arguments. Conditions also known as Predicates are logical expressions that result in a boolean. Operators are used to describe rules between arguments to form that condition. There are 3 families of operators: Boolean, Math and String. Math and String operators are functions that transform arguments into numbers or strings...<h1>Boolean Operators</h1><br /><br />1 arg:<br />======<br /><br /><ul>	<li>IS_NULL</li>	<li>IS_NOT_NULL</li>	<li>STRING_IS_EMPTY</li>	<li>NOT </li>	<li>MAP_IS_EMPTY</li></ul><br />2 args:<br />=======<br /><br /><ul>	<li>EQ</li>	<li>NE (Not Equals)</li>	<li>GT (Greater Than)</li>	<li>GOE (Greater Or Equals)</li>	<li>LT (Lesser Than)</li>	<li>LOE (Lesser Or Equals)</li>	<li>OR</li>	<li>AND</li>	<li>XNOR</li>	<li>XOR</li>	<li>CONTAINS_KEY (for maps only)</li>	<li>CONTAINS_VALUE (for maps only)</li>	<li>MATCHES (regex)</li>	<li>MATCHES_IC (regex ignore case)</li>	<li>STARTS_WITH</li>	<li>STARTS_WITH_IC</li>	<li>EQ_IGNORE_CASE</li>	<li>ENDS_WITH</li>	<li>ENDS_WITH_IC</li>	<li>STRING_CONTAINS</li>	<li>STRING_CONTAINS_IC</li>	<li>LIKE (SQL like)</li></ul><br />3 args exceptions:<br />=================<br /><br /><ul>	<li>BETWEEN</li></ul><br />n args:<br />=======<br /><br /><ul>	<li>IN</li>	<li>NOT_INT</li></ul><h1>Math Operators</h1>1 arg:<br />=====<br /><br /><ul>	<li>NEGATE</li>	<li>MAP_SIZE</li>	<li>STRING_LENGTH</li> <li>CEIL</li> <li>ABS</li> <li>FLOOR</li> <li>ROUND</li> <li>RANDOM (no arg)</li> <li>RANDOM2 (seed arg)</li> <li>NUMCAST</li> <li>HOUR</li> <li>MINUTE</li> <li>SECOND</li> <li>MILLISECOND</li> <li>YEAR</li> <li>WEEK</li> <li>YEAR_MONTH</li> <li>YEAR_WEEK</li> <li>DAY_OF_WEEK</li> <li>DAY_OF_MONTH</li> <li>DAY_OF_YEAR</li> <li>WEEK</li> <li>WEEK</li> <li>WEEK</li></ul><br /><br />2 args:<br />======<br /><br /><ul> <li>ADD</li> <li>DIV</li> <li>MULT</li> <li>SUB</li> <li>POWER</li> <li>MOD</li> <li>LOCATE (index of (string, char))</li> <li>DIFF_YEARS</li> <li>DIFF_MONTHS</li> <li>DIFF_WEEKS</li> <li>DIFF_DAYS</li> <li>DIFF_HOURS</li> <li>DIFF_MINUTES</li> <li>DIFF_SECONDS</li></ul><br /><br />2 args:<br />======<br /><br /><ul>	<li>MIN</li>	<li>MAX</li></ul><h1>String Operators</h1>0 arg:<br />=====<br /><br /><ul>	<li>CURRENT_TIME</li></ul><br /><br />1 arg:<br />=====<br /><br /><ul>	<li>CURRENT_TIME</li>	<li>LOWER</li>	<li>UPPER</li>	<li>TRIM</li>	<li>STRING_CAST</li></ul><br /><br />2 args:<br />=====<br /><br /><ul>	<li>CHAR_AT</li>	<li>SUBSTR_1ARG (substr(string, start))</li>	<li>CONCAT</li>	<li>TRIM</li>	<li>STRING_CAST</li></ul><br /><br />3 args:<br />=====<br /><br /><ul>	<li>SUBSTR_2ARGS (substr(string, start, length))</li></ul>"
  ([] (create-bre-rule nil))
  ([optional-params]
   (:data (create-bre-rule-with-http-info optional-params))))

(defn delete-bre-rule-with-http-info
  "Delete a rule
  May fail if there are existing rules against it. Cannot delete core rules"
  [id ]
  (call-api "/bre/rules/{id}" :delete
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn delete-bre-rule
  "Delete a rule
  May fail if there are existing rules against it. Cannot delete core rules"
  [id ]
  (:data (delete-bre-rule-with-http-info id)))

(defn get-bre-expression-as-string-with-http-info
  "Returns a string representation of the provided expression"
  ([] (get-bre-expression-as-string-with-http-info nil))
  ([{:keys [expression ]}]
   (call-api "/bre/rules/expression-as-string" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    expression
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-bre-expression-as-string
  "Returns a string representation of the provided expression"
  ([] (get-bre-expression-as-string nil))
  ([optional-params]
   (:data (get-bre-expression-as-string-with-http-info optional-params))))

(defn get-bre-rule-with-http-info
  "Get a single rule"
  [id ]
  (call-api "/bre/rules/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth2"]}))

(defn get-bre-rule
  "Get a single rule"
  [id ]
  (:data (get-bre-rule-with-http-info id)))

(defn get-bre-rules-with-http-info
  "List rules"
  ([] (get-bre-rules-with-http-info nil))
  ([{:keys [filter-name filter-enabled filter-system filter-trigger filter-action filter-condition size page ]}]
   (call-api "/bre/rules" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter_name" filter-name "filter_enabled" filter-enabled "filter_system" filter-system "filter_trigger" filter-trigger "filter_action" filter-action "filter_condition" filter-condition "size" size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn get-bre-rules
  "List rules"
  ([] (get-bre-rules nil))
  ([optional-params]
   (:data (get-bre-rules-with-http-info optional-params))))

(defn set-bre-rule-with-http-info
  "Enable or disable a rule
  This is helpful for turning off systems rules which cannot be deleted or modified otherwise"
  ([id ] (set-bre-rule-with-http-info id nil))
  ([id {:keys [enabled ]}]
   (call-api "/bre/rules/{id}/enabled" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    enabled
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn set-bre-rule
  "Enable or disable a rule
  This is helpful for turning off systems rules which cannot be deleted or modified otherwise"
  ([id ] (set-bre-rule id nil))
  ([id optional-params]
   (:data (set-bre-rule-with-http-info id optional-params))))

(defn update-bre-rule-with-http-info
  "Update a rule
  Cannot update system rules"
  ([id ] (update-bre-rule-with-http-info id nil))
  ([id {:keys [bre-rule ]}]
   (call-api "/bre/rules/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    bre-rule
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth2"]})))

(defn update-bre-rule
  "Update a rule
  Cannot update system rules"
  ([id ] (update-bre-rule id nil))
  ([id optional-params]
   (:data (update-bre-rule-with-http-info id optional-params))))

