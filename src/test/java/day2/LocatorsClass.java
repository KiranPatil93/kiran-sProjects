package day2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatorsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  
 Thread.sleep(1000);
 
 // driver.findElement(By.id("dropdown-class-example")).click();
  
  //  driver.findElement(By.name("dropdown-class-example")).click();
  
  
 // driver.findElement(By.linkText("Open Tab")).click();
 // driver.findElement(By.partialLinkText("Tab")).click();
    List<WebElement> table = driver.findElements(By.className("left-align"));
    System.out.println("Number of elements present :"+ table.size());
    
      List<WebElement> links = driver.findElements(By.tagName("a"));
  
      System.out.println("Number of links present :"+ links.size());
	}

}
