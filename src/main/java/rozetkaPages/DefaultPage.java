package rozetkaPages;

import core.decorator.ExtendedFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefaultPage {

    WebDriver driver;

    public DefaultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new ExtendedFieldDecorator(new DefaultElementLocatorFactory(this.driver)), this);
    }

    public void waitPageLoad(long holdTime){
        new WebDriverWait(driver, holdTime).until(
                webDriver -> ((JavascriptExecutor)webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitElementLoad(long holdTime, WebElement element){
        WebDriverWait wait= new WebDriverWait(driver, holdTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitOneElementLeft(long holdTime, String xpathOfList){
        WebDriverWait wait= new WebDriverWait(driver, holdTime);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(xpathOfList),1));
    }
}
