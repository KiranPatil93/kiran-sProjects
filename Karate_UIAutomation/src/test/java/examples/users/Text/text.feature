Feature: Capture Text

  Scenario: Capture the text of element
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    * def textValue = text("//p[text()='Read Only Field']")
    * print textValue