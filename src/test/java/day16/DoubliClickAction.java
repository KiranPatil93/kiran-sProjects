package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubliClickAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		

		//input[@id='field1']
		//input[@id='field2']
		//button[normalize-space()='Copy Text']
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copyBtn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		//clear text 
		field1.clear();
		field1.sendKeys("Welcome Selenium");
		Actions act = new Actions(driver);
		act.doubleClick(copyBtn).build().perform();
		
	     
		String textField2 = field2.getAttribute("value");
		if(textField2.equals("Welcome Selenium")) {
			System.out.println("Text is copied");
		}else {
			System.out.println("Text is not copy");
		}
	     
		
		
		

	}

}
