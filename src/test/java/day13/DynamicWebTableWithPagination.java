package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableWithPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//click on admin link
		driver.findElement(By.xpath("//span[text()='Admin']//ancestor::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Nationalities")).click();
		Thread.sleep(1000);
		//capture all nationalities or make a list of nationlities 
		
	List<WebElement> pagination = driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']//li"));
	int totalPagination = pagination.size();
		
		for(int p=1;p<totalPagination;p++) {
			
			Thread.sleep(1000);
			if(p>1) {
				WebElement pageButton = driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//button[text()= "+p+"]"));
				pageButton.click();
			}
			
			List<WebElement> rows = driver.findElements(By.xpath("//table[@role='table]//div[2]//div[2]/div"));
			int rowcount = rows.size();//50
		
			for(int r=2;r<rowcount;r++) {
				String rowText =rows.get(r).getText();
				if(rowText.equals("Swedish")) {
					WebElement checkbox = driver.findElement(By.xpath("//input[@value = "+r+"]"));
					checkbox.click();
					break;
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
