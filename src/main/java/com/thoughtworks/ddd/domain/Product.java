package com.thoughtworks.ddd.domain;

public class Product {
    String name;
    Price price;

    public Product(String name, Price price, double competitorPrice) {
        this.name = name;
        this.price = price;
        this.price.add(-10/100 * competitorPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
