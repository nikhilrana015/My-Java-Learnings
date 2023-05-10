package ObjectOrientedProgramming;

interface Vehicle {
    void increaseSpeed();
    void decreaseSpeed();
}

interface Car extends Vehicle {
    void numberPlate();
    void noOfTires();
}

class ElectricCar implements Car {
    
    public ElectricCar() {
        System.out.println("Electric Car constructor is called");
    }

    public void increaseSpeed() {
        System.out.println("Increases speed");
    }

    public void decreaseSpeed() {
        System.out.println("Decrease speed");
    }

    public void numberPlate() {
        System.out.println("Car Number plate is UP-14-AC-9867");
    }

    public void noOfTires() {
        System.out.println("No of tires are: " + 4);
    }
}

public class InheritanceInInterfaces {
    public static void main(String args[]) {
        ElectricCar electricCar = new ElectricCar();
        
        electricCar.increaseSpeed();
        electricCar.decreaseSpeed();
        electricCar.numberPlate();
        electricCar.noOfTires();
    }
}
