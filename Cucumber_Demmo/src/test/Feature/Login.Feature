Feature: Login

  Scenario Outline: Successfully login on Zoo-Animal-Management Application
    Given Navigate on Zoo-Animal-Management Application login page using url " "
    When user fills username box with "<uname>"
    And Password filed with "<password>"
    And user click on login button
    Then User navigate on Zoo Details page"<search>"

    Examples:
     url                              | uname   | password |search
    https://yexledemo.appiancloud.com | xyz       | 1234    |search

  Scenario Outline: Unsuccessful login
    Given Navigate on Zoo-Animal-Management Application login page using url " "
    When user fills "username box" with "<username>"
    And Password filed with "<password>"
    And user click on login button
    Then error message displayed with wrong password
    Examples:
      | username | password |
      | xyz      | 1234     |
