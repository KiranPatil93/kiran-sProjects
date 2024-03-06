package PageObjects;

import Utility.DriverFactory;
import Utility.TestUtil;
import Utility.WaitUtil;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static Utility.DriverFactory.driver;
import static Utility.TestUtil.selectdropdownValue;


public class CustomerPage {
  //  WebDriver driver;
    //public  static WebDriverManager manager = new WebDriverManager();


    public CustomerPage(){
       // this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[contains(text(),'Customers')]")
    WebElement menuCustomer;

    @FindBy(xpath = "//*[@class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list']")
    WebElement btnNewCustomer;

    @FindBy(xpath = "//*[@class='ColumnLayout---column ColumnLayout---column_padding_standard ColumnLayout---align_start ColumnLayout---top ColumnLayout---width_narrow_plus ColumnLayout---stack_when_phone appian-context-last-in-list']//div[@role='presentation']//child::input")
    WebElement txtLEI;
    @FindBy(xpath = "//h1[contains(text(),'Create Fund')]")
    WebElement txtValidateCreateFund;
    @FindBy(xpath = "//*[contains(text(),'Create Client')]")
    WebElement validateCreateClientPage;
    @FindBy(xpath = "//*[@class='SideBySideGroup---side_by_side SideBySideGroup---default_direction SideBySideGroup---bottom']//div[@role='presentation']//child::input")
    WebElement txtName;

    @FindBy(xpath = "//*[@class='Button---btn Button---default_direction Button---small Button---minimize_width appian-context-first-in-list appian-context-last-in-list Button---inSideBySide Button---inModalDialogLayout']")
    WebElement btnLookUp;
    @FindBy(xpath = "//*[contains(text(),'Add Funds')]")
    WebElement btnAddFunds;

    @FindBy(xpath = "//*[contains(text(),'--- Select country ---')]//parent::div")
    WebElement dropDomicile;
    @FindBy(xpath = "//*[contains(text(),'--- Select currency ---')]//parent::div")
    WebElement dropCurrency;
    @FindBy(xpath = "//*[contains(text(),'Incorporation Date')]//following::input[1]")
    WebElement txtIncoroporationDate;
    @FindBy(xpath = "//*[contains(text(),'Financial Year End Date')]//following::input")
    WebElement txtfinanceEndDate;
    @FindBy(xpath = "//*[contains(text(),'Other Fund Information')]//following::textarea")
    WebElement txtotherInfo;
    @FindBy(xpath = "//*[contains(text(),'Next')]")
    WebElement btnNext;
    @FindBy(xpath = "//*[contains(text(),'Submit')]")
    WebElement btnSubmit;
    @FindBy(xpath = "//*[contains(text(),'Log into RDC')]")
    WebElement btnRDC;
    @FindBy(css = "a[title='Login']")
    WebElement validateRDC;
    @FindBy(xpath = "//*[contains(text(),'Basic Info')]")
    WebElement basicInfo;
    @FindBy(xpath = "//*[contains(text(),'BASIC INFORMATION')]")
    WebElement customerInfo;
    @FindBy(xpath = "//a[contains(text(),'Add Previous Customer Name')]")
    WebElement linkPreviousCustomer;
    @FindBy(xpath = "//h1[text()='Add Previous Customer Name']")
    WebElement validatePreviousCustomer;
    @FindBy(xpath = "//*[text()='Effective From']//preceding::input")
    WebElement txtPreviousCustomerName;
    @FindBy(xpath = "//*[text()='Effective From']//following::input[1]")
    WebElement dateEffectiveFrom;
    @FindBy(xpath = "//*[text()='Ceased On']//following::input")
    WebElement dateCeasedOn;
    @FindBy(xpath = "//button[text()='Add Previous Customer Name']")
    WebElement btnAddPreviouscustomer;
    @FindBy(xpath = "//*[contains(text(),'Add Beneficial Owner')]//ancestor::a")
    WebElement linkBeneficialOwner;
    @FindBy(xpath = "//h1[contains(text(),'Add Beneficial Owner')]")
    WebElement validateAddBenificial;
    @FindBy(xpath = "//*[text()='Name']")
    WebElement AddBenificialName;
    @FindBy(xpath = "//*[contains(@class,'DropdownWidget---dropdown_value DropdownWidget---placeholder')]")
    WebElement dropOwnerType;
    @FindBy(xpath = "//*[contains(@class,'DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width')]")
    WebElement txtbirthDate;
    @FindBy(xpath = "//*[contains(text(),'Percentage Ownership')]//following::input[2]")
    WebElement txtgovIssueID;
    @FindBy(xpath = "//*[contains(text(),'Percentage Ownership')]//following::input[1]")
    WebElement txtpercentOwnership;
    @FindBy(xpath = "//*[contains(text(),'Country/Jurisdiction')]//following::input")
    WebElement txtCountry;
    @FindBy(xpath = "//button[contains(text(),'Add Beneficial Owner')]")
    WebElement btnAddBeneficialOwner;
    @FindBy(xpath = "//div[contains(text(),'Documents')]//ancestor::a")
    WebElement linkDocuments;
    @FindBy(xpath = "//*[contains(@class,'TextInput---text TextInput---align_start TextInput---inSideBySideItem')]")
    WebElement txtSearchdocuments;
    @FindBy(xpath = "//*[contains(text(),'Products')]//ancestor::a")
    WebElement linkProducts;
    @FindBy(xpath = "//div[contains(text(),'Products')]")
    WebElement productsPage;
    @FindBy(xpath = "//*[contains(text(),'History')]//ancestor::a")
    WebElement linkHistoryTab;
    @FindBy(xpath = "//*[contains(@class,'PickerWidget---picker_input PickerWidget---placeholder')]")
    WebElement txtModifyBy;
    @FindBy(xpath = "//*[contains(text(),'Risk Assessments')]//ancestor::a")
    WebElement linkRiskAssessment;
    @FindBy(xpath = "//button[text()='Add Risk Assessment']")
    WebElement validateRiskAssessment;
    @FindBy(xpath = "//h1[normalize-space()='Create Risk Assessment']")
    WebElement validateRiskAssessment_RelatedAction;
    @FindBy(xpath = "//*[contains(text(),'Proposals')]//ancestor::a")
    WebElement linkProposals;
    @FindBy(xpath = "//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---light']")
    WebElement proposalTable;
    @FindBy(xpath = "//*[contains(text(),'Related Actions')]//ancestor::a")
    WebElement linkRelatedActions;
    @FindBy(xpath = "//a[@class='LinkedItem---standalone_richtext_link LinkedItem---inRecordActionWidget elements---global_a Tooltip---tooltip-target Tooltip---tooltip-pinned Tooltip---tooltip-pinned-left Tooltip---tooltip-element-attached-top Tooltip---tooltip-target-attached-bottom']")
    WebElement pageRelatedActions;
    @FindBy(xpath = "//*[contains(text(),'Edit Entity Relationships')]//ancestor::a")
    WebElement linkEntityRelationships;
    @FindBy(xpath = "//*[contains(text(),'Attach')]//ancestor::a")
    WebElement linkAttach;
    @FindBy(xpath = "//*[contains(text(),'Attach Documents')]")
    WebElement pageAttach;
    @FindBy(xpath = "//*[contains(text(),'Update Contacts')]//ancestor::a")
    WebElement linkUpdateContacts;
    @FindBy(xpath = "//h1[normalize-space()='Update Contacts']")
    WebElement updatecontactspage;
    @FindBy(xpath = "//*[contains(text(),'Add Address')]//ancestor::a")
    WebElement linkAddAddress;

    @FindBy(xpath = "//h1[normalize-space()='Add Address']")
    WebElement pageAddAddress;
    @FindBy(xpath = "//*[contains(text(),'Add Links')]//ancestor::a")
    WebElement linkAddLinks;
    @FindBy(xpath = "//*[contains(text(),'Edit Links')]//ancestor::a")
    WebElement linkEditLinks;
    @FindBy(xpath = "//a[@class='LinkedItem---standalone_richtext_link elements---global_a']")
    WebElement pageAddLinks;
    @FindBy(xpath = "//*[contains(text(),'Add Previous Customer Name')]//ancestor::a")
    WebElement linkAddPreviousCustomer;
    @FindBy(xpath = "//*[contains(text(),'Related Actions')]")
    WebElement validateRelatedActions;

    @FindBy(xpath = "//*[contains(text(),'Add Risk Assessment')]//ancestor::a")
    WebElement linkAddRiskAssessment;

    @FindBy(xpath = "//button[normalize-space()='Create Risk Assessment']")
    WebElement btnCreateRiskAssessment;
    @FindBy(xpath = "//*[contains(text(),'Add Funds')]//ancestor::a")
    WebElement linkAddFunds;

    @FindBy(xpath = "//*[contains(text(),'--- Select type ---')]//parent::div")
    WebElement dropType;
    @FindBy(xpath = "//*[@class='SecondaryText---color_secondary']")
    WebElement validatemesg;
    @FindBy(xpath = "//input[@value='Yes']")
    WebElement payrollYes;
    @FindBy(xpath = "//input[@value='No']")
    WebElement payrollNo;
    @FindBy(xpath = "//button[@class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list Button---inModalDialogLayout']")
    WebElement btnAddContacts;
    @FindBy(xpath = "//*[contains(text(),'Last Name *')]//preceding::input")
    WebElement txtFirstName;
    @FindBy(xpath = "//*[contains(text(),'Last Name *')]//following::input[1]")
    WebElement txtLasttName;
    @FindBy(xpath = "//*[contains(text(),'--- Select title ---')]//parent::div")
    WebElement dropTitle;
    @FindBy(xpath = "//*[contains(text(),'Title')]//following::input[1]")
    WebElement txtEmail;
    @FindBy(xpath = "//*[contains(text(),'--- Select country of residence ---')]//parent::div")
    WebElement dropCountry;
    @FindBy(xpath = "//*[contains(text(),'Date Of Birth')]//following::input")
    WebElement txtDateOfBirth;
    @FindBy(xpath = "//button[contains(text(),'Add Contact')]")
    WebElement btnAddContact;
    @FindBy(xpath = "//*[contains(text(),'Summary')]")
    WebElement validateCustomerSummary;
    @FindBy(xpath = "//*[contains(text(),'Add Sub-Funds')]//ancestor::a")
    WebElement linkAddSubFunds;
    @FindBy(xpath = "//*[contains(text(),'Create Sub-Fund')]")
    WebElement validateAddSubFunds;
    @FindBy(xpath = "//*[contains(text(),'Create Fund')]")
    WebElement validateAddFunds;
    @FindBy(xpath = "//button[text()='Search']")
    WebElement btnSearch;
    public void clickOnCustomerMenu(){
        WaitUtil.waitTill(10);
        Assert.assertTrue("Customer Menu has not been displayed",menuCustomer.isDisplayed() );
        menuCustomer.click();
    }

public void clickOnNewCustomerBtn(){
    WaitUtil.waitTill(10);
    Assert.assertTrue("New Customer button has not been displayed",btnNewCustomer.isDisplayed() );
    btnNewCustomer.click();
}
public void validate_CreateCustomerPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is on Create Customer page",validateCreateClientPage.isDisplayed() );
}
public void selectCustomerType(String option){
    WaitUtil.waitTill(5);
    dropType.click();
    TestUtil.selectdropdownValue(option);

}
public void enterLEICode(){
    WaitUtil.waitTill(2);
    txtLEI.click();
    WaitUtil.waitTill(2);
    String LeIRandom = RandomStringUtils.randomAlphanumeric(20);
    txtLEI.sendKeys(LeIRandom);
    WaitUtil.waitTill(4);
        String LEIcode= txtLEI.getText();
        System.out.println("entered LEI code is :" +LEIcode);

}

public void enterclientName(String name){
    WaitUtil.waitTill(5);
    txtName.click();
    WaitUtil.waitTill(1);
    txtName.sendKeys(name);
    WaitUtil.waitTill(1);
    txtName.sendKeys(Keys.ENTER);

}

public void clickOnLookUpBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Lookup Client button has not been displayed",btnLookUp.isDisplayed());
    btnLookUp.click();
}
public void validatecustomerName(String customerName){
    WaitUtil.waitTill(7);
    WebElement name = driver.findElement(By.xpath("//*[contains(text(),'"+customerName+"')]"));
    TestUtil.scrollToViewByJavaScriptExecutor(name);
    String txtcustName = name.getText();
    System.out.println("Customer Name is :" +txtcustName );
    Assert.assertEquals("Customer Name is not matching",customerName,txtcustName);
}
public void validate_WarningMessage(String message){
    WaitUtil.waitTill(5);
    String warningMessage=validatemesg.getText();
    System.out.println("Warning message is :" +message);
  Assert.assertEquals("Warning message has not been matched",message,warningMessage);
}

    public void clickOnOversightofCustomerPayroll(String payroll){
        WaitUtil.waitTill(2);
        if(payroll.equals("Yes")){
            TestUtil.clickByUsingActionsClass(payrollYes);

        }else{

            TestUtil.clickByUsingActionsClass(payrollNo);
        }

    }

    public void clickOnAddContactsBtn(){
        WaitUtil.waitTill(5);
        Assert.assertTrue("Add contacts button has not been displayed", btnAddContacts.isDisplayed());
        btnAddContacts.click();
    }
