package com.niit.UserAuthenticationService.service;

import com.niit.UserAuthenticationService.domain.Customer;
import com.niit.UserAuthenticationService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        customer.setCustomerId(customer.getCustomerId());
        customer.setPassword(customer.getPassword());
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerByCustomerId(String customerId) {
        Customer customer = customerRepository.findById(customerId).get();
        return customer;
    }
}
