package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_AnimalDetailsPage {

    WebDriver driver;

    public Update_AnimalDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//a[contains(text(),'Tallee')]")
    WebElement ClickonAnimalName;

    @FindBy(xpath = "(//button[contains(text(),'Update Animal Details')]")
    WebElement UpdateAnimalDetails;

    @FindBy(xpath = "(//input[@class='TextInput---text TextInput---align_start'])[1]")
    WebElement EditAnimalName;

    @FindBy(xpath = "//div[contains(text(),'Elephants')]")
    WebElement SpeciesType;

    @FindBy(xpath = "//label[contains(text(),'Female')]")
    WebElement UpdateGenderOfAnimal;

    @FindBy(xpath = "(//input[@class='TextInput---text TextInput---align_start'])[2]")
    WebElement UpdateAnimalAge;

    @FindBy(xpath = "//a[@class='MultipleFileUploadWidget---upload_add elements---global_a elements---inLightBackground']")
    WebElement btnUpload;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement btnSubmit;

    @FindBy(xpath = "//div[@class='DropdownWidget---dropdown_value']")
    WebElement UpdatePenType;

    @FindBy(xpath = "//button[contains(text(),'CANCEL')]")
    WebElement btnCancel;


    public void ClickOnAnimalName(){
        ClickonAnimalName.click();

    }

    public void UpdateAnimalDetails(){
        UpdateAnimalDetails.click();

    }
    public void EditAnimalName(){
        EditAnimalName.sendKeys();

    }

    public void SpeciesType(){
        SpeciesType.click();

    }

    public void UpdateGenderOfAnimal(){
        UpdateGenderOfAnimal.click();

    }

    public void UpdateAnimalAge(){
        UpdateAnimalAge.sendKeys();

    }

    public void UploadPhoto() throws InterruptedException {
        String photo = "";
        Thread.sleep(5000);
        btnUpload.sendKeys(photo);
    }

    public void Submit() {

        btnSubmit.click();
    }

    public void UpdatePenType(String PenType) throws InterruptedException {
        Thread.sleep(3000);
        UpdatePenType.click();
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementById('txt').value='Steel'");
    }

    public void Cancle() {

        btnCancel.click();
    }

}
