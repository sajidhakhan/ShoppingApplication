package com.niit.UserAuthenticationService.controller;

import com.niit.UserAuthenticationService.domain.Customer;
import com.niit.UserAuthenticationService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customerservice/")
public class CustomerController {
    private ResponseEntity responseEntity;
    private CustomerService customerService;

    @Autowired
    public CustomerController(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("customer")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) throws Exception {
        try {
            customerService.saveCustomer(customer);
            responseEntity = new ResponseEntity(customer , HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            responseEntity = new ResponseEntity<>("Error  !!!Try after sometime", HttpStatus.INTERNAL_SERVER_ERROR);
            System.out.println(e);
        }
        return responseEntity;
    }
    @GetMapping("/customers/{customerId}")
    public ResponseEntity<?> findCustomerByCustomerId(@PathVariable String customerId) {

        Customer customer = customerService.findCustomerByCustomerId(customerId);

        if (customer != null)
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);

        return new ResponseEntity<String>("NotFound", HttpStatus.CONFLICT);
    }
}
