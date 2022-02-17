package com.niit.UserAuthenticationService.repository;

import com.niit.UserAuthenticationService.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,String> {
}
