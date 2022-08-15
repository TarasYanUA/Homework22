import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case2Test extends TestRunner {

    @Test(groups = "Case2")
    public void verifyMainPageIsDisplayed(){
        WebElement elementWelcome = DriverProvider.getDriver().findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        Assert.assertTrue(elementWelcome.isEnabled(), "The page is wrong");
    }
}
