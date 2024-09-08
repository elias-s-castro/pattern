package br.com.castro.pattern.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void testObserver() {
        Product product = new Product("Widget", 10.0);
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Supplier supplier = new Supplier("ACME");

        product.addObserver(customer1);
        product.addObserver(customer2);
        product.addObserver(supplier);

        product.setPrice(20.0);
    }
}
