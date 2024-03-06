Feature: Verify Add New Buyer functionalities
  Background: call login functionality
* configure afterScenario =
    """
    function(){
    var info = karate.info;
    karate.log(info);
    if(info.errorMessage){
    driver.screenshot();
    }
    }
    """
   # * def testData = karate.read("classpath:src/test/resources/data.csv")
    When call read('classpath:examples/Utilities/login.feature@login')
    * delay(2000)

    Scenario: I am able to click on Add new Buyer button
      * def btnBuyer = "button[class='Button---btn Button---default_direction Button---primary appian-context-last-in-list Button---icon_start']"
      * def verifypage = "//strong[@class='StrongText---richtext_strong']"
      * mouse(btnBuyer).click()
      * delay(2000)
      * def textValue = text(verifypage)
      * print textValue
     #* def response == "Select Exporter Type"
      Then match textValue == "Select Exporter Type"


  Scenario: I am able to click on Individual card
    * def btnBuyer = "button[class='Button---btn Button---default_direction Button---primary appian-context-last-in-list Button---icon_start']"
    * def verifypage = "//strong[@class='StrongText---richtext_strong']"
    * def cardIndividual = "//span[contains(text(),'Individual')]"
    * def btnNext = "//span[contains(text(),'Next')]"
    * mouse(btnBuyer).click()
    * delay(2000)
    * def textValue = text(verifypage)
    * print textValue
     #* def response == "Select Exporter Type"
    Then match textValue == "Select Exporter Type"
    * mouse(cardIndividual).click()
    * delay(2000)
    * mouse(btnNext).click()

@readcsvfile
  Scenario Outline: I am able to click on fill form
    * def btnBuyer = "button[class='Button---btn Button---default_direction Button---primary appian-context-last-in-list Button---icon_start']"
    * def verifypage = "//strong[@class='StrongText---richtext_strong']"
    * def cardIndividual = "//span[contains(text(),'Individual')]"
    * def btnNext = "//span[text()='Next']"
    * def firstName = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"

    * mouse(btnBuyer).click()
    * delay(2000)
    * def textValue = text(verifypage)
    * print textValue
     #* def response == "Select Exporter Type"
    Then match textValue == "Select Exporter Type"
   * mouse(cardIndividual).click()
    * delay(4000)
    * script(btnNext, '_.scrollIntoView()')
    * delay(1000).screenshot(btnNext)
    When click(btnNext)
    * delay(4000)
    * input(firstName,"<name>")
    * delay(5000)
    Then input("//label[text()='First Name']/parent::div/following-sibling::div/div/input", 'santosh')
    * delay(2000)
    And input("//label[text()='Middle Name']/parent::div/following-sibling::div/div/input", 'Kumar')
    * delay(2000)
    And input("//label[text()='Last Name']/parent::div/following-sibling::div/div/input", 'Gannoju')
    * delay(2000)
    And input("//label[text()='Address Line 1']/parent::div/following-sibling::div/div/textarea", 'Hyderabad secunderabad')
    * delay(2000)
    And input("//label[text()='Address Line 2']/parent::div/following-sibling::div/div/textarea", 'Hitech city near cyber gateway')
    * delay(10000)

    Examples:
    |read('TestData/data.csv') |

