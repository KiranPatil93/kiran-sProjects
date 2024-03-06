@Application
Feature: Employee able to raise Expense

  Configuring your site with the sample application:
  1. Import the applicable version of Automated Testing - XX.X.zip application, provided in the Shared Components page, into your Appian environment
  2. Log into Appian Designer view on your Appian environment and import the downloaded application zip
  3. After import is complete, click on the Automated Testing application
  4. Find and click on the AUT DS object to open the Appian Data Store Designer
  5. Verify the entity mappings under Schema Management and then Save & Publish the data store

  Prerequisites for running the test on the configured site above:
  1. Run the appropriate setupCustomPropertiesFor... script
  2. Replace BROWSER with either FIREFOX or CHROME
  3. Replace APPIAN_URL with your Appian site URL, beginning with https:// and including /suite at the end (e.g. https://forum.appian.com/suite)
  4. Replace APPIAN_VERSION with a supported Appian Version in xx.x format
  5. Replace APPIAN_LOCALE with either "en_US" or "en_GB"
  5. Replace APPIAN_USERNAME with a valid username for Appian URL above
  6. Open src/main/resources/configs/users.properties and add a line for the above username that is of the form username=password (e.g. test.user=password)

  Background: Login to Appian environment
    Given I setup with "CHROME" browser
    When I set appian URL to "https://yexletest.appiancloud.com/suite/sites/expense-management-system"
    And I set appian version to "22.4"
    And I set appian locale to "en_US"
    Then I login with username "kiran.patil@yexle.com"

  #Scenario Outline: Fill out Raise Expense form For currency INR
   # Given I click on button "Add New Expense"
    #And I wait for progress bar
   #When I select value from dropdown "Project or Event" search box with "<option>"
   # When I select value From Date as "<fromDate>"
   # When I select value To Date as "<endDate>"
   # When I populate field "Purpose of Expense" with "<purpose>"
   # When I click on link "Add New"
   #When I populate grid " " column "[1]" row "[1]" with "<expDate>"
   # When I select value from Expense Type dropdown "<expenseType>"
    #When I enter Input in grid at column "[3]" with "<descrption>"
   # When I click on bills Availabe "Yes"
  #  When I select value from Currency dropdown "<currency>"
    #When I enter Input in grid at column "[7]" with "<amount>"
   # When I enter Input in grid at column "[8]" with "<tax>"
  #   When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
   #When I upload documents with "<document>"
  #  Then I click on button "SUBMIT"
   # Examples:
     # | SheetName   | RowNumber |
      # | CuurencyINR | 0 |
     #  | CuurencyINR | 1 |


     # | option  | fromDate | endDate  | purpose | expDate   | expenseType     | descrption | currency | amount | tax | document |  |
     # | Project | 4-1-2023 | 4-2-2023 | test | 15-1-2023 | Marketing / Adv | test | INR | 10000 | 697 |  |  |
     # | Event | 4-1-2023 | 4-3-2023 | test | 1-1-2023  | Sales           | test | INR | 1000  | 65 |  |  |
      #| Event | 4-1-2023 | 4-2-2023 | test | 15-1-2023 | Marketing / Adv | test | INR | 68798 | 65 |  |  |
      #| None | 4-1-2023 | 4-2-2023 | test | 23-1-2023 | Sales           | test | INR | 46546 | 34 |  |  |
      #| None | 4-1-2023 | 4-2-2023 | test | 1-2-2023 | Marketing / Adv | test | INR | 46546 | 67 |  |  |

      #| CurrencyINR | 2        |
      #| CurrencyINR | 3        |
     # | CurrencyINR | 4        |
      #| CurrencyINR | 5        |


  Scenario Outline: Fill out Raise Expense form For currency GBP
    And I wait for "3" seconds
    Given I custome click on Menu "Expense Requests"
    And I wait for progress bar
    Given I click on button "Add New Expense"
    And I wait for progress bar
    Given I zoom In page
    And I wait for "2" minutes
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    And I wait for "2" minutes
    When I select value To Date as "<endDate>"
    When I populate field type "text" named "Purpose of Expense" with "<purpose>"
    And I wait for progress bar
    And I wait for "1" minutes
    When I click on link "Add New"
    And I wait for "2" minutes
    When I enter Input in grid at column "1" with "<expDate>"
    When I populate grid dropdown "Expense Type" column "2" search box with "<expenseType>"
    When I enter Input in grid at column "3" with "<descrption>"
    When I click on radio button in grid column "4" bills Availabe with "Yes"
    When I populate grid dropdown "Currency" column "5" search box with "<currency>"
    And I wait for "1" minutes
    When I enter Input in grid at column "7" with "<amount>"
   # And I wait for "2" minutes
   # When I enter Input in grid at column "8" with "<tax>"
    And I wait for "1" minutes
    When I upload file in grid with column "10" with "<document>"
    Then I click on button "Submit"
    Examples:
      | option                   | fromDate | endDate   | purpose | expDate   | expenseType     | descrption | currency | amount | tax | document                                                                             | Submit |
      | Live Build Challenge     | 4/2/2023 | 10/4/2023 | test    | 8/4/2023  | Sales           | test       | GBP      | 1000   | 26  | C:\Users\KiranPatil\IdeaProjects\YexlePortal_ExpenseManagement\TestData\land Doc.pdf | SUBMIT |
      | Live Build Challenge     | 4/1/2023 | 4/2/2023  | test    | 15/1/2023 | Marketing / Adv | test       | GBP      | 10000  | 697 | C:\Users\KiranPatil\IdeaProjects\YexlePortal_ExpenseManagement\TestData\land Doc.pdf | SUBMIT |
      | Live Build Challenge     | 4/1/2023 | 4/2/2023  | test    | 15/1/2023 | Sales           | test       | GBP      | 1000   | 65  | C:\Users\KiranPatil\IdeaProjects\YexlePortal_ExpenseManagement\TestData\land Doc.pdf | SUBMIT |
      | Live Build Challenge     | 4/1/2023 | 4/2/2023  | test    | 15/1/2023 | Marketing / Adv | test       | GBP      | 68798  | 65  | C:\Users\KiranPatil\IdeaProjects\YexlePortal_ExpenseManagement\TestData\land Doc.pdf | SUBMIT |
      | Live Build Challenge     | 4/1/2023 | 4/2/2023  | test    | 15/1/2023 | Sales           | test       | GBP      | 46546  | 34  | C:\Users\KiranPatil\IdeaProjects\YexlePortal_ExpenseManagement\TestData\land Doc.pdf | SUBMIT |
      | NonLive Build Challengee | 4/1/2023 | 4/2/2023  | test    | 15/1/2023 | Marketing / Adv | test       | GBP      | 46546  | 67  | C:\Users\KiranPatil\IdeaProjects\YexlePortal_ExpenseManagement\TestData\land Doc.pdf | SUBMIT |


  Scenario Outline: Fill out Raise Expense form For currency USD
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I populate dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from Expense Type dropdown "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on bills Availabe "Yes"
    When I select value from Currency dropdown "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "<Submit>"
    Examples:
      | option  | fromDate | endDate  | purpose | expDate   | expenseType     | descrption | currency | amount | tax | document | Submit |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Sales           | test       | USD      | 1000   | 26  |          | SUBMIT |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Marketing / Adv | test       | USD      | 10000  | 697 |          | SUBMIT |
      | Event   | 4-1-2023 | 4-3-2023 | test    | 1-1-2023  | Sales           | test       | USD      | 1000   | 65  |          | SUBMIT |
      | Event   | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Marketing / Adv | test       | USD      | 68798  | 65  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 23-1-2023 | Sales           | test       | USD      | 46546  | 34  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 1-2-2023  | Marketing / Adv | test       | USD      | 46546  | 67  |          | SUBMIT |

  Scenario Outline: Fill out Raise Expense form For Expense Type Travel and currency USD
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I populate dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from Expense Type dropdown "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on bills Availabe "Yes"
    When I select value from Currency dropdown "<currency>"
    When I select distance unit "<distUnit>"
    When I enter Input in grid at column "[7]" with "<distance>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "<Submit>"
    Examples:
      | option  | fromDate | endDate  | purpose | expDate   | expenseType     | descrption | currency | distUnit | distance |  | tax | document | Submit |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Flight | test       | USD      | Miles    | 567      |  | 26  |          | SUBMIT |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Train  | test       | USD      | KM       | 67       |  | 697 |          | SUBMIT |
      | Event   | 4-1-2023 | 4-3-2023 | test    | 1-1-2023  | Travel – Flight | test       | USD      | Miles    | 67       |  | 65  |          | SUBMIT |
      | Event   | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Train  | test       | USD      | KM       | 54       |  | 65  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 23-1-2023 | Travel – Flight | test       | USD      | Miles    | 567      |  | 34  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 1-2-2023  | Travel – Train  | test       | USD      | KM       | 78        |  | 67  |          | SUBMIT |

  Scenario Outline: Fill out Raise Expense form For Expense Type Travel and currency INR
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I populate dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from Expense Type dropdown "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on bills Availabe "Yes"
    When I select value from Currency dropdown "<currency>"
    When I select distance unit "<distUnit>"
    When I enter Input in grid at column "[7]" with "<distance>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "<Submit>"
    Examples:
      | option  | fromDate | endDate  | purpose | expDate   | expenseType     | descrption | currency | distUnit | distance |  | tax | document | Submit |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Flight | test       | INR        | Miles    | 567      |  | 26  |          | SUBMIT |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Train  | test       | INR      | KM       | 67       |  | 697 |          | SUBMIT |
      | Event   | 4-1-2023 | 4-3-2023 | test    | 1-1-2023  | Travel – Flight | test       | INR      | Miles    | 67       |  | 65  |          | SUBMIT |
      | Event   | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Train  | test       | INR      | KM       | 54       |  | 65  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 23-1-2023 | Travel – Flight | test       | INR      | Miles    | 567      |  | 34  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 1-2-2023  | Travel – Train  | test       | INR      | KM       | 78       |  | 67  |          | SUBMIT |

  Scenario Outline: Fill out Raise Expense form For Expense Type Travel and currency GBP
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I populate dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from Expense Type dropdown "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on bills Availabe "Yes"
    When I select value from Currency dropdown "<currency>"
    When I select distance unit "<distUnit>"
    When I enter Input in grid at column "[7]" with "<distance>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "<Submit>"
    Examples:
      | option  | fromDate | endDate  | purpose | expDate   | expenseType     | descrption | currency | distUnit | distance |  | tax | document | Submit |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Flight | test       | GBP      | Miles    | 567      |  | 26  |          | SUBMIT |
      | Project | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Train  | test       | GBP      | KM       | 67       |  | 697 |          | SUBMIT |
      | Event   | 4-1-2023 | 4-3-2023 | test    | 1-1-2023  | Travel – Flight | test       | GBP      | Miles    | 67       |  | 65  |          | SUBMIT |
      | Event   | 4-1-2023 | 4-2-2023 | test    | 15-1-2023 | Travel – Train  | test       | GBP      | KM       | 54       |  | 65  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 23-1-2023 | Travel – Flight | test       | GBP      | Miles    | 567      |  | 34  |          | SUBMIT |
      | None    | 4-1-2023 | 4-2-2023 | test    | 1-2-2023  | Travel – Train  | test       | GBP      | KM       | 78       |  | 67  |          | SUBMIT |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount1>"
    When I enter Input in grid at column "[8]" with "<tax1>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate  | endDate   | purpose | expDate    | expenseType | descrption | currency | amount | tax | document                                    | expenseType1 | amount1 | tax1 |
      | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | Sales       | test       | INR      | 54768  | 46  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | 3447    |35    |


  Scenario Outline: Fill out Raise Expense form For two expense Heads- general
  Given I click on button "Add New Expense"
  And I wait for progress bar
  When I select value from dropdown "Project or Event" search box with "<option>"
  When I select value From Date as "<fromDate>"
  When I select value To Date as "<endDate>"
  When I populate field "Purpose of Expense" with "<purpose>"
  When I click on link "Add New"
  When I populate grid " " column "[1]" row "[1]" with "<expDate>"
  When I select value from dropdown "Expense Type" search box with "<expenseType>"
  When I enter Input in grid at column "[3]" with "<descrption>"
  When I click on radio option "Yes"
  When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
  When I enter Input in grid at column "[7]" with "<amount>"
  When I enter Input in grid at column "[8]" with "<tax>"
  When I upload documents with "<document>"
  When I click on link "Add New[1]"
  When I populate grid " " column "[1]" row "[1]" with "<expDate1>"
  When I select value from dropdown "Expense Type" search box with "<expenseType1>"
  When I enter Input in grid at column "[3]" with "<descrption1>"
  When I click on radio option "Yes"
  When I populate grid dropdown "Currency" column "[5]" search box with "<currency1>"
  When I enter Input in grid at column "[7]" with "<amount1>"
  When I enter Input in grid at column "[8]" with "<tax1>"
  When I upload documents with "<document1>"
  Then I click on button "<Submit>"
  Examples:
    | option  | fromDate  | endDate   | purpose | expDate    | expenseType | descrption | currency | amount | tax | document                                                                                        | expDate1   | expenseType1           | descrption1 | currency1 | amount1 | tax1 | document1                                   |
    | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | general     | test       | INR      | 1000   | 26  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Administrative         | test        | INR       | 456     | 45   | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
    | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | general     | test       | INR      | 10000  | 697 | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Certification ve       | test        | INR       | 6763    | 232  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
    | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | general     | test       | INR      | 1000   | 65  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Staff Welfare          | test        | INR       | 3456    | 213  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
    | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | general     | test       | INR      | 68798  | 65  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Transportation         | test        | INR       | 676867  | 32   | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
    | None    | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | general     | test       | INR      | 46546  | 34  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Immigration            | test        | INR       | 5765    | 123  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
    | None    | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | general     | test       | INR      | 46546  | 67  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Equipment rent/release | test        | INR       | 547     | 321  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |

