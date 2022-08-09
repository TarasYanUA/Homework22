import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage{

    @FindBy(css = ".fa.fa-bars")
    private WebElement menuButton;

    @FindBy(xpath = "//div[@class='main-nav']//li[@id='country-select']")
    private WebElement globeIcon;

    @FindBy(xpath = "//a[@data-key='US']")
    private WebElement languageSelection;

    @FindBy(xpath = "//div[@class='main-nav']//a[@href='https://www.yellowtailwine.com/stores/']")
    private WebElement whereToBuy;

    @FindBy(xpath = "//div[@class='main-nav']//a[@href='https://www.yellowtailwine.com/cocktails/']")
    private WebElement cocktailsPage;


    public MainPage(){
       super();
    }

    public WebElement getMenuButton() {
        return menuButton;
    }
    public void clickMenuButton(){
        getMenuButton().click();
    }

    public WebElement getGlobeIcon(){
        return globeIcon;
    }
    public void clickGlobeIcon(){
        getGlobeIcon().click();
    }

    public WebElement getLanguageSelection(){
        return languageSelection;
    }
    public void clickLanguageSelection(){
        getLanguageSelection().click();
    }

    public WebElement getWhereToBuy(){
        return whereToBuy;
    }
    public WhereToBuyPage clickWhereToBuy(){
        getWhereToBuy().click();
        return new WhereToBuyPage();
    }

    public WebElement getCocktailsPage(){
        return cocktailsPage;
    }
    public CocktailsPage clickCocktailsPage(){
        getCocktailsPage().click();
        return new CocktailsPage();
    }
}
