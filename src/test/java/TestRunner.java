import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

    public void stepsToNavigateToCocktailsPage(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue("eu");
        welcomePage.navigateToMainPage();

        MainPage mainPage = new MainPage();
        mainPage.clickMenuButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainPage.navigateToCocktailsPage();
    }

    public void stepsToNavigateToMainPage() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue("eu");
        welcomePage.navigateToMainPage();
    }
}
