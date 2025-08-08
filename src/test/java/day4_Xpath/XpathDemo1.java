package day4_Xpath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class XpathDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/boards");
		driver.manage().window().maximize();
		//xpath with single attribute 
	//	driver.findElement(By.xpath("//*[@id='forums-small-searchterms']")).sendKeys("T-shirt");
		
		//xpath with multiple attributes 
		//driver.findElement(By.xpath("//input[@id='forums-small-searchterms'][@placeholder='Search forums']")).sendKeys("Java");
		
		//xpath using and or operator 
		
	//	driver.findElement(By.xpath("//input[@id='forums-small-searchterms'and @placeholder='Search forums']")).sendKeys("Java program");
		
		//driver.findElement(By.xpath("//input[@id='forums-small-searchterms'or @placeholder='Search ']")).sendKeys("Java program");
		
		boolean verifyMessage = driver.findElement(By.xpath("//*[text()='To start viewing messages, select the forum that you want to visit from the selections below.']")).isDisplayed();
		
		if(verifyMessage==true) {
			System.out.println("Test is pass");
			System.out.print(verifyMessage);
		}else {
			System.out.println("Test is fail");
		}
		String ExpectedResult = "To start viewing messages, select the forum that you want to visit from the selections below";
		String atualResult = driver.findElement(By.xpath("//*[text()='To start viewing messages, select the forum that you want to visit from the selections below.']")).getText();
		System.out.println(atualResult);
		if(ExpectedResult.contains(atualResult)) {
			System.out.print("Test is pass");
		}
		else {
			System.out.print("Test is fail");
		}
		
		
		
	}

}
