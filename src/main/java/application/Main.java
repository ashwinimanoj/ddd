package application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Product;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadPro = new Product("IPad Pro");
        Product heroInkPen = new Product("Hero Ink Pen");

        cart.add(ipadPro);
        cart.add(heroInkPen);

        System.out.println(cart.getProducts());
    }
}
