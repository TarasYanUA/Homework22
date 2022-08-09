import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case3 extends TestRunner{

    @Test(groups = "Case3")
    public void verifyMenuButtonIsDisplayedOnMainPage() {
        MainPage mainPage = new MainPage();
        Assert.assertNotNull(mainPage.driver.findElement(By.cssSelector(".fa.fa-bars")), "There is no menu button!");
    }

   @Test(groups = "Case3")
    public void verifyWelcomeTextIsDisplayedOnMainPage() {
        String getWelcomeText = "WELCOME TO THE WORLD OF [Yellow tail]";
        Assert.assertEquals(getWelcomeText, "WELCOME TO THE WORLD OF [Yellow tail]", "There is no Welcome text!");
    }

    @Test(groups = "Case3")
    public void verifyWinesTextIsDisplayedOnMainPage() {
        String getWinesText = "We are passionate about creating great tasting, quality wines for everyone to enjoy";
        Assert.assertNotNull(getWinesText.compareToIgnoreCase("We are passionate about creating great tasting, quality wines for everyone to enjoy"), "There is no such a text");
    }

    @Test(groups = "Case3")
    public void verifyWineButtonIsDisplayedOnMainPage() {
        WebElement wineButton = DriverProvider.getDriver().findElement(By.xpath("(//a[@class='button home-button'])[1]"));
        wineButton.isDisplayed();
    }

    @Test(groups = "Case3")
    public void verifyFooterIsDisplayedOnMainPage() {
        WebElement footer = DriverProvider.getDriver().findElement(By.cssSelector("#primary-footer"));
        footer.isDisplayed();
    }
}