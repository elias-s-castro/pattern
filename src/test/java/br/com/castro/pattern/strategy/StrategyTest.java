package br.com.castro.pattern.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test(){
        ShoppingCart shoppingCart = new ShoppingCart(new PercentageDiscount(10));
        System.out.println("Total after percentage discount: $" + shoppingCart.calculateTotal(100));

        shoppingCart.setDiscountStrategy(new FixedDiscount(20));
        System.out.println("Total after fixed discount: $" + shoppingCart.calculateTotal(100));
    }
}
