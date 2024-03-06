Feature:Login
  @SmokeTest
  Scenario: 1. Cannot access home page unless the correct username and password are entered
    Given I am on the login screen
    And I enter Username
    And I enter the wrong password
    When I press Log in
    Then I should see an error message telling me the login attempt was invalid


  @SmokeTest
  Scenario: 2. Login successfully
    Given I am on the login screen
    And I enter Username
    And I enter the correct password
    When I press Log in
    Then I should see the HomePage

