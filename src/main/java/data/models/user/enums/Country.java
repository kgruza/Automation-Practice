package data.models.user.enums;

public enum Country {
    US("United States");

    private final String country;

    Country(String country) {
        this.country = country;
    }


    public String getStringValue() {
        return country;
    }
}
