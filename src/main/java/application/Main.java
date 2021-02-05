package application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.CartItem;
import com.thoughtworks.ddd.domain.Product;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadPro = new Product("IPad Pro");
        Product heroInkPen = new Product("Hero Ink Pen");
        Product gmCricketBat = new Product("GM Cricket Bat");

        cart.add(new CartItem(ipadPro));
        cart.add(new CartItem(heroInkPen));
        cart.add(new CartItem(gmCricketBat, 2));

        System.out.println(cart.getCartItems());
    }
}
