package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    private final WebDriver driver;

    @FindBy(className = "find-a-meeting")
    private WebElement findAMeeting;

    public HomePage(WebDriver driver, String url) {

        this.driver = driver;
        this.driver.get(url);

        PageFactory.initElements(driver, this);
    }

    public void get(String url) {
        driver.get(url);
    }

    public void findAMeeting() {
        findAMeeting.click();
    }

}


