@firstcry
Feature: FirstCry Login Automation


Scenario: Login to FirstCry
Given a user is in the LandingPage on Firstcry
When user click on the login button
And user enter valid emailid
And user click on the continue button
And user click the submit button
And user should be logged in successfully

Scenario: Login to FirstCry
Given a user is in the landingPage 
When user clicks on the Login button
And user enter invalid emailid
And user click on the continue btn
And user click the submit btn
And user should be not able to logged successfully