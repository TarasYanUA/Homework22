import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;
import static utils.Constants.BASIC_URL;

public class TestRunner {

    @BeforeMethod
    public void beforeMethod(){
        DriverProvider.getDriver().get(BASIC_URL);
        DriverProvider.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
    @AfterMethod
    public void afterMethod(ITestResult result){
        if(! result.isSuccess()){
            //make screenshot
            saveScreenshot();
        }

        DriverProvider.getDriver().quit();
        DriverProvider.destroyDriver();
    }

    @Attachment (value = "Page screen", type = "image/png")
    public byte [] saveScreenshot (){
        return ((TakesScreenshot) DriverProvider.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @BeforeGroups(groups = {"Case10", "Case9", "Case8"})
    public void stepsForCocktailsPage(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue("eu");
        welcomePage.clickButtonWelcome();

        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainPage.clickCocktailsPage();
    }

    @BeforeGroups(groups = {"Case6", "Case5", "Case4", "Case3", "Case2"})
    public void stepsForWhereToBuyPage(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue("eu");
        welcomePage.clickButtonWelcome();
    }
}
