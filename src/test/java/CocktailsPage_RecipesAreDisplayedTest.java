import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class CocktailsPage_RecipesAreDisplayedTest extends TestRunner{

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 9 recipes are displayed")
    @Story("Case8")
    @Test(groups = "Case8")
    public void verifyNumberOfDisplayedRecipesOfRedWine() {
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.clickFieldOfCocktailType();
        cocktailsPage.clickRedWineCocktails();

        //Verify that 9 recipes are displayed
        List<WebElement> listOfRedWines = DriverProvider.getDriver().findElements(By.xpath("//div[@class='tile recipe-tile']"));
        int actualListSize = listOfRedWines.size();
        int expectedListSize = 9;
        Assert.assertEquals(actualListSize, expectedListSize, "The number of Red Wine Cocktails is different than 9.");
    }
}
