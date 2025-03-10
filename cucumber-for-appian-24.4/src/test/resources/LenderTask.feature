Feature: Parallel workflow-Tax,Lender and Legal
  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://brookfieldrenewable-test.appiancloud.com/suite/?signin=native"
    And I set appian version to "24.4"
    And I set appian locale to "en_US"


  Scenario: approval flow
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



