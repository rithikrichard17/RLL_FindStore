@firstcry
Feature: Shortlist Functionality

  Scenario: Shortlist products
    Given I am on the login page
    When I log in with valid credentials
    And I shortlist a few products
    And I click on the Shortlist button
    Then the selected products should be in my Shortlist