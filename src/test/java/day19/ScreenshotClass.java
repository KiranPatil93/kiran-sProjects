package day19;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//fullpage screenshot
		//call to Takescreenshot interface 
		TakesScreenshot ts = (TakesScreenshot)driver;//optional 
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
	//	sourceFile.renameTo(targetFile);//copy 
		
		//screenshort of section
		WebElement header = driver.findElement(By.id("header"));
	File sourecFile1 = header.getScreenshotAs(OutputType.FILE);
	File targetFile1 = new File(System.getProperty("user.dir")+"\\Screenshots\\section.png");
	//sourecFile1.renameTo(targetFile1);//copy 
	
	//screenshot of webelement
	
	WebElement logo = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
	File sourecFile2 = logo.getScreenshotAs(OutputType.FILE);
	File targetFile2 = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
	sourecFile2.renameTo(targetFile2);//copy 

	}

}
