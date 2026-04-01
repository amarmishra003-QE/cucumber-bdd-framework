Feature: Login functionality

Scenario: Validate homepage title
  Given user is on homepage
  When user checks the page title
  Then title should contain "Example"
