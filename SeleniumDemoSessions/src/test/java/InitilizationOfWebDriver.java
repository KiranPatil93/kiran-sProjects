import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class InitilizationOfWebDriver {
    public static void main(String[] args) throws InterruptedException {



      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\KiranPatil\\IdeaProjects\\SeleniumDemoSessions\\Driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //    driver.get("https://www.flipkart.com/");//open Browser
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
        //capture the title of the page
        String title = driver.getTitle();
        System.out.println(title);
       String url = driver.getCurrentUrl();
        System.out.println(url);
       driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
       Thread.sleep(2000);
        driver.navigate().refresh();

       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kiran");
       Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).clear();

        String tooltip = driver.findElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(tooltip);
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'dropdown-class-example')]"));
       Select select = new Select(dropdown);
       select.selectByValue("option3");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("Verify visibility of webelemnt : "+ radio1.isDisplayed());
        System.out.println(" verify webelemnt enabled or Disabled : " +radio1.isEnabled());
        radio1.click();
        System.out.println(" verify radio button selected or not  : " +radio1.isSelected());
if(radio1.isDisplayed()){
    radio1.click();
}else{
    Assert.fail("radio 1 webelement not present on webpage");

}

//WebElement option2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
//option2.click();
Thread.sleep(3000);
List<WebElement> listOfCheckboxes = driver.findElements(By.xpath("//div[@id='checkbox-example']//child::input"));
int count = listOfCheckboxes.size();
for(int i=0;i<count;i++){
    listOfCheckboxes.get(i).click();
    Thread.sleep(1000);
}









}

}
