package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindMeetingPage {

    private WebDriver driver;

    public FindMeetingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "meetingSearch")
    private WebElement searchForAMeeting;

    @FindBy(className = "input-group-btn")
    private WebElement searchButton;

    @FindBy(className = "location__name")
    private WebElement firstSearchResultName;

    @FindBy(className = "location__distance")
    private WebElement firstSearchResultMiles;

    public ExpectedCondition<Boolean> waitTillFindAMeetingPageIsLoaded() {
        return ExpectedConditions.titleContains("Get Schedules & Times Near You");
    }

    public void enterZipcode(String zipcode) {
        searchForAMeeting.click();
        searchForAMeeting.sendKeys(zipcode);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getFirstResultName() {
        return firstSearchResultName.getText();
    }

    public String getFirstSearchResultMiles() {
        return firstSearchResultMiles.getText();
    }

    public void clickOnFirstResult() {
        firstSearchResultName.click();
    }

}
