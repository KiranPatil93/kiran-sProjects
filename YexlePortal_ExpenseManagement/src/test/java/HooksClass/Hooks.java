package HooksClass;

import com.appiancorp.ps.automatedtest.common.Settings;
import com.appiancorp.ps.cucumber.fixtures.CucumberTempoFixture;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    protected Settings settings = Settings.initialize();

    public void Initilization(){


        ChromeOptions ops = new ChromeOptions();
      //  ops.addArguments("--remote-allow-origins=*");
        ops.addArguments(new String[]{"--remote-allow-origins=*"});
        ops.setExperimentalOption("useAutomationExtension", false);
        this.settings.setDriver(new ChromeDriver(ops));
    }
}
