Feature:upload file

  Scenario: upload file
    * call read('classpath:examples/users/Buttons/caseButton.feature@NewCase')
    * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
    * sleep(4000)
    And mouse("//a[text()='Add New Document']").click()
    * delay(3000)
    * scroll("//a[starts-with(@class,'GridFooter')]").click()
    * delay(3000)
   # * def filePath ="file:src/test/resources/samplepdf.pdf"

    * driver.inputFile("//input[@type='file']","file:src/test/resources/samplepdf.pdf")
    * delay(3000)


