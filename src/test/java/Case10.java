import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import java.util.List;


public class Case10  extends TestRunner {

    @BeforeGroups(groups = "Case10")
    public void selectTwoCocktails(){
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.clickFieldOfCocktailType();
        cocktailsPage.clickRedWineCocktails();
        cocktailsPage.clickSparklingWineCocktails();
    }

    @Test(groups = "Case10")
    public void verifyWordInDropdown(){
        String expectedType = "Multiple";
        WebElement element = DriverProvider.getDriver().findElement(By.xpath("//span[@aria-label='Type - select to access the drop down menu of wine types']"));
        String actualType = element.getText();
        Assert.assertEquals(actualType, expectedType,"There is no word 'Multiple'.");
    }

    @Test(groups = "Case10")
    public void verifyTwentyRecipesAreDisplayed(){
        List<WebElement> listOfRecipes = DriverProvider.getDriver().findElements(By.xpath("//div[@class='tile recipe-tile']"));
        int actualListSize = listOfRecipes.size();
        int expectedListSize = 20;
        Assert.assertEquals(actualListSize, expectedListSize, "The number of Recipes is different than 20.");

    }
}
