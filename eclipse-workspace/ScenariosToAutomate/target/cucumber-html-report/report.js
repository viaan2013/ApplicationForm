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
  "name": "I select Outcome option in the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select scheduledcourse in the outcome option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003ccourseTitle\u003e\" in outcome search area",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select \"\u003cCourse\u003e\" from search results",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select \"\u003cscheduledCourse\u003e\" from list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I print URL with outcomeID and salesforceID",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \"\u003cproductProgression\u003e\" related to that scheduledcourse",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I print the URL",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I navigate to salesforce",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I search for \"\u003cscheduledcourse\u003e\" in the salesforce url",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see product progression option is unticked",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
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
      "line": 20,
      "id": "product-progression;product-progression-option-true-to-false;;1"
    },
    {
      "cells": [
        "science",
        "aCI3A000000Caf0WAC",
        "//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027International Foundation in Biological and Biomedical Sciences - September Start - 3 Terms - NCL - 2018/19\u0027]",
        "//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027BSc (Hons) Psychology and Biology\u0027]",
        "aCD3A0000008lnbWAA"
      ],
      "line": 21,
      "id": "product-progression;product-progression-option-true-to-false;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4993588116,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
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
  "name": "I select Outcome option in the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select scheduledcourse in the outcome option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"science\" in outcome search area",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select \"aCI3A000000Caf0WAC\" from search results",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select \"//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027International Foundation in Biological and Biomedical Sciences - September Start - 3 Terms - NCL - 2018/19\u0027]\" from list",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I print URL with outcomeID and salesforceID",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \"//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027BSc (Hons) Psychology and Biology\u0027]\" related to that scheduledcourse",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I print the URL",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I navigate to salesforce",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I search for \"aCD3A0000008lnbWAA\" in the salesforce url",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see product progression option is unticked",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductProgressionStepDef.i_am_in_contentful_home_page()"
});
formatter.result({
  "duration": 10570649906,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_select_Outcome_option_in_the_dropdown()"
});
formatter.result({
  "duration": 6499729026,
  "status": "passed"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_select_scheduledcourse_in_the_outcome_option()"
});
formatter.result({
  "duration": 383234906,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027BTNISDL1PTPSF2\u0027, ip: \u002710.11.11.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_172\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\SRUTHI~1.KUN\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 4618f33522e119d4d35a3a8c8680e16b\n*** Element info: {Using\u003dcss selector, value\u003d.input-reset.search-next__query-input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:464)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat com.pages.ProductProgressionPage.selectScheduledCourseInOutcome(ProductProgressionPage.java:27)\r\n\tat com.StepDefination.ProductProgressionStepDef.i_select_scheduledcourse_in_the_outcome_option(ProductProgressionStepDef.java:28)\r\n\tat ✽.And I select scheduledcourse in the outcome option(ProductProgression.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "science",
      "offset": 9
    }
  ],
  "location": "ProductProgressionStepDef.i_enter_in_outcome_search_area(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "aCI3A000000Caf0WAC",
      "offset": 10
    }
  ],
  "location": "ProductProgressionStepDef.i_select_from_search_results(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027International Foundation in Biological and Biomedical Sciences - September Start - 3 Terms - NCL - 2018/19\u0027]",
      "offset": 10
    }
  ],
  "location": "ProductProgressionStepDef.i_select_from_list(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_print_URL_with_outcomeID_and_salesforceID()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "//div[@class\u003d\u0027ReferenceCard__title\u0027][text()\u003d\u0027BSc (Hons) Psychology and Biology\u0027]",
      "offset": 12
    }
  ],
  "location": "ProductProgressionStepDef.i_click_on_related_to_that_scheduledcourse(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_print_the_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_navigate_to_salesforce()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "aCD3A0000008lnbWAA",
      "offset": 14
    }
  ],
  "location": "ProductProgressionStepDef.i_search_for_in_the_salesforce_url(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_productprogression_inactive_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_click_on_Save_button_in_salesforce()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductProgressionStepDef.i_should_see_product_progression_option_is_unticked()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 877666712,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Product progression option False to true",
  "description": "",
  "id": "product-progression;product-progression-option-false-to-true",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 25,
  "name": "I navigate to salesforce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I am searching for \"\u003cprogressiondegree\u003e\" which are having unticked Productprogression inactive option",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click on productprogression inactive option",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on Save button in salesforce",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I should see product progression inactive option ticked",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "product-progression;product-progression-option-false-to-true;",
  "rows": [
    {
      "cells": [
        "progressiondegree"
      ],
      "line": 31,
      "id": "product-progression;product-progression-option-false-to-true;;1"
    },
    {
      "cells": [
        "aCD3A00000090WQ"
      ],
      "line": 32,
      "id": "product-progression;product-progression-option-false-to-true;;2"
    },
    {
      "cells": [
        "aCD3A00000090WP"
      ],
      "line": 33,
      "id": "product-progression;product-progression-option-false-to-true;;3"
    }
  ],
  "keyword": "Examples"
});
