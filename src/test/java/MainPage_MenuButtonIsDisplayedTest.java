import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPage_MenuButtonIsDisplayedTest extends TestRunner {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that Menu button is visible")
    @Story("Case5")
    @Test(groups = "Case5")
    public void verifyMenuButtonIsDisplayedOnHomepage() {
        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        mainPage.driver.findElement(By.xpath("//div[@class=\"default-nav\"]//div[@class='yt-logo']")).click();

        WebElement menuButton = mainPage.getMenuButton();
        Assert.assertTrue(menuButton.isDisplayed());
    }
}
