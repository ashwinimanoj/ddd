package application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Item;
import com.thoughtworks.ddd.domain.Price;
import com.thoughtworks.ddd.domain.Product;

import java.util.Currency;

public class ShoppingCartApplication {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadPro = new Product("IPad Pro", new Price(400000.0, Currency.getInstance("INR")));
        Product heroInkPen = new Product("Hero Ink Pen", new Price(100.0, Currency.getInstance("INR")));
        Product gmCricketBat = new Product("GM Cricket Bat", new Price(7000.0, Currency.getInstance("INR")));

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
