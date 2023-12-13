package com.georgiancollege.test2;

import com.google.gson.annotations.SerializedName;

public class User {
    //id, first name, last name, age, email,phone, birthdate, university, image, and the address
    private int id;
    @SerializedName("FirstName")
    private String firstName;
    @SerializedName("LastName")
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String birthDate;
    private String addresses;
    private String image;

    @SerializedName("University")
    private String university;



    public String getUniversity() {
        return university;
    }


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

    public String getAddress() {
        return addresses;
    }

    public String getImage() {
        return image;
    }

}