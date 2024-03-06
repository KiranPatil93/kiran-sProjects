Feature: User able to cancel project Request

  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/project-management-portal"
    And I set appian version to "23.2"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"
    And I login with role "Dev.DT"
  @CancelProject
    Scenario Outline: User able to create project request
      Given I wait for progress bar
      And I click on button "New Project"
      And I wait for "4" seconds
      And I custom select opportunity "<opportunity>"
      And I wait for "2" seconds
      And I custom select service Type "<service>"
      And I wait for "2" seconds
      And I click on radio option "OnShore"
      And I wait for "2" seconds
      And I populate field type "text" named "Project Name" with "<projectName>"
      And I wait for "2" seconds
      And I custom select project manager "<managerName>"
      And I wait for "2" seconds
      And I custom select project features "<features>"
      And I wait for "2" seconds
      And I custom select technology "<technology>"
      And I wait for "2" seconds
      And I populate field type "paragraph" named "Additonal Comments" with "<comment>"
      And I wait for "2" seconds
      And I click on button "NEXT"
      And I wait for "4" seconds
      And  I custom click on checkbox option
      And I wait for "2" seconds
      And I click on button "NEXT"
      And I wait for "4" seconds
      And I custom select sow demand "<demand1>"
      And I wait for "2" seconds
      And I custom select sow demand "<demand2>"
      And I wait for "2" seconds
      And I click on button "+ ADD Demand"
      And I wait for "2" seconds
      And I custom select onshore_Offshore "<shore>"
      And I wait for "2" seconds
      And I custom select location "<location>"
      And I wait for "2" seconds
      And I custom select technology for demand "<demandTech>"
      And I wait for "3" seconds
      And I custom select role "<role>"
      And I wait for "2" seconds
      And I custom enter demand percentage "<demandpercent>"
      And I wait for "2" seconds
      And I click on button "NEXT"
      And I wait for "4" seconds
      And I click on button "Submit"
      And I wait for "4" seconds
      And I click on button "CLOSE"
      And I wait for "4" seconds
      Then I store project name and project Id in excel file
      And I wait for "4" seconds
      And I custom verify stage of the project as "Pipeline" and approval status "Initiated"
      Examples:
        | opportunity   | service           | projectName                 | managerName   | features   | technology | comment | demand1         | demand2           | demandtype | shore    | location       | demandTech | role              | demandpercent | role1             |
        | Testing 11 32 | Delivery Services | Testing cancel project flow | PMA_ PM_USER1 | AUTOMATION | SELENIUM   | testing | Lead Consultant | Senior Consultant | Investment | OffShore | Andhra Pradesh | Appian     | Junior Consultant | 100           | Junior Consultant |

  @CancelProject
      Scenario Outline: user able to cancel project
        And I wait for progress bar
        And I search for projectName using "<sheetName>" and <rowNumber>
        And I wait for "5" seconds
       And I custom click on Action button
     And I wait for "2" seconds
    And I custom click on cancel project button
    And I wait for "12" seconds
    And I custom click on agree checkbox
    And I wait for "3" seconds
    Then I click on button "Yes"
    And I wait for progress bar
    And I custom verify stage "<stage>" and status "<status>" of the project
        Examples:
          | sheetName    | rowNumber | status   | stage    |
          | Project Data | 0         | Rejected | Upcoming |