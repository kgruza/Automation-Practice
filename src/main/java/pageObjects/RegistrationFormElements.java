package pageObjects;

import dataModels.user.enums.Country;
import dataModels.user.enums.Gender;
import elements.Dropdown;
import elements.EditableTextField;
import elements.RadioButton;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormElements {
    RadioButton mrRadioButton = new RadioButton($("#uniform-id_gender1"));
    RadioButton mrsRadioButton = new RadioButton($("#uniform-id_gender2"));
    Dropdown countryDropdown = new Dropdown($("#id_country"));
    EditableTextField firstNameField = new EditableTextField($("#customer_firstname"));
    EditableTextField lastNameField = new EditableTextField($("#customer_lastname"));
    EditableTextField emailField = new EditableTextField($("#email"));
    EditableTextField passwordField = new EditableTextField($("#passwd"));

    public RegistrationFormElements selectTitle(Gender gender) {
        switch (gender) {
            case MR:
                selectMrRadioButton();
                break;
            case MRS:
                selectMrsRadioButton();
                break;
        }

        return this;
    }

    public RegistrationFormElements selectCountry(Country country) {
        countryDropdown.selectOption(country.getStringValue());
        return this;
    }

    public RegistrationFormElements setFirstName(String firstName) {
        firstNameField.setText(firstName);
        return this;
    }

    public RegistrationFormElements setLastName(String lastName) {
        lastNameField.setText(lastName);
        return this;
    }

    public RegistrationFormElements setEmail(String email) {
        emailField.setText(email);
        return this;
    }

    public RegistrationFormElements setPassword(String password) {
        passwordField.setText(password);
        return this;
    }

    private RegistrationFormElements selectMrRadioButton() {
        mrRadioButton.click();
        return this;
    }

    private RegistrationFormElements selectMrsRadioButton() {
        mrsRadioButton.click();
        return this;
    }
}
