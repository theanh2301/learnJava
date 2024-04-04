package main.java.com.personal.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VehicleManagement {

    private List<Vehicle> ds;
    public VehicleManagement() {
        this.ds = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.ds.add(vehicle);

    }

    public void removeVehicle(Vehicle vehicle) {
        this.ds.remove(vehicle);
    }

    public void displayList() {
        int i = 1;
        if (ds.isEmpty()) {
            System.out.println("The list is empty!");
        }
        else {
            for (Vehicle vehicle : ds) {
                System.out.println("The " + i + " vehicle: ");
                vehicle.display();
                i++;
            }
        }
    }

    public void removeList (Scanner sc) {
        String input = sc.nextLine();
        for (Vehicle vehicle : ds) {
            if (input.equals(vehicle.getName())) {
                removeVehicle(vehicle);
                break;
            } else {
                System.out.println(input + " is not exit!");
                break;
            }
        }
    }

    public void changeList (Scanner sc) {
        for (Vehicle vehicle : ds) {
            String input = sc.next();
            if (input.equals(vehicle.getName())) {
                removeVehicle(vehicle);
                System.out.print("Enter name: ");
                vehicle.setName(input);
                System.out.print("Enter model: ");
                vehicle.setModel(input);
                System.out.print("Enter engine: ");
                vehicle.setEngine(input);
                addVehicle(vehicle);
                break;
            } else {
                System.out.println(input + " is not exit!");
                break;
            }
        }
    }

//    String m;
//    public String get_m() {
//        return m;
//    }
//    public void set_m(String new_m) {
//        this.m = new_m;
//    }
//    public void changeList (Vehicle vehicle) {
//        if (n.equals(vehicle.name)) {
//            ds.remove(vehicle);
//            ds.add(m);
//        }
//        else {
//            System.out.println(n + "is not exit!");
//        }
//
//    }

}
