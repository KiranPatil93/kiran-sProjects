package com.qa.page;

import com.qa.utility.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.qa.base.DriverManagerType.driver;
import static com.qa.utility.TestUtil.WaitUtil;
import static com.qa.utility.TestUtil.clickUsingJavascriptExecutor;

public class HomePage extends BasePage {
    @FindBy(css="nav[class='VirtualNavigationHeaderLayout_HELIUM---header VirtualNavigationHeaderLayout_HELIUM---nav_layout VirtualNavigationHeaderLayout_HELIUM---showSiteNameNav'] span span:nth-child(2)")
    WebElement applicationList;
    @FindBy(xpath="//span[text()='Reduced Study Load']")
    WebElement rsl;
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public void OpenApplication() throws InterruptedException {
        WaitUtil(2000);
        clickUsingJavascriptExecutor(applicationList);
        WaitUtil(5000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rsl);
        WaitUtil(2000);
        Actions act = new Actions(driver);
        act.moveToElement(rsl).click().perform();
    }
}
