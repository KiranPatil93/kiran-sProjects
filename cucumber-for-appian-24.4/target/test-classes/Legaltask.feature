Feature: Parallel workflow-Tax,Lender and Legal
  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://brookfieldrenewable-test.appiancloud.com/suite/?signin=native"
    And I set appian version to "24.4"
    And I set appian locale to "en_US"


    Scenario: Approve task
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