Scenario Outline: Fill out Raise Expense form For two expense Heads- Administrative
Given I click on button "Add New Expense"
And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I populate grid " " column "[1]" row "[1]" with "<expDate1>"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I enter Input in grid at column "[3]" with "<descrption1>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency1>"
When I enter Input in grid at column "[7]" with "<amount1>"
When I enter Input in grid at column "[8]" with "<tax1>"
When I upload documents with "<document1>"
Then I click on button "<Submit>"
Examples:
  | option  | fromDate  | endDate   | purpose | expDate    | expenseType    | descrption | currency | amount | tax | document                                                                                        | expDate1   | expenseType1           | descrption1 | currency1 | amount1 | tax1 | document1                                   |
  | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | Administrative | test       | INR      | 1000   | 26  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Certification          | test        | INR       | 456     | 45   | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | Administrative | test       | INR      | 10000  | 697 | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Staff Welfare          | test        | INR       | 6763    | 232  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | Administrative | test       | INR      | 1000   | 65  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Transportation         | test        | INR       | 3456    | 213  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | Administrative | test       | INR      | 68798  | 65  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Immigration            | test        | INR       | 676867  | 32   | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | None    | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | Administrative | test       | INR      | 46546  | 34  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Equipment rent/release | test        | INR       | 5765    | 123  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | None    | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | Administrative | test       | INR      | 46546  | 67  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | IT/Infra exp           | test        | INR       | 547     | 321  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |

