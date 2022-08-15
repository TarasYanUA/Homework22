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

    public WebElement getSearchField(){
        return searchField;
    }
    public void clickSearchField(){
        getSearchField().click();
    }
    public String enterPostalCode(String postalCode){
        getSearchField().sendKeys(postalCode);
        return postalCode;
    }

    public WebElement getSearchSubmitButton(){
        return searchSubmitButton;
    }
    public void clickSearchSubmitButton(){
        getSearchSubmitButton().click();
    }

}
