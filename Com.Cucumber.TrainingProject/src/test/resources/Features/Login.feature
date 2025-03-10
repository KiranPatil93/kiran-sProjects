Feature:Login Functionality

  Scenario: Successfull login
    Given I open the url of the application
    When I enter the email
    And I enter the password
    And I click on Login button
    Then I should navigate on home page

#  Scenario: Unsuccessfull login
#   Given I open the url of the application
#   When I enter the invalid email "xyzxxxx@gmail.com"
#    And I enter the invalid password "12345765"
#    And I click on Login button
#    Then I should see error message on login page

#    Scenario Outline:Successfull login
#      Given I open the url of the application "<url>"
#      When I enter the email "<username>"
#      And I enter the password "<password>"
#      And I click on login button
#      Then I should navigate on home page
#      Examples:
#        | url                                            | username      | password   |
#        | https://demo.guru99.com/insurance/v1/index.php | xyz@gmail.com | 12345765   |
#        | https://demo.guru99.com/insurance/v1/index.php | abc@gmail.com | gfiuhfjdkf |
Scenario: Verify Reset Functionality
    Given I click on reset