package dataModels.user;

import dataModels.user.enums.Gender;
import dataModels.user.registration.AddressRepository;
import dataModels.user.registration.LoginCredentials;
import dataModels.user.registration.RegistrationOptionsRepository;

import java.time.LocalDate;
import java.time.Month;

public class UserRepository {
    public User getUser() {
        User user = new User();
        user.setFirstName("Charles");
        user.setLastName("Brown");
        user.setGender(Gender.MR);
        user.setLoginCredentials(new LoginCredentials("charles.brown@test.test", "password"));
        user.setDateOfBirth(LocalDate.of(2000, Month.FEBRUARY, 10));
        user.setAddress(new AddressRepository().getAddress());
        user.setMobilePhoneNumber("999999999");
        user.setRegistrationOptions(new RegistrationOptionsRepository().getRegistrationOptions());
        return user;
    }
}
