package core.decorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Locatable;

public interface IElement extends WebElement, WrapsElement, Locatable {

}
