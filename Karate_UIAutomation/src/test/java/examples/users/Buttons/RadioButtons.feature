Feature: Radio
@Radiobutton1
Scenario: click on radio button 1
  * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
  * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
  * sleep(4000)
  And mouse("//input[@value='Option 1']//parent::div[@class='RadioSelect---choice_pair']").click()


  @Radiobutton2
  Scenario: click on radio button 1
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    And mouse("//input[@value='Option 2']//parent::div[@class='RadioSelect---choice_pair']").click()

  @AllRadiobutton
  Scenario: click on multiple radio buttons
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    And def radioButtons = driver.locateAll('div.RadioSelect---choice_pair')
    * print radioButtons
     # Use karate.forEach to iterate over the list of elements
    And karate.forEach(radioButtons, function(radioButton){
    And radioButton.click()})


  @RadiowithCard
  Scenario: click on radio button 1
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    And mouse("//input[@value='Option 1']//parent::div[@class='CardStyleRadioSelects---choice_pair']").click()




