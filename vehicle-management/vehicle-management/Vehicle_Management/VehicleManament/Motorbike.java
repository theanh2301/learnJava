package VehicleManament;

public class Motorbike extends Vehicle {

    public Motorbike() {
    }

    public Motorbike(String name, String model, String engine) {
        super(name, model, engine);
    }

    @Override
    public void run() {
        System.out.println(name + " is riding " + model);

    }
}