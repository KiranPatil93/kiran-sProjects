package day20;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Incognito {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
          driver.get("https://testautomationpractice.blogspot.com/");
		
		String ActualTitle = driver.getTitle();
		System.out.println("title of the webpage :"+ ActualTitle);
		
		String actURL =driver.getCurrentUrl();
		System.out.println("Url of the webpage :"+ actURL);
		
		
	}

}
