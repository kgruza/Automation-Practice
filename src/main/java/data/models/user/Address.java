package data.models.user;

import data.models.user.enums.Country;
import lombok.Data;

@Data
public class Address {
    private String streetName, streetNo, zipPostalCode, city, state, additionalInfo, alias;
    private Country country;
}
