package pageobjects;

import data.models.user.enums.Country;
import data.models.user.enums.Gender;
import data.models.user.Address;
import elements.*;
import pagehelpers.useraccount.MyAccountPage;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormElements {
    RadioButton mrRadioButton = new RadioButton($("#uniform-id_gender1"));
    RadioButton mrsRadioButton = new RadioButton($("#uniform-id_gender2"));
    Dropdown countryDropdown = new Dropdown($("#id_country"));
    EditableTextField firstNameField = new EditableTextField($("#customer_firstname"));
    EditableTextField lastNameField = new EditableTextField($("#customer_lastname"));
    EditableTextField emailField = new EditableTextField($("#email"));
    EditableTextField passwordField = new EditableTextField($("#passwd"));
    EditableTextField addressField = new EditableTextField($("#address1"));
    EditableTextField cityField = new EditableTextField($("#city"));
    EditableTextField zipCodeField = new EditableTextField($("#postcode"));
    EditableTextField mobilePhoneField = new EditableTextField($("#phone_mobile"));
    Dropdown stateDropdown = new Dropdown($("#id_state"));
    Button registerButton = new Button($("#submitAccount"));
    Checkbox signUpForNewsletter = new Checkbox($("#newsletter"));
    Checkbox receiveSpecialOffers = new Checkbox($("#optin"));


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

    public RegistrationFormElements setCountry(Country country) {
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

    public RegistrationFormElements setMobilePhone(String mobilePhone) {
        this.mobilePhoneField.setText(mobilePhone);
        return this;
    }

    public RegistrationFormElements setAddress(Address address) {
        setCountry(address.getCountry());
        setState(address.getState());
        this.addressField.setText(address.getStreetName() + " " + address.getStreetNo());
        setCity(address.getCity());
        setZipPostalCode(address.getZipPostalCode());
        return this;
    }

    public MyAccountPage clickRegisterButton() {
        registerButton.click();
        return new MyAccountPage();
    }

    public RegistrationFormElements setSignInFoNewsletterState(boolean state) {
        boolean isSelected = signUpForNewsletter.isSelected();
        if (isSelected != state)
            signUpForNewsletter.click();
        return this;
    }

    public RegistrationFormElements setReceiveSpecialOffersState(boolean state) {
        boolean isSelected = receiveSpecialOffers.isSelected();
        if (isSelected != state)
            receiveSpecialOffers.click();
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


    private RegistrationFormElements setCity(String city) {
        this.cityField.setText(city);
        return this;
    }

    private RegistrationFormElements setZipPostalCode(String zipCode) {
        this.zipCodeField.setText(zipCode);
        return this;
    }


    private RegistrationFormElements setState(String state) {
        this.stateDropdown.selectOption(state);
        return this;
    }
}
