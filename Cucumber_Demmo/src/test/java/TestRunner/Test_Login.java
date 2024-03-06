package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\KiranPatil\\IdeaProjects\\Cucumber_Demmo\\src\\test\\Feature\\Login.Feature",
        glue = "com.StepDefinition",
        dryRun = true,
        plugin = {"pretty","html:Target"}
)
public class Test_Login {


}
