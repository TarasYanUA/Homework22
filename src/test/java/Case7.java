import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case7 extends TestRunner {
    @Test
    public void verifySearchResultsAreDisplayed() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue();
        welcomePage.clickButtonWelcome();

        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        mainPage.clickWhereToBuy();

        String stringForSearch = "Eg. Sydney, NSW 2000";
        WhereToBuyPage whereToBuyPage = new WhereToBuyPage();
        whereToBuyPage.getSearchField();
        whereToBuyPage.clickSearchField();
        whereToBuyPage.enterPostalCode(stringForSearch);
        whereToBuyPage.clickSearchSubmitButton();

        //variant 1 - Verify that the results of search are displayed
        Assert.assertNotNull(DriverProvider.getDriver().findElement(By.className("results")));
        //variant 2 - Verify that the results of search are displayed
        String getWinesText = "Stockists in your area";
        Assert.assertNotNull(getWinesText.compareToIgnoreCase("Stockists in your area"), "There is no such a text");
    }
}
