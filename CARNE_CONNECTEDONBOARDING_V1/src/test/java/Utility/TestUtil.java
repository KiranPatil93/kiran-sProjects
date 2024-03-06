package Utility;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class TestUtil extends WebDriverManager{
    static long PAGE_LOAD_TIMEOUT = 20;
    static long IMPLICIT_WAIT = 30;

    public static long getPAGE_LOAD_TIMEOUT(){
        return PAGE_LOAD_TIMEOUT;
    }

    public static void setPAGE_LOAD_TIMEOUT(long pAGE_LOAD_TIMEOUT) {
        PAGE_LOAD_TIMEOUT = pAGE_LOAD_TIMEOUT;
    }
    public static long getIMPLICIT_WAIT() {
        return IMPLICIT_WAIT;
    }

    public static void setIMPLICIT_WAIT(long iMPLICIT_WAIT) {

        IMPLICIT_WAIT = iMPLICIT_WAIT;
    }

   /* public static void takeScreenshotAtEndOfTest() throws IOException {
        // logger.info("Take Screenshot");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");

        FileUtils.copyFile(scrFile, new File(currentDir + "Screenshots" + System.currentTimeMillis() + ".png"));

    }*/

    public static void scrollToViewByJavaScriptExecutor(WebElement elementToView){
        WaitUtil.waitTill(3);
        // Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", elementToView);

    }


    public static void scrollDown() {
        WaitUtil.waitTill(3);
        // Creating the JavascriptExecutor interface object by Type casting
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//       // js.executeScript("window.scrollBy(0,350)", "");
//        Actions a = new Actions(driver);
//      //scroll down a page
//      a.sendKeys(Keys.ARROW_DOWN).build().perform();

        Robot robot;
        try {
            robot = new Robot();
            // Scroll Down using Robot class
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



    public static void scrollUp() {
        WaitUtil.waitTill(3);
        // Creating the JavascriptExecutor interface object by Type casting
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//       // js.executeScript("window.scrollBy(0,350)", "");
//        Actions a = new Actions(driver);
//      //scroll down a page
//      a.sendKeys(Keys.ARROW_DOWN).build().perform();

        Robot robot;
        try {
            robot = new Robot();
            // Scroll Down using Robot class
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            //reportLog("Page Scroll Up");

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void scrollToView(WebElement elementToView) {
        WaitUtil.waitTill(3);

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToView);
        actions.perform();

    }

    public static void scrollTopToBottomJavascriptExecutor() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        jse.executeScript("window.scrollBy(0,350)", "");
    }

    public static void switchToFrame(WebElement frameElement) {
        WaitUtil.waitTill(3);
        driver.switchTo().frame(frameElement);

    }

    public static void switchToDefaultFrame() {
        WaitUtil.waitTill(3);
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }

    public static void keyboardButtonENTER() {
        Actions a = new Actions(driver);
        // scroll down a page
        a.sendKeys(Keys.ENTER).build().perform();
    }

    public static void keyboardButtonTAB() {
        Actions a = new Actions(driver);
        // scroll down a page
        a.sendKeys(Keys.TAB).build().perform();
    }

    public static void keyboardButtonPAGEDOWN() {
        Actions a = new Actions(driver);
        // scroll down a page
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    public static void selectFromDropDownByVisibleText(WebElement element, String itemText) {
        Select item = new Select(element);
        item.selectByVisibleText(itemText);
    }

    public static boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } // try
        catch (NoAlertPresentException Ex) {
            return false;
        } // catch
    } // isAlertPresent()

    public static void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public static void dismisstAlert() {
        driver.switchTo().alert().dismiss();
        ;
    }
    public static void selectdropdownValue(String option){
        WaitUtil.waitTill(3);
        for (int i = 0; i < 3; i++) {
            try {
                List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(@class,'MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget')]"));
                for (WebElement dropoption : allOptions) {
                    String txtoptions = dropoption.getText();
                    System.out.println(txtoptions);
                    if (txtoptions.equals(option)) {
                        //dropoption.click();
                        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", dropoption);
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }


    /**
     *
     * method to wait for element presence by webelement
     *
     */

    public void waitForElement(WebElement element) {

        //logger.info("[COMMAND] WAIT FOR ELEMENT ");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            wait.until(ExpectedConditions.visibilityOf(element));

            //  logger.info("[RESPONSE] WAIT FOR ELEMENT, ELEMENT IS PRESENT FOR LOCATOR : " + element.getText());

        } catch (Exception e) {

            // logger.error("[RESPONSE] WAIT FOR ELEMENT, ELEMENT IS NOT PRESENT FOR LOCATOR : " + element + e);

            Assert.fail("Exception : " + e);

        }

    }

    /**
     *
     * method to click on the element
     *
     */

    public void clickOnElement(WebElement element) {

        //waitForElement(element);


        //logger.info("[COMMAND] CLICK ON ELEMENT FOR LOCATOR :" + element);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(element));

            waitElement.click();

            //  logger.info("[RESPONSE] CLICKED ON ELEMENT FOR LOCATOR : " + element.toString());

        } catch (Exception e) {

            // logger.error("[RESPONSE] FAILED TO CLICK ON ELEMENT FOR LOCATOR : " + element + e);

            Assert.fail("Exception : " + e);

        }

    }
    public static void clickByJavaScriptExecutor(WebElement elementToClick){
        WaitUtil.waitTill(3);
        // Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", elementToClick);

    }

    public static void clickByUsingActionsClass(WebElement element) {
        WaitUtil.waitTill(3);
        Actions act = new Actions(driver);
        act.moveToElement(element).click().build().perform();
    }
    /**
     *
     * method to enter text into textElement
     *
     */

    public void enterTextField(WebElement element, String value) {
        waitForElement(element);

        // logger.info("[COMMAND] ENTER TEXT VALUE \"" + value + "\" FOR LOCATOR : " + element);

        try {

            clickOnElement(element);

            element.clear();

            element.sendKeys(value);

            //  logger.info("[RESPONSE] ENTERED TEXT VALUE \"" + value + "\" FOR LOCATOR : " + element.toString());

        } catch (Exception e) {

            //  logger.error("[RESPONSE] FAILED TO ENTERED TEXT VALUE \"" + value + "\" FOR LOCATOR : " + element.toString());

            Assert.fail("Exception : " + e);

        }

    }

    /**
     *
     * method to clear value
     *
     */

    public void clearValue(WebElement element) {

        waitForElement(element);

        //  logger.info("[COMMAND] CLEAR VALUE FOR ELEMENT :" + element.toString());

        try {

            element.clear();

            //logger.info("[RESPONSE] CLEARED VALUE FOR ELEMENT :" + element.toString());

        } catch (Exception e) {

            //logger.warn("[RESPONSE] UNABLE TO CLEARED VALUE FOR ELEMENT :" + element.toString());

        }

    }


    /**
     *
     * method to click on the element
     *
     */

    public void selectFromDropDown(WebElement element, String  drpopDownOptionToSelect) {

        WebElement dropDownElement = null;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {


            WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(dropDownElement));

            dropDownElement.click();



            //  logger.info("[RESPONSE] CLICKED ON ELEMENT FOR LOCATOR : " + dropDownElement.toString());

        } catch (Exception e) {

            // logger.error("[RESPONSE] FAILED TO CLICK ON ELEMENT FOR LOCATOR : " + dropDownElement + e);

            Assert.fail("Exception : " + e);

        }

    }


    public static void mouseOverActions(WebElement elementToMove) {
        WaitUtil.waitTill(3);
        Actions act = new Actions(driver);
        act.moveToElement(elementToMove).perform();
    }


}
