package com.thoughtworks.ddd.domain;

public class Item {

    Product product;
    Integer quantity;

    public Item(Product product) {
        this(product, 1);
    }

    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
