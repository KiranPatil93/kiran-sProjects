Feature: Add New Buy Button with functionality

	Scenario: Verify the Exporter with Add new Buy Button
	
	* configure driver = { type: 'chrome', addOptions: ["--remote-allow-origins=*"] }
	* def signInbtn = "input[value='Sign In']"
	* def exporerMenuLink = "//span[text()='Exporter']"
	* def addNewBuyer = "//span[text()='Add New Buyer']"	
	* def nextButton = "//span[text()='Next']/parent::span/parent::button/parent::div"
	* def nextButton1 = "//span[text()='Next']/parent::span/parent::button"
	* def nextButton2 = "//span[text()='Next']"
	* def addDetailsLink = "//a[text()='Add Details']"
	* def firstName = "//td//div//input[@id='96ff06ed303c49176cf99088a9c3fa6b']"
	* def lastName = "//td//div//input[@id='e73a7a0ce26403a8f19de2b4d3984b7e']"
	* def role = "//td//div//input[@id='55b9465a10e5adcf14d9302f983a4089']"
	* def phone = "//td//div//input[@id='5aa4a0a1e7b6e993d1e33fcd477ada07']"
	* def email = "//td//div//input[@id='7f31e6923d9d554d171b1365194f7fd3']"
	* def address = "//td//div//textarea[@id='0169047643adfc52d20a28176a80fcfa']"
	* def comment = "//td//div//textarea[@id='7fdfe6e8b8cfa9c16963d2dd3fd4c546']"
	
	Given driver 'https://yexledemo.appiancloud.com/suite/sites/aqua/page/home' 
	* delay(2000)
	* maximize()
	* delay(5000)
	* highlight('#un')
	* delay(5000)
	And input('#un' , 'santosh.kumar@yexle.com')
	* delay(2000)
	* highlight('#pw')
	And input('#pw' , 'demo@123')
	* delay(2000)
	* highlight(signInbtn)
	And mouse(signInbtn).click()
	* delay(10000)
	And mouse(exporerMenuLink).click()
	* delay(10000)
	* highlight(addNewBuyer)
	And mouse(addNewBuyer).click()
	* delay(5000)
	And mouse("//span[text()='Individual']").click()
	* delay(10000)
	#Then mouse("//span[text()='Next']").click()
	
	When click("//span[text()='Next']")
	* delay(5000)
	Then input("//label[text()='First Name']/parent::div/following-sibling::div/div/input", 'santosh')

	* delay(10000)
	#Then mouse("//span[text()='Next']/parent::span/parent::button").click()
	* scroll(nextButton1)
	* highlight(nextButton1)
	#And click("nextButton2")
	#Then mouse("nextButton").click()
	Then click(nextButton1)
	* delay(5000)
	#Click On Next button
	* scroll(nextButton1)
	* highlight(nextButton1)	
	And submit().click(nextButton1)


#fileupload

  * driver.inputFile("//span[text()='Upload']", "file:src/main/java/resources/sample.pdf")
	
	
	
	
	
	
	
	
	
	