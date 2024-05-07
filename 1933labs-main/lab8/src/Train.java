public class Train extends Vehicle{
    double mpg;
    public Train(double inMpg){
        mpg = inMpg;
        super.nVehicles++;
    }
    public double getMPG(){
        return mpg;
    }
    public void movingForward(){
        System.out.println("Train moving forward.");
    }
    public void movingBackward(){
        System.out.println("Train moving backward.");
    }
    public void enteringStation(){
        System.out.println("Train entering station.");
    }
    public void leavingStation(){
        System.out.println("Train leaving station.");
    }
    public String toString(){
        String str = "Train: " + mpg;
        return str;
    }
}

