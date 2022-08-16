import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhereToBuyPage extends AbstractPage{

    @FindBy(css = "#locationName")
    private WebElement searchField;

    @FindBy(css = ".search-submit")
    private WebElement searchSubmitButton;

    @FindBy(className = "results")
    private WebElement searchResults;

    public WhereToBuyPage(){
        super();
    }

    @Step
    public void clickSearchField(){
        searchField.click();
    }
    @Step
    public String enterPostalCode(String postalCode){
        searchField.sendKeys(postalCode);
        return postalCode;
    }

    @Step
    public void clickSearchSubmitButton(){
        searchSubmitButton.click();
    }

    @Step
    public WebElement getSearchResults(){
        return searchResults;
    }
}
