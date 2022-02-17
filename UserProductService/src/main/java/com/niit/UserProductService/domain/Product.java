package com.niit.UserProductService.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    private String productCode;
    private String productName;
    private String productDescription;
    private String  isInStock;

    public Product() {
    }

    public Product(String productCode, String productName, String productDescription, String isInStock) {
        this.productCode = productCode;
        this.productName = productName;
        this.productDescription = productDescription;
        this.isInStock = isInStock;
    }
}