public void clickOnAddfundsBtn(){
    WaitUtil.waitTill(2);
Assert.assertTrue("Add Funds button has not been displayed", btnAddFunds.isDisplayed());
   // btnAddFunds.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", btnAddFunds);
}

    public void selectDomicile(String domicile){
        WaitUtil.waitTill(3);
        Assert.assertTrue("Domicile dropdown has not been visible", dropDomicile.isDisplayed());
        dropDomicile.click();
        selectdropdownValue(domicile);
    }


public void selectCuurency(String currency){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Domicile dropdown has not been visible", dropDomicile.isDisplayed());
    dropDomicile.click();
    selectdropdownValue(currency);
}

   public void enterIncoroporationDate(String date){
       WaitUtil.waitTill(2);
       txtIncoroporationDate.sendKeys(date);
       System.out.println("entered Incoroporation Date is :" +date);
       Assert.assertEquals("Entered Incoroporation Date value does not match with actual value",date,txtIncoroporationDate.getAttribute("value"));
   }



    public void enterFinancialYearEndDate(String financeEndDate){
        WaitUtil.waitTill(2);
        txtfinanceEndDate.sendKeys(financeEndDate);
        System.out.println("entered Incoroporation Date is :" +financeEndDate);
        Assert.assertEquals("Entered Financial Year End Date value does not match with actual value",financeEndDate,txtIncoroporationDate.getAttribute("value"));
    }


    public void enterOtherInformation(String fundInfo){
        WaitUtil.waitTill(2);
        txtotherInfo.sendKeys(fundInfo);
        System.out.println("entered Incoroporation Date is :" +fundInfo);
        Assert.assertEquals("Entered Financial Year End Date value does not match with actual value",fundInfo,txtIncoroporationDate.getAttribute("value"));
    }

    public void clickOnNextBtn(){
        WaitUtil.waitTill(5);
        Assert.assertTrue("Next button has not been displayed",btnNext.isDisplayed());
        btnNext.click();
    }


    public void clickOnSubmitBtn(){
        WaitUtil.waitTill(5);
        Assert.assertTrue("Submit button has not been displayed",btnSubmit.isDisplayed());
        btnSubmit.click();
    }

