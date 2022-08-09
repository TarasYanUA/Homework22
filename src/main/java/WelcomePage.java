import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage extends AbstractPage{

    @FindBy(className = "confirmation-checkbox")
    private WebElement itemCheckbox;

    @FindBy(xpath = "//input[@value=\"Welcome\"]")
    private WebElement buttonWelcome;

    @FindBy(id = "agegate-selector-options")
    private WebElement getDropboxValue;


    public WelcomePage(){
        super();
        }

    public WebElement getItemCheckbox() {
        return itemCheckbox;
        }
    public void clickCheckbox(){
        getItemCheckbox().click();
        }

    public Select getDropboxValue(){
        return new Select(getDropboxValue);
    }
    public void selectDropboxValue() {
        getDropboxValue().selectByValue("eu");
    }
    //вариант 2 - оставил себе на память
/*    public Select getDropboxValue(){
        return new Select(DriverProvider.getDriver().findElement(By.id("agegate-selector-options")));
    }
    public void selectDropboxValue(){
        getDropboxValue().selectByValue("eu");
    }*/

    public WebElement getButtonWelcome(){
        return buttonWelcome;
        }
    public MainPage clickButtonWelcome(){
        getButtonWelcome().click();
        return new MainPage();
        }
}
