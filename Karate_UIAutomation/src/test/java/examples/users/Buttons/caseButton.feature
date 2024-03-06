Feature: click on Case button

  @NewCase
  Scenario: click on Case button
    When call read('classpath:examples/users/login.feature@login')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    And mouse("//button[@type='button']//span//span[contains(text(),'New Case')]").click()