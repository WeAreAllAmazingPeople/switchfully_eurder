package be.geertmoris.eurder.controllers;

import be.geertmoris.eurder.customers.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(path="/customer")
public class CustomerController {

}
/*@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
@ResponseStatus(HttpStatus.CREATED)*/

/*public CustomerDTO createCustomer(){

}*/
