package com.niit.UserAuthenticationService.service;

import com.niit.UserAuthenticationService.domain.Customer;

public interface CustomerService {
  Customer saveCustomer(Customer customer);
  Customer findCustomerByCustomerId(String customerId);
}
