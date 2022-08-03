$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Adactin_Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Functionality for Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression_run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is enter the \"\u003cUsername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is enter the \"\u003cPassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is click on submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;;1"
    },
    {
      "cells": [
        "admin",
        "admin123"
      ],
      "line": 12,
      "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;;2"
    },
    {
      "cells": [
        "root",
        "root123"
      ],
      "line": 13,
      "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;;3"
    },
    {
      "cells": [
        "arvind19",
        "12345678"
      ],
      "line": 14,
      "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4559100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality for Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression_run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is enter the \"admin\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is enter the \"admin123\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinition.user_is_launch_the_application()"
});
formatter.result({
  "duration": 4142061100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 19
    }
  ],
  "location": "Adactin_StepDefinition.user_is_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 113290900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 19
    }
  ],
  "location": "Adactin_StepDefinition.user_is_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 58461600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinition.user_is_click_on_submit_button()"
});
formatter.result({
  "duration": 1533773200,
  "status": "passed"
});
formatter.after({
  "duration": 178600,
  "status": "passed"
});
formatter.before({
  "duration": 301200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality for Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression_run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is enter the \"root\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is enter the \"root123\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinition.user_is_launch_the_application()"
});
formatter.result({
  "duration": 191342600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "root",
      "offset": 19
    }
  ],
  "location": "Adactin_StepDefinition.user_is_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 65704600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "root123",
      "offset": 19
    }
  ],
  "location": "Adactin_StepDefinition.user_is_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 68336300,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinition.user_is_click_on_submit_button()"
});
formatter.result({
  "duration": 241908900,
  "status": "passed"
});
formatter.after({
  "duration": 181500,
  "status": "passed"
});
formatter.before({
  "duration": 103300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality for Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality-for-adactin-hotel-booking;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression_run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is enter the \"arvind19\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is enter the \"12345678\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinition.user_is_launch_the_application()"
});
formatter.result({
  "duration": 188738600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arvind19",
      "offset": 19
    }
  ],
  "location": "Adactin_StepDefinition.user_is_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 76732700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 19
    }
  ],
  "location": "Adactin_StepDefinition.user_is_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 49006800,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinition.user_is_click_on_submit_button()"
});
formatter.result({
  "duration": 651144600,
  "status": "passed"
});
formatter.after({
  "duration": 763100,
  "status": "passed"
});
formatter.before({
  "duration": 84700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search Hotel",
  "description": "",
  "id": "adactin-hotel-booking;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@regression_run"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is enter the location",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User is select the Hotel Name",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin_StepDefinition.user_is_enter_the_location()"
});
formatter.result({
  "duration": 2195687900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 133800,
  "status": "passed"
});
});