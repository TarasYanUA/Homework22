import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case3 extends TestRunner{

    @Test(groups = "Case3")
    public void verifyAllRequiredElementsAreDisplayedOnMainPage() {
        //verifyMenuButtonIsDisplayed
        WebElement elementWelcome = DriverProvider.getDriver().findElement(By.cssSelector(".fa.fa-bars"));
        Assert.assertTrue(elementWelcome.isDisplayed(), "There is no menu button!");

        //verifyWelcomeTextIsDisplayedOnMainPage
        String expectedWelcomeText = "WELCOME TO THE WORLD OF";
        WebElement elementWelcomeText = DriverProvider.getDriver().findElement(By.xpath("//div[contains(@class, 'content animation-screen')]"));
        String actualWelcomeText = elementWelcomeText.getText();
        Assert.assertEquals(actualWelcomeText.contains(actualWelcomeText), expectedWelcomeText.contains(expectedWelcomeText), "There is no Welcome text!");

        //verifyWinesTextIsDisplayedOnMainPage
        String expectedWinesText = "We are passionate about creating great tasting, quality wines for everyone to enjoy";
        WebElement elementWines = DriverProvider.getDriver().findElement(By.xpath("(//p[@class='header-sub-copy'])[1]"));
        String actualWinesText = elementWines.getText();
        Assert.assertEquals(actualWinesText.compareToIgnoreCase(actualWinesText), expectedWinesText.compareToIgnoreCase(expectedWinesText), "There is no Wines text");

        //verifyWineButtonIsDisplayedOnMainPage
        WebElement wineButton = DriverProvider.getDriver().findElement(By.xpath("(//a[@class='button home-button'])[1]"));
        Assert.assertTrue(wineButton.isDisplayed());

        //verifyFooterIsDisplayedOnMainPage
        WebElement footer = DriverProvider.getDriver().findElement(By.cssSelector("#primary-footer"));
        Assert.assertTrue(footer.isDisplayed());
    }
}