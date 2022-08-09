import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static utils.Constants.BASIC_URL;

public class TestRunner {

    @BeforeTest
    public void beforeTest(){
        DriverProvider.getDriver().get(BASIC_URL);
        DriverProvider.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
    @AfterTest
    public void afterTest(){
        DriverProvider.getDriver().quit();
    }

    @BeforeGroups(groups = {"Case10", "Case9", "Case8"})
    public void stepsForCocktailsPage(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickCheckbox();
        welcomePage.selectDropboxValue();
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
        welcomePage.selectDropboxValue();
        welcomePage.clickButtonWelcome();
    }
}
