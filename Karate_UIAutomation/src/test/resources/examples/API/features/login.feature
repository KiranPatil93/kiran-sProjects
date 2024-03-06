Feature: login for API

  Scenario: Test login functionality for API Testing
    Given url "https://yexledev.appiancloud.com/suite/sites/project-management"
    When method get
    Then status 200
    And match response == {"title": "project-management"}