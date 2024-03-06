package PageObjects;

import Utility.WaitUtil;
import Utility.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static Utility.WebDriverManager.driver;

public class OnboardingPage {
    public static WebDriverManager manager = new WebDriverManager();

    public OnboardingPage() {
        // driver = manager.driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Onboardings')]")
    WebElement onboardingMenu;
    @FindBy(xpath = "//button[@class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list']")
    WebElement validateOnboardingPage;
    @FindBy(xpath = "//*[contains(text(),'Create Onboarding')]")
    WebElement validateNewOnboardingPage;
    @FindBy(className = "PickerWidget---picker_input PickerWidget---placeholder")
    WebElement txtChooseCustomer;
    @FindBy(xpath = "//*[contains(text(),'Onboarding Details')]")
    WebElement validateOnboardingDetails;
    @FindBy(xpath = "//a[@class='LinkedItem---standalone_richtext_link LinkedItem---inStrongText elements---global_a'][normalize-space()='bamboo capital partners']")
    WebElement customerNamelink;
    @FindBy(className = "DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width")
    WebElement onboardingCompetionDate;
    @FindBy(xpath = "//*[contains(text(),'ADD PRODUCTS')]")
    WebElement validateAddProducts;
    @FindBy(xpath = "//*[contains(text(),'Submit')]")
    WebElement btnSubmit;
    @FindBy(css = "span[class='SizedText---large SizedText---predefined'] a[class='LinkedItem---standalone_richtext_link LinkedItem---inStrongText elements---global_a']")
    WebElement onboardingLinkID;
    @FindBy(xpath = "//span[@class='SizedText---large SizedText---predefined']")
    WebElement successmsg;
    @FindBy(xpath = "//button[contains(text(),'Go To Process Setup')]")
    WebElement btnProcessSetup;
    @FindBy(xpath = "//h3[contains(text(),'Onboarding Process Setup')]")
    WebElement validateprocessSetupPage;
    @FindBy(xpath = "//*[contains(text(),'bamboo capital partners')]")
    List<WebElement> validatecustomerName;
    @FindBy(css = "*[class='TabButtonWidget---tab_button TabButtonWidget---flush TabButtonWidget---selected']")
    WebElement validateAssigneepage;
    @FindBy(xpath = "//*[contains(text(),'Tasks')]//ancestor::a")
    WebElement linkTask;
    @FindBy(xpath = "//*[contains(text(),'Pillars Of Categories')]")
    WebElement validateTaskPage;
    @FindBy(xpath = "//*[@class='Button---btn Button---default_direction Button---small appian-context-first-in-list appian-context-last-in-list']")
    WebElement btnNewTask;
    @FindBy(xpath = "//*[contains(text(),'Add Custom Task')]")
    WebElement validateAddTaskPage;
    @FindBy(xpath = "//*[contains(text(),'Action Log')]//ancestor::a")
    WebElement linkActionLog;
    @FindBy(xpath = "//*[contains(text(),'Add new comment to Action Log')]")
    WebElement validateActionLogPage;
    @FindBy(xpath = "//*[contains(text(),'Discussion')]//ancestor::a")
    WebElement linkDiscussion;
    @FindBy(xpath = "//*[contains(text(),'Tag Users and Groups')]")
    WebElement validateDiscussionPage;
    @FindBy(xpath = "//*[contains(text(),'History')]//ancestor::a")
    WebElement linkHistory;
    @FindBy(className = "PickerWidget---picker_input PickerWidget---placeholder")
    WebElement txtModifyBy;
    @FindBy(xpath = "//*[contains(text(),'Owners')]//ancestor::a")
    WebElement linkOwners;
    @FindBy(xpath = "//*[contains(text(),'Onboarding Owners')]")
    WebElement validateOwnersPage;
    @FindBy(xpath = "//button[@class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list']")
    WebElement btnAddOwner;
    @FindBy(xpath = "//*[contains(text(),'Designate as primary owner')]")
    WebElement validateAddOwnersPage;
    @FindBy(xpath = "//*[contains(text(),'Name')]//following::a")
    WebElement linkAddOwnersPagecustomerName;
    @FindBy(xpath = "//*[contains(text(),'New Task')]//ancestor::a")
    WebElement linkNewTask;
    @FindBy(xpath = "//*[contains(text(),'Cancel')]//ancestor::a")
    WebElement linkCancel;
    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to cancel this onboarding?')]")
    WebElement validateCancelPage;
    @FindBy(xpath = "//*[contains(text(),'Complete')]/ancestor::a")
    WebElement linkComplete;
    @FindBy(xpath = "//*[contains(text(),'Update Onboarding')]/ancestor::a")
    WebElement linkUpdateOnboarding;
    @FindBy(xpath = "//h1[contains(text(),'Update Onboarding')]")
    WebElement validateUpdateOnboarding;
    @FindBy(xpath = "//*[contains(text(),'Pause Onboarding')]/ancestor::a")
    WebElement linkPauseOnboarding;
    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to pause this onboarding?')]")
    WebElement validatePauseOnboarding;
    @FindBy(xpath = "//*[contains(text(),'Update Funding Date')]/ancestor::a")
    WebElement linkUpdateFundingDate;
    @FindBy(xpath = "//button[contains(text(),'Update Funding Date')]")
    WebElement validateUpdateFundingDate;
    @FindBy(xpath = "//*[contains(text(),'Update Funding Value')]/ancestor::a")
    WebElement linkUpdateFundingValue;
    @FindBy(xpath = "//h1[contains(text(),'Update Funding Value')]")
    WebElement validateUpdateFundingValue;
    @FindBy(xpath = "//*[contains(text(),'Attach Documents')]/ancestor::a")
    WebElement linkAttchDocuments;
    @FindBy(xpath = "//button[contains(text(),'Attach')]")
    WebElement validateAttchDocumentsPage;
    @FindBy(xpath = "//*[contains(text(),'Add Owner')]/ancestor::a")
    WebElement linkAddOwner;
    @FindBy(xpath = "//*[contains(text(),'Link Risk Assessment to Onboarding')]/ancestor::a")
    WebElement linkRiskAssessment;
    @FindBy(xpath = "//button[contains(text(),'Link Risk Assessment to Onboarding')]")
    WebElement btnLinkRiskAssessment;
    @FindBy(xpath = "//*[contains(text(),'Extract Task Information')]/ancestor::a")
    WebElement linkExtractTaskInformation;
    @FindBy(xpath = "//*[contains(text(),' Download')]")
    WebElement validateExtractTaskInformation;
    @FindBy(xpath = "//*[contains(text(),'Add Product')]/ancestor::a")
    WebElement linkAddProduct;
    @FindBy(xpath = "//*[contains(text(),'Attach Multiple Documents')]/ancestor::a")
    WebElement linkAttachMultipleDocuments;
    public void clickOnOnboardingMenu() {
        WaitUtil.waitTill(2);
        Assert.assertTrue("Onboarding Menu has not been displayed", onboardingMenu.isDisplayed());
        onboardingMenu.click();
    }

    public void validateOnBoardingPage() {
        WaitUtil.waitTill(2);
        Assert.assertTrue("User is on Onboarding page", validateOnboardingPage.isDisplayed());
    }

    public void clickOnNewOnboardingPage() {
        WaitUtil.waitTill(2);
        Assert.assertTrue("New Onboarding button has not been displayed", validateOnboardingPage.isDisplayed());
        validateOnboardingPage.click();
    }

    public void validate_OnNewOnboardingPage() {
        WaitUtil.waitTill(2);
        Assert.assertTrue("User is on New Onboarding page", validateNewOnboardingPage.isDisplayed());

    }

    public void enterCustomerName(String customerName) {
        WaitUtil.waitTill(2);
        txtChooseCustomer.sendKeys(customerName);
        Assert.assertEquals("Entered customer name value does not match with actual value", customerName, txtChooseCustomer.getAttribute("value"));
        WaitUtil.waitTill(2);
        txtChooseCustomer.sendKeys(Keys.TAB);
        txtChooseCustomer.sendKeys(Keys.ENTER);
    }

    //validateOnboardingDetails
    public void validate_ProvideOnboardingDetails() {
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is on Provide onboarding details page", validateOnboardingDetails.isDisplayed());
    }

    //customerNamelink
    public void clickOnCustomerNamelink(String customerName) {
        WaitUtil.waitTill(2);
        String txtCustomerName = customerNamelink.getText();
        Assert.assertEquals("Customer name is not matching", customerName, txtCustomerName);
        customerNamelink.click();
    }

    public void validate_CustomerSummaryPage() {
        WaitUtil.waitTill(2);
        String parent = driver.getWindowHandle();

        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }
    }
    //onboardingCompetionDate
    public void enterOnboardingEstimateCompletionDate(String completionDate){
        WaitUtil.waitTill(2);
        onboardingCompetionDate.sendKeys(completionDate);
        Assert.assertEquals("Entered Onboarding Estimate Completion Date value does not match with actual value", completionDate, onboardingCompetionDate.getAttribute("value"));
    }
//validateAddProducts
    public void validate_AddProductsPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("User is on Add Products page", validateAddProducts.isDisplayed());
    }
