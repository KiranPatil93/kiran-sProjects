Feature:Verify project details with and without SOW
  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/project-management-portal"
    And I set appian version to "23.2"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"

  Scenario Outline:Without SOW ->  Delivery Services(Fixed Price & Time and Materials)- Demands from SFS Side
    Given I login with role "Dev.DT"
    And I wait for progress bar
    And I click on button "New Project"
    And I wait for "4" seconds
    When I custom select opportunity "<opportunity>"
    And I wait for "2" seconds
    And I custom select service Type "<service>"
    And I wait for "2" seconds
    Then I custom verify cost model value "<costModel>" is present
    And I click on radio option "OffShore"
    And I wait for "2" seconds
    And I populate field type "text" named "Project Name" with "<projectName>"
    And I wait for "2" seconds
    And I custom select project manager "<managerName>"
    And I wait for "2" seconds
    And I custom verify start Date "<sDate>"
    And I custom verify End Date "<eDate>"
    And I custom select project features "<features>"
    And I wait for "2" seconds
    And I custom select technology "<technology>"
    And I wait for "2" seconds
    #And I populate field type "paragraph" named "Additonal Comments" with "<comment>"
    And I wait for "2" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I custom verify SOW
    And I wait for "2" seconds
    And I click on button "NEXT"
    And I custom verify demand creation


    Examples:
      | opportunity | service           | costModel   | projectName                          | managerName | sDate      | eDate      | features       | technology | comment                        |
      | Test        | Delivery Services | FIXED PRICE | Testing SOW through Automation set 3 | Ashwini     | 05/01/2024 | 07/01/2028 | Data Migration | Appian     | Testing SOW through Automation |