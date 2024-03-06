Feature:dropdown
@multipleDropdown
Scenario: click on radio button 1
* call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
* def sleep = function(millis){ java.lang.Thread.sleep(millis) }
* sleep(4000)
And mouse("//span[contains(text(),'Dropdown')]//following::div[3]").click()
  * def listOptions = locateAll('li.MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget')
  * print listOptions
  * def position = 4

  * def fun =

       """

    function(btn, index) {

        if (index == position) {

           btn.mouse().click()

      sleep(6000)

    }

    }

      """

  * eval karate.forEach(listOptions, fun)