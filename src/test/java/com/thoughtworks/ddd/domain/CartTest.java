package com.thoughtworks.ddd.domain;

import org.junit.Assert;
import org.junit.Test;

public class CartTest {

    @Test
    public void shouldAddItemToCart() {
        Cart cart = new Cart();
        Product product = new Product("dummy Item");
        Item item = new Item(product);

        cart.add(item);

        Assert.assertEquals(item, cart.getItems().get(0));
    }

    @Test
    public void shouldRemoveItemAsCart() {
        Cart cart = new Cart();
        Product product = new Product("dummy Item");
        Item item = new Item(product);

        cart.add(item);
        cart.remove(item);

        Assert.assertEquals(0, cart.getItems().size());
    }

    @Test
    public void shouldReturnListOfRemovedCart() {
        Cart cart = new Cart();
        Product product = new Product("dummy Item");
        Item item = new Item(product);

        cart.add(item);
        cart.remove(item);

        Assert.assertEquals(item, cart.getDeletedItems().get(0));
    }
}