Feature: call selenium WebDriver class

  Background:
   # * configure driver1 = {type: 'chrome', addOptions: ['--remote-allow-origins=*']}
    * def MySeleniumTest1 =  Java.type("com.karate.seleniumApi.SeleniumHelper")
    * def driver = new MySeleniumTest1()
    * print 'driver'
    * driver.navigateTo('https://yexledemo.appiancloud.com/suite/sites/automation-cases')

  Scenario: Verify the page title using Selenium
  #  * call MySeleniumTest.navigateTo('https://yexledemo.appiancloud.com/suite/sites/automation-cases')
    When def pageTitle = driver.getTitle()
    * driver.tearDown()

