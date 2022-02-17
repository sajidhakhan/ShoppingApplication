package com.niit.UserProductService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Document
@Data
public class Customer {
    @Id
    private String customerId;
    private String customerName;
    private String shippingAddress;
    private String email;
    private String password;
    List<Product> products;

    public Customer() {
    }

    public Customer(String customerId, String customerName, String shippingAddress, String email, String password, List<Product> products) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.email = email;
        this.password = password;
        this.products = products;
    }
}
