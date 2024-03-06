package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/ApprovalFlow.feature", glue = {
        "com.appiancorp.ps.cucumber","MyStepDefinition"}, plugin = {"pretty"}, tags = "@NeedMoreInfo1")
public class RunCucumberForAppianTest {
}
