Feature:Task
  Background: Login successfully
    Given I am on the login screen
    And I enter Username
    And I enter the correct password
    When I press Log in
    Then I should see the HomePage

  Scenario:I can navigate on Change Due Date Task
    Given I am on Task page
    When I click on Task Checkbox
    And I click on Change due Date button
    And I navigate on Change Due Date Task


  Scenario:I can navigate on Reassign Task
      Given I am on Task page
      When I click on Task Checkbox
      And I click on Reassign button
      Then navigate on Reassign Task

      Scenario:I can navigate on Show Tagged Task
        Given I am on Task page
        When I click on Show Tagged Task button
        Then I should see Tagged Task page




