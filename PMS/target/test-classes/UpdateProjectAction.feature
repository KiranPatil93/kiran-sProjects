Feature:user able to update project Before Approval

  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/project-management-portal"
    And I set appian version to "23.2"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"
    And I login with role "Dev.DT"


  Scenario Outline: user able to update project by changing Project Manager Name from summary page
    And I wait for progress bar
    And I search for projectName using "<sheetName>" and <rowNumber>
      And I wait for "5" seconds
    And I custom click on projectID link
      And I wait for "5" seconds
    And I custom click on UpdateProject button
      And I wait for "12" seconds
    And I custom change projectManager Name "<managerName>"
      And I wait for "2" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And  I custom click on checkbox option
    And I wait for "2" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I click on button "Submit"
      And I wait for "5" seconds
      Then I click on link "Field Audit"
      And I wait for "5" seconds
      And I custom verify updates in Field Audit "<Newvalue>"
    Examples:
      | sheetName    | rowNumber | managerName | Newvalue              |
      | Project Data | 0         | Kiran       | kiran.patil@yexle.com |

 #@UpdateProject
  Scenario Outline: user able to update project by changing Project Functionalities and Technology
    And I wait for progress bar
    And I search for projectName using "<sheetName>" and <rowNumber>
    And I wait for "5" seconds
    And I custom click on projectID link
    And I wait for "5" seconds
    And I custom click on UpdateProject button
    And I wait for "6" seconds
    And I custom select project Functionality "<functionality>"
    And I wait for "2" seconds
    And I custom select project technology "<technology>"
    And I wait for "3" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And  I custom click on checkbox option
    And I wait for "2" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I click on button "Submit"
    And I wait for "5" seconds
    And I refresh
    And I wait for "5" seconds
    Then I click on link "Field Audit"
    And I wait for "5" seconds
    And I custom verify updates in Field Audit "<Newvalue>"
    Examples:
      | sheetName    | rowNumber | functionality | technology | Newvalue      |
      | Project Data | 0         | MANUAL        | SELENIUM   | Functionality |

  @UpdateProject
  Scenario Outline: user able to update project by changing Project Functionalities and Technology
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
    And I wait for "5" seconds
    And I custom click on projectID link
    And I wait for "5" seconds
    And I custom click on UpdateProject button
    And I wait for "6" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And  I custom click on checkbox option
    And I wait for "2" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I custom change demand status
    And I wait for "4" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I click on button "Submit"
    And I wait for "5" seconds
    And I refresh
    And I wait for "5" seconds
    And I click on link "Field Audit"
    And I wait for "5" seconds
    And I refresh
    And I wait for "5" seconds
    And I custom verify updates in Field Audit "<Newvalue>"

    Examples:
      | opportunity   | service           | projectName   | managerName   | features   | technology | comment | demand1         | demand2           | demandtype | shore    | location       | demandTech | role              | demandpercent | role1             | Newvalue   |
      | Testing 11 32 | Delivery Services | Testing set 1 | PMA_ PM_USER1 | AUTOMATION | SELENIUM   | testing | Lead Consultant | Senior Consultant | Investment | OffShore | Andhra Pradesh | Appian     | Junior Consultant | 100           | Junior Consultant | Initiation |

  Scenario Outline: user able to update project by adding new demand
    And I wait for progress bar
    And I search for projectName using "<sheetName>" and <rowNumber>
    And I wait for "5" seconds
    And I custom click on projectID link
    And I wait for "5" seconds
    And I custom click on UpdateProject button
    And I wait for "6" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And  I custom click on checkbox option
    And I wait for "2" seconds
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I click on link "Add New Demand"
    And I wait for "2" seconds
    And I custom select sow demand "<demand1>"
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
    And I click on button "NEXT"
    And I wait for "4" seconds
    And I click on button "Submit"
    And I wait for "5" seconds
    And I refresh
    And I wait for "5" seconds
    And I click on link "Field Audit"
    And I wait for "5" seconds
    And I refresh
    And I wait for "5" seconds
    And I custom verify updates in Field Audit "<Newvalue>"

    Examples:
      | sheetName    | rowNumber | demand1    | shore    | location       | demandTech | role              | demandpercent | Newvalue   |
      | Project Data | 0         | Investment | OffShore | Andhra Pradesh | Appian     | Junior Consultant | 100           | Initiation |