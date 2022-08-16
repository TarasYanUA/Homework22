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

    @FindBy(xpath = "//label[@for='confirm']")
    private WebElement ageText;

    @FindBy(className = "confirmation-checkbox")
    private WebElement confirmationCheckbox;

    @FindBy(id = "agegate-selector-options")
    private WebElement dropdownSelector;

    @FindBy(xpath = "//input[@value=\"Welcome\"]")
    private WebElement welcomeButton;


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

    public WebElement getAgeText(){
        return ageText;
    }
    public WebElement getConfirmationCheckbox(){
        return confirmationCheckbox;
    }
    public WebElement getDropdownSelector(){
        return dropdownSelector;
    }
    public WebElement getWelcomeButton(){
        return welcomeButton;
    }
}
