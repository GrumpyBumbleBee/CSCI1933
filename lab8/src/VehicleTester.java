public class VehicleTester {
    public static void main(String[] args) {
        Drivable vBike = new Bike();
        Drivable vScoot = new Scooter();
        vBike.movingForward();
        vBike.movingBackward();
        vScoot.movingForward();
        vScoot.movingBackward();

        Car car = new Car(30.0);
        System.out.println(car);
        car.movingForward();
        car.movingBackward();
        System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles() + "\n");

        Helicopter helicopter = new Helicopter(0.3);
        System.out.println(helicopter);
        helicopter.movingForward();
        helicopter.movingBackward();
        helicopter.movingUp();
        helicopter.movingDown();
        System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles() + "\n");

        Train train = new Train(470.0);
        System.out.println(train);
        train.movingForward();
        train.movingBackward();
        train.enteringStation();
        train.leavingStation();
        System.out.println("Total Number of Vehicles: " + Vehicle.getNumVehicles());
    }
}