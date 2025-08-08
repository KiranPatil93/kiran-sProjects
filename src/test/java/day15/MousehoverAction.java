package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointMe = driver.findElement(By.xpath("//button[text()='Point Me']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",pointMe);
		Thread.sleep(1000);
		//mouse over 
		Actions act = new Actions(driver);
		act.click(pointMe).perform();
		Thread.sleep(2000);
		WebElement laptops = driver.findElement(By.linkText("Laptops"));
		//laptops.click();
		act.moveToElement(laptops).click().perform();//selenium 3
		//selenium 4
		act.click(laptops).perform();
		

	}

}
