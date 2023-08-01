package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtil extends DriverFactory{
    public static boolean waitForElement(WebDriver driver, WebElement element, int maxWait) {
        boolean statusOfElementToBeReturned = false;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxWait));
        try {
            WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(element));
            if (waitElement.isDisplayed() && waitElement.isEnabled()) {
                statusOfElementToBeReturned = true;
                //Log.event("Element is displayed:: " + element.toString());
            }
        } catch (Exception e) {
            try {
                throw new Exception("Unable to find a element after " + maxWait + " sec ==> "
                        + element.toString());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        return statusOfElementToBeReturned;
    }

    public static boolean waitForElementLoadTime(WebDriver driver, WebElement element, int maxWait) {
        boolean statusOfElementToBeReturned = false;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxWait));
        try {
            WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(element));
            if (waitElement.isDisplayed() && waitElement.isEnabled()) {
                statusOfElementToBeReturned = true;
                // Log.event("Element is displayed: " + element.toString());
                // Log.message(element.toString() + "is displayed after: " + maxWait + " seconds");
            }
        } catch (Exception ex) {
            statusOfElementToBeReturned = false;
            // Log.event("Unable to find an element after " + maxWait + " sec");
            //  Log.message(element.toString() + "Is not displayed after: " + maxWait + " seconds");
        }
        return statusOfElementToBeReturned;
    }


    public static void waitForVisibilityOfElement(WebDriver driver, WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void waitTill(int value) {
        try {
            int waitTime = value * 1000;
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
