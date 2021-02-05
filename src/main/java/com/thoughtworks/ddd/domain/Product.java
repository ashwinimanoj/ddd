package com.thoughtworks.ddd.domain;

public class Product {
    String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
