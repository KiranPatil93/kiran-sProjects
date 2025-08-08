package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {
	public static void Selecdropdown(WebElement element, String text ) {
		Select se = new Select(element);
		se.selectByVisibleText(text);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		String year = "2027";
		String month = "Sep";
		String date = "27";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		Thread.sleep(1000);
		//select year
		WebElement yearDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Selecdropdown(yearDrop,year );
		Thread.sleep(1000);
		//select month
		WebElement monthDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Selecdropdown(monthDrop,month);
		Thread.sleep(1000);
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		int totalDates = allDates.size();
		for(WebElement dat:allDates ) {
			String txtDate = dat.getText();
			if(txtDate.equals(date)) {
				dat.click();
				break;
			}
		}
		
	}

}
