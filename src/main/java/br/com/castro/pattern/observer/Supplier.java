package br.com.castro.pattern.observer;

public class Supplier implements Observer {

    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Supplier " + name + " received message: " + message);
    }
}
