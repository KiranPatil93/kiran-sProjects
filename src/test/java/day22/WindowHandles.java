package day22;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String parentWindowID=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).click();
		Set<String> ids = driver.getWindowHandles();
		
//		for(String windowId:ids) {
//			if(!windowId.equals(parentWindowID)) {
//				driver.switchTo().window(windowId);
//				break;
//			}
//		}
		
		//convert set to list
		List<String> windowIds = new ArrayList(ids);
		String childWindow = windowIds.get(1);
		driver.switchTo().window(childWindow);
		
		
		String childWindow_Title = driver.getTitle();
		System.out.println("Child window title"+childWindow_Title);

	}

}
