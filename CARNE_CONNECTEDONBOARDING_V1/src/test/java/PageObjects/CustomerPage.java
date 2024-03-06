package PageObjects;

import Utility.TestUtil;
import Utility.WaitUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static Utility.TestUtil.selectdropdownValue;
import static Utility.WebDriverManager.driver;

public class CustomerPage {
    //public  static WebDriverManager manager = new WebDriverManager();

    public CustomerPage(){
        //   driver = manager.createLocalDriver();
       // driver = manager.driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[contains(text(),'Customers')]")
    WebElement menuCustomer;

    @FindBy(xpath = "//*[@class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list']")
    WebElement btnNewCustomer;

    @FindBy(xpath = "//*[@class='ColumnLayout---column ColumnLayout---column_padding_standard ColumnLayout---align_start ColumnLayout---top ColumnLayout---width_narrow_plus ColumnLayout---stack_when_phone appian-context-last-in-list']//div[@role='presentation']//child::input")
    WebElement txtLEI;

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
    @FindBy(xpath = "//*[contains(text(),'Next')]")
    WebElement btnSubmit;
    @FindBy(xpath = "//*[contains(text(),'Log into RDC')]")
    WebElement btnRDC;
    @FindBy(css = "a[title='Login']")
    WebElement validateRDC;
    @FindBy(xpath = "//*[contains(text(),'Basic Info')]")
    WebElement basicInfo;
    @FindBy(xpath = "//*[contains(text(),'CUSTOMER INFORMATION')]")
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
    @FindBy(linkText = "Add Beneficial Owner")
    WebElement linkBeneficialOwner;
    @FindBy(xpath = "//h1[contains(text(),'Add Beneficial Owner')]")
    WebElement validateAddBenificial;
    @FindBy(xpath = "//*[text()='Name']")
    WebElement AddBenificialName;
    @FindBy(className = "DropdownWidget---dropdown_value DropdownWidget---placeholder")
    WebElement dropOwnerType;
    @FindBy(className = "DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width")
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
    @FindBy(className = "TextInput---text TextInput---align_start TextInput---inSideBySideItem")
    WebElement txtSearchdocuments;
    @FindBy(xpath = "//*[contains(text(),'Products')]//ancestor::a")
    WebElement linkProducts;
    @FindBy(xpath = "//*[contains(text(),'Associated Products')]")
    WebElement productsPage;
    @FindBy(xpath = "//*[contains(text(),'History')]//ancestor::a")
    WebElement linkHistoryTab;
    @FindBy(className = "PickerWidget---picker_input PickerWidget---placeholder")
    WebElement txtModifyBy;
    @FindBy(xpath = "//*[contains(text(),'Risk Assessments')]//ancestor::a")
    WebElement linkRiskAssessment;
    @FindBy(xpath = "//button[@class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list']")
    WebElement btnRiskAssessment;
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
    @FindBy(xpath = "//*[contains(text(),'Attach Documents')]")
    WebElement pageAttach;
    @FindBy(xpath = "//*[contains(text(),'Update Contacts')]//ancestor::a")
    WebElement linkUpdateContacts;
    @FindBy(xpath = "//h1[normalize-space()='Update Contacts']")
    WebElement updatecontactspage;
    @FindBy(linkText = "Add Address")
    WebElement linkAddAddress;
    @FindBy(xpath = "//h1[normalize-space()='Add Address']")
    WebElement pageAddAddress;
    @FindBy(linkText = "Add Links")
    WebElement linkAddLinks;
    @FindBy(xpath = "//a[@class='LinkedItem---standalone_richtext_link elements---global_a']")
    WebElement pageAddLinks;
    @FindBy(linkText = "Add Previous Name")
    WebElement linkAddPreviousCustomer;
    @FindBy(linkText = "Add Risk Assessment")
    WebElement linkAddRiskAssessment;
    @FindBy(xpath = "//button[normalize-space()='Create Risk Assessment']")
    WebElement btnCreateRiskAssessment;
    @FindBy(linkText = "Add Funds")
    WebElement linkAddFunds;
    @FindBy(xpath = "//*[contains(text(),'--- Select type ---')]//parent::div")
    WebElement dropType;
    public void clickOnCustomerMenu(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Customer Menu has not been displayed",menuCustomer.isDisplayed() );
        menuCustomer.click();
    }

public void clickOnNewCustomerBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("New Customer button has not been displayed",btnNewCustomer.isDisplayed() );
    btnNewCustomer.click();
}
public void validate_CreateCustomerPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is on Create Customer page",txtLEI.isDisplayed() );
}
public void selectCustomerType(String option){
    WaitUtil.waitTill(2);
    dropType.click();
    WaitUtil.waitTill(3);
    TestUtil.selectdropdownValue(option);
}
public void enterLEICode(String LEI){
    WaitUtil.waitTill(2);
    txtLEI.sendKeys(LEI);
        String LEIcode= txtLEI.getText();
        System.out.println("entered LEI code is :" +LEIcode);
        Assert.assertEquals("Entered LEI code value does not match with actual value",LEIcode,txtLEI.getAttribute("placeholder value"));
}

