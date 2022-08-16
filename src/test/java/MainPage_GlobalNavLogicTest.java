import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class MainPage_GlobalNavLogicTest extends TestRunner {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Select USA in popup and click on it. Verify that url has changed")
    @Story("Case6")
    @Test
    public void verifyUrlHasChanged() {
        stepsToNavigateToMainPage();

        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        mainPage.clickGlobeIcon();

        WebElement languageSelection = (new WebDriverWait((mainPage.driver), Duration.ofSeconds(2))).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-key='US']")));
        languageSelection.click();

        //Verify that url has changed
        String expectedUrl = "https://www.yellowtailwine.com/us/";
        String actualUrl = DriverProvider.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.toLowerCase().contains(expectedUrl.toLowerCase()));
    }
}
