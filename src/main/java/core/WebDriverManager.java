package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.util.Objects.isNull;

public class WebDriverManager {

    private static final ThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    private WebDriverManager() {
    }

    public static synchronized WebDriver getDriver() {
        if (isNull(driverPool.get())) {
            driverPool.set(Driver.getChromeInstance());
        }
        return driverPool.get();
    }

    public static void tearDown() {
        if (driverPool.get() != null) {
            driverPool.remove();
        }
    }

    public static class Driver {

        private static WebDriver getChromeInstance() {
            System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
            ChromeDriver chrome = new ChromeDriver();
            chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            chrome.manage().window().maximize();
            return chrome;
        }
    }
}
