package elementsImplementation;

import com.codeborne.selenide.SelenideElement;
import interfaces.IEditable;

public class EditableTextField implements IEditable {
    private final SelenideElement element;

    public EditableTextField(SelenideElement element) {
        this.element = element;
    }

    @Override
    public void clearText() {
        element.clear();
    }

    @Override
    public void setText(String text) {
        element.setValue(text);
    }

    @Override
    public void appendText(String text) {
        element.append(text);
    }

    @Override
    public String getText() {
        return element.getText();
    }
}
