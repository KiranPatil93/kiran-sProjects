Feature: Login Fucntionality of Aqua Application

	Scenario: Verify the Login Fucntionality 
	
	* configure driver = { type: 'chrome', addOptions: ["--remote-allow-origins=*"] }
	
	* def signInbtn = "input[value='Sign In']"
	* def exporerMenuLink = "//span[text()='Exporter']"
	
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
	
	
	
	
	