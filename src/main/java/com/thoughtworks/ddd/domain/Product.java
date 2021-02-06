package com.thoughtworks.ddd.domain;

public class Product {
    String name;
    Price price;

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
