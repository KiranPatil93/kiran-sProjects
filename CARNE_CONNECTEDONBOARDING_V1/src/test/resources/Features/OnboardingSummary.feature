Feature: Onboarding summary

  Scenario Outline:I can see summary of onboarding
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    When I click on Onboarding ID "<customerName>"
    Then I can see onboarding summary
    Examples:
      | customerName            |
      | bamboo capital partners |

    Scenario Outline:I can see customer details
      Given I click on Onboarding Menu
      And I navigate on Onboarding page
      When I click on customer name "<customerName>"
      Then I can see Customer details
      Examples:
        | customerName            |
        | bamboo capital partners |

      Scenario: I can see Assignee details
        Given I click on Onboarding Menu
        And I navigate on Onboarding page
        And I click on Onboarding ID
        And I can see onboarding summary
        When I click on Assignee name
        Then I can see Assignee details

        Scenario: I can see Documents page
          Given I click on Onboarding Menu
          And I navigate on Onboarding page
          And I click on Onboarding ID
          And I can see onboarding summary
          When I click on Documents link
          Then I can see Documents page

  Scenario: I can see Products page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on Products link
    Then I can see Products page

    Scenario: I can see Tasks page
      Given I click on Onboarding Menu
      And I navigate on Onboarding page
      And I click on Onboarding ID
      And I can see onboarding summary
      When I click on Tasks link
      Then I can see Tasks page

      Scenario: I can navigate on New Task page
        Given I click on Onboarding Menu
        And I navigate on Onboarding page
        And I click on Onboarding ID
        And I can see onboarding summary
        And I click on Tasks link
        And I can see Tasks page
        When I click on New Tasks button
        Then I can navigate on New Task page

  Scenario: I can see Action Log page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on Action Log link
    Then I can see Action Log page

  Scenario: I can see Discussion page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on Discussion link
    Then I can see Discussion page

  Scenario Outline: I can see History page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on History link
    Then I can see History page "<historyPage>"
    Examples:
      | historyPage |
      | Modified By |

  Scenario: I can see Owners page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on Owners link
    Then I can see Owners page

  Scenario: I can navigate on Add Owners page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on Add Owners button
    Then I can see Add Owners page

    Scenario: I can see Onboarding details on Add Owners page
      Given I click on Onboarding Menu
      And I navigate on Onboarding page
      And I click on Onboarding ID
      And I can see onboarding summary
      And I click on Add Owners button
      And I can see Add Owners page
      When I click on Onboarding name link
      Then I can navigate on Onboarding summary page

  Scenario: I can navigate on Risk Assessment page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on Risk Assessment link
    Then I can see Risk Assessment page

    Scenario: I can navigate on Create Risk Assessment page
      Given I click on Onboarding Menu
      And I navigate on Onboarding page
      And I click on Onboarding ID
      And I can see onboarding summary
      And I click on Risk Assessment link
      And I can see Risk Assessment page
      When I click on Link Risk Assessment to onboarding button
      Then I can navigate on Create Risk Assessment page

  Scenario: I can navigate on Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    When I click on Related Actions link
    Then I can see Related Actions page

  Scenario: I can navigate on New Tasks page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on New Tasks link
    Then I can navigate on New Tasks page

  Scenario: I can navigate on Cancel Onboarding page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Cancel link
    Then I can navigate on Cancel Onboarding page

  Scenario: I can navigate on Complete Onboarding page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Complete link
    Then I can navigate on Complete Onboarding page

  Scenario: I can navigate on Update Onboarding page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Update link
    Then I can navigate on Update Onboarding page

  Scenario: I can navigate on Pause Onboarding page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Pause link
    Then I can navigate on Pause Onboarding page

  Scenario: I can navigate on Update funding date page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Update funding date link
    Then I can navigate on Update funding date page

  Scenario: I can navigate on Update funding value page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Update funding value link
    Then I can navigate on Update funding value page

  Scenario: I can navigate on attach Documents page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on attach Documents link
    Then I can navigate on attach Documents page

  Scenario: I can navigate on Add Owner page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Owner link
    Then I can navigate on Add Owner page

  Scenario: I can navigate on Link Risk Assessment to onboarding page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Link Risk Assessment to onboarding link
    Then I can navigate on Link Risk Assessment to onboarding page

  Scenario: I can navigate on Extract Task Information page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Extract Task Information link
    Then I can navigate on Extract Task Information page

  Scenario: I can navigate on Add product page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add product link
    Then I can navigate on Add product page

  Scenario: I can navigate on Attach multiple documents page from Related Actions page
    Given I click on Onboarding Menu
    And I navigate on Onboarding page
    And I click on Onboarding ID
    And I can see onboarding summary
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Attach multiple documents link
    Then I can navigate on Attach multiple documents page