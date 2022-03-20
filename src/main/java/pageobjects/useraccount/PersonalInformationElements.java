package pageobjects.useraccount;

import elements.Button;
import elements.Checkbox;
import elements.EditableTextField;
import elements.RadioButton;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PersonalInformationElements {
    public RadioButton mrRadio = new RadioButton($("#id_gender1"));
    public RadioButton mrsRadio = new RadioButton($("#id_gender2"));
    public EditableTextField firstName = new EditableTextField($("#firstname"));
    public EditableTextField lastName = new EditableTextField($("#lastname"));
    public EditableTextField emailAddress = new EditableTextField($("#email"));
    public Button saveButton = new Button($x("//button[@type='submit']"));
    public Checkbox signUpForNewsletter = new Checkbox($("#newsletter"));
    public Checkbox receiveSpecialOffers = new Checkbox($("#optin"));
}
