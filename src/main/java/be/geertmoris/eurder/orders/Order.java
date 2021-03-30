package be.geertmoris.eurder.orders;

import be.geertmoris.eurder.customers.Customer;

import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private final Customer customer;
    private List<ItemGroup> orderedItems;
    private double totalPrice;

    public Order(Customer customer, List<ItemGroup> orderedItems, double totalPrice) {
        this.id= UUID.randomUUID().toString();
        this.customer = customer;
        this.orderedItems = orderedItems;
        this.totalPrice = totalPrice;
    }
}
