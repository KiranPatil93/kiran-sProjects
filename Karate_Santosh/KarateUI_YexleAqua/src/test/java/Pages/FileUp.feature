Feature: File Upload Functionality

	Scenario: Verify the File Upload Functionality
	
	* configure driver = { type: 'chrome', addOptions: ["--remote-allow-origins=*"] }
	
	* def nextButton2 = "//span[text()='Next']"
	* def nextButton1 = "//span[text()='Next']/parent::span/parent::button"
	

	* call read('classpath:Utilities/Login.feature')
	
	* def addNewBuyer = "//span[text()='Add New Buyer']"	
	* highlight(addNewBuyer)
	And mouse(addNewBuyer).click()
	* delay(5000)
	And mouse("//span[text()='Individual']").click()
	* delay(10000)
	When click("//span[text()='Next']")
	* delay(5000)
	
	Then input("//label[text()='First Name']/parent::div/following-sibling::div/div/input", 'santosh')
	* delay(2000)
	And input("//label[text()='Middle Name']/parent::div/following-sibling::div/div/input", 'Kumar')
	* delay(2000)
	
	# Click on Next Button
	
	* delay(10000)
	* scroll(nextButton1)
	* highlight(nextButton1)
	Then click(nextButton1)
	* delay(5000)
	
	#Click On Next button
	
	* scroll(nextButton1)
	* highlight(nextButton1)	
	#And submit().click(nextButton1)
	And click(nextButton1)
	
	# click on Next Button
	
	* scroll(nextButton2)
	* highlight(nextButton2)	
	#And submit().click(nextButton2)
	 And click(nextButton2)
	
	# Bank details
	
	* call read('classpath:Pages/BankDetailsPage.feature')
	* delay(5000)
	
	
	
	
	
	
	
	
	
	
	
	
	