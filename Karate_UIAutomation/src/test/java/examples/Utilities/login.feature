Feature: Login functionality

 @login
  Scenario Outline: user able to login
   # * configure driver = {type: 'chrome', addOptions: ['--disable-save-password-bubble']}
   * def signIn = "input[value='Sign In']"
    * def exporerMenuLink = "//span[text()='Exporter']"

  Given driver 'https://yexledemo.appiancloud.com/suite/sites/aqua'
    * maximize()
    * delay(1000)
  * input('#un',username)
  And input('#pw',password)
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(2000)
    And mouse(signIn).click()
    * sleep(4000)
   And mouse(exporerMenuLink).click()
   Examples:
    |username|password|
    |kiran123|Pass@123|