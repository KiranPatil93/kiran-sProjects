package day24;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelUtil;

public class TestDriven {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		String filepath = System.getProperty("user.dir")+"\\TestData\\AutomationData.xlsx";
		int rows = ExcelUtil.getRowCount(filepath,"Sheet1");
		System.out.println("Rows "+rows);
		for(int r=1;r<=rows;r++) {
			String name = ExcelUtil.getCellData(filepath, "Sheet1", r, 0);
			driver.findElement(By.id("name")).sendKeys(name);
			
			String email =ExcelUtil.getCellData(filepath, "Sheet1", r, 1);
			driver.findElement(By.id("email")).sendKeys(email);
			
			
			String phoneNo = ExcelUtil.getCellData(filepath, "Sheet1", r, 2);
			driver.findElement(By.id("phone")).sendKeys(phoneNo);
			
			String address = ExcelUtil.getCellData(filepath, "Sheet1", r, 3);
			driver.findElement(By.id("textarea")).sendKeys(address);
			
			
			//select country
			String country =  ExcelUtil.getCellData(filepath, "Sheet1", r, 4);
			WebElement countryDrop = driver.findElement(By.id("country"));
			Select se = new Select(countryDrop);
			se.selectByVisibleText(country);
			
			String datepickerr = ExcelUtil.getCellData(filepath, "Sheet1", r, 5);
			driver.findElement(By.id("datepicker")).sendKeys(datepickerr);
			
			
			
		}

	}

}
