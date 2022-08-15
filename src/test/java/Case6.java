import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Case6 extends TestRunner {

    @Test(groups = "Case6")
    public void verifyUrlHasChanged() {
        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        mainPage.clickGlobeIcon();

        WebElement languageSelection = (new WebDriverWait((mainPage.driver), Duration.ofSeconds(2))).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-key='US']")));
        languageSelection.click();

        //Verify that url has changed
        String expectedUrl = "https://www.yellowtailwine.com/us/";
        String actualUrl = DriverProvider.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.toLowerCase().contains(expectedUrl.toLowerCase()));
    }
}
