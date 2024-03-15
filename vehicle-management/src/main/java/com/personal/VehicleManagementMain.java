package main.java.com.personal;
import main.java.com.personal.model.*;

import java.util.Scanner;

public class VehicleManagementMain {
    public static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        VehicleManagement vehicleManagement = new VehicleManagement();


        while (true) {
            System.out.println("\nCan I help you?");
            System.out.println("1. Print list.");
            System.out.println("2. Add element for list.");
            System.out.println("3. Change element for list.");
            System.out.println("4. Remove element for list.");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice = myObj.nextInt();
            String v,m;
            switch (choice) {
                case 1:
                    System.out.println("\nThe list has entered: ");
                    vehicleManagement.displayList();
                    break;
                case 2:
                    System.out.print("Which vehicle do you want to add? (Car, Bicycle, Motorbike: ");
                    v = myObj.next();
                    switch (v) {
                        case "Car", "car" -> {
                            System.out.print("Enter the length of the list: ");
                            int n = myObj.nextInt();

                            for (int i = 0; i <= n - 1; i++) {
                                Vehicle newCar = new Car("Car 1", "Model 1", "Engine 1");
                                System.out.print("Enter name: ");
                                newCar.setName(myObj.next());
                                System.out.print("Enter model: ");
                                newCar.setModel(myObj.next());
                                System.out.print("Enter engine: ");
                                newCar.setEngine(myObj.next());
                                newCar.run();
                                vehicleManagement.addVehicle(newCar);
                            }
                        }
                        case "Bicycle", "bicycle" -> {
                            System.out.print("Enter the length of the list: ");
                            int n = myObj.nextInt();

                            for (int i = 0; i <= n - 1; i++) {
                                Vehicle newBicycle = new Bicycle("Bike 1", "Model 1", "Engine 1");
                                System.out.print("Enter name: ");
                                newBicycle.setName(myObj.next());
                                System.out.print("Enter model: ");
                                newBicycle.setModel(myObj.next());
                                System.out.print("Enter engine: ");
                                newBicycle.setEngine(myObj.next());
                                newBicycle.run();
                                vehicleManagement.addVehicle(newBicycle);
                            }
                        }
                        case "Motorbike", "motorbike" -> {
                            System.out.print("Enter the length of the list: ");
                            int n = myObj.nextInt();

                            for (int i = 0; i <= n - 1; i++) {
                                Vehicle newMotoBike = new Motorbike("Motor 1", "Model 1", "Engine 1");
                                System.out.print("Enter name: ");
                                newMotoBike.setName(myObj.next());
                                System.out.print("Enter model: ");
                                newMotoBike.setModel(myObj.next());
                                System.out.print("Enter engine: ");
                                newMotoBike.setEngine(myObj.next());
                                newMotoBike.run();
                                vehicleManagement.addVehicle(newMotoBike);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Which vehicle do you want to change? (Car, Bicycle, Motorbike: ");
                    v = myObj.next();
                    switch (v) {
                        case "Car", "car" -> {
                            Vehicle newCar = new Car("Car 1", "Model 1", "Engine 1");
                            System.out.println("Enter vehicle you want to change: ");
                            m = myObj.next();

                            if (m.equals(newCar.getName())) {
                                vehicleManagement.removeVehicle(newCar);
                                System.out.print("Enter name: ");
                                newCar.setName(myObj.next());
                                System.out.print("Enter model: ");
                                newCar.setModel(myObj.next());
                                System.out.print("Enter engine: ");
                                newCar.setEngine(myObj.next());
                                vehicleManagement.addVehicle(newCar);
                            } else {
                                System.out.println("False");
                            }
                        }
                        case "Bicycle", "bicycle" -> {
                            Vehicle newBicycle = new Bicycle("Bike 1", "Model 1", "Engine 1");
                            System.out.println("Enter vehicle you want to change: ");
                            m = myObj.next();

                            if (m.equals(newBicycle.getName())) {
                                vehicleManagement.removeVehicle(newBicycle);
                                System.out.print("Enter name: ");
                                newBicycle.setName(myObj.next());
                                System.out.print("Enter model: ");
                                newBicycle.setModel(myObj.next());
                                System.out.print("Enter engine: ");
                                newBicycle.setEngine(myObj.next());
                                vehicleManagement.addVehicle(newBicycle);
                            } else {
                                System.out.println("False");
                            }
                        }
                        case "Motorbike", "motorbike" -> {
                            Vehicle newMotoBike = new Motorbike("Motor 1", "Model 1", "Engine 1");
                            System.out.println("Enter vehicle you want to change: ");
                            m = myObj.next();
                            if (m.equals(newMotoBike.getName())) {
                                vehicleManagement.removeVehicle(newMotoBike);
                                System.out.print("Enter name: ");
                                newMotoBike.setName(myObj.next());
                                System.out.print("Enter model: ");
                                newMotoBike.setModel(myObj.next());
                                System.out.print("Enter engine: ");
                                newMotoBike.setEngine(myObj.next());
                                vehicleManagement.addVehicle(newMotoBike);
                            } else {
                                System.out.println("False");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Which vehicle do you want to remove? (Car, Bicycle, Motorbike: ");
                    v = myObj.next();
                    switch (v) {
                        case "Car", "car" -> {
                            Vehicle newCar = new Car("Car 1", "Model 1", "Engine 1");
                            System.out.print("\nEnter id or name of vehicle you want to move: ");
                            vehicleManagement.set_n(myObj.next());
                            vehicleManagement.removeList(newCar);
                        }
                        case "Bicycle", "bicycle" -> {
                            Vehicle newBicycle = new Bicycle("Bike 1", "Model 1", "Engine 1");
                            System.out.print("\nEnter id or name of vehicle you want to move: ");
                            vehicleManagement.set_n(myObj.next());
                            vehicleManagement.removeList(newBicycle);
                        }
                        case "Motorbike", "motorbike" -> {
                            Vehicle newMotoBike = new Motorbike("Motor 1", "Model 1", "Engine 1");
                            System.out.print("\nEnter id or name of vehicle you want to move: ");
                            vehicleManagement.set_n(myObj.next());
                            vehicleManagement.removeList(newMotoBike);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Bye bye.");
                    System.exit(0);
                default:
                    System.out.println("Your choice  is invalid!");
            }

        }


//        String n = myObj.next();
//        if (n.equals(newMotoBike.getID())) {
//            vehicleManagement.removeVehicle(newMotoBike);
//        }
//        else if (n.equals(newMotoBike.getName())) {
//            System.out.println("True");
//            vehicleManagement.removeVehicle(newMotoBike);
//        }
//        else {
//            System.out.println("False");
//        }

    }
}