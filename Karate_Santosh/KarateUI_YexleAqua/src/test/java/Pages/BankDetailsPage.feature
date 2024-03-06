Feature: Bank Details of Invidividual Buyer

	Scenario: Verify the Bank Details of Individual Buyer
	
	* configure driver = { type: 'chrome', addOptions: ["--remote-allow-origins=*"] }
	
  * def accountHolderName = "//label[text()='Account Holder Name']/parent::div/following-sibling::div/div//input"
	* def branchName = "//label[text()='Branch Name']/parent::div/following-sibling::div/div//input"
	* def accountNumber = "//label[text()='Account Number']/parent::div/following-sibling::div/div//input"
	* def branchCode = "//label[text()='Branch Code']/parent::div/following-sibling::div/div//input"
	* def ifscCode = "//label[text()='IFSC Code']/parent::div/following-sibling::div/div//input"
	* def branchAddress = "//label[text()='Branch Address']/parent::div/following-sibling::div/div//input"
	* def nextButton2 = "//span[text()='Next']"
	* def nextButton1 = "//span[text()='Next']/parent::span/parent::button"
	
	
	Given input(accountHolderName , 'Santosh Kumar')
	* delay(2000)
	And input(branchName , 'Hitech city')
  * delay(2000)
  And input(accountNumber , '9876543210')
  * delay(2000)
  And input(branchCode , '6308')
  * delay(2000)
  And input(ifscCode , 'icic0006308')
  * delay(2000)
  And input(branchAddress , 'Hyd,secbd')
	* delay(10000)
	* scroll(nextButton2)
	* highlight(nextButton2)	
	And submit().click(nextButton2)
	
	
	
	
	