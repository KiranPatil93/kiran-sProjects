Feature: Verify the components

	Scenario: Verify the Components like dropdown,search
	
	* configure driver = { type: 'chrome', addOptions: ["--remote-allow-origins=*"] }
	
	* def buyerRefIdDD = "//span[text()='Buyer Ref Id']/parent::div//following-sibling::div/div/div//span[text()='---Select a Value---']"
	* def buyerRefIdDDValues = "//li[starts-with(@class,'MenuWidgetItem')]"
	* def buyerRefIdDDFirstValue = "//li[@class='MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget']"
	* def statusDD = "//span[text()='Status']/parent::div//following-sibling::div/div/div//span"
	* def statusDDAllValues = "//li[starts-with(@class,'MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget')]"
	
	Given driver 'https://yexledemo.appiancloud.com/suite/sites/aqua/page/home' 
	* delay(2000)
	* maximize()
	* delay(5000)
	And input('#un' , 'santosh.kumar@yexle.com')
	* delay(2000)
	And input('#pw' , 'demo@123')
	* delay(2000)
	And mouse("input[value='Sign In']").click()
	* delay(10000)
	And mouse("//span[text()='Exporter']").click()
	* delay(10000)
	* mouse(buyerRefIdDD).click()
	* delay(5000)
	# Clicking on First Dropdown value 
	* highlight(buyerRefIdDDFirstValue)
	* mouse(buyerRefIdDDFirstValue).click()
	* delay(5000)
	#status dropdown
	* mouse(statusDD).click()
	* delay(5000)
	# Fetching all Dropdown Values 
	* highlight(statusDDAllValues)
	#* mouse(statusDDAllValues).click()
	* def StatusDDList = locateAll(statusDDAllValues)
	* delay(5000) 
	* print StatusDDList
	* def fun =
"""
function(e) {

var text = e.getText();

if (text === 'Verified') {
    e.mouse().click();
    karate.log('The Clicked Drop down value is : ' + text);
    delay(5000);
  }   
}

"""
* StatusDDList.forEach(fun)
	
	
	
	
	
	
	
	
	
	