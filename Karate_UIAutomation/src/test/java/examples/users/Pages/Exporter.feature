Feature: Verify functionalities in Exporter page
  Background: call login functionality
    When call read('classpath:examples/Utilities/login.feature@login')
    * delay(2000)

  Scenario Outline: user able to enter text in seacrh field
    * def searchText = 'input.TextInput---text.TextInput---align_start.TextInput---inSideBySideItem'
     * input(searchText,searchInput)

    Examples:
    |searchInput  |
    |Sippy Walnut |

  Scenario Outline: user able to search using buyer name
    * def searchText = 'input.TextInput---text.TextInput---align_start.TextInput---inSideBySideItem'
    * def searchbtn = "//button[@class='Button---btn Button---default_direction appian-context-first-in-list appian-context-last-in-list Button---inSideBySide Button---icon_start']"

    * input(searchText,searchInput)
    * delay(2000)
    * mouse(searchbtn).click()

    Examples:
      |searchInput  |
      |Sippy Walnut |

    Scenario: user able to filter data using Buyer Ref Id
      * def buyerRefIdDrop = "//span[text()='Status']//preceding::div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder']"
      And mouse(buyerRefIdDrop).click()
      * def listOptions = locateAll('li.MenuWidgetItem---default_direction.MenuWidgetItem---inDropdownWidget')
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
* delay(3000)

  Scenario: user able to filter data using Status
    * def status = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"
    And mouse(status).click()
    * def listOptions = locateAll('li.MenuWidgetItem---default_direction.MenuWidgetItem---inDropdownWidget')
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
    * delay(3000)

  Scenario: user able to filter data using Country
    * def country = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"
    And mouse(country).click()
    * def listOptions = locateAll('li.MenuWidgetItem---default_direction.MenuWidgetItem---inDropdownWidget')
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
    * delay(3000)

  Scenario: user able to filter data using Rating
    * def rating = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"
    And mouse(rating).click()
    * def listOptions = locateAll('li.MenuWidgetItem---default_direction.MenuWidgetItem---inDropdownWidget')
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
    * delay(3000)

  Scenario: user able to filter data using Purchased Made
    * def purchasesMade = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"
    And mouse(purchasesMade).click()
    * def listOptions = locateAll('li.MenuWidgetItem---default_direction.MenuWidgetItem---inDropdownWidget')
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
    * delay(3000)

  Scenario: user able to filter data using Buyer type
    * def buyerType = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)"
    And mouse(buyerType).click()
    * def listOptions = locateAll('li.MenuWidgetItem---default_direction.MenuWidgetItem---inDropdownWidget')
    * print listOptions
    * def position = 1

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
    * delay(3000)