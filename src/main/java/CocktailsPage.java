import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CocktailsPage extends AbstractPage{

    @FindBy(className = "dropdown")
    private WebElement fieldOfCocktailType;

    @FindBy(xpath = "//a[contains(text(), 'Red wine cocktails')]")
    private WebElement redWineCocktails;

    @FindBy(xpath = "//a[contains(text(), 'Sparkling wine cocktails')]")
    private WebElement sparklingWineCocktails;

    @FindBy(xpath = "//span[@aria-label='Type - select to access the drop down menu of wine types']")
    private WebElement multipleText;

    @FindBy(xpath = "//div[@class='tile recipe-tile']")
    private List<WebElement> listOfRecipes;

    @FindBy(xpath = "//div[@class='tile recipe-tile']")
    private List<WebElement> listOfRedWines;

    @FindBy(xpath = "//img[@alt='Raspberry Rose']")
    private WebElement raspberryRose;

    @FindBy(className = "rhs")
    private WebElement block;

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

    public WebElement getMultipleText(){
        return multipleText;
    }

    public List<WebElement> getListOfRecipes(){
        return listOfRecipes;
    }

    public List<WebElement> getListOfRedWines(){
        return listOfRedWines;
    }

    public WebElement getRaspberryRose(){
        return raspberryRose;
    }

    public WebElement getBlock(){
        return block;
    }
}
