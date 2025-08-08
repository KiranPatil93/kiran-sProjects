package day18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutorClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver; //calling 
		//zoom out 50%
		js.executeScript("document.body.style.zoom = '0.5'");
		//zoom in 100%
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '1'");
		//aletrnate fro sendkeys 
		
js.executeScript("document.getElementById('name').value='Welcome'");

//scroll-down 
//js.executeScript("window.scrollBy(0,750)", "");
Thread.sleep(1000);
WebElement maleRadio  = driver.findElement(By.id("male"));
//click
js.executeScript("arguments[0].click();",maleRadio);


//scroll-up 
//js.executeScript("window.scrollBy(0,-300)", "");

//condition scroll untill webelement visible
WebElement section1 = driver.findElement(By.id("input1"));
js.executeScript("arguments[0].scrollIntoView();", section1);
Thread.sleep(1000);

section1.sendKeys("Section1");



	}

}
