import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePage_DisplayedElementsTest extends TestRunner{

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify all required elements are displayed")
    @Story("Case1")
    @Test
    public void verifyAllRequiredElementsAreDisplayedOnWelcomePage(){
        WelcomePage welcomePage = new WelcomePage();
        String ageTextActual = welcomePage.getAgeText().getText();
        String ageTextExpected = "I am of legal drinking age in";
        Assert.assertEquals(ageTextActual, ageTextExpected, "There is no text about age limit!");

        //verifyForCheckboxPresent
        WebElement confirmationCheckbox = welcomePage.getConfirmationCheckbox();
        Assert.assertTrue(confirmationCheckbox.isDisplayed());

        //verifyForDropdownPresent
        WebElement dropdownSelector = welcomePage.getDropdownSelector();
        Assert.assertTrue(dropdownSelector.isDisplayed());

        //verifyWelcomeButtonIsPresentAndDisabled
        WebElement welcomeButton = welcomePage.getWelcomeButton();
        Assert.assertTrue(welcomeButton.isDisplayed(), "The button is not present on the page!");
        Assert.assertFalse(welcomeButton.isEnabled(), "The button is active!");
    }
}
