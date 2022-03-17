package dataModels.user.registration;

public class RegistrationOptionsRepository {
    public RegistrationOptions getRegistrationOptions() {
        RegistrationOptions registrationOptions = new RegistrationOptions();
        registrationOptions.setReceiveSpecialOffer(true);
        registrationOptions.setSignUpForNewsletter(true);
        return registrationOptions;
    }
}
