package day9;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
//		simpleAlert.click();
	
//		System.out.println(myAlert.getText());
//		Thread.sleep(2000);
//		myAlert.accept();//click on ok 
		
//		
//		WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirmBtn']"));
//		confirmAlert.click();
//		Thread.sleep(2000);
//		Alert myAlert = driver.switchTo().alert();
//		myAlert.dismiss();
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[@id='promptBtn']"));
		promptAlert.click();
		Thread.sleep(2000);
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("Selenium");
		Thread.sleep(2000);
		myAlert.accept();
		
		
		
	}

}
