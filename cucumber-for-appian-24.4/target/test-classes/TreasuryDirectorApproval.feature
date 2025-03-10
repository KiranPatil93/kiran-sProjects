
Feature:Treasury Director approve case

  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://brookfieldrenewable-test.appiancloud.com/suite/?signin=native"
    And I set appian version to "24.4"
    And I set appian locale to "en_US"
    Then I login with username "kiran.patil@yexle.com"

    Scenario: Treasury Director approve request
      Given I wait for progress bar
   #   And I custom zoom out page
      Given I click on menu button "btn"
      Given I wait for progress bar
      Given I click on Treasury Director action
      Given I wait for progress bar
      When I enter comment "Treasury Director approve"
      And I click on approve button

