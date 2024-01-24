@firstcry
Feature: StoreLocator Functionality
  
  Background:
    Given User navigates to the web URL
    When User must click on the login/Register
    And User Enter the valid emailID
    And User clicks on the continue button
    And User Enter OTP
    And User Clicks on Submit button
    Then User must be able to view the store result
    
   Scenario: User must be able to find FirstCry store results
    Given User must be able to access HomePage
    When User must hover over the stores&preschool
    And User must click on the find stores from drop down
    And User switches focus to the new tab
    And User select the store Type,state and city
    And User click on the search button
    Then User must be able to view the store result
    
    
  
    
    
  
  
