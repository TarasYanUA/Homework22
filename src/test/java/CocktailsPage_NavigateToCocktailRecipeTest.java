import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class CocktailsPage_NavigateToCocktailRecipeTest extends TestRunner{

    @Severity(SeverityLevel.NORMAL)
    @Description("Select RASPBERRY ROSÉ and verify that new page is displayed and ingredients section is displayed")
    @Story("Case9")
    @Test
    public void verifyNewPageIsDisplayed(){
        stepsToNavigateToCocktailsPage();
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.getRaspberryRose();

        WebElement element = cocktailsPage.getRaspberryRose();
        Actions actions = new Actions(DriverProvider.getDriver());
        actions.moveToElement(element);
        actions.perform();
        element.click();
        (new WebDriverWait((cocktailsPage.driver), Duration.ofSeconds(2))).until(ExpectedConditions.elementToBeClickable(By.className("recipe-title")));

        //Verify that new page is displayed
        String expectedUrl = "https://www.yellowtailwine.com/recipe/raspberry-rose/";
        String actualUrl = DriverProvider.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.toLowerCase().contains(expectedUrl.toLowerCase()));

        //verifyIngredientsSectionIsDisplayed
        (new WebDriverWait((cocktailsPage.driver), Duration.ofSeconds(2))).until(ExpectedConditions.elementToBeClickable(By.className("rhs")));
        Assert.assertTrue(cocktailsPage.getBlock().isDisplayed());
    }
}
