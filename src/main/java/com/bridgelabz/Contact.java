package com.bridgelabz;

public class Contact {
    public final String firstName;
    public final String lastName;
    public final String address;
    public final String city;
    public final String state;
    public final Integer zip;
    public final String phoneNumber;
    public final String emailId;

    public Contact(String firstName, String lastName, String address, String city, String state, Integer zip, String phoneNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return emailId;
    }

    public String toString(){
        return "First Name : " +this.firstName + ", Last Name : " +this.lastName + ", Address : " +this.address + ", City : " +city + ", State : " +this.state + ", Zip : " +this.zip + ", Phone Number : " +this.phoneNumber + ", Email : " +this.emailId;
    }

}
