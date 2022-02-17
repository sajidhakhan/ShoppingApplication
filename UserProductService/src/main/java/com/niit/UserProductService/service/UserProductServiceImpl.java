package com.niit.UserProductService.service;

import com.niit.UserProductService.domain.Customer;
import com.niit.UserProductService.domain.Product;
import com.niit.UserProductService.exception.CustomerAlreadyExistsException;
import com.niit.UserProductService.repository.UserProductReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserProductServiceImpl implements UserProductService {
    private UserProductReposiory userProductReposiory;

    @Autowired
    public UserProductServiceImpl(UserProductReposiory userProductReposiory) {
        this.userProductReposiory = userProductReposiory;
    }
    @Override
    public Customer registerNewCustomer(Customer customer) throws CustomerAlreadyExistsException {
        customer.setCustomerId(customer.getCustomerId());
        customer.setCustomerName(customer.getCustomerName());
        customer.setShippingAddress(customer.getShippingAddress());
        customer.setEmail(customer.getEmail());
        customer.setPassword(customer.getPassword());
        customer.setProducts(customer.getProducts());
        return userProductReposiory.insert(customer);
    }

//    @Override
//    public Customer saveCustomerProduct(String customerId, Product product) throws Exception {
////        List<Product> productList = new ArrayList<Product>();
//        Customer newCustomer = new Customer();
//       Optional<Customer> customer1 = this.userProductReposiory.findById(customerId);
//       if(customer1.isPresent()){
//           product.setProductCode(product.getProductCode());
//           product.setProductName(product.getProductName());
//           product.setProductDescription(product.getProductDescription());
//           product.setIsInStock(product.getIsInStock());
//           return userProductReposiory(customer1.get());
//       }
//       else{
//           return null;
//       }
//    }
    @Override
    public List<Customer> getAllProductsOfACustomer() {
        return userProductReposiory.findAll();
    }
}
