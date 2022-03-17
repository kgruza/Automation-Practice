package elements;

import com.codeborne.selenide.SelenideElement;
import interfaces.IClickable;

public class Button extends Element implements IClickable {
    private final SelenideElement button;

    public Button(SelenideElement element) {
        super(element);
        button = element;
    }


    @Override
    public void click() {
        button.click();
    }

    @Override
    public void clickTwice() {
        button.doubleClick();

    }
}
