Feature: Checkboxes

  Scenario: click on single checkbox
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    And mouse("//label[contains(text(),'Option 2')]//parent::div[@class='CheckboxGroup---choice_pair']").click()

  Scenario: click on multiple checkboxes
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    * def listOptions = locateAll("//div[@class='CheckboxGroup---choice_pair']")
    * print listOptions

    * def fun =

       """

    function(btn) {



           btn.mouse().click()

      sleep(6000)



    }

      """

    * eval karate.forEach(listOptions, fun)