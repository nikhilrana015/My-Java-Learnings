package ObjectOrientedProgramming;

interface Vehicle {
    void increaseSpeed();
    void decreaseSpeed();
    int noOfTires = 4;
    
}

class BMW implements Vehicle {
    
    public BMW() {
        System.out.println("BMW class created");
    }

    public void increaseSpeed() {
        System.out.println("Speed increases");
    }

    public void decreaseSpeed() {
        System.out.println("Speed Decreases");
    }

}

public class Interfaces {
    public static void main(String args[]) {
        BMW bmw = new BMW();
        bmw.increaseSpeed();
        bmw.decreaseSpeed();
    }
}
