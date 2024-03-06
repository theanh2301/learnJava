package main.java.com.personal.model;

import java.util.Scanner;

public abstract class Vehicle {
   private static int idVehicle = 0;
   protected int id;
   protected String name;
   protected String model;
   protected String engine;

   public Vehicle () {
      this.id = idVehicle++;
   }
   public Vehicle (int id, String name, String model, String engine) {
      this.id = id;
      this.name = name;
      this.model = model;
      this.engine = engine;
   }

   public String getName() {
      return name;
   }
   public void setName(String newName) {
      this.name = newName;
   }

   public String getModel() {
      return model;
   }
   public void setModel(String newModel) {
      this.model = newModel;
   }

   public String getEngine() {
      return engine;
   }
   public void setEngine(String newEngine) {
      this.engine = newEngine;
   }
   public void enter(Scanner sc) {
      System.out.print("Enter name: ");
      name = sc.next();
      System.out.print("Enter model: ");
      model = sc.next();
      System.out.print("Enter engine: ");
      engine = sc.next();
   }
   public abstract void run();
}
