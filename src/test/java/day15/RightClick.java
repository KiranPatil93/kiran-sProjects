package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		WebElement rightClickkButton=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
	Actions act = new Actions(driver);
	act.contextClick(rightClickkButton).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	
	}

}
