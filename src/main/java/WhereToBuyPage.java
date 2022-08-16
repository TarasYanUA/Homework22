import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhereToBuyPage extends AbstractPage{

    @FindBy(css = "#locationName")
    private WebElement searchField;

    @FindBy(css = ".search-submit")
    private WebElement searchSubmitButton;

    public WhereToBuyPage(){
        super();
    }

    public void clickSearchField(){
        searchField.click();
    }
    public String enterPostalCode(String postalCode){
        searchField.sendKeys(postalCode);
        return postalCode;
    }

    public void clickSearchSubmitButton(){
        searchSubmitButton.click();
    }

}
