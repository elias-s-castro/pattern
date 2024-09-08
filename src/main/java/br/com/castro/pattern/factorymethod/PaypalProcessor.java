package br.com.castro.pattern.factorymethod;

public class PaypalProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment of $" + amount);
    }
}
