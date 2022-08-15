import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case1Test extends TestRunner{

    @Test
    public void verifyAllRequiredElementsAreDisplayedOnWelcomePage(){
        WebElement element = DriverProvider.getDriver().findElement(By.xpath("//label[@for=\"confirm\"]"));
        String ageTextActual = element.getText();
        String ageTextExpected = "I am of legal drinking age in";
        Assert.assertEquals(ageTextActual, ageTextExpected, "There is no a text about age limit!");

        //verifyForCheckboxPresent
        WebElement checkbox = DriverProvider.getDriver().findElement(By.className("confirmation-checkbox"));
        Assert.assertTrue(checkbox.isDisplayed());

        //verifyForDropdownPresent
        WebElement dropdown = DriverProvider.getDriver().findElement(By.id("agegate-selector-options"));
        Assert.assertTrue(dropdown.isDisplayed());

        //verifyWelcomePresentAndDisabled
        WebElement elementWelcome = DriverProvider.getDriver().findElement(By.xpath("//input[@value=\"Welcome\"]"));
        Assert.assertTrue(elementWelcome.isDisplayed(), "The button is not present on the page!");       //button is present
        Assert.assertFalse(elementWelcome.isEnabled(), "The button is active!");     //button is disabled
    }
}
