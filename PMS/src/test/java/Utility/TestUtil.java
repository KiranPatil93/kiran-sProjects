package Utility;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import com.appiancorp.ps.cucumber.fixtures.CucumberTempoFixture;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class TestUtil extends BaseFixture {

    private static CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver= ctf.getSettings().getDriver();

public static void zoomOut(){
    Actions actions = new Actions(driver);
    // Zoom out using "Ctrl" + "-"
    actions.keyDown(Keys.CONTROL).sendKeys("-").keyUp(Keys.CONTROL).perform();
}
    public static void zoomIn(){
        int zoomPercentage = 60;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom = arguments[0] + '%';", zoomPercentage);
    }

    public static void selectdropdownValue(String option) {

        int flag = 0;
        // for (int i = 0; i < 3; i++) {
        try {
            List<WebElement> allOptions = driver.findElements(By.xpath("//li[contains(@role,'option')]"));
            for (WebElement dropoption : allOptions) {
                String txtoptions = dropoption.getText();
                System.out.println(txtoptions);
                if (txtoptions.toString().equals(option)) {
                    Actions act = new Actions(driver);
                    act.moveToElement(dropoption).click().build().perform();
                    flag = 1;// Set to 1 when the required element was found and clicked.
                    break;
                }

            }

        } catch (StaleElementReferenceException e) {
            List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(@class,'MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget')]"));
            for (WebElement dropoption : allOptions) {
                String txtoptions = dropoption.getText();
                System.out.println(txtoptions);
                if (txtoptions.toString().equals(option)) {
                    Actions act = new Actions(driver);
                    act.moveToElement(dropoption).click().build().perform();
                    flag = 1;// Set to 1 when the required element was found and clicked.
                    break;
                }

            }
        }

    }
public static void autosuggetionDropdown(String option, String locator1,String locator2) throws InterruptedException {
       Actions act = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element1 = driver.findElement(By.xpath(locator1));
    //element1.click();
   // act.moveToElement(element1).click().build().perform();
    js.executeScript("arguments[0].click();", element1);
   // Thread.sleep(1000);
  //  act.moveToElement(element1).click().build().perform();
    Thread.sleep(10000);
    WebElement element2 = driver.findElement(By.xpath(locator2));
    Thread.sleep(1000);
    element2.sendKeys(option);
    Thread.sleep(2000);
    List<WebElement> searchSuggetions = driver.findElements(By.xpath("//li[@role='option']"));
    for(WebElement suggetion:searchSuggetions){
        String textSuggetion = suggetion.getText();
        System.out.println(textSuggetion);
        if(textSuggetion.contains(option)){
            act.moveToElement(suggetion).click().build().perform();
        }
    }
}

public static void uploadFile(String filePath, String locator) throws InterruptedException {
   WebElement fileupload = driver.findElement(By.xpath(locator));
    fileupload.sendKeys(filePath);
}

    public static void enterComment(String comment, String locator) throws InterruptedException {
        WebElement fileupload = driver.findElement(By.xpath(locator));
        fileupload.sendKeys(comment);
    }

public static void clickUsingJavaScriptExecutor(String locator){
    WebElement element = driver.findElement(By.xpath(locator));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);
}

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

public static int randomNumberBetween50to150(){
    // Create a Random object
    Random random = new Random();

    // Generate a random number between 50 and 150
    int randomDays = random.nextInt(101) + 50; // Generates a number between 0 and 100 and adds 50

    // Print the random number generated
    System.out.println("Random days: " + randomDays);
    return randomDays;
}





































































}
