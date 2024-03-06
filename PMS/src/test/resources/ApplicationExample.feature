@Application
Feature: Sample feature file that interacts with an Appian application

  Configuring your site with the sample application:
  1. Import the applicable version of Automated Testing - XX.X.zip application, provided in the Shared Components page, into your Appian environment
  2. Log into Appian Designer view on your Appian environment and import the downloaded application zip
  3. After import is complete, click on the Automated Testing application
  4. Find and click on the AUT DS object to open the Appian Data Store Designer
  5. Verify the entity mappings under Schema Management and then Save & Publish the data store

  Prerequisites for running the test on the configured site above:
  1. Run the appropriate setupCustomPropertiesFor... script
  2. Replace BROWSER with either FIREFOX or CHROME
  3. Replace APPIAN_URL with your Appian site URL, beginning with https:// and including /suite at the end (e.g. https://forum.appian.com/suite)
  4. Replace APPIAN_VERSION with a supported Appian Version in xx.x format
  5. Replace APPIAN_LOCALE with either "en_US" or "en_GB"
  5. Replace APPIAN_USERNAME with a valid username for Appian URL above
  6. Open src/main/resources/configs/users.properties and add a line for the above username that is of the form username=password (e.g. test.user=password)

  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/project-management-portal"
    And I set appian version to "23.2.1"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"
  #  Then I login with username "kiran.patil@yexle.com"
    Then I login with role "Dev.DT"



  Scenario: user able click on New Project button
    Given I wait for progress bar
    And I click on button "New Project"
   #And I tear down

@createProject
    Scenario Outline: user able to create project request for Test 10 54
      Given I wait for progress bar
      And I click on button "New Project"
      And I wait for "4" seconds
      And I custom select opportunity "<opportunity>"
       And I wait for "2" seconds
      And I custom select service Type "<service>"
  And I wait for "2" seconds
   And I click on radio option "OffShore"
  And I wait for "2" seconds
  And I populate field type "text" named "Project Name" with "<projectName>"
  And I wait for "2" seconds
  And I custom select project manager "<managerName>"
  And I wait for "2" seconds
  And I custom select project features "<features>"
  And I wait for "2" seconds
  And I custom select technology "<technology>"
  And I wait for "2" seconds
  #And I populate field type "paragraph" named "Additonal Comments" with "<comment>"
  And I wait for "2" seconds
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
  And I custom select billability "<billablity>"
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
      Examples:
        | opportunity | service           | projectName           | managerName | features         | technology | comment | demandtype | billablity | shore    | location       | demandTech | role              | demandpercent | demandtype1 | role1           |
        | Test 10 54  | Delivery Services | Testing set -2 Dec 20 | Ashwini     | Automation - RPA | Appian     | testing | Investment | Shadow     | OffShore | Andhra Pradesh | Appian     | Junior Consultant | 100           | New         | Lead Consultant |

  @createProject
  Scenario Outline: user able to create project request for Testing 11 32
    Given I wait for progress bar
    And I click on button "New Project"
    And I wait for "4" seconds
    And I custom select opportunity "<opportunity>"
    And I wait for "2" seconds
    And I custom select service Type "<service>"
    And I wait for "2" seconds
   # And I click on radio option "OnShore"
   # And I wait for "2" seconds
    And I custom select delivery location "<location>"
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
      | opportunity   | service           | projectName   | managerName   | features   | technology | comment | demand1         | demand2           | demandtype | shore    | location       | demandTech | role              | demandpercent | role1             | location |
      | Testing 11 32 | Delivery Services | Testing set 1 | PMA_ PM_USER1 | AUTOMATION | SELENIUM   | testing | Lead Consultant | Senior Consultant | Investment | OffShore | Andhra Pradesh | Appian     | Junior Consultant | 100           | Junior Consultant | Yexle-India |










