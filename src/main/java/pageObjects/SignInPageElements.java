package pageObjects;

import elements.Button;
import elements.EditableTextField;

import static com.codeborne.selenide.Selenide.$;

public class SignInPageElements {
    public Button createAccountButton = new Button($("#SubmitCreate"));
    public EditableTextField createAccountEmailAddressField = new EditableTextField($("#email_create"));


}
