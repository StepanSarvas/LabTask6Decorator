package core.decorator;

import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;


import java.lang.reflect.Field;

public class ExtendedFieldDecorator extends DefaultFieldDecorator {

    public ExtendedFieldDecorator(ElementLocatorFactory factory) {
        super(factory);
    }

    @Override
    public Object decorate(ClassLoader loader, Field field) {
        if (field.getType().equals(Element.class)) {
            ElementLocator locator = factory.createLocator(field);
            if (locator == null) {
                return null;
            }
            return new Element(proxyForLocator(loader, locator));
        }
        return super.decorate(loader, field);
    }
}

