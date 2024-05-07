public class Car extends Vehicle{
    double mpg;
    public Car(double inMpg){
        mpg = inMpg;
        super.nVehicles++;
    }
    public double getMPG(){
        return mpg;
    }
    public void movingForward(){
        System.out.println("Car class moving forward.");
    }
    public void movingBackward(){
        System.out.println("Car class moving backward.");
    }
    public String toString(){
        String str = "Car: " + mpg;
        return str;
    }
}
