package Day5;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class getMethodsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	String ActualTitle = driver.getTitle();
	System.out.println("title of the webpage :"+ ActualTitle);
	
	String actURL =driver.getCurrentUrl();
	System.out.println("Url of the webpage :"+ actURL);
		
		//String pageSource = driver.getPageSource();
		
	//	System.out.println(pageSource);
		
	   // String singleWindowID  =  driver.getWindowHandle();
	   // System.out.println("Window ID :"+singleWindowID);//94C00F5F7872BB43DFE6BAA97CA83CD6
		
	    driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	    Set<String> windowIds = driver.getWindowHandles();
	    System.out.println(windowIds);
		
	}

}
