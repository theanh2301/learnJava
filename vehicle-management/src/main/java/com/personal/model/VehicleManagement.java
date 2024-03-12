package main.java.com.personal.model;

import java.util.ArrayList;
import java.util.List;


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

    String n;
    public String get_n() {
        return n;
    }
    public void set_n(String new_n) {
        this.n = new_n;
    }
    public void removeList (Vehicle vehicle) {
        if (n.equals(vehicle.name)) {
            ds.remove(vehicle);
        }
        else {
            System.out.println(n + " is not exit!");
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
