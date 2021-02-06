package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Price {
    private double amount;
    private Currency currency;

    public Price(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void add(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + amount +
                ", currency=" + currency +
                '}';
    }
}
