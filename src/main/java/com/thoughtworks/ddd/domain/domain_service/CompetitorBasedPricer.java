package com.thoughtworks.ddd.domain.domain_service;

import com.thoughtworks.ddd.domain.Price;

import java.util.Currency;
import java.util.HashMap;

public class CompetitorBasedPricer {

    private static HashMap<String, Price> competitorProductsWithPrice = new HashMap<>();

    static {
        competitorProductsWithPrice.put("IPad Pro", new Price(100000.0, Currency.getInstance("INR")));
        competitorProductsWithPrice.put("Hero Ink Pen", new Price(90.0,  Currency.getInstance("INR")));
        competitorProductsWithPrice.put("GM Cricket Bat", new Price(9000.0,  Currency.getInstance("INR")));
    }

    public static Price getPriceFor(String productName) {
        double amount = 0.9 * competitorProductsWithPrice.get(productName).getAmount() ;
        return new Price(amount, competitorProductsWithPrice.get(productName).getCurrency());
    }

}
