package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://expired.badssl.com/");
        String title = driver.getTitle();//actual result
        System.out.println(title);


    }
}
