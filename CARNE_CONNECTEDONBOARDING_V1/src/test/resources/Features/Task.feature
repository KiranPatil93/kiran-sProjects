Feature:Task
  Background: Login successfully
    Given I am on the login screen
    And I enter Username
    And I enter the correct password
    When I press Log in
    Then I should see the HomePage

  Scenario Outline:I can Mark Task Not Needed
    Given I am on Task page
    When I click on Task Checkbox
    And I click on Mark not needed button
    And I select a reason "<reason>"
    And I enter other reason "<otherReason>"
    Then I click on submit button
    Examples:
      | reason | otherReason |
      | Other  | testing     |


  Scenario:I can Claim Task
    Given I am on Task page
    When I click on Task Checkbox
    And I click on Claim Task button button
    Then I should see name in Assignee field

  Scenario Outline:I can Change Due Date of Task
    Given I am on Task page
    When I click on Task Checkbox
    And I click on Change due Date button
    And I enter Due Date "<dueDate>"
    And I select Reason for change "<reason>"
    Then I click on submit button
    And I should see Due date updated on home page
    Examples:
      | dueDate    | reason |
      | 05/25/2023 | Other  |

    Scenario Outline:I can Reassign Task
      Given I am on Task page
      When I click on Task Checkbox
      And I click on Reassign button
      And I enter Assignee name "<assigneeName>"
      Then I click on Submit button
      And I should see Assignee name updated on Home page
      Examples:
        | assigneeName |
        | Kiran Patil  |

      Scenario:I can navigate on Show Tagged Task
        Given I am on Task page
        When I click on Show Tagged Task button
        Then I should see Tagged Task page

  Scenario:I can navigate on RDC Alert
    Given I am on Task page
    When I click on RDC Alert button
    Then I should see RDC Alert page

    Scenario Outline: I can create new Onboarding from home page
      Given I am on home page
      When I click on New Onboarding button
      And I enter Fund Name "<fundName>"
      And I click on Next button
      And I enter Estimated Onboarding Completion Date "<complettionDate>"
      And I click on Next button
      And I click on Next button
      And I click on Submit button
      And I click on Go to process setup button
      And I click on update Funding value link
      And I enter actual funding value "<fundingValue>"
      And I select currency "<currency>"
      And I click on Update Funding value button
      Then I click on submit button
      Examples:
        | complettionDate | fundingValue | currency |
        | 3/6/2023        | 235456457    | GBP      |
