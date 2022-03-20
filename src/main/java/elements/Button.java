package elements;

import com.codeborne.selenide.SelenideElement;
import interfaces.IClickable;

public class Button extends Element implements IClickable {

    public Button(SelenideElement element) {
        super(element);
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public void clickTwice() {
        element.doubleClick();
    }
}