Scenario Outline: Fill out Raise Expense form For two expense Heads- Administrative
Given I click on button "Add New Expense"
And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I populate grid " " column "[1]" row "[1]" with "<expDate1>"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I enter Input in grid at column "[3]" with "<descrption1>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency1>"
When I enter Input in grid at column "[7]" with "<amount1>"
When I enter Input in grid at column "[8]" with "<tax1>"
When I upload documents with "<document1>"
Then I click on button "<Submit>"
Examples:
  | option  | fromDate  | endDate   | purpose | expDate    | expenseType   | descrption | currency | amount | tax | document                                                                                        | expDate1   | expenseType1           | descrption1 | currency1 | amount1 | tax1 | document1                                   |
  | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | Certification | test       | INR      | 1000   | 26  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Staff Welfare          | test        | INR       | 456     | 45   | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | Certification | test       | INR      | 10000  | 697 | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Transportation         | test        | INR       | 6763    | 232  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | Certification | test       | INR      | 1000   | 65  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Immigration            | test        | INR       | 3456    | 213  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | Certification | test       | INR      | 68798  | 65  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | Equipment rent/release | test        | INR       | 676867  | 32   | C:/Users/KiranPatil/Downloads/LearnJava.pdf |
  | None    | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | Certification | test       | INR      | 46546  | 34  | C:\\Users\\KiranPatil\\IdeaProjects\\YexlePortal_ExpenseManagement\\TestData\\RaiseExpense.xlsx | 16-01-2023 | IT/Infra exp           | test        | INR       | 5765    | 123  | C:/Users/KiranPatil/Downloads/LearnJava.pdf |

