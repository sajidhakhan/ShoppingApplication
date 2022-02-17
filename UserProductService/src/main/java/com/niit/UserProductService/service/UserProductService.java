package com.niit.UserProductService.service;

import com.niit.UserProductService.domain.Customer;
import com.niit.UserProductService.domain.Product;
import com.niit.UserProductService.exception.CustomerAlreadyExistsException;

import java.util.List;

public interface UserProductService {
    Customer registerNewCustomer(Customer customer) throws CustomerAlreadyExistsException;
//    Customer saveCustomerProduct(String customerId ,Product product) throws Exception;
    List<Customer> getAllProductsOfACustomer();
}