//btnSubmit
    public void clickOnSubmitBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("submit button has not been displayed", btnSubmit.isDisplayed());
        btnSubmit.click();
    }

//onboardingLinkID
    public void validate_OnboardingID(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Onboarding ID  has not been displayed", onboardingLinkID.isDisplayed());
    }
//successmsg
    public void validate_SuccessMessage(String message){
        WaitUtil.waitTill(2);
        String txtsuccessMessage = successmsg.getText();
        System.out.println(txtsuccessMessage);
        if(txtsuccessMessage.equalsIgnoreCase(message)){
            System.out.println("Success message has been displayed");
        }else{
            Assert.fail("Success message has not been displayed");
        }
    }

//btnProcessSetup
    public void clickOnProcessSetupBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Go to process setup  has not been displayed", btnProcessSetup.isDisplayed());
        btnProcessSetup.click();
    }
//validateprocessSetupPage
    public void validate_ProcessSetupPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is on Process Setup page", validateprocessSetupPage.isDisplayed());
    }

public void clickOnOnboardingId(String customerName){
    WaitUtil.waitTill(2);
    WebElement onboardingID = driver.findElement(By.xpath("//a[contains(text(),'"+customerName+"')]//preceding::a[1]"));
    Assert.assertTrue("Onboarding Id has not been displayed",onboardingID.isDisplayed());
    onboardingID.click();
}

