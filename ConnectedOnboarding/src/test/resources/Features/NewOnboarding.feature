Feature:New Onboarding

  Background:Login successfully
    Given I am on the login screen
    And I enter Username
    And I enter the correct password
    When I press Log in
    Then I should see the HomePage

    Scenario:I can see Onboarding page
      Given I am on Home page
      When I click on Onboarding menu
      Then I am on Onboarding page

      Scenario: I can see New Onboarding page
        Given I click on Onboarding menu
        When I click on New Onboarding button
        Then I am on New Onboarding page

Scenario Outline:I can see customer name in suggestions
  Given I click on Onboarding menu
  And I click on New Onboarding button
  And I am on New Onboarding page
  When I choose customer name "<customerName>"
  And I click on Next button
  Examples:
    | customerName            |
    | Astarte Capital Partners |

  Scenario Outline:I can see customer details
    Given I click on Onboarding menu
    And I click on New Onboarding button
    And I am on New Onboarding page
    When I choose customer name "<customerName>"
    And I click on Next button
    And I am on Provide Onboarding details page
    When I click on Customer name "<customerName>"
    Then I navigate on Customer details page
    Examples:
      | customerName            |
      | Astarte Capital Partners |




