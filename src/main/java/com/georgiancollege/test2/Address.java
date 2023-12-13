package com.georgiancollege.test2;

public class Address {
    @SerializedName("street_address")
    private String streetAddress;
    private String city;
    private String state;
    @SerializedName("zip_code")
    private String zipCode;
    @SerializedName("country")
    private String country;

    // Constructor
    public Address(String streetAddress, String city, String state, String zipCode, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    // Getters for instance variables
    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }
}
