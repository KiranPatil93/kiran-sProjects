Feature: Login the Appian Application

	Scenario: Verify the login functionality 
	
	* configure driver = { type: 'chrome', addOptions: ["--remote-allow-origins=*"] }
	
	Given driver 'https://yexledemo.appiancloud.com/suite/sites/aqua/page/home' 
	* delay(2000)
	* maximize()
	* delay(2000)
	And input('#un' , 'santosh.kumar@yexle.com')
	* delay(2000)
	And input('#pw' , 'demo@123')
	* delay(2000)
	And mouse("input[value='Sign In']").click()
	* delay(10000)
	And mouse("//span[text()='Exporter']").click()
	* delay(5000)
	
	
	
	
