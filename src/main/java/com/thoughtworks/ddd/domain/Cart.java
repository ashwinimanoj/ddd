package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items;
    private final List<Item> deletedItems;

    public Cart() {
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
}


