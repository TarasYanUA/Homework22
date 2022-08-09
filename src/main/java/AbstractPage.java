import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
    WebDriver driver;

    public AbstractPage(){
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }
}
