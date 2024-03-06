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
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/expense-management"
    And I set appian version to "22.4"
    And I set appian locale to "en_US"
    Then I login with username "kiran123"

  Scenario: Fill out Automated Testing Data Input form
    Given I click on menu "Exporter"
    And I wait for progress bar
    Given I click on button "Add New Buyer"
    Given I custome click on action "Individual"
    Given I click on button "Next"
    When I populate field "First Name" with "abc"
    When I populate field "Middle Name" with "xyz"
    When I populate field "Last Name" with "ytv"
    When I populate field "Address Line 1" with "test"
    When I populate field "City" with "Pune"
    When I populate field "State" with "Maharashtra"
    When I populate field "Country" with "India"
    When I populate field "Pin Code" with "414001"
    When I click on button "Next"
    And I wait for progress bar
    When I click on link "Add Details"
    When I enter Input in grid at column "[1]" with "abc"
    When I enter Input in grid at column "[2]" with "abc"
    When I enter Input in grid at column "[3]" with "abc"
    When I enter Input in grid at column "[4]" with "abc"
    When I enter Input in grid at column "[5]" with "abc"
    When I enter Input in grid at textarea column "[1]" with "test"
    When I enter Input in grid at textarea column "[2]" with "test"
    When I click on button "Next"
    And I wait for progress bar
    When I click on link "ADD DOCUMENT"
    When I enter Input in grid at column "[1]" with "abc"
    When I click on button "Next"
    And I wait for progress bar
    When I populate field "Account Holder Name" with "abc"
    When I populate field "Account Number" with "658769307875"
    When I populate field "Account Number" with "658769307875"
    When I populate field "IFSC Code" with "SBIN34354"
    When I populate field "Branch Name" with "Pune"
    When I populate field "Branch Code" with "788"
    When I populate field "Branch Address" with "testing"
    When I click on button "Next"
    And I wait for progress bar
    When I click on checkbox option "I acknowledge that all information provide here is valid and correct"
    When I click on checkbox option "I have read and understand all rules and procedure"
    Then I click on button "Submit"

