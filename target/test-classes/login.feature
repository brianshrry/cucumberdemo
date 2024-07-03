#Author: brian
#Keywords Summary : this will test the login page of a new web application
#Feature: List of scenarios.
#Scenario: logging into a web application
@tag
Feature: Login page

  @tag1
  Scenario: Title of your scenario
    Given I have a login page on this new web application
    When I enter valid credentials
    And I click submit button
    Then I confirm that the account has been logged in