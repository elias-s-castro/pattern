package br.com.castro.pattern.factorymethod;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void processOrder(String paymentType, double amount){
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.createPaymentProcessor(paymentType);
        paymentProcessor.processPayment(amount);
        System.out.println("Order processed successfully");
    }
}
