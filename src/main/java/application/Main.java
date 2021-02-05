package application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Product;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product = new Product("IPad Pro");

        cart.addProduct(product);

        System.out.println(cart.getProducts());
    }
}
