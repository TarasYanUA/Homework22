import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case5 extends TestRunner {

    @Test(groups = "Case5")
    public void verifyMenuButtonIsVisible() {
        MainPage mainPage = new MainPage();
        mainPage.driver.findElement(By.cssSelector(".fa.fa-bars")).click();
        mainPage.driver.findElement(By.xpath("(//div[@class='yt-logo'])[1]")).click();

        //variant 1
        Assert.assertNotNull(DriverProvider.getDriver().findElement(By.xpath("//i[@class='fa fa-bars']")), "There is no menu on the page");

        //variant 2
/*        WebElement elementWelcome;
        elementWelcome = DriverProvider.getDriver().findElement(By.cssSelector(".fa.fa-bars"));
        elementWelcome.click();
        elementWelcome = DriverProvider.getDriver().findElement(By.xpath("(//div[@class='yt-logo'])[1]"));
        elementWelcome.click();*/
    }
}
