import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhereToBuyPage_EnterValidAddressTest extends TestRunner {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that the results of search are displayed")
    @Story("Case7")
    @Test
    public void verifySearchResultsAreDisplayed() {
        stepsToNavigateToMainPage();
        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();

        WhereToBuyPage whereToBuyPage = mainPage.navigateToWhereToBuyPage();
        whereToBuyPage.clickSearchField();
        whereToBuyPage.enterPostalCode("Eg. Sydney, NSW 2000");
        whereToBuyPage.clickSearchSubmitButton();

        //verify that the results of search are displayed
        Assert.assertTrue(whereToBuyPage.getSearchResults().isDisplayed());
    }
}
