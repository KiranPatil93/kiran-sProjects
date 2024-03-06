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
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/ess-portal/page/employee-dashboard"
    And I set appian version to "23.2"
    And I set appian locale to "en_US"
    And I custome zoom in page
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\cucumber-for-appian-23.2.1\Screenshots"
    And I set take error screenshots to "true"
    Then I login with username "kiran.patil@yexle.com"


  Scenario: user able click on Document link from landing page
    Given I wait for progress bar
    And I click on link "Documents"
    And I tear down

    Scenario: user able to see Role Matrix tab
      Given I wait for progress bar
      And I click on link "Documents"
      And I wait for "2" seconds
      When I click on menu "ROLE MATRIX"

      @Upload
      Scenario Outline: user able to upload Recruitment/employment document
        Given I wait for progress bar
        And I click on link "Documents"
        And I wait for "5" seconds
        When I custom click on button upload document
        And I wait for "5" seconds
        And I custom select doc type "<doc>"
        And I wait for "2" seconds
        And I custome select year "<year>"
        And I wait for "1" seconds
        And I custome select month "<month>"
        And I wait for "2" seconds
        And I custome upload document "<upload>"
        And I wait for "3" seconds
     #   And I custom enter comment "<comment>"
        #And I wait for "10" seconds
        And I click on button "Save"
        And I wait for "5" seconds
        And I custom click on file name
        And I wait for "2" seconds
        And I verify link "<doc>" is present
        And I take screenshot "<doc>"

        Examples:
          | doc                                                       | year | month  | upload                                                                             | comment |
          | Offer – Initial, hikes, location changes, relocation etc. | 2023 | August | C:/Users/KiranPatil/IdeaProjects/cucumber-for-appian-23.2.1/TestData/samplepdf.pdf | test    |














