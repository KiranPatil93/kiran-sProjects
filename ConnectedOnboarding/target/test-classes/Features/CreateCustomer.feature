Feature:Add New Customer
  Background: Login successfully
    Given I am on the login screen
    And I enter Username
    And I enter the correct password
    When I press Log in
    Then I should see the HomePage

  @SmokeTest
  Scenario:1.I can see Add new Customer page
    Given I click on Customer Menu
    When I click on New Customer button
    Then I should see Add New Customer page

    @SmokeTest
    Scenario Outline:2. I can select customer Type Client from Type dropdown
      Given I click on Customer Menu
      And I click on New Customer button
      When I select customer Type from Type dropdown "<option>"
      Examples:
        | option |
        | Client |
  @SmokeTest
Scenario Outline: 3. I can Look up for client
  Given I click on Customer Menu
  And I click on New Customer button
    When I select customer Type from Type dropdown "<option>"
     And I enter name "<name>"
    And I click on Look Up Client button
    Then I should see client details "<clientDetails>"
  Examples:
    | option | name                    | clientDetails  |
    | Client | Astarte Capital Partners | Client Details |

  @SmokeTest
  Scenario Outline: 3. I can Look up for New client
    Given I click on Customer Menu
    And I click on New Customer button
    When I select customer Type from Type dropdown "<option>"
    And I click on radio button for Oversight of Customer Payroll "<payroll>"
    And I enter LEI code
    And I enter name "<name>"
    And I click on Look Up Client button
    Then I should see warning message "<message>"
    Examples:
      | option | name | payroll | message                                   |
      | Client | xyz  | Yes     | No client match found. Check entered name |


  @SmokeTest
  Scenario Outline: I can fill Customer Info
  Given I click on Customer Menu
  And I click on New Customer button
  When I select customer Type from Type dropdown "<option>"
  And I click on radio button for Oversight of Customer Payroll "<payroll>"
  And I enter LEI code
  And I enter name "<name>"
  And I click on Look Up Client button
  And I should see client details "<clientDetails>"
  Then I click on Next button
  Examples:
    | option | payroll | name                    | clientDetails  |
    | Client | Yes     | Astarte Capital Partners | Client Details |

  @SmokeTest
  Scenario Outline: I can navigate on Address and contacts page
  Given I click on Customer Menu
  And I click on New Customer button
  When I select customer Type from Type dropdown "<option>"
  And I click on radio button for Oversight of Customer Payroll "<payroll>"
  And I enter LEI code
  And I enter name "<name>"
  And I click on Look Up Client button
  And I should see client details "<clientDetails>"
  And I click on Next button
  Then I click on Next button
  Examples:
    | option | payroll | name                    | clientDetails  |
    | Client | Yes     | Astarte Capital Partners | Client Details |

  @SmokeTest
  Scenario Outline: I can navigate on Review page
    Given I click on Customer Menu
    And I click on New Customer button
    When I select customer Type from Type dropdown "<option>"
    And I click on radio button for Oversight of Customer Payroll "<payroll>"
    And I enter LEI code
    And I enter name "<name>"
    And I click on Next button
    And I click on Next button
    Then I click on Next button
    Examples:
      | option | payroll | name                    | clientDetails  |
      | Client | Yes     | Astarte Capital Partners | Client Details |

  @SmokeTest
  Scenario Outline: I can create new customer
        Given I click on Customer Menu
        And I click on New Customer button
        When I select customer Type from Type dropdown "<option>"
        And I click on radio button for Oversight of Customer Payroll "<payroll>"
        And I enter LEI code
        And I enter name "<name>"
        And I click on Next button
        And I click on Next button
        And I click on Next button
        Then I click on submit button
        Examples:
          | option | payroll | name                    | clientDetails  |
          | Client | Yes     | Astarte Capital Partners | Client Details |


