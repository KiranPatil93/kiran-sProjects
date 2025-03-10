Feature: Create new account of user

  Background:Login functionality
    Given I open the url of the application
    And I enter the email
    And I enter the password
    And I click on Login button


  Scenario:create new account for user
    Given I should navigate on home page
    When I click on new Account menu
    And I enter customer id "21476"
    And I select account type "savings"
    And I enter initial deposit "6754"
    And I click on submit button








