package com.appiancorp.ps.cucumber.fixtures;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static Utility.TestUtil.*;
import static com.appiancorp.ps.cucumber.fixtures.Locators.*;

public class MyStepdefs extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver= null;

    @Given("I custome click on card {string}")
    public void i_custome_click_on_card(String text) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).click();
    }

    @When("I custome zoom in page")
    public void i_custome_zoom_in_page() {
        zoomIn();
    }


    @When("I custom click on button upload document")
    public void i_custom_click_on_button_upload_document() throws InterruptedException {
        driver = ctf.getSettings().getDriver();

        String parent = driver.getWindowHandle();

        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());
                Thread.sleep(2000);
                WebElement uploadBtn = driver.findElement(By.cssSelector(uploadButton));
                if(uploadBtn.isDisplayed()){
                    uploadBtn.click();
                }else{
                    Assert.fail("upload button is not displayed");
                }

            }

        }

    }




    @When("I custom select doc type {string}")
    public void i_custom_select_doc_type(String doc) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement docuTypeDrop = driver.findElement(By.xpath(dropDocumentType));
        docuTypeDrop.click();
        Thread.sleep(1000);
        int flag = 0;
        // for (int i = 0; i < 3; i++) {
        try {
            List<WebElement> allOptions = driver.findElements(By.xpath("//li[contains(@role,'option')]"));
            for (WebElement dropoption : allOptions) {
                String txtoptions = dropoption.getText();
                System.out.println(txtoptions);
                if (txtoptions.toString().equals(doc)) {
                    Actions act = new Actions(driver);
                    act.moveToElement(dropoption).click().build().perform();
                    flag = 1;// Set to 1 when the required element was found and clicked.
                    break;
                }

            }

        }catch(StaleElementReferenceException e){
            List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(@class,'MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget')]"));
            for (WebElement dropoption : allOptions) {
                String txtoptions = dropoption.getText();
                System.out.println(txtoptions);
                if (txtoptions.toString().equals(doc)) {
                    Actions act = new Actions(driver);
                    act.moveToElement(dropoption).click().build().perform();
                    flag = 1;// Set to 1 when the required element was found and clicked.
                    break;
                }

            }
        }
    }

    @When("I custome select employee name {string}")
    public void i_custome_select_employee_name(String employee) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        autosuggetionDropdown(employee,dropEmployee,inputEmployee);
    }

    @When("I custom select employee name {string}")
    public void i_custom_select_employee_name(String employee) throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath(dropEmployee));
        element1.click();
        Thread.sleep(2000);
        autosuggetionDropdown(employee, dropEmployee, inputEmployee);
    }
    @When("I custome select year {string}")
    public void i_custome_select_year(String year) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement docuTypeDrop = driver.findElement(By.xpath(dropYear));
        docuTypeDrop.click();
        Thread.sleep(1000);
        selectdropdownValue(year);
    }
    @When("I custome select month {string}")
    public void i_custome_select_month(String month) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement docuTypeDrop = driver.findElement(By.xpath(dropMonth));
        docuTypeDrop.click();
        Thread.sleep(1000);
        selectdropdownValue(month);
    }
    @When("I custome upload document {string}")
    public void i_custome_upload_document(String upload) throws InterruptedException {
        uploadFile(upload,btnUpload);
    }

    @When("I custom enter comment {string}")
    public void i_custom_enter_comment(String comment) throws InterruptedException {
        enterComment(comment,txtComment);
    }

    @When("I custom click on file name")
    public void i_custom_click_on_file_name() {
        String filePath = "C:/Users/KiranPatil/IdeaProjects/cucumber-for-appian-23.2.1/TestData/samplepdf.pdf";
        File file = new File(filePath);
        String fileName = file.getName();
        // Remove the file extension
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex > 0) {
            fileName = fileName.substring(0, lastDotIndex);
        }

        System.out.println("File Name without Extension: " + fileName);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement fileNamelink = driver.findElement(By.xpath("//a[contains(text(),'"+fileName+"')]"));
        Actions act = new Actions(driver);
       // js.executeScript("arguments[0].scrollIntoView();", fileNamelink);
        act.moveToElement(fileNamelink).click().build().perform();
       // String textvalue = fileNamelink.getText();
        int columnIndex = 2;
     /*   List<WebElement>summaryGrid = driver.findElements(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---distribute']/tbody/tr/td["+columnIndex+"]"));
        for(WebElement linkname:summaryGrid){
            String linktext = linkname.getText();
            if(linktext.contains(textvalue)){
                //linkname.click();
                //js.executeScript("arguments[0].click();", linkname);
                Actions act = new Actions(driver);
                js.executeScript("arguments[0].scrollIntoView();", linkname);
                act.moveToElement(linkname).click().build().perform();
                break;
            }else{
                Assert.fail("uploaded file is not present in grid");
            }
        }*/

    }













}
