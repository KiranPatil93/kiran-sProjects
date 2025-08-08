package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		//single file upload
		String filepath = "C:\\Users\\KiranPatil\\eclipse-workspace\\JAVA\\Com.Selenium.Tutorial\\TestData\\fileUpload.doc";
		//driver.findElement(By.id("filesToUpload")).sendKeys(filepath);

	//multiple fileupload 
String file2= "C:\\Users\\KiranPatil\\eclipse-workspace\\JAVA\\Com.Selenium.Tutorial\\TestData\\file2.xlsx";

driver.findElement(By.id("filesToUpload")).sendKeys(filepath+"\n"+file2);


List<WebElement> textFile = driver.findElements(By.xpath("//ul[@id='fileList']//li"));
for(WebElement file: textFile) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].style.border='3px solid red'", file);
}

	
	}
	
}
