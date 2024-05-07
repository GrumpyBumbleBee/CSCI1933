public class Helicopter extends Vehicle{
    double mpg;
    public Helicopter(double inMpg){
        mpg = inMpg;
        super.nVehicles++;
    }
    public double getMPG(){
        return mpg;
    }
    public void movingForward(){
        System.out.println("Helicopter moving forward.");
    }
    public void movingBackward(){
        System.out.println("Helicopter moving backward.");
    }
    public void movingUp() {
        System.out.println("Helicopter moving up.");
    }
    public void movingDown() {
        System.out.println("Helicopter moving down.");
    }
    public String toString(){
        String str = "Helicopter: " + mpg;
        return str;
    }
}

