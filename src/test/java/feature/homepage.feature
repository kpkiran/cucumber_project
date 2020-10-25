Feature: Login and click on the Employee details

Background:
Given User is logged into the application

@HomePage
Scenario:
When User clicks on Employee Details link
Then User is displayed with Employee details page

@HomePage
Scenario:
When User clicks on Employee Details link
And User is displayed with Employee details page
Then User click on the create new button
