$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProductProgression.feature");
formatter.feature({
  "line": 2,
  "name": "Product Progression",
  "description": "",
  "id": "product-progression",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ProductProgression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Product progression option true to false",
  "description": "",
  "id": "product-progression;product-progression-option-true-to-false",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am in contentful home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter Email as \"charles.parvez@intoglobal.com\" and Password as \"Into3683\" in the home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on login to contentful test site",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select Outcome option in the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select scheduledcourse in the outcome option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"\u003ccourseTitle\u003e\" in outcome search area",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select \"\u003cCourse\u003e\" from search results",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select \"\u003cscheduledCourse\u003e\" from list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I print URL with outcomeID and salesforceID",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"\u003cproductProgression\u003e\" related to that scheduledcourse",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I print the URL",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I navigate to salesforce",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter userName as \"sruthi.kundoor@intoglobal.com.iupsfuat\" and passWord as \"Into1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Login button in salesforce home page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I search for \"\u003cscheduledcourse\u003e\" in the salesforce url",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see product progression option is unticked",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "product-progression;product-progression-option-true-to-false;",
  "rows": [
    {
      "cells": [
        "courseTitle",
        "Course",
        "scheduledCourse",
        "productProgression",
        "scheduledcourse"
      ],
      "line": 24,
      "id": "product-progression;product-progression-option-true-to-false;;1"
    },
    {
      "cells": [
        "Jamie",
        "aCI8E0000008Ph4WAE",
        "//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19\u0027]",
        "//cf-entity-field[12]/div/div/div[2]/cf-widget-renderer/cf-reference-editor/div[2]/ol/li/cf-entity-link/div/div/article/a/div/div/div",
        "aCD3A0000009J8xWAE"
      ],
      "line": 25,
      "id": "product-progression;product-progression-option-true-to-false;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Product progression option true to false",
  "description": "",
  "id": "product-progression;product-progression-option-true-to-false;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ProductProgression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in contentful home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter Email as \"charles.parvez@intoglobal.com\" and Password as \"Into3683\" in the home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on login to contentful test site",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select Outcome option in the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select scheduledcourse in the outcome option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"Jamie\" in outcome search area",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select \"aCI8E0000008Ph4WAE\" from search results",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select \"//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19\u0027]\" from list",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I print URL with outcomeID and salesforceID",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"//cf-entity-field[12]/div/div/div[2]/cf-widget-renderer/cf-reference-editor/div[2]/ol/li/cf-entity-link/div/div/article/a/div/div/div\" related to that scheduledcourse",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I print the URL",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I navigate to salesforce",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter userName as \"sruthi.kundoor@intoglobal.com.iupsfuat\" and passWord as \"Into1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Login button in salesforce home page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I search for \"aCD3A0000009J8xWAE\" in the salesforce url",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see product progression option is unticked",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductProgressionStepDef.i_am_in_contentful_home_page()"
});
formatter.result({
  "duration": 6446390975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "charles.parvez@intoglobal.com",
      "offset": 18
    },
    {
      "val": "Into3683",
      "offset": 66
    }
  ],
  "location": "ProductProgressionStepDef.i_enter_Email_as_and_Password_as_in_the_home_page(String,String)"
});
formatter.result({
  "duration": 576811487,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_login_to_contentful_test_site()"
});
formatter.result({
  "duration": 6413984410,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_select_Outcome_option_in_the_dropdown()"
});
formatter.result({
  "duration": 3200658872,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_select_scheduledcourse_in_the_outcome_option()"
});
formatter.result({
  "duration": 1277755077,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jamie",
      "offset": 9
    }
  ],
  "location": "ProductProgressionStepDef.i_enter_in_outcome_search_area(String)"
});
formatter.result({
  "duration": 2539701333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aCI8E0000008Ph4WAE",
      "offset": 10
    }
  ],
  "location": "ProductProgressionStepDef.i_select_from_search_results(String)"
});
formatter.result({
  "duration": 3236995692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19\u0027]",
      "offset": 10
    }
  ],
  "location": "ProductProgressionStepDef.i_select_from_list(String)"
});
formatter.result({
  "duration": 2943540923,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_print_URL_with_outcomeID_and_salesforceID()"
});
formatter.result({
  "duration": 153849436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//cf-entity-field[12]/div/div/div[2]/cf-widget-renderer/cf-reference-editor/div[2]/ol/li/cf-entity-link/div/div/article/a/div/div/div",
      "offset": 12
    }
  ],
  "location": "ProductProgressionStepDef.i_click_on_related_to_that_scheduledcourse(String)"
});
formatter.result({
  "duration": 16087186872,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_print_the_URL()"
});
formatter.result({
  "duration": 5730461,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_navigate_to_salesforce()"
});
formatter.result({
  "duration": 1208660103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sruthi.kundoor@intoglobal.com.iupsfuat",
      "offset": 21
    },
    {
      "val": "Into1234",
      "offset": 78
    }
  ],
  "location": "ProductProgressionStepDef.i_enter_userName_as_and_passWord_as(String,String)"
});
formatter.result({
  "duration": 490683897,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_Login_button_in_salesforce_home_page()"
});
formatter.result({
  "duration": 2571960616,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aCD3A0000009J8xWAE",
      "offset": 14
    }
  ],
  "location": "ProductProgressionStepDef.i_search_for_in_the_salesforce_url(String)"
});
formatter.result({
  "duration": 2859788718,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_productprogression_inactive_option()"
});
formatter.result({
  "duration": 5215770257,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_Save_button_in_salesforce()"
});
formatter.result({
  "duration": 9126251897,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_should_see_product_progression_option_is_unticked()"
});
formatter.result({
  "duration": 69675077,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Product progression option False to true",
  "description": "",
  "id": "product-progression;product-progression-option-false-to-true",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 29,
  "name": "I navigate to salesforce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I am searching for \"\u003cprogressiondegree\u003e\" which are having unticked Productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should see product progression inactive option ticked",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "product-progression;product-progression-option-false-to-true;",
  "rows": [
    {
      "cells": [
        "progressiondegree"
      ],
      "line": 35,
      "id": "product-progression;product-progression-option-false-to-true;;1"
    },
    {
      "cells": [
        "aCD3A0000009J9A"
      ],
      "line": 36,
      "id": "product-progression;product-progression-option-false-to-true;;2"
    },
    {
      "cells": [
        "aCD3A0000009J91"
      ],
      "line": 37,
      "id": "product-progression;product-progression-option-false-to-true;;3"
    },
    {
      "cells": [
        "aCD3A0000009J9F"
      ],
      "line": 38,
      "id": "product-progression;product-progression-option-false-to-true;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 36,
  "name": "Product progression option False to true",
  "description": "",
  "id": "product-progression;product-progression-option-false-to-true;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ProductProgression"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I navigate to salesforce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I am searching for \"aCD3A0000009J9A\" which are having unticked Productprogression inactive option",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should see product progression inactive option ticked",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductProgressionStepDef.i_navigate_to_salesforce_homepage()"
});
formatter.result({
  "duration": 7522450461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aCD3A0000009J9A",
      "offset": 20
    }
  ],
  "location": "ProductProgressionStepDef.i_am_searching_for_which_are_having_unticked_Productprogression_inactive_option(String)"
});
formatter.result({
  "duration": 1599365334,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_productprogression_inactive_option()"
});
formatter.result({
  "duration": 5188712615,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_Save_button_in_salesforce()"
});
formatter.result({
  "duration": 9164907077,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_should_see_product_progression_inactive_option_ticked()"
});
formatter.result({
  "duration": 47910974,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Product progression option False to true",
  "description": "",
  "id": "product-progression;product-progression-option-false-to-true;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ProductProgression"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I navigate to salesforce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I am searching for \"aCD3A0000009J91\" which are having unticked Productprogression inactive option",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should see product progression inactive option ticked",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductProgressionStepDef.i_navigate_to_salesforce_homepage()"
});
formatter.result({
  "duration": 8520355282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aCD3A0000009J91",
      "offset": 20
    }
  ],
  "location": "ProductProgressionStepDef.i_am_searching_for_which_are_having_unticked_Productprogression_inactive_option(String)"
});
formatter.result({
  "duration": 1933338256,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_productprogression_inactive_option()"
});
formatter.result({
  "duration": 5185525334,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_Save_button_in_salesforce()"
});
formatter.result({
  "duration": 9129369025,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_should_see_product_progression_inactive_option_ticked()"
});
formatter.result({
  "duration": 57568411,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Product progression option False to true",
  "description": "",
  "id": "product-progression;product-progression-option-false-to-true;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ProductProgression"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I navigate to salesforce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I am searching for \"aCD3A0000009J9F\" which are having unticked Productprogression inactive option",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should see product progression inactive option ticked",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductProgressionStepDef.i_navigate_to_salesforce_homepage()"
});
formatter.result({
  "duration": 7849620102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aCD3A0000009J9F",
      "offset": 20
    }
  ],
  "location": "ProductProgressionStepDef.i_am_searching_for_which_are_having_unticked_Productprogression_inactive_option(String)"
});
formatter.result({
  "duration": 1664595282,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_productprogression_inactive_option()"
});
formatter.result({
  "duration": 5230899282,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_Save_button_in_salesforce()"
});
formatter.result({
  "duration": 9104439794,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_should_see_product_progression_inactive_option_ticked()"
});
formatter.result({
  "duration": 35372718,
  "status": "passed"
});
});