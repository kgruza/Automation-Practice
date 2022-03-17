package dataModels.user;

import dataModels.user.enums.Gender;
import dataModels.user.registration.Address;
import dataModels.user.registration.LoginCredentials;
import dataModels.user.registration.RegistrationOptions;

import java.time.LocalDate;

public class User {
    private Gender gender;
    private String firstName, lastName, homePhoneNumber, mobilePhoneNumber, company;
    private LoginCredentials loginCredentials;
    private Address address;
    private LocalDate dateOfBirth;
    private RegistrationOptions registrationOptions;

    public User() {
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }

    public void setLoginCredentials(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public RegistrationOptions getRegistrationOptions() {
        return registrationOptions;
    }

    public void setRegistrationOptions(RegistrationOptions registrationOptions) {
        this.registrationOptions = registrationOptions;
    }
}
