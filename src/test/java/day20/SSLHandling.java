package day20;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SSLHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		String title = driver.getTitle();//actual result
        System.out.println(title);
	}

}
