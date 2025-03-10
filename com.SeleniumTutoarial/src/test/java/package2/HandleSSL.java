package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSSL {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://expired.badssl.com/");
        System.out.println("Title of the page -  " + driver.getTitle());
    }
}
