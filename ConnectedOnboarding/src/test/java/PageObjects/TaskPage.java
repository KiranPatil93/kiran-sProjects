package PageObjects;

import Utility.TestUtil;
import Utility.WaitUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Utility.DriverFactory.driver;

public class TaskPage {
    public TaskPage(){
        // this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[text()='TASKS']")
    WebElement taskButton;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement taskCheckbox;
    @FindBy(xpath = "//button[text()='Claim Task']")
    WebElement btnClaimTask;
    @FindBy(xpath = "//button[contains(text(),'Change Due Date')]")
    WebElement btnChangeDueDate;
    @FindBy(xpath = "//input[@class='DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width']")
    WebElement txtDueDate;
    @FindBy(xpath = "//*[contains(text(),'--- Select reason ---')]//parent::div")
    WebElement dropSelectReason;
    @FindBy(xpath = "//*[contains(text(),'Submit')]")
    WebElement btnsubmit;
    @FindBy(xpath = "//button[contains(text(),'Reassign')]")
    WebElement btnReassign;
    @FindBy(xpath = "//button[text()='SHOW TAGGED TASKS']")
    WebElement btnTaggedTask;
    @FindBy(xpath = "//button[text()='RDC Alerts']")
    WebElement btnRDCAlerts;
    @FindBy(xpath = "//*[text()='Log into RDC']")
    WebElement validateRDC;
    public void clickOnTaskButton(){
        WaitUtil.waitTill(4);
        Assert.assertTrue("Task button is not visible",taskButton.isDisplayed());
        TestUtil.clickByUsingActionsClass(taskButton);
    }
public void clickOnTaskCheckbox(){
    WaitUtil.waitTill(7);
 //Actions act = new Actions(driver);
  // List<WebElement> taskCheckboxes = driver.findElements(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---light']/tbody/tr[1]/td[1]//input"));
   //if(taskCheckboxes.size()>0){
     //  act.moveToElement(taskCheckboxes.get(0)).click().build().perform();
   //}else{
     //  Assert.fail("Unable to see checkboxes");
  // }
   // WebElement taskCheckBox =
    WebElement checkbox =  driver.findElement(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---light']/tbody/tr[1]/td[1]//input"));
    /*if(taskCheckBox.isDisplayed()){
    //      act.moveToElement(taskCheckBox).click();
        taskCheckBox.click();
        }else{
          Assert.fail("Unable to see checkboxes");
         }*/
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", checkbox);
    }
public void clickOnClaimTaskButton(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Claim Task button is not visible",btnClaimTask.isDisplayed());
    btnClaimTask.click();
}
public void validate_claimTask(String assigneeName){
    WaitUtil.waitTill(4);
    WebElement assignee = driver.findElement(By.xpath("//a[contains(text(),'"+assigneeName+"')]"));
    Assert.assertTrue("Task not Claimed",assignee.isDisplayed());
}
public void clickOnChangeDueDateBtn(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Change Due Date button is not visible",btnChangeDueDate.isDisplayed());
    btnChangeDueDate.click();
}
public void validate_ChangeDueDatePage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("user is not on change Due Date page",txtDueDate.isDisplayed());
}
public void enterDueDate(String dueDate){
    WaitUtil.waitTill(4);
    txtDueDate.sendKeys(dueDate);
    Assert.assertEquals("Due Date field is not visible",dueDate,txtDueDate.getAttribute("value"));
}

public void clickOnReassignBtn(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("ReAssign button is not visible",btnReassign.isDisplayed());
    btnReassign.click();
}

public void validate_ReAssignPage(){
    List<WebElement> ReaasignPage = driver.findElements(By.xpath("//span[contains(text(),'Assignee')]"));
    if(ReaasignPage.size()>0){
        System.out.println("user is on Reassign Task page");
    }else{
        Assert.fail("user is not on Reassign Task page");
    }
}

public void clickOnShowTaggedTaskBtn(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Show Tagged Task button is not visible",btnTaggedTask.isDisplayed());
    btnTaggedTask.click();
}

public void validate_showTaggedTaskPage(){
    WaitUtil.waitTill(4);
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", btnTaggedTask);
}


public void clickOnRDCAlertBtn(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("RDC Alert button is not visible",btnRDCAlerts.isDisplayed());
    btnRDCAlerts.click();
}


public void validate_RDCAlertPage(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("user is not on RDC Alert page",validateRDC.isDisplayed());
}









































































}

