import rozetkaPages.MainPage;
import rozetkaPages.ProductPage;
import rozetkaPages.SearchResultPage;
import rozetkaPages.SortedPage;
import core.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;


public class DefaultTest {

    private static final String ROZETKA_URL = "https://rozetka.com.ua/ua/";

    @BeforeTest
    public void profileSettings() {
    }

    @BeforeMethod
    public void openSite() {
        WebDriverManager.getDriver().get(ROZETKA_URL);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverManager.getDriver().close();
        WebDriverManager.tearDown();
    }

    @AfterTest
    public void killDriver() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MainPage getMainPage() {
        return new MainPage(WebDriverManager.getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(WebDriverManager.getDriver());
    }

    public SortedPage getSortedPage() {
        return new SortedPage(WebDriverManager.getDriver());
    }

    public ProductPage getProductPage() {
        return new ProductPage(WebDriverManager.getDriver());
    }
}
