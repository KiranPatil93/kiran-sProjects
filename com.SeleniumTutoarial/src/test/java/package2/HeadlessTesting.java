package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless=new");//setting for headless test
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demo.nopcommerce.com/");//open the application
        driver.manage().window().maximize();// maximize screen
        // validate title of the application
        String title = driver.getTitle();//actual result
        System.out.println(title);
        //validation
        if(title.equals("nopCommerce demo store")){
            System.out.println("Test is pass");
        }else{
            System.out.println("Test is fail");
        }
    }
}
