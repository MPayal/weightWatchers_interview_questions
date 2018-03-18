package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstResultPage {

    private WebDriver driver;

    @FindBy(className = "location__name")
    private WebElement nameOfTheFirstResult;

    @FindBy(xpath = "//div[@class='hours-list-item-wrapper hours-list--currentday']//div[@ng-repeat='meeting in day.meetings']")
    private WebElement todaysHoursOfOperation;

    public FirstResultPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getNameOfTheFirstResult() {
        return nameOfTheFirstResult.getText();
    }

    public void getCurrentDaysHoursOfOperation() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", todaysHoursOfOperation);
        System.out.println(todaysHoursOfOperation.getText());
    }
}
