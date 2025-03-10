Feature:Create New Customer Account
  Background: Navigate on LUMA application
    Given I setup with "CHROME" browser
    When I set URL to "https://magento.softwaretestingboard.com/"

  Scenario Outline: User successfully creates a new account
    Given User is on "Home Page"
    And user click on link "Create an Account"
    And  user navigate on Create New Customer Account page
    When user enter first name "<firstName>"
    And user enter last name "<lastName>"
    And user enter email "<email>"
    And user enter password "<password>"
    And user enter confirm password "<confirmPassword>"
    And user click on button "Create an Account"
    Then successfully account should create
    Examples:
      | firstName     | lastName     | email               | password          | confirmPassword   |
      | TestFirstName | TestLastName | rani33372@gmail.com | TestFirstLast@123 | TestFirstLast@123 |

