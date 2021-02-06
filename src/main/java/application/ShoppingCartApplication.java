package application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Item;
import com.thoughtworks.ddd.domain.Price;
import com.thoughtworks.ddd.domain.Product;
import com.thoughtworks.ddd.domain.domain_service.CompetitorBasedPricer;

import java.util.Currency;
import java.util.HashMap;

public class ShoppingCartApplication {

    public static void main(String[] args) {
        Cart cart = new Cart();
        HashMap<String, Double> competitorProductsWithPrice = new HashMap<String, Double>();
        competitorProductsWithPrice.put("IPad Pro", 100000.0);
        competitorProductsWithPrice.put("Hero Ink Pen", 90.0);
        competitorProductsWithPrice.put("GM Cricket Bat", 9000.0);

        Product ipadPro = new Product("IPad Pro", CompetitorBasedPricer.getPriceFor("IPad Pro"));
        Product heroInkPen = new Product("Hero Ink Pen", CompetitorBasedPricer.getPriceFor("Hero Ink Pen"));
        Product gmCricketBat = new Product("GM Cricket Bat", CompetitorBasedPricer.getPriceFor("GM Cricket Bat"));

        Item iPadProItem = new Item(ipadPro);
        Item heroInkPenItem = new Item(heroInkPen);
        Item gmCricketBatItem = new Item(gmCricketBat, 2);

        cart.add(iPadProItem);
        cart.add(heroInkPenItem);
        cart.add(gmCricketBatItem);

        System.out.println(cart.getItems());

        cart.remove(iPadProItem);

        System.out.println(cart.getItems());
        System.out.println(cart.getDeletedItems());
    }
}
