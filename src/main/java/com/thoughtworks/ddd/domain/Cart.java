package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void add(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}


