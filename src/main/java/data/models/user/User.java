package data.models.user;

import data.models.user.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private Gender gender;
    private String firstName, lastName, homePhoneNumber, mobilePhoneNumber, company;
    private LoginCredentials loginCredentials;
    private Address address;
    private LocalDate dateOfBirth;
    private RegistrationOptions registrationOptions;
}
