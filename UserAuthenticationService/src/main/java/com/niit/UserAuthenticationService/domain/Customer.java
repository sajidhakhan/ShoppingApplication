package com.niit.UserAuthenticationService.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {
    @Id
    private String customerId;
    private String password;

    public Customer() {
    }

    public Customer(String customerId, String password) {
        this.customerId = customerId;
        this.password = password;
    }
}
