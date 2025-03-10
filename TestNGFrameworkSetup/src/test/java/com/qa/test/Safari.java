package com.qa.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Safari {
    @Test
void safariSetup(){
    WebDriverManager manager = WebDriverManager.safaridriver().browserInDocker().enableVnc();
   WebDriver driver = manager.create();
   URL url = manager.getDockerNoVncUrl();
   driver.get("https://yexledemo.appiancloud.com/suite/sites/automation-cases");
}
}