Scenario Outline: Fill out Raise Expense form For two expense Heads- Travel
Given I click on button "Add New Expense"
And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
 When I populate grid dropdown "Distance Unit" column "[6]" search box with "<distUnit>"
When I enter Input in grid at column "[7]" with "<distance>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I populate grid " " column "[1]" row "[1]" with "<expDate1>"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I enter Input in grid at column "[3]" with "<descrption1>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency1>"
 When I populate grid dropdown "Distance Unit" column "[6]" search box with "<distUnit1>"
When I enter Input in grid at column "[7]" with "<distance>"
When I enter Input in grid at column "[7]" with "<amount1>"
When I enter Input in grid at column "[8]" with "<tax1>"
When I upload documents with "<document1>"
Then I click on button "<Submit>"
Examples:
  | option  | fromDate  | endDate   | purpose | expDate    | expenseType | descrption | currency | amount | tax | document                                    | expDate1   | expenseType1           | descrption1 | currency1 | distUnit1 | amount1 | tax1 | document1                                   | submit |
  | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | Travel      | test       | INR      | 1000   | 26  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | 15/01/2023 | Staff Welfare          | test        | INR       | KM        | 456     | 45   | C:/Users/KiranPatil/Downloads/LearnJava.pdf | SUBMIT |
  | Project | 4/01/2023 | 4/02/2023 | test    | 15/01/2023 | Travel      | test       | INR      | 10000  | 697 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | 15/01/2023 | Transportation         | test        | INR       | KM        | 6763    | 232  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | SUBMIT |
  | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | Travel      | test       | INR      | 1000   | 65  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | 16/01/2023 | Immigration            | test        | INR       | KM        | 3456    | 213  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | SUBMIT |
  | Event   | 4/01/2023 | 4/02/2023 | test    | 16/01/2023 | Travel      | test       | INR      | 68798  | 65  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | 16/01/2023 | Equipment rent/release | test        | INR       | KM        | 676867  | 32   | C:/Users/KiranPatil/Downloads/LearnJava.pdf | SUBMIT |
  | None    | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | Travel      | test       | INR      | 46546  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | 18/01/2023 | IT/Infra exp           | test        | INR       | KM        | 5765    | 123  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | SUBMIT |
  | Project | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | Travel      | test       | INR      | 43657  | 23  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | 18/01/2023 | Administrative         | test        | INR       | KM        | 3435    | 13   | C:/Users/KiranPatil/Downloads/LearnJava.pdf | SUBMIT |
  | Project | 4/01/2023 | 4/02/2023 | test    | 18/01/2023 | Travel      | test       | INR      | 5466   | 45  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | 18/01/2023 | General                | test        | INR       | KM        | 46456   | 13   | C:/Users/KiranPatil/Downloads/LearnJava.pdf | SUBMIT |

Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , Administrative
Given I click on button "Add New Expense"
And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[2]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType2>"
 When I enter Input in grid at column "[3]" with "<descrption>"
 When I click on radio option "Yes"
 When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
 When I enter Input in grid at column "[7]" with "<amount>"
 When I enter Input in grid at column "[8]" with "<tax>"
 When I upload documents with "<document>"
