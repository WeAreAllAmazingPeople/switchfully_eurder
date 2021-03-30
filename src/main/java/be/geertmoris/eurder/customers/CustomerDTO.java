package be.geertmoris.eurder.customers;


public class CustomerDTO {
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private String phoneNumber;

    public CustomerDTO() {
    }

    public CustomerDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerDTO setAddress(Address address) {
        this.address = address;
        return this;
    }

    public CustomerDTO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
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
}
