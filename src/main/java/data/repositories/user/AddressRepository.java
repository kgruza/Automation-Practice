package data.repositories.user;

import data.models.user.enums.Country;
import data.models.user.Address;

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
        address.setZipPostalCode("02101");
        return address;
    }
}