public void enterclientName(String name){
    WaitUtil.waitTill(2);
    txtName.sendKeys(name);
    String clientName= txtLEI.getText();
    System.out.println("entered LEI code is :" +clientName);
    Assert.assertEquals("Entered LEI code value does not match with actual value",clientName,txtName.getAttribute("placeholder value"));
}

public void clickOnLookUpBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Lookup Client button has not been displayed",btnLookUp.isDisplayed());
    btnLookUp.click();
}
public void clickOncustomerName(String customerName){
    WaitUtil.waitTill(2);
    WebElement name = driver.findElement(By.xpath("//a[contains(text(),'"+customerName+"')]"));
    String txtcustName = name.getText();
    System.out.println("Customer Name is :" +txtcustName );
    Assert.assertEquals("Customer Name is not matching",customerName,txtcustName);
}

public void clickOnAddfundsBtn(){
    WaitUtil.waitTill(2);
Assert.assertTrue("Add Funds button has not been displayed", btnAddFunds.isDisplayed());
    btnAddFunds.click();
}
//dropDomicile
    public void selectDomicile(String domicile){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Domicile dropdown has not been visible", dropDomicile.isDisplayed());
        dropDomicile.click();
        selectdropdownValue(domicile);
    }

//dropCurrency
public void selectCuurency(String currency){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Domicile dropdown has not been visible", dropDomicile.isDisplayed());
    dropDomicile.click();
    selectdropdownValue(currency);
}
//txtIncoroporationDate
   public void enterIncoroporationDate(String date){
       WaitUtil.waitTill(2);
       txtIncoroporationDate.sendKeys(date);
       System.out.println("entered Incoroporation Date is :" +date);
       Assert.assertEquals("Entered Incoroporation Date value does not match with actual value",date,txtIncoroporationDate.getAttribute("value"));
   }

//txtfinanceEndDate

    public void enterFinancialYearEndDate(String financeEndDate){
        WaitUtil.waitTill(2);
        txtfinanceEndDate.sendKeys(financeEndDate);
        System.out.println("entered Incoroporation Date is :" +financeEndDate);
        Assert.assertEquals("Entered Financial Year End Date value does not match with actual value",financeEndDate,txtIncoroporationDate.getAttribute("value"));
    }
//txtotherInfo

    public void enterOtherInformation(String fundInfo){
        WaitUtil.waitTill(2);
        txtotherInfo.sendKeys(fundInfo);
        System.out.println("entered Incoroporation Date is :" +fundInfo);
        Assert.assertEquals("Entered Financial Year End Date value does not match with actual value",fundInfo,txtIncoroporationDate.getAttribute("value"));
    }
//btnNext
    public void clickOnNextBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Next button has not been displayed",btnNext.isDisplayed());
        btnNext.click();
    }
//btnSubmit

    public void clickOnSubmitBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Next button has not been displayed",btnSubmit.isDisplayed());
        btnSubmit.click();
    }
//btnRDC
public void clickOnRDCBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Next button has not been displayed",btnRDC.isDisplayed());
    btnRDC.click();
}

public void validateRDCPage(){
    WaitUtil.waitTill(2);
Assert.assertTrue("user is not on RDC Page",validateRDC.isDisplayed());


}

//basicInfo
    public void clickOnBsicInfo(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Basic Info has not been visible",basicInfo.isDisplayed());
        basicInfo.click();
    }
