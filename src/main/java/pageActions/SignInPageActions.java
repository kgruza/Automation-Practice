package pageActions;

import pageObjects.SignInPageElements;

public class SignInPageActions {
    private final SignInPageElements signInPageElements;

    public SignInPageActions() {
        this.signInPageElements = new SignInPageElements();
    }

    public RegistrationFormActions proceedToRegistrationFormWithEmail(String email) {
        signInPageElements
                .getCreateAccountEmailAddressField()
                .setText(email);
        signInPageElements
                .getCreateAccountButton()
                .click();

        return new RegistrationFormActions();
    }
}
