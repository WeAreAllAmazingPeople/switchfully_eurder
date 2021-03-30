package be.geertmoris.eurder.customers;

import org.springframework.stereotype.Component;


@Component
public class CustomerMapper {

    public CustomerDTO toDto(Customer customer) {
        return new CustomerDTO()
                .setFirstName();


    }
}
