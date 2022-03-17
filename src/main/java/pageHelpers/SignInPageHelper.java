package pageHelpers;

import pageObjects.SignInPageElements;

public class SignInPageHelper {
    private final SignInPageElements signInPageElements;

    public SignInPageHelper() {
        this.signInPageElements = new SignInPageElements();
    }

    public RegistrationFormHelper proceedToRegistrationFormWithEmail(String email) {
        signInPageElements
                .createAccountEmailAddressField
                .setText(email);
        signInPageElements
                .createAccountButton
                .click();

        return new RegistrationFormHelper();
    }
}
