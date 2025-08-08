package day3;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/boards");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#forums-small-searchterms")).sendKeys("mobile");
		//driver.findElement(By.cssSelector("input.search-box-input")).sendKeys("Selenium");
		//driver.findElement(By.cssSelector("input[placeholder='Search forums']")).sendKeys("Webdriver");
		driver.findElement(By.cssSelector("input.search-box-input[placeholder='Search forums']")).sendKeys("Selenium WebDriver");
		
		
	}

}
