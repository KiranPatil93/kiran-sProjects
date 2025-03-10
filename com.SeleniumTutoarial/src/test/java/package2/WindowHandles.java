package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement link = driver.findElement(By.linkText("orange HRM"));
        String parentWindowID = driver.getWindowHandle();
        //ctrl + click
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
        Set<String> ids = driver.getWindowHandles();
        //method 1 set to list
//        List<String> windowIds = new ArrayList(ids);
//        String childWindow = windowIds.get(1); //ABE691A737512F86920A2B558B92C14B
//        driver.switchTo().window(childWindow);
//        String childWindow_Title = driver.getTitle();
//        System.out.println("Child Window title is " + childWindow_Title);

        //method direct set
        for(String handle:ids){
            if(!handle.equals(parentWindowID)){
                driver.switchTo().window(handle);
                break;
            }
        }
        String childWindow_Title = driver.getTitle();
       System.out.println("Child Window title is " + childWindow_Title);



    }
}
