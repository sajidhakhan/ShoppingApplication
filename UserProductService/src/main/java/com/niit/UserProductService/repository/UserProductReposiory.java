package com.niit.UserProductService.repository;

import com.niit.UserProductService.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProductReposiory extends MongoRepository<Customer,String> {
}
