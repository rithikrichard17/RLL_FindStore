@firstcry
Feature: Add to Cart Functionality

  Background: 
    Given User navigate to the FirstCry URL
    And User have valid credentials for login

  Scenario: Login, Search and Add Product to Cart
    When User log into the application with my credentials
    Then User should be redirected to the homepage
    When User search for a specific product
    And select one product from the search results
    And User switches focus to the new tab in Firstcry
    And I click on "Add to Cart" for the selected product
    Then the selected product should be added to my cart
    #Then he must see the text messsage 'PRODUCT DESCRIPTION' is displayed
    #And the cart count should increase by 1
