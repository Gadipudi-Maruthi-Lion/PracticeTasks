Feature: book a flight ticket feature
Scenario Outline: flight ticket booking scenario

Given user open easemytrip application
When user enters "<source>" and "<destination>"
Then user should get the fares of all flights
Then user select any lowest cost flight
And close the browser

Examples:
|source  |destination|
|Hyderabad|Bangalore|



