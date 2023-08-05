
@tag
Feature: Open Browser
 

  @tag1
  Scenario: Title Validation
    Given User Opens the Chrome Browser
    When user enter the url "http://google.com"
    Then Title of this page should be "Google"
    

 