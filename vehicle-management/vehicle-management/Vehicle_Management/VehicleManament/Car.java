
package VehicleManament;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(String name, String model, String engine) {
        super(name, model, engine);
    }

    @Override
    public void run() {
        System.out.println(name + " is driving " + model);
    }
}