Then I click on button "Submit"
Examples:
  | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | amount | tax  | document                                    | expenseType1 | expenseType2   | Submit |
  | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 547768 | 4365 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Administrative | SUBMIT |
  |event    |01/01/2023  |01/03/2023  |testing  |14/02/2023  |Sales        |testing     |INR       |547768  |4365  |C:/Users/KiranPatil/Downloads/LearnJava.pdf  |General       |Administrative  |SUBMIT  |
  |None     |01/01/2023  |01/03/2023  |testing  |14/02/2023  |Sales        |testing     |INR       |4678    |78    |C:/Users/KiranPatil/Downloads/LearnJava.pdf  |General       |Administrative  |SUBMIT  |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , Certification
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate1>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I click on link "Add New[2]"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | amount | tax | document                                    | expenseType1 | expenseType2  | expDate1   | Submit |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Certification | 14/02/2023 | SUBMIT |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Certification | 14/02/2023 | SUBMIT |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 4766   | 23  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Certification | 14/02/2023 |SUBMIT  |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , staff Welfare
    Given I click on button "Add New Expense"
    And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I click on link "Add New[2]"
 When I select value from dropdown "Expense Type" search box with "<expenseType2>"
Then I click on button "Submit"
  Examples:
    | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | amount | tax | document                                    | expenseType1 | expenseType2  |
    | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | staff Welfare |
    | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | staff Welfare |
    | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 5756   |34   | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | staff Welfare |

Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , Transportation
Given I click on button "Add New Expense"
And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[2]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
 When I select value from dropdown "Expense Type" search box with "<expenseType2>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
