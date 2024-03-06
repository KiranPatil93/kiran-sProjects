Feature:Login

  @login
  Scenario Outline: Login successfully
    When call read('classpath:examples/users/launchBrowser.feature@launch')
    * delay(1000)
    * input('#un',username)
    And input('#pw',password)
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(2000)
    And mouse("input[value='Sign In']").click()
    Examples:
    |username |password |
    | kiran123|Pass@123 |

