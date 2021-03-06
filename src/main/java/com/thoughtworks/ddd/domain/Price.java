package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Price {
    private double amount;
    private Currency currency;

    public Price(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + amount +
                ", currency=" + currency +
                '}';
    }
}
