package rozetkaPages;

import core.decorator.Element;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage extends DefaultPage{

    @FindBy(xpath = "//input[contains(@name, 'search')]")
    private Element searchLine;

    public void searchByCategory(String keyword){
        searchLine.sendKeys(keyword + Keys.ENTER);
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
