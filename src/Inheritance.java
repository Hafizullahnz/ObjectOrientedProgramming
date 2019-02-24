public class Inheritance {


    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle(100);
        System.out.println( myVehicle.getMaxSpeed());
        System.out.println( "==================1");

        Car myCar = new Car(130, true);
        System.out.println( myCar.getMaxSpeed());
        System.out.println( myCar.isSmallcar());
        System.out.println( "==================2");

        Car2 myCar2 = new Car2(150, false);
        System.out.println( myCar2.getMaxSpeed());
        System.out.println( myCar2.isfiveDoors());
        System.out.println( "==================3");

        Vehicle vehicle = new Vehicle(85);
        Vehicle myCarVehicle = new Car(210, true);
        System.out.println(vehicle.getMaxSpeed());
        System.out.println(myCarVehicle.getMaxSpeed());
        //((Car) myCarVehicle).isSmallcar(); //accessing with casting
        System.out.println(vehicle.toString());//Variation3 // overiding
        System.out.println( "==================4");

        FoolishCar fcar = new FoolishCar(5);
        fcar.getMaxSpeed();
        fcar.maxSpeed = 10;
        fcar.getMaxSpeed();
        System.out.println("FoolishCars Parents maxSpeed: " + fcar.I_stillWantParentClassSpeed());
    }
}

class Vehicle {
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor parameter");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

//Variation3
   /*@Override
   public String toString(){
       return "Vehicle Speed: " + maxSpeed;
   }*/
}



class Car extends Vehicle {
    private boolean smallcar;

    public Car(int maxSpeed, boolean smallcar) {
        super(maxSpeed);
        this.smallcar = smallcar;
        System.out.println("Car Constructor Parameter");
    }

    public boolean isSmallcar() {
        return smallcar;
    }
}




class Car2 extends Vehicle {
    private boolean fiveDoors;

    public Car2(int maxSpeed, boolean fiveDoors) {
        super(maxSpeed);
        // super should be called inside the constractor to access super class#
        //variable " maxspeed"
        this.fiveDoors = fiveDoors;
        System.out.println("Car222 Constructor Parameter");
    }

    public boolean isfiveDoors() {
        return fiveDoors;
    }
}


class FoolishCar extends Vehicle {
    public int maxSpeed;

    public FoolishCar(int maxSpeed) {
        super(maxSpeed);
        this.maxSpeed = maxSpeed;
        System.out.println("FOOLISHCar Constructor Parameter");
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("FoolishCar MaxSpeed called: " + maxSpeed);
        return maxSpeed;
    }

    public int I_stillWantParentClassSpeed(){
        return super.getMaxSpeed();
    }
}