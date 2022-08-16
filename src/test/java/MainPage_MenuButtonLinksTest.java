import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class MainPage_MenuButtonLinksTest extends TestRunner {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that header with all needed links is appeared")
    @Story("Case4")
    @Test
    public void verifyHeaderWithAllLinks() {
        stepsToNavigateToMainPage();

        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();

        //Verify that header with all needed links is appeared
        List<WebElement> listOfHeaderItems = mainPage.getListOfHeaderItems();
        int actualHeaderItems = listOfHeaderItems.size();
        int expectedHeaderItems = 6;
        Assert.assertEquals(actualHeaderItems, expectedHeaderItems, "The number of links is incorrect.");
    }
}
