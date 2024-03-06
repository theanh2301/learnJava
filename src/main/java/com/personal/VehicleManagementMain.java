package main.java.com.personal;
import main.java.com.personal.model.*;

import java.util.Scanner;

public class VehicleManagementMain {
    public static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        VehicleManagement Vehicle = new VehicleManagement();

        Motorbike motor = new Motorbike();
        System.out.print("Enter name: ");
        motor.setName(myObj.next());
        System.out.print("Enter model: ");
        motor.setModel(myObj.next());
        System.out.println("Enter engine");
        motor.setEngine(myObj.next());
        motor.run();

        Car car = new Car();
        System.out.print("Enter name: ");
        car.setName(myObj.next());
        System.out.print("Enter model: ");
        car.setModel(myObj.next());
        System.out.println("Enter engine");
        car.setEngine(myObj.next());
        car.run();

        Bicycle bicycle = new Bicycle();
        System.out.print("Enter name: ");
        bicycle.setName(myObj.next());
        System.out.print("Enter model: ");
        bicycle.setModel(myObj.next());
        System.out.println("Enter engine");
        bicycle .setEngine(myObj.next());
        bicycle.run();



        while (true) {
            System.out.println("\nCan I help you?");
            System.out.println("1. Print list." );
            System.out.println("2. Add element for list.");
            System.out.println("3. Change element for list.");
            System.out.println("4. Remove element for list.");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            int choice = myObj.nextInt();
            switch (choice) {
                case 1:
                    Vehicle.printList();
                    break;
                case 2:
                    System.out.print("Enter the length of the list: ");
                    int n = myObj.nextInt();
                    for (int i=0; i <= n-1; i++) {
                        System.out.print("Enter element you want to add: ");
                        Vehicle.set_n(myObj.next());
                        Vehicle.addList();
                    }
                    break;
                case 3:
                    System.out.print("Enter Vehicle you want to change: ");
                    Vehicle.set_n(myObj.next());
                    System.out.print("Enter Vehicle you want to replace: ");
                    Vehicle.set_m(myObj.next());
                    Vehicle.changeList();
                    break;
                case 4:
                    System.out.print("Enter element you want to remove: ");
                    Vehicle.set_n(myObj.next());
                    Vehicle.removeList();
                    break;
                case 0:
                    System.out.println("Bye bye.");
                    System.exit(0);
                default:
                    System.out.println("Your choice  is invalid!");
            }
        }
    }
}