package be.geertmoris.eurder.repositories;

import be.geertmoris.eurder.customers.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class CustomerRepository {

    private final HashMap<String, Customer> customersById = new HashMap();

    @Autowired
    public CustomerRepository(Collection<Customer> customers) {
        if (customers != null) {
            customers.stream()
                    .filter(customer -> customer != null)
                    .forEach(customer -> customersById.put(customer.getId(), customer));
        }
    }

    public void saveCustomer(Customer newCustomer) {
        this.customersById.put(newCustomer.getId(), newCustomer);
    }
}
