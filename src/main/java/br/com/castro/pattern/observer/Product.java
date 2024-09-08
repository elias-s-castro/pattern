package br.com.castro.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        String message = "Price of product " + name + " has been changed to $" + price;
        observers.forEach(observer -> observer.update(message));
    }
}
