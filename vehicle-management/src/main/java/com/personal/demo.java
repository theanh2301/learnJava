package main.java.com.personal;
import main.java.com.personal.model.Bicycle;
import main.java.com.personal.model.Car;
import main.java.com.personal.model.Vehicle;
import main.java.com.personal.model.VehicleManagement;

import java.util.UUID;
public class demo {
    public static void main(String[] args) {
        VehicleManagement vehicleManagement = new VehicleManagement();
        Vehicle new1 = new Car("car 1", "model", "engine");
        Vehicle new2 = new Bicycle("bike 1", "model", "engine");
        vehicleManagement.addVehicle(new1);
        vehicleManagement.addVehicle(new2);
        System.out.println(new1.getID());
        vehicleManagement.displayList();
        UUID uniqueKey = UUID.randomUUID();
        System.out.println(uniqueKey);
    }
}
