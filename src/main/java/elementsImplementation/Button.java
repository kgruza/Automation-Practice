package elementsImplementation;

import com.codeborne.selenide.SelenideElement;
import interfaces.IClickable;

public class Button implements IClickable {
    private final SelenideElement button;

    public Button(SelenideElement selenideElement) {
        this.button = selenideElement;
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
