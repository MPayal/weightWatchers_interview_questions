package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    static String currentDirectory = System.getProperty("user.dir");

    public enum Browser {
       IE;
    }

    public static WebDriver get(Browser browser) {
        switch (browser) {

            case IE:
                String ieDriver = currentDirectory + "/src/main/resources/IEDriverServer.exe";
                System.setProperty("webdriver.ie.driver", ieDriver);
                return new InternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Unknown browser requested: " + browser);
        }
    }
}
