import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case9 extends TestRunner{

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
        element.click();    //Click on “RASPBERRY ROSÉ” recipe

        //Verify that new page is displayed
        String expectedUrl = "https://www.yellowtailwine.com/recipe/raspberry-rose/";
        String actualUrl = DriverProvider.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.toLowerCase().contains(expectedUrl.toLowerCase()));
    }

    @Test(groups = "Case9")
    public void verifyIngredientsSectionIsDisplayed(){
        WebElement element = DriverProvider.getDriver().findElement(By.xpath("//img[@alt='Raspberry Rose']"));
        element.click();    //Click on “RASPBERRY ROSÉ” recipe
        Assert.assertNotNull(DriverProvider.getDriver().findElement(By.className("rhs")));
    }
}
