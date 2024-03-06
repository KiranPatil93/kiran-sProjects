Feature: Common Functions of Aqua 

 * def nextButton2 = "//span[text()='Next']"
 * def nextButton1 = "//span[text()='Next']/parent::span/parent::button"

@nextButtonWithClick

Scenario: Clicking a Next button with click()

* def k = karate
* def sleep = function(pause){ java.lang.Thread.sleep(pause*1000) }
* click(nextButton1)
 

@nextButtonWithSubmit

Scenario: Clicking a Next button with submit()

* def k = karate
* def sleep = function(pause){ java.lang.Thread.sleep(pause*1000) }
* submit.click(nextButton2).click()





