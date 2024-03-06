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
  When I click on Type dropdown
  And I can select option from Type dropdown "<option>"
  And I enter client name in Name field "<clientName>"
    And I click on Look Up Client button
    Then I should see client details "<clientDetails>"
  Examples:
    | option | clientName              | clientDetails |
    | Client | bamboo capital partners | Client Details |

  @SmokeTest
  Scenario Outline: 3. I can Look up for New client
    Given I click on Customer Menu
    And I click on New Customer button
    When I click on Type dropdown
    And I can select option from Type dropdown "<option>"
    And I enter client name in Name field "<clientName>"
    And I click on Look Up Client button
    Then I should see warning message "<message>"
    Examples:
      | option | clientName | message                                   |
      | Client | xyz        | No client match found. Check entered name |


@SmokeTest
Scenario Outline: I can fill Customer Info
  Given I click on Customer Menu
  And I click on New Customer button
  When I click on Type dropdown
  And I can select option from Type dropdown "<option>"
  And I click on radio button for Oversight of Customer Payroll "<payroll>"
  And I enter LEI code "<LEI>"
  And I enter client name in Name field "<clientName>"
  And I click on Look Up Client button
  And I should see client details "<clientDetails>"
  Then I click on Next button
  Examples:
    | option | payroll | LEI                  | clientName              | clientDetails  |
    | Client | Yes     | kkkkkkkkkk1234567890 | bamboo capital partners | Client Details |

@SmokeTest
Scenario Outline: I can navigate on Address and contacts page
  Given I click on Customer Menu
  And I click on New Customer button
  When I click on Type dropdown
  And I can select option from Type dropdown "<option>"
  And I click on radio button for Oversight of Customer Payroll "<payroll>"
  And I enter LEI code "<LEI>"
  And I enter client name in Name field "<clientName>"
  And I click on Look Up Client button
  And I should see client details "<clientDetails>"
  And I click on Next button
  Then I click on Next button
  Examples:
    | option | payroll | LEI                  | clientName              | clientDetails  |
    | Client | Yes     | kkkkkkkkkk1234567890 | bamboo capital partners | Client Details |

  @SmokeTest
  Scenario Outline: I can create customer contact - Client
    Given I click on Customer Menu
    And I click on New Customer button
    And I click on Type dropdown
    And I can select option from Type dropdown "<option>"
    And I click on radio button for Oversight of Customer Payroll "<payroll>"
    And I enter LEI code "<LEI>"
    And I enter client name in Name field "<clientName>"
    And I click on Look Up Client button
    And I should see client details "<clientDetails>"
    And I click on Next button
    And I click on Next button
    When I click on Add Contacts button
    And I enter FirstName "<firstName>"
    And I enter LastName "<lastName>"
    And I select Title from Title dropdown "<title>"
    And I enter email "<email>"
    And I select country from Country of residence "<country>"
    And I select Date of Birth "<date>"
    Then I click on Add Contact button

    Examples:
      | option | payroll | LEI                  | clientName              | clientDetails  | firstName | lastName | title | email       | country | date      |
      | Client | Yes     | kkkkkkkkkk1234567890 | bamboo capital partners | Client Details | Kiran     | Patil    | Mrs   | xyz@abc.com | India   | 26/4/2023 |

  @SmokeTest
  Scenario Outline: I can navigate on Review page
    Given I click on Customer Menu
    And I click on New Customer button
    When I click on Type dropdown
    And I can select option from Type dropdown "<option>"
    And I click on radio button for Oversight of Customer Payroll "<payroll>"
    And I enter LEI code "<LEI>"
    And I enter client name in Name field "<clientName>"
    And I click on Look Up Client button
    And I should see client details "<clientDetails>"
    And I click on Next button
    And I click on Next button
    Then I click on Next button
    Examples:
      | option | payroll | LEI                  | clientName              | clientDetails  |
      | Client | Yes     | kkkkkkkkkk1234567890 | bamboo capital partners | Client Details |

      @SmokeTest
      Scenario Outline: I can create new customer
        Given I click on Customer Menu
        And I click on New Customer button
        When I click on Type dropdown
        And I can select option from Type dropdown "<option>"
        And I click on radio button for Oversight of Customer Payroll "<payroll>"
        And I enter LEI code "<LEI>"
        And I enter client name in Name field "<clientName>"
        And I click on Look Up Client button
        And I should see client details "<clientDetails>"
        And I click on Next button
        And I click on Next button
        And I click on Next button
        Then I click on submit button
        Examples:
          | option | payroll | LEI                  | clientName              | clientDetails  |
          | Client | Yes     | kkkkkkkkkk1234567890 | bamboo capital partners | Client Details |

 @SmokeTest
    Scenario Outline: I can create new customer - Fund
   Given I click on Customer Menu
   And I click on New Customer button
   When I click on Type dropdown
   And I can select option from Type dropdown "<option>"
   And I click on radio button for Oversight of Customer Payroll "<payroll>"
   And I enter LEI code "<LEI>"
   And I enter name "<name>"
   And I select domicile "<domicile>"
   And I select country "<country>"
   And I select Incorporation date "<IncorporationDate>"
   And I select Financial Year enter details "<FinancialDetails>"
   And I enter other fund Information "<fundInfo>"
   And I click on Next button
   And I click on Next button
   And I click on Next button
   Then I click on Submit button
   Examples:
     | option | payroll | LEI                  | name    | domicile | country | IncorporationDate | FinancialDetails | fundInfo |
     | Fund   | No      | kkkkkkkkkk1234567890 | testing | Spain    | EUR     | 5/1/2023          | 30/3/2024        | TEST     |

  @SmokeTest
  Scenario Outline: I can create new customer - Sub-Fund
    Given I click on Customer Menu
    And I click on New Customer button
    When I click on Type dropdown
    And I can select option from Type dropdown "<option>"
    And I click on radio button for Oversight of Customer Payroll "<payroll>"
    And I enter LEI code "<LEI>"
    And I enter name "<name>"
    And I select domicile "<domicile>"
    And I select country "<country>"
    And I select Incorporation date "<IncorporationDate>"
    And I select Financial Year enter details "<FinancialDetails>"
    And I enter other fund Information "<fundInfo>"
    And I click on Next button
    And I click on Next button
    And I click on Next button
    Then I click on Submit button
    Examples:
      | option   | payroll | LEI                  | name    | domicile | country | IncorporationDate | FinancialDetails | fundInfo |
      | Sub-Fund | No      | kkkkkkkkkk1234567890 | testing | Spain    | EUR     | 5/1/2023          | 30/3/2024        | TEST     |