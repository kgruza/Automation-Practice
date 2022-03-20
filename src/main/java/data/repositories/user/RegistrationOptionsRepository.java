package data.repositories.user;

import data.models.user.RegistrationOptions;

public class RegistrationOptionsRepository {
    public RegistrationOptions getRegistrationOptions() {
        RegistrationOptions registrationOptions = new RegistrationOptions();
        registrationOptions.setReceiveSpecialOffer(true);
        registrationOptions.setSignUpForNewsletter(true);
        return registrationOptions;
    }
}
