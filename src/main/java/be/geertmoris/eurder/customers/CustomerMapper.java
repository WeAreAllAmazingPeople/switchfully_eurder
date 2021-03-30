package be.geertmoris.eurder.customers;

import org.springframework.stereotype.Component;


@Component
public class CustomerMapper {

    public CustomerDTO toDto(Customer customer) {
        return new CustomerDTO()
                .setFirstName(customer.getFirstName())
                .setLastName(customer.getLastName())
                .setEmail(customer.getEmail())
                .setAddress(customer.getAddress())
                .setPhoneNumber(customer.getPhoneNumber());
    }

    public Customer toCustomer(CustomerDTO customerDTO) {
        return new Customer(customerDTO.getFirstName(), customerDTO.getLastName(), customerDTO.getEmail(),
                customerDTO.getAddress(), customerDTO.getPhoneNumber());
    }
}
