package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.Hooks.task;

public class TaskStep {
    @Given("I click on Task button")
    public void iClickOnTaskButton() {
        task.clickOnTaskButton();
    }

    @When("I click on Task Checkbox")
    public void iClickOnTaskCheckbox() {
        task.clickOnTaskCheckbox();
    }


    @And("I click on Claim Task button button")
    public void iClickOnClaimTaskButtonButton() {
        task.clickOnClaimTaskButton();
    }

    @Then("I should see name in Assignee field {string}")
    public void iShouldSeeNameInAssigneeField(String assigneeName) {
        task.validate_claimTask(assigneeName);
    }

    @And("I click on Change due Date button")
    public void iClickOnChangeDueDateButton() {
        task.clickOnChangeDueDateBtn();
    }

    @And("I navigate on Change Due Date Task")
    public void iNavigateOnChangeDueDateTask() {
        task.validate_ChangeDueDatePage();
    }

    @And("I click on Reassign button")
    public void iClickOnReassignButton() {
        task.clickOnReassignBtn();
    }

    @Then("navigate on Reassign Task")
    public void navigateOnReassignTask() {
        task.validate_ReAssignPage();
    }

    @When("I click on Show Tagged Task button")
    public void iClickOnShowTaggedTaskButton() {
        task.clickOnShowTaggedTaskBtn();
    }

    @Then("I should see Tagged Task page")
    public void iShouldSeeTaggedTaskPage() {
        task.validate_showTaggedTaskPage();
    }

    @When("I click on RDC Alert button")
    public void iClickOnRDCAlertButton() {
        task.clickOnRDCAlertBtn();
    }

    @Then("I should see RDC Alert page")
    public void iShouldSeeRDCAlertPage() {
        task.validate_RDCAlertPage();
    }

    @Given("I am on Task page")
    public void iAmOnTaskPage() {
        task.clickOnTaskButton();
    }
}
