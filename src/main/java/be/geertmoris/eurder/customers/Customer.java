package be.geertmoris.eurder.customers;

import java.util.UUID;

public class Customer {

    private final String id;
    private final String firstName;
    private final String lastName;
    private String email;
    private Address address;
    private String phoneNumber;

    public Customer(String firstName, String lastName, String email, Address address, String phoneNumber) {
        this(UUID.randomUUID().toString(),firstName,lastName,email,address,phoneNumber);
    }

    public Customer(String id, String firstName, String lastName, String email, Address address, String phoneNumber) {
        assertFirstName(firstName);
        assertLastName(lastName);
        assertEmail(email);
        assertAddress(address);
        assertPhoneNumber(phoneNumber);

        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.address= address;
        this.phoneNumber=phoneNumber;
    }

    private void assertFirstName(String firstName) {
        if (firstName  == null) {
            throw new IllegalArgumentException("First name must be specified");
        }
    }

    private void assertLastName(String lastName) {
        if (lastName  == null) {
            throw new IllegalArgumentException("Last name must be specified");
        }
    }

    private void assertEmail(String email) {
        if (email  == null) {
            throw new IllegalArgumentException("Email must be specified");
        }
    }

    private void assertAddress(Address address) {
        if (address  == null) {
            throw new IllegalArgumentException("Address must be specified");
        }
    }

    private void assertPhoneNumber(String phoneNumber) {
        if (phoneNumber  == null) {
            throw new IllegalArgumentException("Phone number must be specified");
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
