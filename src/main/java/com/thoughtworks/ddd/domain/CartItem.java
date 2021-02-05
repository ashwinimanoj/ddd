package com.thoughtworks.ddd.domain;

public class CartItem {

    Product product;
    Integer quantity;

    public CartItem(Product product) {
        this(product, 1);
    }

    public CartItem(Product product, Integer quantity) {
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
