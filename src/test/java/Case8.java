import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Case8 extends TestRunner{

    @Test(groups = "Case8")
    public void verifyNineRecipesOfRedWineAreDisplayed() {
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.clickFieldOfCocktailType();
        cocktailsPage.clickRedWineCocktails();      //Select “Red wine cocktails”

        //Verify that 9 recipes are displayed
        List<WebElement> listOfRedWines = DriverProvider.getDriver().findElements(By.xpath("//div[@class='tile recipe-tile']"));
        int actualListSize = listOfRedWines.size();
        int expectedListSize = 9;
        Assert.assertEquals(actualListSize, expectedListSize, "The number of Red Wine Cocktails is different than 9.");
    }
}
