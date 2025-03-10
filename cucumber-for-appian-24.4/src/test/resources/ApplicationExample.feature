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
    When I set appian URL to "https://brookfieldrenewable-test.appiancloud.com/suite/?signin=native"
    And I set appian version to "24.4"
    And I set appian locale to "en_US"




  Scenario: create new flow of fund request for distribution and test field required -Yes
    Given I login with username "FF_BRUS_Treasury_User1"
    Given I wait for progress bar
    Given I click on menu button "btn"
    Given I wait for progress bar
    When I click on button action "Create Flow of Funds"
    And I wait for "2" seconds
    And I select "Platform" dropdown value "BRUS"
    And I wait for "2" seconds
    And I select "Company" dropdown value "BAIF-Brookfield U.S. Renewable Power AIV II LLC"
    And I wait for "1" seconds
    And I enter comment "Create New Flow of Fund"
    And I wait for "1" seconds
    And I select "Flow of Funds Type" dropdown value "Distribution"
    And I wait for "1" seconds
    And I enter due date "03/07/2025"
    And I wait for "1" seconds
    And I click on radio option "Yes"
    And I wait for "1" seconds
    And I click on Distribution test required Yes
    And I wait for "1" seconds
    And I upload flow of fund pdf "C:\Users\KiranPatil\IdeaProjects\cucumber-for-appian-24.4\TestData\samplepdf.pdf"
    And I wait for "3" seconds
    And I click on button submit button

  Scenario: Treasury Director approve request
    Given I login with username "kiran.patil@yexle.com"
    Given I wait for progress bar
    Given I click on menu button "btn"
    Given I wait for progress bar
    Given I click on Treasury Director action
    Given I wait for progress bar
    When I enter comment "Treasury Director approve"
    And I click on approve button

  Scenario: Lender team task
    Given I login with username "FF_BRUS_Lender_User1"
    Given I wait for progress bar
    Given I click on menu button "btn"
    Given I wait for progress bar
    When I click on Action button
    Given I wait for progress bar
    And I upload lender relations notes pdf "C:\Users\KiranPatil\IdeaProjects\cucumber-for-appian-24.4\TestData\samplepdf.pdf"
    And I wait for "1" seconds
    When I enter Distribution Test Notes "Treasury Director approve"
    And I wait for "1" seconds
    When I enter comment "Lender team approve"
    And I wait for "1" seconds
    And I click on approve button

  Scenario:Tax team approve task
    Given I login with username "FF_BRUS_Tax_User1"
    Given I wait for progress bar
    Given I click on menu button "btn"
    Given I wait for progress bar
    When I click on Action button
    And I wait for "1" seconds
    Given I wait for progress bar
    And I wait for "1" seconds
    When I enter comment "tax team approve"
    And I wait for "1" seconds
    And I click on approve button

  Scenario: Legal Approve task
    Given I login with username "FF_BRUS_Legal_User1"
    And I wait for "1" seconds
    Given I wait for progress bar
    Given I click on menu button "btn"
    And I wait for "1" seconds
    Given I wait for progress bar
    When I click on Action button
    Given I wait for progress bar
    And I enter "BAIF" value and select entity "BAIF Renewable Power Services LLC"
    And I wait for "2" seconds
    And I select "Letter of Direction" dropdown value "Letter Of Direction 2"
    And I wait for "2" seconds
    And I select "Template" dropdown value "Template - DE LP RES Corp GP Distribution"
    And I wait for "2" seconds
    And I select "To Entity" dropdown value "BAIF – Brookfield U.S. Renewable Power AIV II LLC"
    And I wait for "2" seconds
    And I enter transaction date "02/27/2025"
    And I wait for "2" seconds
    And I enter amount "64553"
    And I wait for "2" seconds
    And I select "Member Type" dropdown value "Member"
    And I wait for "2" seconds
    And I click on "Generate Document" button