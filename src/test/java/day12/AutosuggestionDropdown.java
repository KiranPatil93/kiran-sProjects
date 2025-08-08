package day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
        driver.switchTo().defaultContent();
		
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(2000);
        
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		for(WebElement option:options) {
			String txtOption = option.getText();
			System.out.println(txtOption);
			if(txtOption.equalsIgnoreCase("selenium testing")){
				option.click();
				break;
			}
		}
		
		
	}

}
