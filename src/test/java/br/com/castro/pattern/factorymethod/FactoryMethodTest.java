package br.com.castro.pattern.factorymethod;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryMethodTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testOrderService() {
        orderService.processOrder("creditcard", 100.0);
        orderService.processOrder("paypal", 200.0);
    }
}