public void clickOnRDCBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Next button has not been displayed",btnRDC.isDisplayed());
    btnRDC.click();
}

public void validateRDCPage(){
    WaitUtil.waitTill(2);
    String parent = driver.getWindowHandle();

    Set<String> s = driver.getWindowHandles();
    Iterator<String> I1 = s.iterator();

    while (I1.hasNext()) {

        String child_window = I1.next();


        if (!parent.equals(child_window)) {
            driver.switchTo().window(child_window);

            System.out.println(driver.switchTo().window(child_window).getTitle());


        }

    }

}


    public void clickOnBsicInfo(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Basic Info has not been visible",basicInfo.isDisplayed());
        basicInfo.click();
    }

    public void validateBasicInfoPage(){
        WaitUtil.waitTill(2);
     Assert.assertTrue("Basic Info has not been visible",customerInfo.isDisplayed());
    }

    public void clickOnPreviousCustomerNameLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Previous customer Name link has not been visible",linkPreviousCustomer.isDisplayed());
        linkPreviousCustomer.click();
    }

public void enterPreviousCustomerName(String name){
    WaitUtil.waitTill(2);
    txtPreviousCustomerName.sendKeys(name);
    System.out.println("entered Previous customer Name is :" +name);
    Assert.assertEquals("Entered previous customer name value does not match with actual value",name,txtPreviousCustomerName.getAttribute("value"));
}

    public void enterDateEffectiveFrom(String effectiveFrom){
        WaitUtil.waitTill(2);
        dateEffectiveFrom.sendKeys(effectiveFrom);
        System.out.println("entered Effective From Date is :" +effectiveFrom);
        Assert.assertEquals("Entered Effective From Date value does not match with actual value",effectiveFrom,dateEffectiveFrom.getAttribute("value"));
    }

