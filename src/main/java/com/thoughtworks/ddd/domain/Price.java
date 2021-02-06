package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Price {
    double value;
    Currency currency;

    public Price(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                ", currency=" + currency +
                '}';
    }
}
