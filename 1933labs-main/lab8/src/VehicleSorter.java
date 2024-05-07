import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class VehicleSorter {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car(0.3));
        vehicles.add(new Train(220.0));
        vehicles.add(new Helicopter(5.0));
        vehicles.add(new Helicopter(220.0));
        vehicles.add(new Car(550.0));
        //TODO: add vehicle objects of different types to your list
        //	e.g. vehicles.add(new Vehicle());

        Collections.sort(vehicles);
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}