//customerInfo
    public void validateBasicInfoPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Basic Info has not been visible",customerInfo.isDisplayed());
    }
//linkPreviousCustomer
    public void clickOnPreviousCustomerNameLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Previous customer Name link has not been visible",linkPreviousCustomer.isDisplayed());
        linkPreviousCustomer.click();
    }
//validatePreviousCustomer
    public void validatePreviousCustomerNamePage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("User unable to navigate on Previous Customer Name page",validatePreviousCustomer.isDisplayed());

    }
//txtPreviousCustomerName
public void enterPreviousCustomerName(String name){
    WaitUtil.waitTill(2);
    txtPreviousCustomerName.sendKeys(name);
    System.out.println("entered Previous customer Name is :" +name);
    Assert.assertEquals("Entered previous customer name value does not match with actual value",name,txtPreviousCustomerName.getAttribute("value"));
}
//dateEffectiveFrom
    public void enterDateEffectiveFrom(String effectiveFrom){
        WaitUtil.waitTill(2);
        dateEffectiveFrom.sendKeys(effectiveFrom);
        System.out.println("entered Effective From Date is :" +effectiveFrom);
        Assert.assertEquals("Entered Effective From Date value does not match with actual value",effectiveFrom,dateEffectiveFrom.getAttribute("value"));
    }
//dateCeasedOn
public void enterDateCeasedOn(String ceasedOn){
    WaitUtil.waitTill(2);
    dateCeasedOn.sendKeys(ceasedOn);
    System.out.println("entered Ceased On Date is :" +ceasedOn);
    Assert.assertEquals("Entered Ceased On Date value does not match with actual value",ceasedOn,dateCeasedOn.getAttribute("value"));
}
//btnAddPreviouscustomer
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

//linkBeneficialOwner
    public void clickOnBenificialOwnerLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Add Benificial Owner link has not been visible",linkBeneficialOwner.isDisplayed());
        linkBeneficialOwner.click();
    }
//validateAddBenificial
    public void validate_AddBenfecialOwnerPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Add Beneficial Owner page has not been visible",validateAddBenificial.isDisplayed());
    }
//AddBenificialName
    public void enterBeneficialName(String beneficialName){
        WaitUtil.waitTill(2);
        AddBenificialName.sendKeys(beneficialName);
        System.out.println("entered Ceased On Date is :" +beneficialName);
        Assert.assertEquals("Entered Beneficial name value does not match with actual value",beneficialName,AddBenificialName.getAttribute("placeholder value"));
    }

//dropOwnerType
    public void selectOwnerType(String ownerType){
        WaitUtil.waitTill(2);
        dropOwnerType.click();
        TestUtil.selectdropdownValue(ownerType);
    }
//birthDate
    public void enterBirthDate(String birthDate){
        WaitUtil.waitTill(2);
        txtbirthDate.sendKeys(birthDate);
        System.out.println("entered Birth Date is :" +birthDate);
        Assert.assertEquals("Entered Birth Date value does not match with actual value",birthDate,txtbirthDate.getAttribute("value"));
    }

//txtpercentOwnership
    public void enterPercentageOwnership(String ownership){
        WaitUtil.waitTill(2);
        txtpercentOwnership.sendKeys(ownership);
        System.out.println("entered percentage ownership is :" +ownership);
        Assert.assertEquals("Entered percentage ownership value does not match with actual value",ownership,txtpercentOwnership.getAttribute("placeholder value"));
    }
//txtgovIssueID

    public void enterGovernmentIssueID(String govID){
        WaitUtil.waitTill(2);
        txtgovIssueID.sendKeys(govID);
        System.out.println("Entered Government Issue ID is :" +govID);
        Assert.assertEquals("Entered Government Issue ID value does not match with actual value",govID,txtgovIssueID.getAttribute("placeholder value"));
    }
//txtCountry

    public void enterCountry_Jurisdiction(String country){
        WaitUtil.waitTill(2);
        txtCountry.sendKeys(country);
        System.out.println("Entered Country/Jurisdiction is :" +country);
        Assert.assertEquals("Entered Country/Jurisdiction value does not match with actual value",country,txtCountry.getAttribute("placeholder value"));
    }
//btnAddBeneficialOwner
public void clickOnBenificialOwnerLBtn(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Add Beneficial Owner button has not been visible",btnAddBeneficialOwner.isDisplayed());
    btnAddBeneficialOwner.click();
}

