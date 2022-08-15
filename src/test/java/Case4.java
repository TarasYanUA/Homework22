import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Case4 extends TestRunner {

    @Test(groups = "Case4")
    public void verifyHeaderWithAllLinks() {
        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();

        //Verify that header with all needed links is appeared
        List<WebElement> listOfHeaderItems = DriverProvider.getDriver().findElements(By.xpath("//div[@class='main-nav']//li[@class='link']"));
        int actualHeaderItems = listOfHeaderItems.size();
        int expectedHeaderItems = 6;
        Assert.assertEquals(actualHeaderItems, expectedHeaderItems, "The number of links is incorrect.");
    }
}
