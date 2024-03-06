Feature: End to End application

  Scenario Outline: End to end
    When call read('classpath:examples/users/login.feature@login')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    And mouse("//button[@type='button']//span//span[contains(text(),'New Case')]").click()
  * delay(2000)
    * input('input.TextInput---text.TextInput---align_start', '<text>')
    * delay(2000)
    * input('input.DatePickerWidget---text.DatePickerWidget---align_start.DatePickerWidget---input_width', '<date>')
    * delay(2000)
    * input('textarea.ParagraphWidget---textarea.ParagraphWidget---align_start.ParagraphWidget---height_medium.ParagraphWidget---inModalDialogLayout', '<paragraph>')
    * delay(2000)
    And mouse("//input[@value='Option 1']//parent::div[@class='RadioSelect---choice_pair']").click()
    * delay(2000)
    And mouse("//input[@value='Option 1']//parent::div[@class='CardStyleRadioSelects---choice_pair']").click()
    * delay(2000)
    And mouse("//span[contains(text(),'Dropdown')]//following::div[3]").click()
    * delay(2000)
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
    * delay(2000)
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
    * delay(2000)
    * def textValue = text("//p[text()='Read Only Field']")
    * print textValue
    * delay(2000)
    And mouse("//a[text()='Add New Document']").click()
    * delay(3000)
    * scroll("//a[starts-with(@class,'GridFooter')]").click()
    * delay(3000)
   # * def filePath ="file:src/test/resources/samplepdf.pdf"

    * driver.inputFile("//input[@type='file']","file:src/test/resources/samplepdf.pdf")
    * delay(3000)
    Examples:
      |text     |date      |paragraph|
      |kiran    |07/07/2023|testing  |
