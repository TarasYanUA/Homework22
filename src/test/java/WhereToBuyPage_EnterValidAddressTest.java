import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhereToBuyPage_EnterValidAddressTest extends TestRunner {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that the results of search are displayed")
    @Story("Case7")
    @Test
    public void verifySearchResultsAreDisplayed() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue("eu");

        MainPage mainPage = welcomePage.navigateToMainPage();
        mainPage.clickMenuButton();

        WhereToBuyPage whereToBuyPage = mainPage.navigateToWhereToBuyPage();
        whereToBuyPage.getSearchField();
        whereToBuyPage.clickSearchField();
        whereToBuyPage.enterPostalCode("Eg. Sydney, NSW 2000");
        whereToBuyPage.clickSearchSubmitButton();

        //verify that the results of search are displayed
        WebElement searchResults = DriverProvider.getDriver().findElement(By.className("results"));
        Assert.assertTrue(searchResults.isDisplayed());
    }
}
