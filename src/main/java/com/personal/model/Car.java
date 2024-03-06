package main.java.com.personal.model;

import main.java.com.personal.model.Vehicle;

public class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println(name + " is driving " + model);
    }
}
