import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePage_NavigateToMainPageTest extends TestRunner {

    @Severity(SeverityLevel.NORMAL)
    @Description("Navigate to Main page as European customer")
    @Story("Case2")
    @Test(groups = "Case2")
    public void verifyMainPageIsDisplayed(){
        WebElement elementWelcome = DriverProvider.getDriver().findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        Assert.assertTrue(elementWelcome.isEnabled(), "The page is wrong");
    }
}
