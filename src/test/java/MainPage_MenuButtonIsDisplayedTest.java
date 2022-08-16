import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPage_MenuButtonIsDisplayedTest extends TestRunner {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that Menu button is visible")
    @Story("Case5")
    @Test
    public void verifyMenuButtonIsDisplayedOnHomepage() {
        stepsToNavigateToMainPage();

        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        mainPage.clickMainLogo();

        WebElement menuButton = mainPage.getMenuButton();
        Assert.assertTrue(menuButton.isDisplayed());
    }
}
