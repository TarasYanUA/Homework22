import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case5 extends TestRunner {

    @Test(groups = "Case5")
    public void verifyMenuButtonIsDisplayedOnHomepage() {
        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        mainPage.driver.findElement(By.xpath("//div[@class=\"default-nav\"]//div[@class='yt-logo']")).click();

        WebElement menuButton = mainPage.getMenuButton();
        Assert.assertTrue(menuButton.isDisplayed());
    }
}
