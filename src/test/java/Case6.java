import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case6 extends TestRunner {

    @Test(groups = "Case6")
    public void verifyMenuButtonIsDisplayedOnHomepage() {
        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        mainPage.clickGlobeIcon();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainPage.clickLanguageSelection();

        //Verify that url is changed
        String expectedUrl = "https://www.yellowtailwine.com/us/";
        String actualUrl = DriverProvider.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.toLowerCase().contains(expectedUrl.toLowerCase()));
    }
}
