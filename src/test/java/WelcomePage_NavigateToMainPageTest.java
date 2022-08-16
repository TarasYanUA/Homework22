import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePage_NavigateToMainPageTest extends TestRunner {

    @Severity(SeverityLevel.NORMAL)
    @Description("Navigate to Main page as European customer")
    @Story("Case2")
    @Test
    public void verifyMainPageIsDisplayed(){
        stepsToNavigateToMainPage();

        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.getMenuButton().isDisplayed(), "The page is wrong");
    }
}
