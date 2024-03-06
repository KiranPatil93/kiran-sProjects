package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnimalDetailsPage {
    WebDriver driver;

    public AnimalDetailsPage(WebDriver driver) {
      //  this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[contains(text(),'Add Animal Details')])[1]")
    WebElement AddAnimalDetails;

    @FindBy(xpath = "(//label[contains(text(),'Animal Name')]//following::input[1]")
    WebElement inputAddAnimal;

    @FindBy(xpath = "//label[contains(text(),'Animal Characteristics')]//following::textarea")
    WebElement txtAnimalChar;

    @FindBy(xpath = "//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder']")
    WebElement DropSpecieType;

    @FindBy(xpath = "(//div[@class='DropdownWidget---dropdown_value'])[1]")
    WebElement DropPenName;

    @FindBy(xpath = "//input[@value='Male']")
    WebElement radioMale;

    @FindBy(xpath = "//input[@value='Female']")
    WebElement radioFemale;

    @FindBy(xpath = "//label[contains(text(),'Animal Age')]//following::input[1]")
    WebElement txtAnimalAge;

    @FindBy(xpath = "//button[contains(text(),'Upload')]")
    WebElement btnUpload;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement btnSubmit;

    @FindBy(xpath = "//span[contains(text(),'Pen Details')]")
    WebElement penDetailssect;

    @FindBy(xpath = "//strong[contains(text(),'Pen Details')]")
    WebElement penDetailsPage;

    @FindBy(xpath = "//button[@class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list']")
    WebElement btnAddPen;

    @FindBy(xpath = "//input[@class='TextInput---text TextInput---align_start']")
    WebElement txtPenName;

    @FindBy(xpath = "//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder']")
    WebElement DropPenType;

    @FindBy(xpath = "//button[contains(text(),'CANCEL')]")
    WebElement btnCancle;
    @FindBy(xpath = "//span[contains(text(),'Specie Type')]")
    WebElement filtSpecieType;

    @FindBy(xpath = "//span[contains(text(),'Gender')]")
    WebElement filtGender;

    @FindBy(xpath = "//span[contains(text(),'Gender')]")
    WebElement filtPenName;

    @FindBy(xpath = "//input[@class='TextInput---text TextInput---align_start TextInput---inSideBySideItem']")
    WebElement txtearchAnimal;

    public void verifyZooDetailPage() {
        List<WebElement> ZooDetail = driver.findElements(By.xpath("//div[contains(text(),'Zoo Details')]"));
        if (ZooDetail.size() > 0) {
            System.out.println("user is on Zoo detail page");
        } else {
            Assert.fail("User is not on zoo Detail page");
        }

    }

    public void verifyAnimalDetailspage() {
        List<WebElement> AnimalDetailspage = driver.findElements(By.xpath("//div[contains(text(),'Zoo Details')]"));
        if (AnimalDetailspage.size() > 0) {
            System.out.println("user is on Zoo detail page");
        } else {
            Assert.fail("User is not on zoo Detail page");
        }

    }

    public void AddAnimalDetails() {

        AddAnimalDetails.click();
    }

    public void verify_AddAnimalPage() {
        List<WebElement> zoo = driver.findElements(By.xpath("BillboardLayout---billboard_photo_fixed_height"));
        if (zoo.size() > 0) {
            System.out.println("user is on Add Animal page");
        }
    }

    public void AddAnimalName(String AnimalName) {
        inputAddAnimal.sendKeys(AnimalName);
    }

    public void AnimalCharacterstics(String AnimalCharacterstics) {
        txtAnimalChar.sendKeys(AnimalCharacterstics);
    }


    public void SpecieType(String SpecieType) throws InterruptedException {
        Thread.sleep(3000);
        DropSpecieType.click();
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementById('txt').value='Amphibians'");
    }


    public void PenName(String PenName) throws InterruptedException {
        Thread.sleep(3000);
        DropPenName.click();
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementById('txt').value='"+PenName+"'");
    }

    //radioMale
    public void GenderOfAnimal(String Gender) {
        if (Gender == "Male") {
            radioMale.click();
        } else {
            radioFemale.click();
        }

    }

    //txtAnimalAge
    public void animalAge(String AnimalAge) {

        txtAnimalAge.sendKeys(AnimalAge);
    }

    //btnUpload
    public void uploadPhoto() throws InterruptedException {
        String photo = "";
        Thread.sleep(5000);
        btnUpload.sendKeys(photo);
    }

    //btnSubmit
    public void submit() {
        btnSubmit.click();
    }

    //penDetailssect
    public void clickOnPenDetails() {
        if (penDetailssect.isDisplayed()) {
            penDetailssect.click();
        } else {
            Assert.fail("Element is not clickable or PEn Details section is not visible");
        }
    }

    //penDetailsPage
    public void verifyPenDetailsPage() {
        List<WebElement> penDetailsPage = driver.findElements(By.xpath("//strong[contains(text(),'Pen Details')]"));
        if (penDetailsPage.size() > 0) {
            System.out.println("User is on pen details page");
        } else {
            Assert.fail("User is not on pen details page");
        }
    }

    //btnAddPen
    public void clickOnAddPen() {
        if (btnAddPen.isDisplayed()) {
            btnAddPen.click();
        } else {
            Assert.fail("Add Pen Details page is not visible");
        }
    }
    //txtPenName
    public void AddPenName(String PenName) {

        txtPenName.sendKeys(PenName);


    }
    //DropPenType
    public void PenType(String PenType) throws InterruptedException {
        Thread.sleep(3000);
        DropPenType.click();
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementById('txt').value='Steel'");
    }
     //btnUpload
    public void uploadPenPhoto() throws InterruptedException {
        String photo = "";
        Thread.sleep(5000);
        btnUpload.sendKeys(photo);
    }
    //btnCancle
    public void empcancleAnimal (){
        btnCancle.click();
    }

    //btnCancle
    public void empcanclePen (){

        btnCancle.click();
    }
//filtSpecieType
    public void getSpecieType(String SpecieType) throws InterruptedException {
        filtSpecieType.click();
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementById('txt').value='"+SpecieType+"'");
    }
    //filtGender
    public void selectGender(String gender) throws InterruptedException {
        filtGender.click();
        Thread.sleep(3000);
        WebElement genderm = driver.findElement(By.xpath("//div[normalize-space()='"+gender+"']"));
        genderm.click();
    }
//filtPenName
    public void selectPenName(String penName){
if(filtPenName.isDisplayed()){
    filtPenName.click();
    driver.findElement(By.xpath("//div[normalize-space()='"+penName+"]")).click();
}else{
    Assert.fail("");
}

    }

    //txtearchAnimal
    public void searchAnimal(String name) throws InterruptedException {
        if(txtearchAnimal.isDisplayed()){
            txtearchAnimal.click();
            Thread.sleep(2000);
            txtearchAnimal.sendKeys(name);
        }else{
            Assert.fail("Search for animal is not visible");
        }

    }

    public void searchAnimal_ID(String ID) throws InterruptedException {
        if(txtearchAnimal.isDisplayed()){
            txtearchAnimal.click();
            Thread.sleep(2000);
            txtearchAnimal.sendKeys(ID);
        }else{
            Assert.fail("Search for animal is not visible");
        }

    }

public void verify_AnimalDetailsTable(){
        List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---distribute']//th"));
        for(WebElement header:tableHeaders ){
            String animalDetail = header.getText();
            if(animalDetail.equals("id")|equals("Animal Name")|equals("Pen Name")|equals("Specie Name")|equals("Age")|equals("Charecteristics")|equals("Is Active?")){
                System.out.println("Table contains ID,Animal Name, Pen Name, Specie Name,Age, Chearecteristics and IS Active eaders are present");
            }else{
                Assert.fail("Required headers are not present.");
            }
        }
}


































}