public void enterDateCeasedOn(String ceasedOn){
    WaitUtil.waitTill(2);
    dateCeasedOn.sendKeys(ceasedOn);
    System.out.println("entered Ceased On Date is :" +ceasedOn);
    Assert.assertEquals("Entered Ceased On Date value does not match with actual value",ceasedOn,dateCeasedOn.getAttribute("value"));
}

public void clickOnPreviousCustomerNameBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Previous customer Name button has not been visible",btnAddPreviouscustomer.isDisplayed());
    btnAddPreviouscustomer.click();
}

public void validatePreviousCustomerNamePage(String name){
    WaitUtil.waitTill(2);
    WebElement previousCustomerName = driver.findElement(By.xpath("//*[contains(text(),'"+name+"')]"));
    Assert.assertTrue("Previous Customer Name has not been added on Basic Info page" ,previousCustomerName.isDisplayed());
}
public void entityRelationships_ValidateFunds(){
    WaitUtil.waitTill(2);
    List<WebElement> allFunds = driver.findElements(By.xpath("//*[contains(@class,'LinkedItem---standalone_richtext_link LinkedItem---inStrongText elements---global_a')]"));
    for(int i=0;i<allFunds.size();i++){
        allFunds.get(i).click();
        WaitUtil.waitTill(2);
    }
    String parentWindow =driver.getWindowHandle();
    Set<String> windows = driver.getWindowHandles();
    Iterator<String> I1= windows.iterator();
    while(I1.hasNext())
    {

        String child_window=I1.next();


        if(!parentWindow.equals(child_window))
        {
            driver.switchTo().window(child_window);
            String windowTitle = driver.switchTo().window(child_window).getTitle();

            System.out.println(windowTitle);

            driver.close();
        }

    }
//switch to the parent window
    driver.switchTo().window(parentWindow);

}


    public void clickOnBenificialOwnerLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Add Benificial Owner link has not been visible",linkBeneficialOwner.isDisplayed());
        linkBeneficialOwner.click();
    }

    public void validate_AddBenfecialOwnerPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Add Beneficial Owner page has not been visible",validateAddBenificial.isDisplayed());
    }



    public void enterBirthDate(String birthDate){
        WaitUtil.waitTill(2);
        txtbirthDate.sendKeys(birthDate);
        System.out.println("entered Birth Date is :" +birthDate);
        Assert.assertEquals("Entered Birth Date value does not match with actual value",birthDate,txtbirthDate.getAttribute("value"));
    }


    public void enterPercentageOwnership(String ownership){
        WaitUtil.waitTill(2);
        txtpercentOwnership.sendKeys(ownership);
        System.out.println("entered percentage ownership is :" +ownership);
        Assert.assertEquals("Entered percentage ownership value does not match with actual value",ownership,txtpercentOwnership.getAttribute("placeholder value"));
    }


    public void enterGovernmentIssueID(String govID){
        WaitUtil.waitTill(2);
        txtgovIssueID.sendKeys(govID);
        System.out.println("Entered Government Issue ID is :" +govID);
        Assert.assertEquals("Entered Government Issue ID value does not match with actual value",govID,txtgovIssueID.getAttribute("placeholder value"));
    }


    public void enterCountry_Jurisdiction(String country){
        WaitUtil.waitTill(2);
        txtCountry.sendKeys(country);
        System.out.println("Entered Country/Jurisdiction is :" +country);
        Assert.assertEquals("Entered Country/Jurisdiction value does not match with actual value",country,txtCountry.getAttribute("placeholder value"));
    }

public void clickOnBenificialOwnerLBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Add Beneficial Owner button has not been visible",btnAddBeneficialOwner.isDisplayed());
    btnAddBeneficialOwner.click();
}


    public void clickOnDocumentsLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Documents Tab has not been visible",linkDocuments.isDisplayed());
        linkDocuments.click();
    }
public void validate_DocumentsPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("user is not on Documents page",btnSearch.isDisplayed());
}

public void clickOnProductsLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Products Tab has not been visible",linkProducts.isDisplayed());
    linkProducts.click();
}

public void validate_ProductsPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("User is not on Products page",productsPage.isDisplayed());
}

public void clickOnHistoryTabLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("History Tab has not been visible",linkHistoryTab.isDisplayed());
    linkHistoryTab.click();
}
    public void validate_HistoryPage(String historyPage){
        WaitUtil.waitTill(5);
        String Modify= txtModifyBy.getAttribute("placeholder");
        System.out.println(historyPage);
        Assert.assertEquals("user is on History page",historyPage,Modify);
    }

public void clickOnRiskAssessmentTabLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("History Tab has not been visible",linkRiskAssessment.isDisplayed());
    linkRiskAssessment.click();
}

public void validate_RiskAssessmentsPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("User is not on Risk Assessments page",validateRiskAssessment.isDisplayed());
}
public void validate_RiskAssessmentRelatedAction(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("User is not on Risk Assessments page",validateRiskAssessment_RelatedAction.isDisplayed());
}

