package com.qa.page;

import com.qa.utility.BasePage;
import com.qa.utility.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import static com.qa.base.DriverManagerType.driver;

public class ApplicationSubmissionPage extends BasePage {
@FindBy(xpath="//span[contains(text(),'Course Level')]//preceding::div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder']")
    WebElement coursedDrop;
@FindBy(xpath="//span[contains(text(),'Year')]//following::div[4]")
WebElement years;
@FindBy(xpath="//span[contains(text(),'Session')]//following::div[4]")
WebElement sessions;
@FindBy(xpath="//input[@type='text']")
WebElement creditPoint;
    @FindBy(xpath="//p[contains(text(),'Contemporary Global Perspectives on Strategy')]//preceding::input[1]")
    WebElement subjectChbox;
    @FindBy(xpath="//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder']")
    WebElement reasonDrop;
    @FindBy(xpath="//textarea[@class='ParagraphWidget---textarea ParagraphWidget---align_start ParagraphWidget---height_medium ParagraphWidget---hasCharacterCount']")
    WebElement txtFurtherDetails;
    @FindBy(xpath="//button[@class='Button---btn Button---default_direction Button---secondary Button---small Button---minimize_width Button---icon_start']")
    WebElement uploadBtn;
    @FindBy(xpath="//button[@class='Button---btn Button---default_direction Button---solid appian-context-first-in-list appian-context-last-in-list Button---icon_start']")
    WebElement nextBtn;
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement agreeChbox;
    @FindBy(xpath="//button[@class='Button---btn Button---default_direction Button---solid appian-context-first-in-list appian-context-last-in-list Button---icon_start']")
    WebElement submitBtn;
    public ApplicationSubmissionPage(){
        PageFactory.initElements(driver, this);
    }

    //An International non HDR undergraduate student   having enrolled into multiple courses with active or restricted status
public void switchToApplicationSubmissionWindow() throws InterruptedException {
    Thread.sleep(2000);
    String parentWindowID = driver.getWindowHandle();
    Set<String> ids = driver.getWindowHandles();
    for(String handle:ids){
        if(!handle.equals(parentWindowID)){
            driver.switchTo().window(handle);
            break;
        }
    }
    String childWindow_Title = driver.getTitle();
    System.out.println("Child Window title is " + childWindow_Title);
}
    public void selectCourse(String option) throws InterruptedException {
       Thread.sleep(5000);
        TestUtil.clickUsingJavascriptExecutor(coursedDrop);
        Thread.sleep(2000);
        TestUtil.selectdropdownValue(option);
    }
public void selectYear(String yearValue) throws InterruptedException {
    Thread.sleep(2000);
    TestUtil.clickUsingJavascriptExecutor(years);
    //Thread.sleep(2000);
    TestUtil.selectdropdownValue("2023");
}
public void selectSession(String sessionValue) throws InterruptedException {
    Thread.sleep(2000);
    TestUtil.clickUsingJavascriptExecutor(sessions);
    Thread.sleep(2000);
    TestUtil.selectdropdownValue(sessionValue);
}
public void enterCreditPoints(String creditPoints) throws InterruptedException {
    Thread.sleep(2000);
    creditPoint.sendKeys("10");

}
//subjectChbox
    public void selectSubject(String subject) throws InterruptedException {
        Thread.sleep(2000);
        TestUtil.clickUsingJavascriptExecutor(subjectChbox);
    }
public void selectReason(String reasonvalue) throws InterruptedException {
    Thread.sleep(2000);
    TestUtil.clickUsingJavascriptExecutor(reasonDrop);
    Thread.sleep(2000);
    TestUtil.selectdropdownValue(reasonvalue);
}
public void enterFurtherDetails(String furthDetails) throws InterruptedException {
    Thread.sleep(2000);
    txtFurtherDetails.sendKeys(furthDetails);
}
public void uploadDocuments() throws InterruptedException, AWTException {
        String pdfFile = System.getProperty("user.dir")+"\\testData\\samplepdf.pdf";
//uploadBtn
    Thread.sleep(1000);
   // uploadBtn.sendKeys(pdfFile);
    uploadBtn.click();
    Thread.sleep(5000);
    Robot robot = new Robot();
    StringSelection filePath = new StringSelection(pdfFile);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
    // CTRL+V to paste the file path into the file upload dialog
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    // Press Enter to close the file upload dialog
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
}
//nextBtn
    public void clickOnNextBtn() throws InterruptedException {
        Thread.sleep(5000);
        nextBtn.click();
    }
    //agreeChbox
    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(5000);
        TestUtil.clickUsingJavascriptExecutor(agreeChbox);
    }
    //submitBtn
    public void clickOnSubmit() throws InterruptedException {
        Thread.sleep(3000);
        TestUtil.clickUsingJavascriptExecutor(submitBtn);
    }
}
