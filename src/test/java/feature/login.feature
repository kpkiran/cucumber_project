Feature: Login to eapp to check the login functionality

Background:
	Given User is on the login page

  @LoginTest
  Scenario Outline: 
    And User enters <Username> in usernamefield
    And User enters <Password> in password field
    When User clicks on Login button
    Then User gets the message <message>

    Examples: 
      | Username | Password | message                         |
      | admin    | admin    | Invalid login attempt.          |
      | password | admin    | Invalid login attempt.          |
      
     @LoginTest
    Scenario Outline:
		And User enters <Username> in usernamefield
    And User enters <Password> in password field
    When User clicks on Login button
    Then User should be logged in
    
    Examples: 
      | Username | Password |
      | admin	|	password |