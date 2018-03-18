package weightwatchers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.DriverManager;
import pageobjects.FindMeetingPage;
import pageobjects.FirstResultPage;
import pageobjects.HomePage;

import static org.junit.Assert.assertEquals;

public class Solution2 {

    private WebDriver driver;
    private String url = "https://www.weightwatchers.com/us/";
    private HomePage homePage;
    private FindMeetingPage findMeetingPage;
    private FirstResultPage firstResultPage;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        driver = DriverManager.get(DriverManager.Browser.IE);
        homePage = new HomePage(driver, url);
        findMeetingPage = new FindMeetingPage(driver);
        firstResultPage = new FirstResultPage(driver);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void searchForMeetingInAZipCode() {

        assertEquals("Weight Loss Program, Recipes & Help | Weight Watchers", driver.getTitle());

        homePage.findAMeeting();
        wait.until(findMeetingPage.waitTillFindAMeetingPageIsLoaded());

        findMeetingPage.enterZipcode("10011");

        findMeetingPage.clickSearchButton();

        System.out.println("The name of the first search result is " + findMeetingPage.getFirstResultName());

        System.out.println("The distance of the first search result is " + findMeetingPage.getFirstSearchResultMiles());

        findMeetingPage.clickOnFirstResult();

        assertEquals(findMeetingPage.getFirstResultName(), firstResultPage.getNameOfTheFirstResult());

        firstResultPage.getCurrentDaysHoursOfOperation();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
