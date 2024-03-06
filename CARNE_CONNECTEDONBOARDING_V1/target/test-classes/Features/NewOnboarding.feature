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

Scenario Outline:I can choose a customer
  Given I click on Onboarding menu
  And I click on New Onboarding button
  And I am on New Onboarding page
  When I choose customer name "<customerName>"
  And I click on Next button
  Examples:
    | customerName            |
    | bamboo capital partners |

  Scenario Outline:I can see customer details
    Given I click on Onboarding menu
    And I click on New Onboarding button
    And I am on New Onboarding page
    And I enter customer name "<customerName>"
    And I can choose Customer name
    And I click on Next button
    And I am on Provide Onboarding details page
    When I click on Customer name "<customerName>"
    Then I navigate on Customer details page
    Examples:
      | customerName            |
      | bamboo capital partners |

    Scenario Outline:I can provide Onboarding details
      Given I click on Onboarding menu
      And I click on New Onboarding button
      And I am on New Onboarding page
      And I enter customer name "<customerName>"
      And I can choose Customer name
      And I click on Next button
      And I am on Provide Onboarding details page
      When I enter Estimated Onboarding Completion Date "<completionDate>"
      Then I click on Next button
      And I navigate on Add Products page
      Examples:
        | customerName            | completionDate |
        | bamboo capital partners | 2/6/2023       |

Scenario Outline:I can create new customer
  Given I click on Onboarding menu
  And I click on New Onboarding button
  And I am on New Onboarding page
  When I enter customer name "<customerName>"
  And I can choose Customer name
  And I click on Next button
  And I am on Provide Onboarding details page
  And I enter Estimated Onboarding Completion Date "<completionDate>"
  And I click on Next button
  And I navigate on Add Products page
  And I click on Next button
  Then I click on submit button
  And I can see onboarding ID
  And I can see success messgae "<message>"
  Examples:
    | customerName            | completionDate | message                 |
    | bamboo capital partners | 2/6/2023       | bamboo capital partners |

  Scenario Outline:I can see Process setup page
    Given I click on Onboarding menu
    And I click on New Onboarding button
    And I am on New Onboarding page
    And I enter customer name "<customerName>"
    And I can choose Customer name
    And I click on Next button
    And I am on Provide Onboarding details page
    And I enter Estimated Onboarding Completion Date "<completionDate>"
    And I click on Next button
    And I navigate on Add Products page
    And I click on Next button
    And I click on submit button
    When I click on Go to process setup page button
    Then I navigate on Onboarding process setup page

    Examples:
      | customerName            | completionDate |
      | bamboo capital partners | 2/6/2023       |