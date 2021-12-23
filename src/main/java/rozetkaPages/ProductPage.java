package rozetkaPages;

import core.decorator.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends DefaultPage {

    @FindBy(xpath = "//div/app-product-buy-btn/app-buy-button/button[contains(@class, 'button_with_icon button_color_green')]")
    private Element buyButton;

    @FindBy(xpath = "//div[contains(@class, 'cart-receipt__sum-price')]/span[1]")
    private Element cartSum;

    @FindBy(xpath = "//li[1]/rz-gallery-main-thumbnail-image/a/img[contains(@alt, '1')]")
    private Element openIMG;

    public void clickOnBuyButton() {
        buyButton.click();
    }

    public void clickOnImg() {
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
