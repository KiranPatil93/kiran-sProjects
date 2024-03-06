Feature: Allocated Employee
  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/project-management-portal"
    And I set appian version to "23.2"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"
  #  Then I login with username "kiran.patil@yexle.com"


  Scenario Outline: Allocate Employee
    Given I login with role "Dev.DT"
    And I wait for progress bar
    When I click on button "Project Allocation"
    And I custom select opportunity "<opportunity>"
    And I wait for "2" seconds
    And I custom select project Name "<projectName>"
    And I wait for "3" seconds
    And I click on record grid navigation "<DemandId>"
    And I search for "<employeeName>"
    And I wait for "3" seconds
    And I custom click on employee checkbox
    And I wait for "3" seconds
    And I populate grid "[19]" column "[10]" row "[1]" with value "<allocValue>"
    And I wait for "1" seconds
    And I populate grid "[19]" column "[11]" row "[1]" with value "<fromDate>"
    And I wait for "1" seconds
    And I populate grid "[19]" column "[12]" row "[1]" with value "<toDate>"
    And I wait for "3" seconds
    And I click on button "SUBMIT"


    Examples:
      | opportunity | projectName   | DemandId     | employeeName | allocValue | fromDate | toDate |
      | Test 11 24  | Testing set 3 | DM0000001480 | Ajay Goud    | 100        |          |        |




