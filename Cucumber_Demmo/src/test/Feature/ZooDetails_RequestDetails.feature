Feature Request Details

  Background:
  Given User is logged in on Zoo Animal Management application
   And User is on Zoo Details page
    And clicked on Request Details section

  Scenario Outline: Employees can submit requests to Treat an injured animal
    Given User is on Request details page
    When User clicked on 'Add New Request' button
    And USer Navigate on 'Raise Service Request' page
    And click on Medical Request type
    And select Animal Name as "<animalName>"
    And enter Description as "<description>" not more than 1000 characters
    And enter Request start date "<startDate>"
    And enter Request end date "<endDate>"
    And click on Submit button
    Then Request details are shown on Request details section with ID, name, request Type, start date and end Date

Examples:
  | animalName | description | startDate | endDate |
  | Freddie    | xys         | 30/9/2022 | 3/10/2022

  Scenario Outline: Employees can submit requests to Repair a pen in the zoo.
    Given User is on Request details page
    When User clicked on 'Add New Request' button
    And USer Navigate on 'Raise Service Request' page
    And click on 'Equipment' Request Type
    And select Animal Name as "<animalName>"
    And enter Description as "<description>" not more than 1000 characters
    And enter Request start date "<startDate>"
    And enter Request end date "<endDate>"
    And click on Submit button
    Then Request details are shown on Request details section with ID, name, request Type, start date and end Date
    Examples:
      | animalName | description | startDate | endDate |
      | Freddie    | xys         | 30/9/2022 | 3/10/2022


  Scenario: Employees only see requests submitted by them
      Given User is on Request details page
      When USer search request by using request details like name
      And click on search button
      And Select Request Type 'Medical' or 'Equipment'
      Then List of request is displyed

      Scenario: Each request keeps track of the date it was submitted
        Given User is on Request details page
        When USer search request by using request details like name
        And click on search button
        And Select Request Type 'Medical' or 'Equipment'
        Then List of request is displyed with start date and End date of request