public void clickOnProposalsTabLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Proposals Tab has not been visible",linkProposals.isDisplayed());
    linkProposals.click();
}


    public void validate_ProposalsPage(){
        WaitUtil.waitTill(5);
        Assert.assertTrue("User is not on Risk Assessments page",proposalTable.isDisplayed());
    }

public void clickOnRelatedActionsTabLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Related Actions Tab has not been visible",linkRelatedActions.isDisplayed());
    linkRelatedActions.click();
}

public void validate_RelateActionsPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("User is not on Relate Actions page",validateRelatedActions.isDisplayed());
}


public void clickOnAttchLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("attach link is not visible",linkAttach.isDisplayed());
    linkAttach.click();
}

public void validate_AttachPage(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("User is not on Attach page",pageAttach.isDisplayed());
}

public void clickOnEditEntityRelationshipsLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Edit Entity Relationships link is not visible",linkEntityRelationships.isDisplayed());
    linkEntityRelationships.click();
}
//linkUpdateContacts
    public void clickOnUpdateContactsLink(){
        WaitUtil.waitTill(4);
        Assert.assertTrue("Update contacts link is not visible",linkUpdateContacts.isDisplayed());
        linkUpdateContacts.click();
    }

public void validate_UpdateContactsPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("User is not on Update Contacts page",updatecontactspage.isDisplayed());
}

public void clickOnAddAddressLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Add Address link is not visible",linkAddAddress.isDisplayed());
    linkAddAddress.click();
}
//pageAddAddress
public void validate_addAddressPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("User is not on Add Address page",pageAddAddress.isDisplayed());
}

public void clickOnAddLinksLink(){
    WaitUtil.waitTill(7);
    if(linkAddLinks.isDisplayed()){
        linkAddLinks.click();
    }else{
        linkEditLinks.click();
    }

}

public void validate_addLinksPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("User is not on Add Links page",pageAddLinks.isDisplayed());
}

public void clickOnAddPreviousCustomerLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue("Add Add Previous Customer link is not visible",linkAddPreviousCustomer.isDisplayed());
    linkAddPreviousCustomer.click();
}

public void clickOnAAddRiskAssessmentLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue(" Add RiskAssessment link is not visible",linkAddRiskAssessment.isDisplayed());
    linkAddRiskAssessment.click();
}




