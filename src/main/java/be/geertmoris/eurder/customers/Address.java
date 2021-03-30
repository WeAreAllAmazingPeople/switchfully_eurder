package be.geertmoris.eurder.customers;

public class Address {
    private final String street;
    private final String number;
    private final String zipCode;
    private final String city;

    public Address(String street, String number, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
    }
}
