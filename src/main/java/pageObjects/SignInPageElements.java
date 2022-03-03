package pageObjects;

import elementsImplementation.Button;
import elementsImplementation.EditableTextField;

import static com.codeborne.selenide.Selenide.$;

public class SignInPageElements {
    private Button createAccountButton;
    private EditableTextField createAccountEmailAddressField;

    public Button getCreateAccountButton() {
        createAccountButton = new Button($("#SubmitCreate"));
        return createAccountButton;
    }

    public EditableTextField getCreateAccountEmailAddressField() {
        createAccountEmailAddressField = new EditableTextField($("#email_create"));
        return createAccountEmailAddressField;
    }
}
