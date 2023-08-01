Feature:Login
  @SmokeTest
  Scenario Outline: 1. Cannot access home page unless the correct username and password are entered
    Given I am on the login screen
    And I enter wrong Username "<wrongUsername>"
    And I enter the wrong password "<wrongPassword>"
    When I press Log in
    Then I should see an error message telling me the login attempt was invalid
    Examples:
      | wrongUsername   | wrongPassword |
      | kiran@yexle.com | 12345         |


  @SmokeTest
  Scenario: 2. Login successfully
    Given I am on the login screen
    And I enter Username
    And I enter the correct password
    When I press Log in
    Then I should see the HomePage

    @SmokeTest
    Scenario: Logout Successfully
      Given I am on the login screen
      And I enter Username
      And I enter the correct password
      And I press Log in
      And I should see the HomePage
      When I click on user Profile
      And I click on SignOut button
      Then I should see Login page

