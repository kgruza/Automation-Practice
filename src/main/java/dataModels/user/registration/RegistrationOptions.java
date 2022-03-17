package dataModels.user.registration;

public class RegistrationOptions {
    boolean signUpForNewsletter = false;
    boolean receiveSpecialOffer = false;

    public RegistrationOptions() {
    }

    public boolean isSignUpForNewsletter() {
        return signUpForNewsletter;
    }

    public void setSignUpForNewsletter(boolean signUpForNewsletter) {
        this.signUpForNewsletter = signUpForNewsletter;
    }

    public boolean isReceiveSpecialOffer() {
        return receiveSpecialOffer;
    }

    public void setReceiveSpecialOffer(boolean receiveSpecialOffer) {
        this.receiveSpecialOffer = receiveSpecialOffer;
    }
}
