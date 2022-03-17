package pageHelpers;

import dataModels.user.User;
import dataModels.user.enums.Country;
import pageObjects.RegistrationFormElements;

public class RegistrationFormHelper {
    private final RegistrationFormElements registrationFormElements;

    public RegistrationFormHelper() {
        this.registrationFormElements = new RegistrationFormElements();
    }

    public RegistrationFormHelper fillForm(User user) {
        registrationFormElements
                .selectTitle(user.getGender())
                .selectCountry(Country.US)
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getLoginCredentials().getEmail())
                .setPassword(user.getLoginCredentials().getPassword());
        return this;
    }
}
