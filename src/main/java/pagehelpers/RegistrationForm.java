package pagehelpers;

import data.models.user.User;
import pagehelpers.useraccount.MyAccountPage;
import pageobjects.RegistrationFormElements;

public class RegistrationForm {
    private final RegistrationFormElements registrationFormElements;

    public RegistrationForm() {
        this.registrationFormElements = new RegistrationFormElements();
    }

    public MyAccountPage fillFormAndSubmit(User user) {
        return registrationFormElements
                .selectTitle(user.getGender())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getLoginCredentials().getEmail())
                .setPassword(user.getLoginCredentials().getPassword())
                .setAddress(user.getAddress())
                .setMobilePhone(user.getMobilePhoneNumber())
                .setReceiveSpecialOffersState(user.getRegistrationOptions().isReceiveSpecialOffer())
                .setSignInFoNewsletterState(user.getRegistrationOptions().isSignUpForNewsletter())
                .clickRegisterButton();
    }
}
