package elements;

import com.codeborne.selenide.SelenideElement;
import interfaces.IClickable;

public class RadioButton extends Element implements IClickable {
    private final SelenideElement radioButton;

    public RadioButton(SelenideElement radioButton) {
        super(radioButton);
        this.radioButton = radioButton;
    }

    @Override
    public void click() {
        radioButton.click();
    }

    @Override
    public void clickTwice() {

    }
}