//linkDocuments
    public void clickOnDocumentsLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Documents Tab has not been visible",linkDocuments.isDisplayed());
        linkDocuments.click();
    }
public void validate_DocumentsPage(String documentPage){
    WaitUtil.waitTill(2);
   String searchDocuments = txtSearchdocuments.getAttribute("placeholder");
   System.out.println(searchDocuments);
   Assert.assertEquals("user is on documents page",documentPage,searchDocuments);
}
//linkProducts
public void clickOnProductsLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Products Tab has not been visible",linkProducts.isDisplayed());
    linkProducts.click();
}

public void validate_ProductsPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Products page",productsPage.isDisplayed());
}
//linkHistoryTab
public void clickOnHistoryTabLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("History Tab has not been visible",linkHistoryTab.isDisplayed());
    linkHistoryTab.click();
}
    public void validate_HistoryPage(String historyPage){
        WaitUtil.waitTill(2);
        String Modify= txtModifyBy.getAttribute("placeholder");
        System.out.println(historyPage);
        Assert.assertEquals("user is on History page",historyPage,Modify);
    }
//linkRiskAssessment
public void clickOnRiskAssessmentTabLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("History Tab has not been visible",linkRiskAssessment.isDisplayed());
    linkRiskAssessment.click();
}
//btnRiskAssessment
public void validate_RiskAssessmentsPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Risk Assessments page",btnRiskAssessment.isDisplayed());
}

//linkProposals
public void clickOnProposalsTabLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Proposals Tab has not been visible",linkProposals.isDisplayed());
    linkProposals.click();
}
//proposalTable

    public void validate_ProposalsPage(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("User is not on Risk Assessments page",proposalTable.isDisplayed());
    }
//linkRelatedActions
public void clickOnRelatedActionsTabLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Related Actions Tab has not been visible",linkRelatedActions.isDisplayed());
    linkRelatedActions.click();
}
//pageRelatedActions
public void validate_RelateActionsPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Relate Actions page",pageRelatedActions.isDisplayed());
}


public void clickOnAttchLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("attach link is not visible",pageRelatedActions.isDisplayed());
    pageRelatedActions.click();
}
//pageAttach
public void validate_AttachPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Attach page",pageAttach.isDisplayed());
}
//linkEntityRelationships
public void clickOnEditEntityRelationshipsLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Edit Entity Relationships link is not visible",linkEntityRelationships.isDisplayed());
    linkEntityRelationships.click();
}
//linkUpdateContacts
    public void clickOnUpdateContactsLink(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Update contacts link is not visible",linkUpdateContacts.isDisplayed());
        linkUpdateContacts.click();
    }
//updatecontactspage
public void validate_UpdateContactsPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Update Contacts page",updatecontactspage.isDisplayed());
}
//linkAddAddress
public void clickOnAddAddressLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Add Address link is not visible",linkAddAddress.isDisplayed());
    linkAddAddress.click();
}
//pageAddAddress
public void validate_addAddressPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Add Address page",pageAddAddress.isDisplayed());
}
//linkAddLinks
public void clickOnAddLinksLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Add Links link is not visible",linkAddLinks.isDisplayed());
    linkAddLinks.click();
}
//pageAddLinks
public void validate_addLinksPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Add Links page",pageAddLinks.isDisplayed());
}
//linkAddPreviousCustomer
public void clickOnAddPreviousCustomerLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("Add Add Previous Customer link is not visible",linkAddPreviousCustomer.isDisplayed());
    linkAddPreviousCustomer.click();
}
//linkAddRiskAssessment
public void clickOnAAddRiskAssessmentLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue(" Add RiskAssessment link is not visible",linkAddRiskAssessment.isDisplayed());
    linkAddRiskAssessment.click();
}

//btnCreateRiskAssessment
public void validate_AddRiskAssessmentPage(){
    WaitUtil.waitTill(2);
    Assert.assertTrue("User is not on Add Links page",btnCreateRiskAssessment.isDisplayed());
}
//linkAddFunds
public void clickOnAAddfundsLink(){
    WaitUtil.waitTill(2);
    Assert.assertTrue(" Add Funds link is not visible",linkAddFunds.isDisplayed());
    linkAddFunds.click();
}





















}



