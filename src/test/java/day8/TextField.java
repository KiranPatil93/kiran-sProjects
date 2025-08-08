package day8;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//enter text in textfield
		//name 
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("74873948");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("hdiwhwojdwoeiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		

	}

}
