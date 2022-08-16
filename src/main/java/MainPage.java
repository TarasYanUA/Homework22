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

    public WebElement getMenuButton(){  //нужен для Case2, Case5
        return menuButton;
    }
    public void clickMenuButton(){
        getMenuButton().click();
    }

    public void clickGlobeIcon(){
        globeIcon.click();
    }

    public void clickLanguageSelection(){
        languageSelection.click();
    }

    public WhereToBuyPage navigateToWhereToBuyPage(){
        whereToBuy.click();
        return new WhereToBuyPage();
    }

    public CocktailsPage navigateToCocktailsPage(){
        cocktailsPage.click();
        return new CocktailsPage();
    }
}
