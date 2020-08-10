$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Maruthi Work/Working/PracticeTasks/src/main/java/com/qa/features/bookATicket.feature");
formatter.feature({
  "line": 1,
  "name": "book a flight ticket feature",
  "description": "",
  "id": "book-a-flight-ticket-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "flight ticket booking scenario",
  "description": "",
  "id": "book-a-flight-ticket-feature;flight-ticket-booking-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user open easemytrip application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"\u003csource\u003e\" and \"\u003cdestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should get the fares of all flights",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user select any lowest cost flight",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "book-a-flight-ticket-feature;flight-ticket-booking-scenario;",
  "rows": [
    {
      "cells": [
        "source",
        "destination"
      ],
      "line": 11,
      "id": "book-a-flight-ticket-feature;flight-ticket-booking-scenario;;1"
    },
    {
      "cells": [
        "Hyderabad",
        "Bangalore"
      ],
      "line": 12,
      "id": "book-a-flight-ticket-feature;flight-ticket-booking-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "flight ticket booking scenario",
  "description": "",
  "id": "book-a-flight-ticket-feature;flight-ticket-booking-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user open easemytrip application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"Hyderabad\" and \"Bangalore\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should get the fares of all flights",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user select any lowest cost flight",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "BookATicketStepDefination.user_open_easemytrip_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 13
    },
    {
      "val": "Bangalore",
      "offset": 29
    }
  ],
  "location": "BookATicketStepDefination.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookATicketStepDefination.user_should_get_the_fares_of_all_flights()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookATicketStepDefination.user_select_any_lowest_cost_flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});