package com.georgiancollege.test2;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String birthDate;
    private String university;
    private String image;
    private Address address; // Using a separate Address class for address information

    // Constructor
    public User(int id, String firstName, String lastName, int age, String email, String phone, String birthDate,
                String university, String image, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.university = university;
        this.image = image;
        this.address = address;
    }

    // Get methods for instance variables
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getUniversity() {
        return university;
    }

    public String getImage() {
        return image;
    }

    public Address getAddress() {
        return address;
    }

    // Inner Address class to hold address information
    public static class Address {
        @SerializedName("street_address")
        private String streetAddress;
        @SerializedName("city")
        private String city;
        @SerializedName("state")
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

        // Get methods for address variables
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
}
