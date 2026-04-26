Feature: Login functionality

  Scenario: Verify user login with valid credentials
    Given user launches the application
    When user enters valid username and password
    And user clicks on login button
    Then user should be redirected to the home page
