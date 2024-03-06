Feature: Login functionality

  @login
  Scenario Outline: user able to login
    * def signIn = "input[value='Sign In']"
    * def exporerMenuLink = "//span[text()='Exporter']"

    Given driver 'https://yexledemo.appiancloud.com/suite/sites/automation-cases'
    * maximize()
    * delay(1000)
    * input('#un',username)
   # And call com.appiancorp.ps.automatedtest.fixture.SitesFixture.loginWithUsername('<username>');
    And input('#pw',password)
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(2000)
    And mouse(signIn).click()
    * sleep(10000)
    * def MySeleniumTest =  Java.type("com.appiancorp.ps.automatedtest.fixture.SitesFixture")
  #  * def MySeleniumTest =  Java.type("com.appiancorp.example.HelloAppian")
    * def fixture = new MySeleniumTest()
    * print 'fixture'
   * fixture.getSettings().getDriver().clickOnButton('<buttonName>');
   # * fixture.clickOnCaseButton()
  #  * mouse("//button[@class='Button---btn Button---default_direction Button---primary Button---small appian-context-first-in-list appian-context-last-in-list Button---icon_start']").click()
    * delay(2000)
    * driver.populateFieldWith("Radio Buttons Card", new String[]{"Option 1"});

    Examples:
      |username|password|buttonName|
      |kiran123|Pass@123| New Case |