import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case7 extends TestRunner {
    @Test
    public void verifySearchResultsAreDisplayed() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue("eu");

        MainPage mainPage = welcomePage.clickButtonWelcome();
        mainPage.clickMenuButton();

        WhereToBuyPage whereToBuyPage = mainPage.clickWhereToBuy();
        whereToBuyPage.getSearchField();
        whereToBuyPage.clickSearchField();
        whereToBuyPage.enterPostalCode("Eg. Sydney, NSW 2000");
        whereToBuyPage.clickSearchSubmitButton();

        //verify that the results of search are displayed
        WebElement searchResults = DriverProvider.getDriver().findElement(By.className("results"));
        Assert.assertTrue(searchResults.isDisplayed());
    }
}
