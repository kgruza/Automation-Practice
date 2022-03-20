package elements;

import com.codeborne.selenide.SelenideElement;
import com.google.common.base.Strings;
import interfaces.IEditable;

public class EditableTextField extends Element implements IEditable {

    public EditableTextField(SelenideElement element) {
        super(element);
    }

    @Override
    public void clearText() {
        element.clear();
    }

    @Override
    public void setText(String text) {
        if (!Strings.isNullOrEmpty(text)) {
            element.clear();
            element.setValue(text);
        }
    }

    @Override
    public void appendText(String text) {
        element.append(text);
    }

    @Override
    public String getText() {
        return element.getValue();
    }
}
