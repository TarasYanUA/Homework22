import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CocktailsPage_RecipesAreDisplayedTest extends TestRunner{

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 9 recipes are displayed")
    @Story("Case8")
    @Test
    public void verifyNumberOfDisplayedRecipesOfRedWine() {
        stepsToNavigateToCocktailsPage();
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.clickFieldOfCocktailType();
        cocktailsPage.clickRedWineCocktails();

        //Verify that 9 recipes are displayed
        int actualListSize = cocktailsPage.getListOfRedWines().size();
        int expectedListSize = 9;
        Assert.assertEquals(actualListSize, expectedListSize, "The number of Red Wine Cocktails is different than 9.");
    }
}