public void clickOnCustomerName(String customerName){
    WaitUtil.waitTill(2);
    List<WebElement> name = driver.findElements(By.xpath("//a[contains(text(),'"+customerName+"')]"));
    if(name.size()>0){
        name.get(0).click();
    }else{
        Assert.fail(customerName + "is not visible");
    }
}

public void validate_Customerpage(){
    WaitUtil.waitTill(2);
            if(validatecustomerName.size()>0){
                System.out.println("user is on Customer Summary page");
            }else{
                Assert.fail("User is not on Customer summary page");
            }
}
public void clickonAssigneeName() {
    WaitUtil.waitTill(2);
    String columnvaalue = "Assignee";
    //First loop will find the 'ClOCK TWER HOTEL' in the first column
    for (int i = 1; i <= 3; i++) {
        String header = null;
        header = driver.findElement(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/thead/tr[1]/th[" + i + "]")).getText();
        System.out.println("Headers are :" + header);
        if (header.equalsIgnoreCase(columnvaalue)) {
            WebElement AssigneeName = driver.findElement(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr[1]/td[" + i + "]//a"));
            AssigneeName.click();
            break;
        }
    }

}
//validateAssigneepage
    public void validate_AssigneeSummaryPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is not on Assignee summary page.",validateAssigneepage.isDisplayed());

    }

//linkTask
    public void clickOnTaskTab(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Task Tab has not been visible.",linkTask.isDisplayed());
        linkTask.click();
    }

//validateTaskPage
    public void validate_TaskPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is not on Task page",validateTaskPage.isDisplayed());
    }

//btnNewTask
    public void clickOnNewTaskBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("New Task button is not visible on Task page.",btnNewTask.isDisplayed());
        btnNewTask.click();
    }

//validateAddTaskPage
    public void validate_AddTaskPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is not on Add Task page",validateAddTaskPage.isDisplayed());
    }
//linkActionLog
    public void clickOnActionLogTab(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Action Log Tab is not visible.",linkActionLog.isDisplayed());
        linkActionLog.click();
    }
//validateActionLogPage
    public void validate_ActionLogPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is not on Action Log page",validateActionLogPage.isDisplayed());
    }

//linkDiscussion
    public void clickOnDiscussionTab(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Discussion Tab is not visible.",linkDiscussion.isDisplayed());
        linkDiscussion.click();
    }
//validateDiscussionPage
    public void validate_DiscussionPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is not on Discussion page",validateDiscussionPage.isDisplayed());
    }
//linkHistory
public void clickOnHistoryTab(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("History Tab is not visible.",linkHistory.isDisplayed());
    linkHistory.click();
}