Then I click on button "Submit"
  Examples:
    | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | amount | tax | document                                    | expenseType1 | expenseType2   |
    | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Transportation |
    | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Transportation |
    | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Transportation |

Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , Travel
Given I click on button "Add New Expense"
And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[2]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
 When I select value from dropdown "Expense Type" search box with "<expenseType2>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
Then I click on button "Submit"
  Examples:
    | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | amount | tax | document                                    | expenseType1 | expenseType2   |
    | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Transportation |
    | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Transportation |
    | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Transportation |

Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , Travel
Given I click on button "Add New Expense"
And I wait for progress bar
When I select value from dropdown "Project or Event" search box with "<option>"
When I select value From Date as "<fromDate>"
When I select value To Date as "<endDate>"
When I populate field "Purpose of Expense" with "<purpose>"
When I click on link "Add New"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[1]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
When I select value from dropdown "Expense Type" search box with "<expenseType1>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
When I click on link "Add New[2]"
When I populate grid " " column "[1]" row "[1]" with "<expDate>"
 When I select value from dropdown "Expense Type" search box with "<expenseType2>"
When I enter Input in grid at column "[3]" with "<descrption>"
When I click on radio option "Yes"
When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
When I select value from dropdown "Distance Unit" search box with "<distance>"
When I enter Input in grid at column "[7]" with "<amount>"
When I enter Input in grid at column "[8]" with "<tax>"
When I upload documents with "<document>"
Then I click on button "Submit"
  Examples:
    | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1 | expenseType2 |
    | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Travel       |
    | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Travel       |
    | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Travel       |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , Immigration
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1 | expenseType2 |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Immigration  |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Immigration  |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Immigration  |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , General , Equipment rent/release
    Given I click on button "Add New Expense"
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1 | expenseType2           |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Equipment rent/release |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Equipment rent/release |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | General      | Equipment rent/release |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Administrative ,Certification
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1   | expenseType2           |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Certification |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Certification |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Certification |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Administrative ,Staff Welfare
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1   | expenseType2  |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Staff Welfare |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Staff Welfare |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Staff Welfare |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Administrative ,Transportation
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1   | expenseType2   |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Transportation |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Transportation |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Transportation |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Administrative ,Travel
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I populate grid dropdown "Distance Unit" column "[6]" search box with "<distUnit1>"
    When I enter Input in grid at column "[7]" with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I populate grid dropdown "Distance Unit" column "[6]" search box with "<distUnit1>"
    When I enter Input in grid at column "[7]" with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1   | expenseType2 |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Travel       |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Travel       |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Travel       |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Administrative ,Immigration
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1   | expenseType2 |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Immigration  |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Immigration  |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Immigration  |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Administrative ,Equipment rent/release
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1   | expenseType2           |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Equipment rent/release |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Equipment rent/release |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | Equipment rent/release |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Administrative ,IT/Infra exp
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1   | expenseType2 |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | IT/Infra exp |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | IT/Infra exp |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Administrative | IT/Infra exp |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Certification and Staff Welfare
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2  |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Staff Welfare |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Staff Welfare |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Staff Welfare |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Certification and Transportation
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2   |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Transportation |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Transportation |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Transportation |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Certification and Travel
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2 |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Travel       |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Travel       |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Travel       |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Certification and Immigration
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2 |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Immigration  |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Immigration  |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Immigration  |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Certification and Equipment rent/release
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2           |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Equipment rent/release |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Equipment rent/release |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | Equipment rent/release |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Certification and IT/Infra exp
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2           |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | IT/Infra exp |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | IT/Infra exp |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Certification | IT/Infra exp |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Staff Welfare, Transportation
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2   |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Staff Welfare | Transportation |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Staff Welfare | Transportation |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Staff Welfare | Transportation |

  Scenario Outline: Fill out Raise Expense form For two expense Heads- Sales , Staff Welfare, Travel
    Given I click on button "Add New Expense"Certification
    And I wait for progress bar
    When I select value from dropdown "Project or Event" search box with "<option>"
    When I select value From Date as "<fromDate>"
    When I select value To Date as "<endDate>"
    When I populate field "Purpose of Expense" with "<purpose>"
    When I click on link "Add New"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[1]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType1>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    When I click on link "Add New[2]"
    When I populate grid " " column "[1]" row "[1]" with "<expDate>"
    When I select value from dropdown "Expense Type" search box with "<expenseType2>"
    When I enter Input in grid at column "[3]" with "<descrption>"
    When I click on radio option "Yes"
    When I populate grid dropdown "Currency" column "[5]" search box with "<currency>"
    When I select value from dropdown "Distance Unit" search box with "<distance>"
    When I enter Input in grid at column "[7]" with "<amount>"
    When I enter Input in grid at column "[8]" with "<tax>"
    When I upload documents with "<document>"
    Then I click on button "Submit"
    Examples:
      | option  | fromDate   | endDate    | purpose | expDate    | expenseType | descrption | currency | distance | amount | tax | document                                    | expenseType1  | expenseType2   |
      | Project | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 65587  | 676 | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Staff Welfare | Transportation |
      | event   | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 34677  | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Staff Welfare | Transportation |
      | None    | 01/01/2023 | 01/03/2023 | testing | 14/02/2023 | Sales       | testing    | INR      | KM       | 5756   | 34  | C:/Users/KiranPatil/Downloads/LearnJava.pdf | Staff Welfare | Transportation |

