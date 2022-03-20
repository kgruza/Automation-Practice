package data.models.user;

import lombok.Data;

@Data
public class RegistrationOptions {
    boolean signUpForNewsletter = false;
    boolean receiveSpecialOffer = false;
}