//txtModifyBy
public void validate_HistoryPage(String historyPage){
    WaitUtil.waitTill(2);
    String Modify= txtModifyBy.getAttribute("placeholder");
    System.out.println(historyPage);
    Assert.assertEquals("user is on History page",historyPage,Modify);
}
//linkOwners
public void clickOnOwnersTab(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Owners Tab is not visible.",linkOwners.isDisplayed());
    linkOwners.click();
}
//validateOwnersPage
public void validate_OwnersPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on Owners page",validateOwnersPage.isDisplayed());
}
//btnAddOwner
public void clickOnOAddOwnerBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Add Owner button is not visible on Owners page.",btnAddOwner.isDisplayed());
    btnAddOwner.click();
}
//validateAddOwnersPage
public void validate_AddOwnersPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on Add Owners page",validateAddOwnersPage.isDisplayed());
}
//linkAddOwnersPagecustomerName
    public void clickOncustomerNameOnAddOwnersPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Customer name link is not visible on Add Owners page.",linkAddOwnersPagecustomerName.isDisplayed());
        linkAddOwnersPagecustomerName.click();
    }
    public void validate_CustomerNameSummary(){
        WaitUtil.waitTill(2);
        String parent = driver.getWindowHandle();

        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }
    }

//linkNewTask
    public void clickOnNewTaskLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("New Task link is not visible on Related Actions page.",linkNewTask.isDisplayed());
        linkNewTask.click();
    }
//linkCancel
public void clickOnOCancelLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Cancel link is not visible on Related Actions page.",linkCancel.isDisplayed());
    linkCancel.click();
}
    public void validate_CancelPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is not on Cancel page",validateCancelPage.isDisplayed());
    }

//linkComplete
public void clickOnOCompleteLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Complete link is not visible on Related Actions page.",linkComplete.isDisplayed());
    linkComplete.click();
}
//linkUpdateOnboarding
    public void clickOnUpdateOnboardingLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Update Onboarding link is not visible on Related Actions page.",linkUpdateOnboarding.isDisplayed());
        linkUpdateOnboarding.click();
    }
//validateUpdateOnboarding
public void validate_UpdateOnboardingPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on Update Onboarding page",validateUpdateOnboarding.isDisplayed());
}
//linkPauseOnboarding
public void clickOnPauseOnboardingLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Pause Onboarding link is not visible on Related Actions page.",linkPauseOnboarding.isDisplayed());
    linkPauseOnboarding.click();
}
//validatePauseOnboarding
public void validate_PauseOnboardingPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on Pause Onboarding page",validatePauseOnboarding.isDisplayed());
}
//linkUpdateFundingDate
public void clickOnUpdatefundingDateLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Update Funding Date link is not visible on Related Actions page.",linkUpdateFundingDate.isDisplayed());
    linkUpdateFundingDate.click();
}
//validateUpdateFundingDate
public void validate_UpdateFundingDatePage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on validate Update Funding Date page",validateUpdateFundingDate.isDisplayed());
}
//linkUpdateFundingValue
public void clickOnUpdatefundingValueLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Update Funding Date link is not visible on Related Actions page.",linkUpdateFundingValue.isDisplayed());
    linkUpdateFundingValue.click();
}
//validateUpdateFundingValue
public void validate_UpdateFundingValuePage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on validate Update Funding Date page",validateUpdateFundingValue.isDisplayed());
}
//linkAttchDocuments
public void clickOnAttachDocumentsLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Attach documents link is not visible on Related Actions page.",linkAttchDocuments.isDisplayed());
    linkAttchDocuments.click();
}
//validateAttchDocumentsPage
public void validate_AttchDocumentsPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on Attch Documents page",validateAttchDocumentsPage.isDisplayed());
}
//linkAddOwner

    public void clickOnAddOwnerLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Add Owner link is not visible on Related Actions page.",linkAddOwner.isDisplayed());
        linkAddOwner.click();
    }
//linkRiskAssessment

    public void clickOnLinkRiskAssessmentLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Add Owner link is not visible on Related Actions page.",linkRiskAssessment.isDisplayed());
        linkRiskAssessment.click();
    }
//btnLinkRiskAssessment
    public void validate_LinkRiskAssessment(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("user is not on Risk Assessment Link page",btnLinkRiskAssessment.isDisplayed());
    }

//linkExtractTaskInformation
public void clickOnExtractTaskInformationLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Extract Task Information link is not visible on Related Actions page.",linkExtractTaskInformation.isDisplayed());
    linkExtractTaskInformation.click();
}
//validateExtractTaskInformation
public void validate_ExtractTaskInformation(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on validate Extract Task Information page",validateExtractTaskInformation.isDisplayed());
}
//linkAddProduct
public void clickOnAddProductLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Add Product link is not visible on Related Actions page.",linkAddProduct.isDisplayed());
    linkAddProduct.click();
}
//linkAttachMultipleDocuments
public void clickOnAttachMultipleDocumentsLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Attach Multiple Documents link is not visible on Related Actions page.",linkAttachMultipleDocuments.isDisplayed());
    linkAttachMultipleDocuments.click();
}











































}


































































































































