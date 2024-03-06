Feature: L1 and L2 can Approve/Reject/ Need more Info of project Request
  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/project-management-portal"
    And I set appian version to "23.2"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"
   # Then I login with username "kiran.patil@yexle.com"
 #   Then

@NeedMoreInfo
    Scenario Outline: L1 can ask for need more Info
      Given I login with role "Dev.L1"
      And I wait for progress bar
   #   When I custom click on menu Tasks
#      And I wait for "9" seconds
#      And I search for projectId using "<sheetName>" and <rowNumber>
#      And I wait for "5" seconds
#      And I custom click on title link
#       And I wait for "5" seconds
#      And I populate field type "paragraph" named "Comment" with "<comment>"
#      Then I click on button "Need More Info"
#     And I wait for "5" seconds
#  And I custom click on menu home
#  And I wait for "5" seconds
    And  And I custom verify stage of the project as "Pipeline" and approval status "Need More Info"

      Examples:
        | sheetName    | rowNumber | comment        | status |
        | Project Data | 0         | Need more Info | Need More Info  |

  @NeedMoreInfo
  Scenario Outline: PM submit Need more Info task
    Given I login with role "Dev.PM"
    And I wait for progress bar
    When I custom click on menu Tasks
    And I wait for "4" seconds
    And I search for projectId using "<sheetName>" and <rowNumber>
    And I wait for "2" seconds
    And I custom click on title link
    And I wait for "5" seconds
    And I populate field type "paragraph" named "Comment[2]" with "<comment>"
    Then I click on button "SUBMIT"
    Examples:
      | sheetName    | rowNumber | comment               |
      | Project Data | 0         | Submit Need more Info |
  @NeedMoreInfo
    Scenario Outline: L1 can Approve need more Info task
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
@RejectFlow
  Scenario Outline: L1 can Reject need more Info task
    Given I login with role "Dev.DT"
  Given I wait for progress bar
  And I click on button "New Project"
  And I wait for "4" seconds
  And I custom select opportunity "<opportunity>"
  And I wait for "2" seconds
  And I custom select service Type "<service>"
  And I click on radio option "OffShore"
  And I populate field type "text" named "Project Name" with "<projectName>"
  And I custom select project manager "<managerName>"
  And I custom select project features "<features>"
  And I custom select technology "<technology>"
  And I populate field type "paragraph" named "Additonal Comments" with "<comment>"
  And I click on button "NEXT"
  And I wait for "4" seconds
  And  I custom click on checkbox option
  And I wait for "2" seconds
  And I click on button "NEXT"
  And I wait for "4" seconds
  And I click on link "Add New Demand"
  And I wait for "2" seconds
  And I custom select demandType "<demandtype>"
  And I wait for "2" seconds
  And I custom select onshore_Offshore "<shore>"
  And I custom select location "<location>"
  And I custom select technology for demand "<demandTech>"
  And I custom select role "<role>"
  And I wait for "2" seconds
  And I custom enter demand percentage "<demandpercent>"
  And I wait for "2" seconds
  And I click on link "Add New Demand"
  And I wait for "2" seconds
  And I custom select demandType for row 2 "<demandtype1>"
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
  And I click on link "Add New Demand"
  And I custom select demandType for row 3 "<demandtype1>"
  And I wait for "2" seconds
  And I custom select onshore_Offshore for row 3 "<shore>"
  And I wait for "2" seconds
  And I custom select location for row 3 "<location>"
  And I wait for "2" seconds
  And I custom select technology for demand for row 3 "<demandTech>"
  And I wait for "2" seconds
  And I custom select role for row 3 "<role1>"
  And I wait for "2" seconds
  And I custom enter demand percentage for row 3 "<demandpercent>"
  And I wait for "2" seconds
  And I click on button "NEXT"
  And I wait for "4" seconds
  And I click on button "SUBMIT"
  And I wait for "7" seconds
  And I click on button "CLOSE"
  And I wait for "4" seconds
  Then I store project name and project Id in excel file
    And I logout
    And I wait for "5" seconds
    And I login with role "Dev.L1"
    And I wait for progress bar
    When I custom click on menu Tasks
    And I wait for "4" seconds
    And I search for projectId using "<sheetName>" and <rowNumber>
    And I wait for "2" seconds
    And I custom click on title link
    And I wait for "5" seconds
    And I populate field type "paragraph" named "Comment" with "<comment>"
    Then I click on button "Reject"
    And I custom verify stage "<stage>" and status "<status>" of the project
    Examples:
      | opportunity | service           | projectName         | managerName | features   | technology | comment | demandtype | sheetName    | shore    | location       | demandTech | role              | demandpercent | rowNumber | comment  | stage    | status   |
      | Test 10 54  | Delivery Services | testingByAutomation | Ashwini     | AUTOMATION | Appian     | testing | Investment | Project Data | OffShore | Andhra Pradesh | Appian     | Junior Consultant | 100 %         | 0         | Rejected | Pipeline | Rejected |

  @NeedMoreInfo
  Scenario Outline: L2 can Approve need more Info task
    Given I login with role "Dev.L2"
    And I wait for progress bar
    When I custom click on menu Tasks
    And I wait for "8" seconds
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

