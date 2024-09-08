package br.com.castro.pattern.factorymethod;

public class PaymentProcessorFactory {


    public static PaymentProcessor createPaymentProcessor(String type){
        return switch (type.toLowerCase()) {
            case "paypal" -> new PaypalProcessor();
            case "creditcard" -> new CredicardProcessor();
            default -> throw new IllegalArgumentException("Invalid payment processor type");
        };
    }
}
