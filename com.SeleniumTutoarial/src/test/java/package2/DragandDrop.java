package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class DragandDrop {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(dragElement,dropElement).build().perform();
        WebElement linkopen = driver.findElement(By.xpath("//a[normalize-space()='orange HRM']"));
       String parentwindowID = driver.getWindowHandle();
        act.keyDown(Keys.CONTROL).click(linkopen).keyUp(Keys.CONTROL).build().perform();
        Set<String> ids = driver.getWindowHandles();
//        List<String> windowIds = new ArrayList(ids);
//        String childWindowId = windowIds.get(1);
//        System.out.println("Child window Id is "+childWindowId );
//        driver.switchTo().window(childWindowId);
//        String childwindowTitle = driver.getTitle();
//        System.out.println(childwindowTitle);

        for(String handle:ids){
            if(!handle.equals(parentwindowID)){
                driver.switchTo().window(handle);
                break;
            }
        }
        String childWindowTitle = driver.getTitle();
        System.out.println(childWindowTitle);
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);




    }
}
