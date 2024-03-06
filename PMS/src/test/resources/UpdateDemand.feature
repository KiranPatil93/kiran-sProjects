Feature: Update Demand
  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/project-management-portal"
    And I set appian version to "23.2"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"
  #  Then I login with username "kiran.patil@yexle.com"


  Scenario Outline: user able to create project request for Testing 11 32
    Given I login with role "Dev.PM"
    And I wait for progress bar
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
    And I wait for "2" seconds
    And I custom select role "<role>"
    And I wait for "2" seconds
    And I custom enter demand percentage "<demandpercent>"
    And I wait for "2" seconds
    And I click on link "Add New Demand"
    And I wait for "2" seconds
    And I custom select demandType for row 2 "<demandtype>"
    And I wait for "2" seconds
    And I custom select onshore_Offshore for row 2 "<shore>"
    And I wait for "2" seconds
    And I custom select location for row 2 "<location>"
    And I wait for "2" seconds
    And I custom select technology for demand for row 2 "<demandTech>"
    And I wait for "2" seconds
    And I custom select role for row 2 "<role1>"
    And I wait for "2" seconds
    And I custom enter demand percentage for row 2 "<demandpercent>"
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
      | opportunity   | service           | projectName   | managerName   | features   | technology | comment | demand1         | demand2           | demandtype | shore    | location       | demandTech | role              | demandpercent | role1             |
      | Testing 11 32 | Delivery Services | Testing set 1 | PMA_ PM_USER1 | AUTOMATION | SELENIUM   | testing | Lead Consultant | Senior Consultant | Investment | OffShore | Andhra Pradesh | Appian     | Junior Consultant | 100           | Junior Consultant |

  Scenario Outline: L1 can Approve task
    Given I login with role "Dev.L1"
    And I wait for progress bar
    When I custom click on menu Tasks
    And I wait for "7" seconds
    And I search for projectId using "<sheetName>" and <rowNumber>
    And I wait for "2" seconds
    And I custom click on title link
    And I wait for "5" seconds
    And I populate field type "paragraph" named "Comment" with "<comment>"
    Then I click on button "Approve"
    And I wait for "5" seconds
    And I custom verify status of the project "<status>"
    Examples:
      | sheetName    | rowNumber | comment        | status           |
      | Project Data | 0         | Need more Info | Pending Approval|

  Scenario Outline: L2 approve request
    Given I login with role "Dev.L2"
    And I wait for progress bar
    When I custom click on menu Tasks
    And I wait for "4" seconds
    And I search for projectId using "<sheetName>" and <rowNumber>
    And I wait for "2" seconds
    And I custom click on title link
    And I wait for "5" seconds
    And I populate field type "paragraph" named "Comment" with "<comment>"
    Then I click on button "Approve"
    And I logout
    And I login with role "Dev.PM"
    And I wait for progress bar
    And I search for projectName using "<sheetName>" and <rowNumber>
    And I wait for "5" seconds
    And I custom verify stage "<stage>" and status "<status>" of the project

    Examples:
      | sheetName    | rowNumber | comment | status   | stage    |
      | Project Data | 0         | Approve | Approved | Upcoming |

  Scenario Outline: user able to update demand status pending Initiation to open
    Given I login with role "Dev.DT"
    Given I wait for progress bar
    And I search for projectName using "<sheetName>" and <rowNumber>
    And I wait for "5" seconds
    And I custom click on projectID link
    And I wait for "5" seconds
    And I click on link "Demand Details"
    And I wait for "5" seconds
    And I click on button "Update Demand"
    And I wait for "5" seconds
    And I custom change demand status "<demandstatus>"
    And I wait for "5" seconds
    And I populate field type "paragraph" named "Comment" with "<comment>"
    And I wait for "5" seconds
    And I click on button "SUBMIT"

Examples:
  | sheetName    | rowNumber | demandstatus | comment              |
  | Project Data | 0         | Open         | submit update demand |




