import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//div[@class='main-nav']//li[@class='link']")
    private List<WebElement> listOfHeaderItems;

    @FindBy(xpath = "//div[@class=\"default-nav\"]//div[@class='yt-logo']")
    private WebElement mainLogo;

    @FindBy(xpath = "//div[contains(@class, 'content animation-screen')]")
    private WebElement welcomeText;

    @FindBy(xpath = "//div[@class=\"content animation-screen -one\"]//p[@class='header-sub-copy']")
    private WebElement winesText;

    @FindBy(xpath = "//div[@class=\"content animation-screen -one\"]//a[@class='button home-button']")
    private WebElement wineButton;

    @FindBy(css = "#primary-footer")
    private WebElement footer;


    public MainPage(){
       super();
    }

    public WebElement getMenuButton(){
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

    public List<WebElement> getListOfHeaderItems(){
        return listOfHeaderItems;
    }

    public void clickMainLogo(){
        mainLogo.click();
    }

    public WebElement getWelcomeText(){
        return welcomeText;
    }

    public WebElement getWinesText(){
        return winesText;
    }

    public WebElement getWineButton(){
        return wineButton;
    }

    public WebElement getFooter(){
        return footer;
    }
}
