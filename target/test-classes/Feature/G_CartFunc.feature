@firstcry
Feature: Cart Functionality

Background:
Given User navigates to the web URL in firstcry
When User click on the Register
And User Enters the valid emailID
And User clicks on the continue buttonn
And User Clicks on Submit buttonn
Then Validate login is successfull

Scenario: User must be able to view cart
When User goto Search button
And User select the product
And go to the add to cart button
And go to the Go to cart button
And increase the Quality of the product
