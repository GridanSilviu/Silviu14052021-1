import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{

        // Class constructor
        public MainPage(WebDriver driver){
            super(driver);
        }
        private final String SITE_NAME = "Youtobe";
        private final String VALID_URL = "www.youtobe.com";

        @FindBy(xpath = "//*[@id=\"siteName\"]")
        private WebElement siteName;
        public void populateSiteName(){
            this.siteName.sendKeys(SITE_NAME);
        }

        @FindBy(xpath = "//*[@id=\"urlName\"]")
        private WebElement siteUrl;
        public void populateSiteUrl(){
            this.siteUrl.sendKeys(VALID_URL);
        }

        @FindBy (xpath = "//*[@id=\"myForm\"]/button")
        private WebElement button;
        public void searchButton(){
            this.button.click();
        }
    }
