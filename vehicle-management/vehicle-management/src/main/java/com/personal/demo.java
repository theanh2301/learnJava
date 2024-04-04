//package main.java.com.personal;
//import main.java.com.personal.model.*;
//
//import java.util.Scanner;
//
//public class demo {
//    public static Scanner myObj = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        VehicleManagement vehicleManagement = new VehicleManagement();
//        Vehicle newCar = new Car("Car 1", "Model 1", "Engine 1");
//        Vehicle newBicycle = new Car("Car 1", "Model 1", "Engine 1");
//        Vehicle newMotoBike = new Car("Car 1", "Model 1", "Engine 1");
//
//
//        while (true) {
//            System.out.println("\nCan I help you?");
//            System.out.println("1. Print list.");
//            System.out.println("2. Add element for list.");
//            System.out.println("3. Change element for list.");
//            System.out.println("4. Remove element for list.");
//            System.out.println("0. Exit");
//
//            System.out.print("Enter your choice: ");
//            int choice = myObj.nextInt();
//            String v;
//                switch (choice) {
//                    case 1:
//                        System.out.println("\nThe list has entered: ");
//                        vehicleManagement.displayList();
//                        break;
//                    case 2:
//                        System.out.print("Which vehicle do you want to add? (Car, Bicycle, Motorbike: ");
//                        v = myObj.next();
//                        switch (v) {
//                            case "Car", "car" -> {
//                                System.out.print("Enter the length of the list: ");
//                                int n = myObj.nextInt();
//
//                                for (int i = 0; i <= n - 1; i++) {
//                                    newCar = new Car("Car 1", "Model 1", "Engine 1");
//                                    System.out.print("Enter name: ");
//                                    newCar.setName(myObj.next());
//                                    System.out.print("Enter model: ");
//                                    newCar.setModel(myObj.next());
//                                    System.out.print("Enter engine: ");
//                                    newCar.setEngine(myObj.next());
//                                    newCar.run();
//                                    vehicleManagement.addVehicle(newCar);
//                                }
//                            }
//                            case "Bicycle", "bicycle" -> {
//                                System.out.print("Enter the length of the list: ");
//                                int n = myObj.nextInt();
//
//                                for (int i = 0; i <= n - 1; i++) {
//                                    newBicycle = new Bicycle("Bike 1", "Model 1", "Engine 1");
//                                    System.out.print("Enter name: ");
//                                    newBicycle.setName(myObj.next());
//                                    System.out.print("Enter model: ");
//                                    newBicycle.setModel(myObj.next());
//                                    System.out.print("Enter engine: ");
//                                    newBicycle.setEngine(myObj.next());
//                                    newBicycle.run();
//                                    vehicleManagement.addVehicle(newBicycle);
//                                }
//                            }
//                            case "Motorbike", "motorbike" -> {
//                                System.out.print("Enter the length of the list: ");
//                                int n = myObj.nextInt();
//
//                                for (int i = 0; i <= n - 1; i++) {
//                                    newMotoBike = new Motorbike("Motor 1", "Model 1", "Engine 1");
//                                    System.out.print("Enter name: ");
//                                    newMotoBike.setName(myObj.next());
//                                    System.out.print("Enter model: ");
//                                    newMotoBike.setModel(myObj.next());
//                                    System.out.print("Enter engine: ");
//                                    newMotoBike.setEngine(myObj.next());
//                                    newMotoBike.run();
//                                    vehicleManagement.addVehicle(newMotoBike);
//                                }
//                            }
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Case 3: ");
//                        System.out.print("Enter id or name of vehicle you want to change: ");
//                        v = myObj.nextLine();
//                        vehicleManagement.changeList(v);
//                        break;
//                    case 4:
//                        System.out.println("Case 4: ");
//                        System.out.print("\nEnter id or name of vehicle you want to remove: ");
//                        String n = myObj.nextLine();
//                        vehicleManagement.removeList(n);
//                        break;
//                    case 0:
//                        System.out.println("Bye bye.");
//                        System.exit(0);
//                    default:
//                        System.out.println("Your choice  is invalid!");
//                }
//
//
//
//
//        }
//
//
//    }
//}