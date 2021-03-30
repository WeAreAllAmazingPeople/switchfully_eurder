package be.geertmoris.eurder.controllers;

import be.geertmoris.eurder.customers.CustomerDTO;
import be.geertmoris.eurder.customers.CustomerMapper;
import be.geertmoris.eurder.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(path = "/customer")
public class CustomerController {

    private final CustomerMapper customerMapper;
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerMapper customerMapper, CustomerService customerService) {
        this.customerMapper = customerMapper;
        this.customerService = customerService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)

    public CustomerDTO createCustomer(@RequestBody CustomerDTO customerDTO) {

        return customerMapper.toDto(customerService.saveCustomer(customerMapper.toCustomer(customerDTO)));

    }
}
