Feature: To test login functionality
  Scenario: verify successful login with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the dashboard page