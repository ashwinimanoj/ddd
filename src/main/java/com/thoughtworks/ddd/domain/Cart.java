package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Cart {
    private final UUID identifier;
    private final List<Item> items;
    private final List<Item> deletedItems;

    public Cart() {
        identifier = UUID.randomUUID();
        items = new ArrayList<>();
        deletedItems = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        deletedItems.add(item);
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getDeletedItems() {
        return deletedItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return this.identifier.equals(cart.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }
}


