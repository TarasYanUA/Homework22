import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CocktailsPage_SelectSeveralWinesTest extends TestRunner {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Navigate to “Cocktails” page and verify that 20 recipes are displayed")
    @Story("Case10")

    @Test
    public void verifyWordInDropdownAndListOfRecipes(){
        stepsToNavigateToCocktailsPage();
        selectTwoCocktails();
        CocktailsPage cocktailsPage = new CocktailsPage();
        String actualType = cocktailsPage.getMultipleText().getText();
        String expectedType = "Multiple";
        Assert.assertEquals(actualType, expectedType,"There is no word 'Multiple'.");

        //verifyTwentyRecipesAreDisplayed
        int actualListSize = cocktailsPage.getListOfRecipes().size();
        int expectedListSize = 20;
        Assert.assertEquals(actualListSize, expectedListSize, "The number of Recipes is different than 20.");
    }

    public void selectTwoCocktails(){
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.clickFieldOfCocktailType();
        cocktailsPage.clickRedWineCocktails();
        cocktailsPage.clickSparklingWineCocktails();
    }
}
