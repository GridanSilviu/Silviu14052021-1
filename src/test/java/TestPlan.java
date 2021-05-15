import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }
    @Test(testName = "Search a url")
    public static void SearchForProduct(){
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSiteUrl();
        webForm.searchButton();
    }

    @Test(testName = "Search website name")
    public static void SearchWebsiteName() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSiteName();
        webForm.searchButton();
    }

    @Test(testName = "Push button")
    public static void SearchButton(){
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.searchButton();
    }

    @Test(testName = "Search website name and a url")
        public static void SearchNameAndUrl(){
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSiteName();
        webForm.populateSiteUrl();
        webForm.searchButton();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
