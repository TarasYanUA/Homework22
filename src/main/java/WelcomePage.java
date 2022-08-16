import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage extends AbstractPage{

    @FindBy(className = "confirmation-checkbox")
    private WebElement itemCheckbox;

    @FindBy(xpath = "//input[@value=\"Welcome\"]")
    private WebElement buttonWelcome;

    @FindBy(id = "agegate-selector-options")
    private WebElement dropboxValue;


    public WelcomePage(){
        super();
        }

    public void clickCheckbox(){
        itemCheckbox.click();
        }

    public Select getDropboxValue(){
        return new Select(dropboxValue);
    }
    public String selectDropboxValue(String value) {
        getDropboxValue().selectByValue(value);
        return value;
    }

    public MainPage navigateToMainPage(){
        buttonWelcome.click();
        return new MainPage();
        }
}
