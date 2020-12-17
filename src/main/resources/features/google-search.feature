Feature: To test Google search
  Scenario: To test google search functionality
    Given browser is open
    And user is on google search page
    When user enters search key
    And hit enter
    Then verify search results
