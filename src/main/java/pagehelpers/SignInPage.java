package pagehelpers;

import pageobjects.SignInPageElements;

public class SignInPage {
    private final SignInPageElements signInPageElements;

    public SignInPage() {
        this.signInPageElements = new SignInPageElements();
    }

    public RegistrationForm proceedToRegistrationFormWithEmail(String email) {
        signInPageElements
                .createAccountEmailAddressField
                .setText(email);
        signInPageElements
                .createAccountButton
                .click();

        return new RegistrationForm();
    }
}
