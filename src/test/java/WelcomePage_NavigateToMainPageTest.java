import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePage_NavigateToMainPageTest extends TestRunner {

    @Severity(SeverityLevel.NORMAL)
    @Description("Navigate to Main page as European customer")
    @Story("Case2")
    @Test
    public void verifyMainPageIsDisplayed(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue("eu");
        welcomePage.navigateToMainPage();

        MainPage mainPage = new MainPage();
        WebElement menuButton = mainPage.getMenuButton();
        Assert.assertTrue(menuButton.isDisplayed(), "The page is wrong");
    }
}
