package be.geertmoris.eurder.services;

import be.geertmoris.eurder.customers.Customer;
import be.geertmoris.eurder.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer newCustomer) {
        customerRepository.saveCustomer(newCustomer);
        return newCustomer;
    }
}

