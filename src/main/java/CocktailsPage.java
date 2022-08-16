import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CocktailsPage extends AbstractPage{

    @FindBy(className = "dropdown")
    private WebElement fieldOfCocktailType;

    @FindBy(xpath = "//a[contains(text(), 'Red wine cocktails')]")
    private WebElement redWineCocktails;

    @FindBy(xpath = "//a[contains(text(), 'Sparkling wine cocktails')]")
    private WebElement sparklingWineCocktails;

    public CocktailsPage(){
        super();
    }

    public WebElement getFieldOfCocktailType(){
        return fieldOfCocktailType;
    }
    public void clickFieldOfCocktailType(){
        getFieldOfCocktailType().click();
    }

    public WebElement getRedWineCocktails(){
        return redWineCocktails;
    }
    public void clickRedWineCocktails(){
        getRedWineCocktails().click();
    }

    public WebElement getSparklingWineCocktails(){
        return sparklingWineCocktails;
    }
    public void clickSparklingWineCocktails(){
        getSparklingWineCocktails().click();
    }

}
