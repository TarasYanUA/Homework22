import io.qameta.allure.Step;
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

    @Step
    public void clickCheckbox(){
        itemCheckbox.click();
        }

    @Step
    public Select getDropboxValue(){
        return new Select(dropboxValue);
    }
    @Step
    public String selectDropboxValue(String value) {
        getDropboxValue().selectByValue(value);
        return value;
    }

    @Step
    public MainPage navigateToMainPage(){
        buttonWelcome.click();
        return new MainPage();
        }

    @Step
    public WebElement getAgeText(){
        return ageText;
    }
    @Step
    public WebElement getConfirmationCheckbox(){
        return confirmationCheckbox;
    }
    @Step
    public WebElement getDropdownSelector(){
        return dropdownSelector;
    }
    @Step
    public WebElement getWelcomeButton(){
        return welcomeButton;
    }
}
