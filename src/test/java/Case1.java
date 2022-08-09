import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case1 extends TestRunner{

    @Test
    public void verifyTextForLegalDrinkingAge(){
        String ageTextActual = "I am of legal drinking age in";
        Assert.assertEquals(ageTextActual, "I am of legal drinking age in", "There is not such a text!");
        }

    @Test
    public void verifyForCheckboxPresent(){
        Assert.assertNotNull(DriverProvider.getDriver().findElement(By.className("confirmation-checkbox")), "There is no checkbox on the page!");
    }

    @Test
    public void verifyForDropDownPresent(){
        //variant 1
        Assert.assertNotNull(DriverProvider.getDriver().findElement(By.id("agegate-selector-options")), "There is no dropdown on the page");
        //variant 2
        WebElement dropDown = DriverProvider.getDriver().findElement(By.id("agegate-selector-options"));
        dropDown.isDisplayed();
    }

    @Test
    public void verifyWelcomePresentAndDisabled(){
        WebElement elementWelcome = DriverProvider.getDriver().findElement(By.xpath("//input[@value=\"Welcome\"]"));
        elementWelcome.isDisplayed();       //button is present
        Assert.assertFalse(elementWelcome.isEnabled(), "The button is active");     //button is disabled
    }
}
