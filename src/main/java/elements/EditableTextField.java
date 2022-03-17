package elements;

import com.codeborne.selenide.SelenideElement;
import com.google.common.base.Strings;
import interfaces.IEditable;

public class EditableTextField extends Element implements IEditable {
    private final SelenideElement editableTextField;

    public EditableTextField(SelenideElement editableTextField) {
        super(editableTextField);
        this.editableTextField = editableTextField;
    }

    @Override
    public void clearText() {
        editableTextField.clear();
    }

    @Override
    public void setText(String text) {
        editableTextField.setValue(text);
    }

    @Override
    public void appendText(String text) {
        editableTextField.append(text);
    }

    @Override
    public void setTextIfNotNullOrEmpty(String text) {
        if (!Strings.isNullOrEmpty(text))
            editableTextField.setValue(text);
    }

    @Override
    public String getText() {
        return editableTextField.getText();
    }
}
