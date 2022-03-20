package data.repositories.user;

import com.github.javafaker.Faker;
import data.models.user.User;
import data.models.user.enums.Gender;
import data.models.user.LoginCredentials;

import java.time.LocalDate;
import java.time.Month;

public class UserRepository {
    private final Faker faker = new Faker();

    public User getUser() {
        User user = new User();
        user.setFirstName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setGender(Gender.MR);
        user.setLoginCredentials(new LoginCredentials(String.format("%s.%s@testemail.test", user.getFirstName(), user.getLastName()), "password"));
        user.setDateOfBirth(LocalDate.of(2000, Month.FEBRUARY, 10));
        user.setAddress(new AddressRepository().getAddress());
        user.setMobilePhoneNumber("999999999");
        user.setRegistrationOptions(new RegistrationOptionsRepository().getRegistrationOptions());
        return user;
    }
}
