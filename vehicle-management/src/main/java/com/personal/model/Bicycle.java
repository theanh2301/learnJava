package main.java.com.personal.model;

public class Bicycle extends Vehicle {

    public Bicycle() {
    }

    public Bicycle(String name, String model, String engine) {
        super(name, model, engine);
    }

    @Override
    public void run() {
        System.out.println(name + " is riding " + model);
    }
}