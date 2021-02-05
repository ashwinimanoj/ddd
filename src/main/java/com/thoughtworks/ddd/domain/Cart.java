package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}


