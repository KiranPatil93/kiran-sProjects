package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//capture all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links present : "+links.size());//33
		
		int noOfBrokenLinks =0;
		for(WebElement linkElement:links) {
			String hrefAttValue = linkElement.getAttribute("href");
			if(hrefAttValue==null||hrefAttValue.isEmpty()) {
				System.out.println("href attribute value is null or empty. not possible to check");
				continue;
			}
			try {
			//string convert url 
			URL linkURL = new URL(hrefAttValue);
			
			HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection();
			//open connection in server
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefAttValue+"Broken link ");
				noOfBrokenLinks++;
			}else {
				System.out.println("Not Broken link ");
			}
			
			}catch(Exception e) {
				
			}
		}
		System.out.println("Broken link count"+noOfBrokenLinks);
		
	}

}
