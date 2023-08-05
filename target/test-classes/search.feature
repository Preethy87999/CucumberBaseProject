#Author: developer@companydomain.com
#Keywords Summary :This feature shall search a product on flipkart
#Feature: List of scenarios.
#Scenario: Searching a Product on ecommerce Platform


Feature: Flipkart search
  I want to write this feature so as to search a product on the ecommerce platform

  
  Scenario: Search a Product
    Given I have a search field on the Flipkart Home Page
    When I search for a product named "MRFBat"
    And I enter the price as "1200"
    Then Product with name "MRFBat" should be displayed
    

  