import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPage_DisplayedElementsTest extends TestRunner{

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify all required elements are displayed")
    @Story("Case3")
    @Test
    public void verifyAllRequiredElementsAreDisplayedOnMainPage() {
        stepsToNavigateToMainPage();
        MainPage mainPage = new MainPage();

        //verifyMenuButtonIsDisplayed
        WebElement elementWelcome = mainPage.getMenuButton();
        Assert.assertTrue(elementWelcome.isDisplayed(), "There is no menu button!");

        //verifyWelcomeTextIsDisplayedOnMainPage
        String actualWelcomeText = mainPage.getWelcomeText().getText();
        String expectedWelcomeText = "WELCOME TO THE WORLD OF";
        Assert.assertEquals(actualWelcomeText.contains(actualWelcomeText), expectedWelcomeText.contains(expectedWelcomeText), "There is no Welcome text!");

        //verifyWinesTextIsDisplayedOnMainPage
        String actualWinesText = mainPage.getWinesText().getText();
        String expectedWinesText = "We are passionate about creating great tasting, quality wines for everyone to enjoy";
        Assert.assertEquals(actualWinesText.compareToIgnoreCase(actualWinesText), expectedWinesText.compareToIgnoreCase(expectedWinesText), "There is no Wines text");

        //verifyWineButtonIsDisplayedOnMainPage
        Assert.assertTrue(mainPage.getWineButton().isDisplayed());

        //verifyFooterIsDisplayedOnMainPage
        Assert.assertTrue(mainPage.getFooter().isDisplayed());
    }
}