Feature: enter in Input filed

  @NewCase
  Scenario Outline: click on Case button
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    * input('input.TextInput---text.TextInput---align_start', '<text>')
    Examples:
    |text     |
    |kiran    |
