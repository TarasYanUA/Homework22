import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import java.util.List;


public class CocktailsPage_SelectSeveralWinesTest extends TestRunner {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Navigate to “Cocktails” page and verify that 20 recipes are displayed")
    @Story("Case10")
    @BeforeGroups(groups = "Case10")
    public void selectTwoCocktails(){
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.clickFieldOfCocktailType();
        cocktailsPage.clickRedWineCocktails();
        cocktailsPage.clickSparklingWineCocktails();
    }

    @Test(groups = "Case10")
    public void verifyWordInDropdownAndListOfRecipes(){
        String expectedType = "Multiple";
        WebElement element = DriverProvider.getDriver().findElement(By.xpath("//span[@aria-label='Type - select to access the drop down menu of wine types']"));
        String actualType = element.getText();
        Assert.assertEquals(actualType, expectedType,"There is no word 'Multiple'.");

        //verifyTwentyRecipesAreDisplayed
        List<WebElement> listOfRecipes = DriverProvider.getDriver().findElements(By.xpath("//div[@class='tile recipe-tile']"));
        int actualListSize = listOfRecipes.size();
        int expectedListSize = 20;
        Assert.assertEquals(actualListSize, expectedListSize, "The number of Recipes is different than 20.");
    }
}