public void clickOnAAddfundsLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue(" Add Funds link is not visible",linkAddFunds.isDisplayed());
    //linkAddFunds.click();
    TestUtil.clickByUsingActionsClass(linkAddFunds);
}

    public void enterFirstName(String firstName){
        WaitUtil.waitTill(5);
        txtFirstName.sendKeys(firstName);
        System.out.println("Entered First Name is :" +firstName);
        Assert.assertEquals("Entered First Name value does not match with actual value",firstName,txtFirstName.getAttribute("placeholder value"));
    }


    public void enterLastName(String lastName){
        WaitUtil.waitTill(4);
        txtLasttName.sendKeys(lastName);
        System.out.println("Entered First Name is :" +lastName);
        Assert.assertEquals("Entered Last Name value does not match with actual value",lastName,txtLasttName.getAttribute("placeholder value"));
    }
//dropTitle
    public void selectTitle(String title){
        WaitUtil.waitTill(4);
        dropTitle.click();
        WaitUtil.waitTill(1);
        TestUtil.selectdropdownValue(title);
    }

    public void enterEmail(String email){
        WaitUtil.waitTill(3);
        txtEmail.sendKeys(email);
        System.out.println("Entered Email is :" +email);
        Assert.assertEquals("Entered Email value does not match with actual value",email,txtEmail.getAttribute("placeholder value"));
    }

    public void selectCountryResidence(String country){
        WaitUtil.waitTill(3);
        dropCountry.click();
        WaitUtil.waitTill(1);
        TestUtil.selectdropdownValue(country);
    }




    public void clickOnAddContactButton(){
        WaitUtil.waitTill(3);
        Assert.assertTrue(" Add Contact button is not visible",btnAddContact.isDisplayed());
        btnAddContact.click();
    }


    public void clickOnCustomerNameLink(String customerName){
        WaitUtil.waitTill(4);
        WebElement customerLink = driver.findElement(By.xpath("//a[contains(text(),'"+customerName+"')]"));
       if(customerLink.isDisplayed()){
           TestUtil.scrollToViewByJavaScriptExecutor(customerLink);
           TestUtil.clickByJavaScriptExecutor(customerLink);
       }else{
           List<WebElement> customerNameLinks = driver.findElements(By.xpath("//a[@class='LinkedItem---standalone_richtext_link LinkedItem---inStrongText elements---global_a']"));
           if(customerNameLinks.size()>0){
               customerNameLinks.get(0).click();
           }else{
               Assert.fail("Customer Names are not visible");
           }
       }
    }


    public void validate_CustomerSummaryPage(){
        WaitUtil.waitTill(5);
        Assert.assertTrue(" user is on Customer summary page",validateCustomerSummary.isDisplayed());
    }
public void validate_CreateFundsPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("user is not on Create Funds page",txtValidateCreateFund.isDisplayed());
}
public void clickOnAddSubFundsLink(){
    WaitUtil.waitTill(4);
    Assert.assertTrue(" Add Sub Funds button is not visible",linkAddSubFunds.isDisplayed());
    linkAddSubFunds.click();
}

    public void validate_AddSubFundsPage(){
        WaitUtil.waitTill(5);
        Assert.assertTrue("user is not on Add Sub Funds page",validateAddSubFunds.isDisplayed());
    }
    public void validate_AddFundsPage(){
        WaitUtil.waitTill(5);
        Assert.assertTrue("user is not on Add Funds page",validateAddFunds.isDisplayed());
    }
    public void clickOnFundsName(){
        WaitUtil.waitTill(4);
       List<WebElement> funds = driver.findElements(By.xpath("(//strong[normalize-space()='ENTITY RELATIONSHIPS']//following::div[@class='CardLayout---card_item CardLayout---margin_below_standard CardLayout---margin_above_none CardLayout---border_invisible CardLayout---height_auto CardLayout---width_fit CardLayout---light_background'])[1]//a"));
       if(funds.size()>0){
           funds.get(0).click();
       }else{
           Assert.fail("Funds names are not visible");
       }
    }








}



