import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CocktailsPage_NavigateToCocktailRecipeTest extends TestRunner{

    @Severity(SeverityLevel.NORMAL)
    @Description("Select RASPBERRY ROSÉ and verify that new page is displayed and ingredients section is displayed")
    @Story("Case9")
    @Test(groups = "Case9")
    public void verifyNewPageIsDisplayed(){
        //variant 1 - Scroll to “RASPBERRY ROSÉ” recipe
/*        WebElement element = DriverProvider.getDriver().findElement(By.xpath("//img[@alt='Raspberry Rose']"));
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //variant 2 - Scroll to “RASPBERRY ROSÉ” recipe
        WebElement element = DriverProvider.getDriver().findElement(By.xpath("//img[@alt='Raspberry Rose']"));
        Actions actions = new Actions(DriverProvider.getDriver());
        actions.moveToElement(element);
        actions.perform();
        element.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Verify that new page is displayed
        String expectedUrl = "https://www.yellowtailwine.com/recipe/raspberry-rose/";
        String actualUrl = DriverProvider.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.toLowerCase().contains(expectedUrl.toLowerCase()));

        //verifyIngredientsSectionIsDisplayed
        WebElement block = DriverProvider.getDriver().findElement(By.className("rhs"));
        Assert.assertTrue(block.isDisplayed());
    }
}
