package com.appiancorp.ps.cucumber.fixtures;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class MyStepdefs extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver = null;

    @Given("I click on menu button {string}")
    public void i_click_on_menu_button(String string) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        String parentWindowID = driver.getWindowHandle();
        Thread.sleep(3000);
        WebElement menuBtn = driver.findElement(By.cssSelector(".Button_TEMPO_SITE_NAVIGATION_MENU---btn.undefined"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", menuBtn);
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++) {
            try {
                List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
                for (WebElement option : options) {
                    String textOption = option.getText();
                    if (textOption.equals("Flow of Funds")) {
                        // WebElement flowOfFund= driver.findElement(By.xpath("//span[text()='Flow of Funds']"));
                        Actions act = new Actions(driver);
                        act.click(option).build().perform();

                    }
                }

            }catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
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

    @When("I click on button action {string}")
    public void iClickOnButtonAction(String brg) {
        driver = ctf.getSettings().getDriver();

        try {
            Actions act = new Actions(driver);
            WebElement newFlowOfFund = driver.findElement(By.xpath("//button/following::span[text()='Create Flow of Funds']"));
            if (brg.equals("Create Flow of Funds")) {
//                act.click(newFlowOfFund).build().perform();
                newFlowOfFund.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }


    @And("I select {string} dropdown value {string}")
    public void iSelectDropdownValue(String dropdown, String option) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement dropdownName = driver.findElement(By.xpath("//span[text()='"+dropdown+"']//following::div[3]"));
        Actions act = new Actions(driver);
        act.click(dropdownName).build().perform();
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++) {
            try {
                List<WebElement> dropdownOptions = driver.findElements(By.xpath("//li[@role='option']"));
                for (WebElement element : dropdownOptions) {
                    String textOption = element.getText();
                    System.out.println(textOption);
                    if (textOption.equals(option)) {
                        act.click(element).build().perform();
                    }
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @And("I click on Distribution test required Yes")
    public void iClickOnDistributionTestRequiredYes() {
        driver = ctf.getSettings().getDriver();
        WebElement distribution = driver.findElement(By.xpath("(//*[@class='MultiColumnLayout---column_layout MultiColumnLayout---margin_above_none appian-context-last-in-list'])[1]"));
        distribution.click();
    }

    @And("I enter comment {string}")
    public void iEnterComment(String comment) {
        driver = ctf.getSettings().getDriver();
       WebElement textarea= driver.findElement(By.xpath("//textarea[@class='ParagraphWidget---textarea ParagraphWidget---align_start ParagraphWidget---height_medium ParagraphWidget---inModalDialogLayout']"));
        textarea.sendKeys(comment);
    }

    @And("I enter due date {string}")
    public void iEnterDueDate(String dueDate) {
        driver = ctf.getSettings().getDriver();
        WebElement date = driver.findElement(By.xpath("//input[@class='DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width']"));
        date.sendKeys(dueDate);
    }

    @And("I upload flow of fund pdf {string}")
    public void iUploadFlowOfFundPdf(String file) {
        driver = ctf.getSettings().getDriver();
        WebElement upload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
        JavascriptExecutor jsexec = (JavascriptExecutor) driver;
        jsexec.executeScript("arguments[0].type='file'", upload);
        upload.sendKeys(file);
    }

    @And("I click on button submit button")
    public void iClickOnButtonSubmitButton() {
        driver = ctf.getSettings().getDriver();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//button[@class='Button---btn Button---default_direction Button---solid appian-context-first-in-list appian-context-last-in-list Button---inModalDialogLayout Button---icon_start']"));
        executor.executeScript("arguments[0].click();", element);
    }

    @Given("I click on Treasury Director action")
    public void iClickOnTreasuryDirectorAction() {
        driver = ctf.getSettings().getDriver();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr[1]/td[8]//button"));
        executor.executeScript("arguments[0].click();", element);
    }

    @And("I click on approve button")
    public void iClickOnApproveButton() {
        driver = ctf.getSettings().getDriver();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Approve')]//ancestor::button"));
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        executor.executeScript("arguments[0].click();", element);
    }

    @When("I click on Action button")
    public void iClickOnActionButton() {
        driver = ctf.getSettings().getDriver();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr[1]/td[8]//button"));
        executor.executeScript("arguments[0].click();", element);
    }

    @And("I upload lender relations notes pdf {string}")
    public void iUploadLenderRelationsNotesPdf(String file) {
        driver = ctf.getSettings().getDriver();
        WebElement upload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
        JavascriptExecutor jsexec = (JavascriptExecutor) driver;
        jsexec.executeScript("arguments[0].type='file'", upload);
        upload.sendKeys(file);
    }

    @When("I enter Distribution Test Notes {string}")
    public void iEnterDistributionTestNotes(String note) {
        driver = ctf.getSettings().getDriver();
        WebElement notes= driver.findElement(By.xpath("//textarea[@class='ParagraphWidget---textarea ParagraphWidget---align_start ParagraphWidget---height_short ParagraphWidget---hasCharacterCount ParagraphWidget---inModalDialogLayout']"));
        notes.sendKeys(note);
    }


    @And("I enter {string} value and select entity {string}")
    public void iEnterValueAndSelectEntity(String input, String entity) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement inputText = driver.findElement(By.xpath("//input[@class='PickerWidget---picker_input PickerWidget---placeholder']"));
        inputText.sendKeys(input);
        Actions act = new Actions(driver);
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++) {
            try {
                List<WebElement> dropdownOptions = driver.findElements(By.xpath("//li[@role='option']"));
                for (WebElement element : dropdownOptions) {
                    String textOption = element.getText();
                    System.out.println(textOption);
                    if (textOption.equals(entity)) {
                        act.click(element).build().perform();
                    }
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @And("I enter transaction date {string}")
    public void iEnterTransactionDate(String date) {
        driver = ctf.getSettings().getDriver();
        WebElement inputText = driver.findElement(By.xpath("//input[@class='DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---inEditableGridLayout']"));
        inputText.sendKeys(date);
    }

    @And("I enter amount {string}")
    public void iEnterAmount(String amount) {
        driver = ctf.getSettings().getDriver();
        WebElement inputText = driver.findElement(By.xpath("//input[@class='TextInput---text TextInput---align_start TextInput---inEditableGridLayout']"));
        inputText.sendKeys(amount);
    }

    @And("I click on {string} button")
    public void iClickOnButton(String button) {
        driver = ctf.getSettings().getDriver();
        WebElement buttonElement = driver.findElement(By.xpath("//*[text()='"+button+"']//ancestor::button"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", buttonElement);

    }


    @Given("I custom resize window width {int} height {int}")
    public void iCustomResizeWindowWidthHeight(int width, int height) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        Dimension dimension = new Dimension(width, height);
        Dimension currentSize = driver.manage().window().getSize();
        System.out.println("Current window size: Width = " + currentSize.getWidth() + ", Height = " + currentSize.getHeight());
        driver.manage().window().setSize(dimension);
        Thread.sleep(1000);
    }




    @And("I custom zoom out page")
    public void iCustomZoomOutPage() throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.transform = 'scale(0.55)';");
        Thread.sleep(2000);
        // Center the entire page content
        // Center the entire page content
        // Adjust Layout (Example: Setting body min-width to viewport width)
        String preventOverflowScript = "document.body.style.overflow = 'hidden';" +
                "document.body.style.minWidth = window.innerWidth + 'px';"; // Ensure width matches viewport
        js.executeScript(preventOverflowScript);

        // Scroll to Top
        js.executeScript("window.scrollTo(0, 0);"); // Scroll to top-left corner
        Thread.sleep(2000);
    }
}



