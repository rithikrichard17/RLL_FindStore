@firstcry
Feature: MyProfile Functionality

Scenario: User edits their profile information
 Given I open the browser
 When I navigate to the application
 When I Log in with valid credentials
 When I click on My Account
 And I select My Profile
 And I perform an Edit operation