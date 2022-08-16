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

    public void clickFieldOfCocktailType(){
        fieldOfCocktailType.click();
    }

    public void clickRedWineCocktails(){
        redWineCocktails.click();
    }

    public void clickSparklingWineCocktails(){
        sparklingWineCocktails.click();
    }
}
