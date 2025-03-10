package Utilities;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader {
    public static Properties properties;
    public static FileInputStream fc;
    public static String propertyFilePath= "C:\\Users\\KiranPatil\\IdeaProjects\\Com.Cucumber.TrainingProject\\Config\\Config.properties";

    static {
          properties = new Properties();

        try {

        fc = new FileInputStream(propertyFilePath);
            try {
                properties.load(fc);
                fc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);

        }

    }
    public static long getImplicitelyWait(){
        String implicitlyWait = properties.getProperty("implicitlyWait");//80
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }
    public static String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
    public static String getBrowser(){
        String browserName = properties.getProperty("browser");
        if(browserName != null) return browserName;
        else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }

    public static String getLoginUsername() {
        String username = properties.getProperty("username");
        if(username != null) return username;
        else throw new RuntimeException("Login Email is not specified in the Configuration.properties file for the Key:email");
    }

    public static String getLoginPassword() {
        String password = properties.getProperty("password");
        if(password != null) return password;
        else throw new RuntimeException("Login password is not specified in the Configuration.properties file for the Key:password");
    }
}
