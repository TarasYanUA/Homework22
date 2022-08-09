import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class DriverProvider {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            driver = getBrowserType();

            //оставляю себе на память
/*          System.setProperty(Constants.FIREFOX_DRIVER_PROPERTY, Constants.FIREFOX_DRIVER_PATH);
            driver = new FirefoxDriver();*/
        }
        return driver;
    }

    private static WebDriver getBrowserType(){
        String browserName = getProperties().getProperty("browser");
        WebDriver webDriver;
        if (browserName.equals("chrome")){
            System.setProperty(Constants.CHROME_DRIVER_PROPERTY, Constants.CHROME_DRIVER_PATH);
            webDriver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty(Constants.FIREFOX_DRIVER_PROPERTY, Constants.FIREFOX_DRIVER_PATH);
            webDriver = new FirefoxDriver();
        } else{
            System.setProperty(Constants.CHROME_DRIVER_PROPERTY, Constants.CHROME_DRIVER_PATH);
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    private static Properties getProperties(){
        String current = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = "src" + separator + "test" + separator + "resources";
        String resourcesFile = "data.properties";
        Path file = Paths.get(current + separator + resourcesFolder + separator + resourcesFile);

        Properties properties = new Properties();
        try {
            properties.load(Files.newInputStream(file));
        } catch (IOException e) {
            throw new RuntimeException("File " + resourcesFile + " is NOT found.");
        }
        return properties;

    }

    private DriverProvider(){}
}
