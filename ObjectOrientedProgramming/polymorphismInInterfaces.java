package ObjectOrientedProgramming;

interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone2 {

    public MyCellPhone2() {
        System.out.println("MyCellPhone constructor is called");
    }

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {

    public MySmartPhone2() {
        System.out.println("MySmartphone constructor is called");
    }

    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording Video");
    }

    public void record4KVideoofSmartphone(){
    System.out.println("Taking snap and recoding in 4k");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Nikhil", "Ajay", "Airtel" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class polymorphismInInterfaces {
    public static void main(String args[]) {
        
        /*
            So in this we creating the object of class MySmartPhone2 and using the
            reference myCamera2. Due to this we only allowed or eligible to access the
            myCamera2 interfaces methods and can't access the other interfaces or class methods.
        */
        MyCamera2 myCamera2 = new MySmartPhone2();
        
        // myCamera2 is allowed to access only their methods write inside the interfaces.
        myCamera2.recordVideo();
        myCamera2.record4KVideo();

        // Not Allowed to access.
        // myCamera2.record4KVideoofSmartphone();
        // myCamera2.connectToNetwork("Jio")
    }
}
