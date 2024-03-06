Feature: enter value in Date Picker filed
  Scenario Outline: enter value in Date Picker field
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    * input('input.DatePickerWidget---text.DatePickerWidget---align_start.DatePickerWidget---input_width', '<date>')
    Examples:
      |date     |
      |22/07/2023    |