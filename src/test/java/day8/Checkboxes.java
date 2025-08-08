package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//select all checkboxes
		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		int chSize =checkboxes.size();
		System.out.println(chSize);
		
//		for(int i=0;i<chSize;i++) {
//			checkboxes.get(i).click();
//		}
		
//		for(WebElement checkbox:checkboxes) {
//			checkbox.click();
//		}
		
		//select first 3 checkboxes
//		for(int i=0;i<3;i++) {
//			checkboxes.get(i).click();
//		}
		
		//select last 3 checkboxes
//		for(int i=4;i<chSize;i++) {
//			checkboxes.get(i).click();
//		}
		
		//unselect checkboxes if it is selected
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
			
		}
		Thread.sleep(1000);
		for(WebElement checkbox:checkboxes) {
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
