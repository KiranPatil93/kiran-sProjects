Feature: As as Sales User I want to update a demand record so that I can manage the demand requirements of the customer

  Background:: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexledev.appiancloud.com/suite/sites/sales-forecast"
    And I set appian version to "23.2.1"
    And I set appian locale to "en_US"
    And I set screenshot path to "C:\Users\KiranPatil\IdeaProjects\PMS\Screenshots"
    And I set take error screenshots to "true"
  #  Then I login with username "kiran.patil@yexle.com"
    Then I login with role "Dev.L1"

    Scenario Outline: user able to create opportunity till Proposal stage
      Given I wait for "10" seconds
      When I click on button "New Opportunity"
      And I wait for "2" seconds
      And I custom enter opportunity name
      And I wait for "2" seconds
      And I custom select end client "Appian"
      And I wait for "2" seconds
      And I custom select contract channel from dropdown "<channel>"
      And I wait for "2" seconds
      And I custom select contracting entity address "<entity>"
      And I wait for "2" seconds
      And I click on button "Proceed to next stage"
      And I wait for "2" seconds
      And I custom select Domain "<domain>"
      And I wait for "2" seconds
      And I custom select Lead Type from dropdown "<leadType>"
      And I wait for "2" seconds
      And I custom select Confidentiality Coverage from dropdown "<coverage>"
      And I wait for "2" seconds
      And I populate field type "paragraph" named "Scope Details" with "<scope>"
      And I wait for "2" seconds
      And I click on button "Proceed to next stage"
      And I wait for "4" seconds
      And I click on checkbox option "Delivery Services"
      And I wait for "2" seconds
      And I custom enter tentative start Date "<startDate>"
      And I wait for "2" seconds
      And I custom enter tentative end date "<endDate>"
      And I wait for "2" seconds
      And I custom select currency from dropdown "<currency>"
      And I wait for "2" seconds
      And I custom enter contract value "<contractValue>"
      And I wait for "2" seconds
      And I click on button "Proceed to next stage"
      And I wait for "4" seconds
      And I click on radio option "TIME AND MATERIALS"
      And I wait for "2" seconds
      And I populate dropdown "Role" search box with "<role1>"
      And I wait for "2" seconds
      And I custom select onshoreoffshore from dropdown "<shore>"
      And I wait for "2" seconds
      And I custom select location from dropdown "<location>"
      And I wait for "2" seconds
      And I custom select demand start Date "<date>"
      And I wait for "2" seconds
      And I custom enter days
      And I wait for "2" seconds
      And I custom enter daily Rate
      And I wait for "2" seconds
      And I custom select demand currency "<demandCurr>"
      And I wait for "2" seconds
      And I custom click on add demand link
      And I wait for "2" seconds
      And I populate dropdown "Role" search box with "<role2>"
      And I wait for "2" seconds
      And I custom select onshoreoffshore from dropdown "<shore>"
      And I wait for "2" seconds
      And I custom select location from dropdown "<location>"
      And I wait for "2" seconds
      And I custom select demand start Date "<date>"
      And I wait for "2" seconds
      And I custom enter days
      And I wait for "2" seconds
      And I custom enter daily Rate
      And I wait for "2" seconds
      And I custom select demand currency "<demandCurr>"

      Examples:
        | client | channel | entity       | domain   | leadType  | coverage | scope   | startDate  | endDate    | currency | contractValue | role1             | shore    | location    | date       | demandCurr | role2 |
        | Appian | Direct  | Headquarters | Business | Appian CS | NDA      | testing | 08/02/2024 | 14/02/2025 | INR      | 4563          | Junior Consultant | Offshore | Maharashtra | 07/02/2024 | INR        | Senior Consultant |