package dataModels.user.registration;

import dataModels.user.enums.Country;

public class AddressRepository {

    public Address getAddress() {
        Address address = new Address();
        address.setCountry(Country.US);
        address.setStreetName("Long street");
        address.setStreetNo("14");
        address.setCity("Boston");
        address.setState("Massachusetts");
        address.setAdditionalInfo("23th floor, elevator does not work");
        address.setAlias("My main address");
        address.setPostalCode("02101");
        return address;
    }
}
