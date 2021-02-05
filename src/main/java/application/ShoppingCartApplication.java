package application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Item;
import com.thoughtworks.ddd.domain.Product;

public class ShoppingCartApplication {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadPro = new Product("IPad Pro");
        Product heroInkPen = new Product("Hero Ink Pen");
        Product gmCricketBat = new Product("GM Cricket Bat");

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
