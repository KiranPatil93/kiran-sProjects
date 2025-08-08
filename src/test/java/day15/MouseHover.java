package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement pointMe = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",pointMe);
		 
	     Actions act = new Actions(driver);
	     act.moveToElement(pointMe).build().perform();
	     Thread.sleep(2000);
	     WebElement laptop = driver.findElement(By.linkText("Laptops"));
	     act.moveToElement(laptop).click().build().perform();
	
	     
	
	
	
	}

}
