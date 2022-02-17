package com.niit.UserProductService.controller;

import com.niit.UserProductService.domain.Customer;
import com.niit.UserProductService.service.UserProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/userproducts/")
public class UserProductController {
    private ResponseEntity responseEntity;
    private UserProductService userProductService;

    @Autowired
    public UserProductController(UserProductService userProductService) {
        this.userProductService = userProductService;
    }
    @PostMapping("product")
    public ResponseEntity<?> registerNewCustomer(@RequestBody Customer customer) throws Exception {
        try {
            userProductService.registerNewCustomer(customer);
            responseEntity = new ResponseEntity(customer, HttpStatus.CREATED);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<>("Error  !!!Try after sometime", HttpStatus.INTERNAL_SERVER_ERROR);
            System.out.println(e);
        }
        return responseEntity;
    }
}
