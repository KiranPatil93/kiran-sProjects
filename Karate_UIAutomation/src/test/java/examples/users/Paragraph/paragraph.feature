Feature: enter value in paragraph filed
  Scenario Outline: enter value in Date Picker field
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    * input('textarea.ParagraphWidget---textarea.ParagraphWidget---align_start.ParagraphWidget---height_medium.ParagraphWidget---inModalDialogLayout', '<paragraph>')
    Examples:
      |paragraph     |
      |kiran         |