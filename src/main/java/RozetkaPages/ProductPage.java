package RozetkaPages;

import decorator.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends DefaultPage {

    @FindBy(xpath = "//div/app-product-buy-btn/app-buy-button/button[contains(@class, 'button_with_icon button_color_green')]")
    Element buyButton;

    @FindBy(xpath = "//li[2]/a[contains(@class, 'tabs__link')]")
    Element productDescription;

    @FindBy(xpath = "//div[contains(@class, 'cart-receipt__sum-price')]/span[1]")
    Element cartSum;

    @FindBy(xpath = "//li[1]/rz-gallery-main-thumbnail-image/a/img[contains(@alt, '1')]")
    Element openIMG;

    public void clickOnBuyButton() {
        buyButton.click();
    }

    public void openIMGClick() {
        openIMG.click();
    }

    public int getCartSumValue() {
        return Integer.parseInt(cartSum.getText());
    }

    public Element getBuyButton() {
        return buyButton;
    }

    public Element getCartSum() {
        return cartSum;
    }

    public ProductPage(WebDriver driver) {
        super(driver);
    }

}
