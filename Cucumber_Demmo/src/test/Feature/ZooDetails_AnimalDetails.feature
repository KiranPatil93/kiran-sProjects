Feature: Animals Details


  Scenario Outline: Employees add animals to the zoo successfully
    Given User has been login on application
    And User is on Zoo Details and Animal Details page
    When User click on 'Add Animal Details' button
    And User on Add animal Details page
    And User enters the following details:
    Examples:

      | AnimalName | SpecieType | PenName | AnimalAge | AnimalCharacterstics      | Gender |
      | abs        | pandas     | WDE     | 7         | Panda is sleepy in nature | Male   |
    And Upload Animal Photo
    And click on Submit button
    Then Message Displayed - 'Animals Add in zoo Successfully'
    And User is on 'Animals Detail' page

  Scenario Outline: Employees add Pen to the zoo successfully
    Given User has been login on application
    And User is on Zoo Details
    When User click on 'Pen Details' Section
    Then User navigate on 'Pen Details' page
    When User click on 'Add Pen Details' button
    Then User Navigate on 'ZOO' Window
    And User enters the following details:
    Examples:

      | Pen Name | Pen Type |
      | abs      | Steel    |
    And Upload Pen Photo
    And click on Submit button
    Then Message Displayed - 'Pen Add in zoo Successfully'
    And User is on 'Pen Details' page

  Scenario: Employees cancel to add animals to the zoo using cancel button
    Given User has been login on application
    And User is on Zoo Details and Animal Details page
    When User click on 'Add Animal Details' button
    And User on Add animal Details page
    And click on 'Cancel' button
    Then USer navigate on Animal Details Section without adding Animal

  Scenario: Employees cancel to add Pen to the zoo using cancel button
    Given User has been login on application
    And User is on Zoo Details
    When User click on 'Pen Details' Section
    Then User navigate on 'Pen Details' page
    When User click on 'Add Pen Details' button
    Then User Navigate on 'ZOO' Window
    And click on 'Cancel' button
    Then USer navigate on Pen Details Section without adding Pen

Background:
  Given User has been logged in on application
  And User is on Zoo Details page
  And User has been Added Animal and pens to Zoo

Scenario Outline: Employees can view records for both animals and pens using filter 'Specie Type' and 'GENDER'
  Given User is on Animal Details page
  When User selects appropriate 'Specie Type'
  And  User select appropriate Gender of animal
  Then List of Animals with suitable Specie Type and Gender is displayed
  Examples:
  SpecieType|gender
  Lion      | Male

  Scenario Outline: Employees can view records by using filter 'PEN NAME'
    Given User is on Animal Details page
    When User select 'Pen Name' from dropdown
    Then List of Animals with pen name, Special name,age ,Charecterstics and isActive is displayed
Examples:
    penName
    Hex Steel
  Scenario Outline: Employees can view records by using filter name and ID.
    Given User is on Animal Details page
    When user enter animal's name or ID in animal search box
    And Click on 'Search' button
    Then Animal with pen name, Special name,age ,Charecterstics and isActive is displayed
Examples:
    name|ID
    abc|2










