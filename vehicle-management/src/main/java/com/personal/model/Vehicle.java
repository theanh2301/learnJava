package main.java.com.personal.model;

import java.util.Objects;
import java.util.UUID;


public abstract class Vehicle {
   private static Integer idVehicle = 0;
   private String id;
   protected String name;
   protected String model;
   protected String engine;

   protected Vehicle() {

   }

   public Vehicle (String name, String model, String engine) {
      UUID uniqueId = UUID.randomUUID();
      id = String.valueOf(uniqueId);
      this.name = name;
      this.model = model;
      this.engine = engine;
   }


    public String getID() {
      return id;
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
   public void display() {
      System.out.print("Id: " + id);
      System.out.print(" | Name: " + name);
      System.out.print(" | Model: " + model);
      System.out.println(" | Engine: " + engine);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null) return false;
      if (this.getClass() != o.getClass()) return false;
      Vehicle obj = (Vehicle) o;
      return Objects.equals(id, obj.id)
              && (name.equals(obj.name)
              && engine.equals(obj.engine)
              && model.equals(obj.model));
   }

   public abstract void run();

}
