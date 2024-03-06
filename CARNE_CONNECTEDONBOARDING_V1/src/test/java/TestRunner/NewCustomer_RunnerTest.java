package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/CreateCustomer.feature", glue = "StepDefinition", plugin = {"pretty"}, dryRun = false,monochrome = true
        //format = {"pretty", "html:TestReports", "json:TestReports/cucumber.json", "junit:TestReports/cucumber.xml"}
)
public class NewCustomer_RunnerTest {

}
