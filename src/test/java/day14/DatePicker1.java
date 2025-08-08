package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	
	public static void getFutureDate(WebDriver driver,String month,String year) {
		while(true) {
			String actual_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actual_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(actual_month.equals(month)&&actual_year.equals(year)) {
				break;
			}
			WebElement nextLink = driver.findElement(By.xpath("//span[text()='Next']"));
			nextLink.click();
			
		}
	}
	
	public static void getPastDate(WebDriver driver,String month,String year) {
		while(true) {
			String actual_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actual_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(actual_month.equals(month)&&actual_year.equals(year)) {
				break;
			}
			WebElement nextLink = driver.findElement(By.xpath("//span[text()='Prev']"));
			nextLink.click();
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement inputField = driver.findElement(By.xpath("//input[@id='datepicker']"));
		//inputField.sendKeys("04/22/2026");
		String year = "2023";
		String month = "November";
		String date = "20";
		inputField.click();
		//getFutureDate(driver,month,year);
		getPastDate(driver,month,year);
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		int totalDates = allDates.size();
		for(WebElement dat:allDates ) {
			String txtDate = dat.getText();
			if(txtDate.equals(date)) {
				dat.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		driver.switchTo().defaultContent();
	}

}
