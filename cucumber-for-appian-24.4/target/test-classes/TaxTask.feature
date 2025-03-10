Feature: Parallel workflow-Tax,Lender and Legal
  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://brookfieldrenewable-test.appiancloud.com/suite/?signin=native"
    And I set appian version to "24.4"
    And I set appian locale to "en_US"


    Scenario:Tax team approve task
      Given I login with username "FF_BRUS_Tax_User1"
      And I wait for "1" seconds
      Given I wait for progress bar
      And I wait for "1" seconds
      Given I click on menu button "btn"
      And I wait for "1" seconds
      Given I wait for progress bar
      When I click on Action button
      And I wait for "1" seconds
      Given I wait for progress bar
      And I wait for "1" seconds
      When I enter comment "tax team approve"
      And I wait for "1" seconds
      And I click on approve button