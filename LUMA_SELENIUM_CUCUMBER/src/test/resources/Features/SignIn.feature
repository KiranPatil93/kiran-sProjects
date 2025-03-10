Feature: Customer Login
  Background: Navigate on LUMA application
    Given I setup with "CHROME" browser
    When I set URL to "https://magento.softwaretestingboard.com/"

  Scenario Outline: User successfully sign in with valid credentials
    Given User is on "Home Page"
    And user click on link "Sign In"
    When User enters Email "<email>"
    And User enters Password "<password>"
    And User clicks on Sign In button
    Then User should be logged in and redirected to the "Home Page"
    Examples:
      | email             | password          |
      | rani33372@gmail.com | TestFirstLast@123 |


