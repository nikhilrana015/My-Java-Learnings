package ObjectOrientedProgramming;

class Base {
    
    int x;
    
    Base() {
        System.out.println("Base class default constructor is called");
    }

    Base(int x) {
        this.x = x;
        System.out.println("Base class parameter constructor is called and x value is " + this.x);
    }
}

class Child extends Base {
    
    int y;

    Child() {
        System.out.println("Child class default constructor is called");
    }

    Child(int y) {
        this.y = y;
        System.out.println("child class parameter constructor is called and y value is " + this.y);
    }
}

class GrandChild extends Child {
    
    int z;

    GrandChild() {
        System.out.println("GrandChild class default constructor is called");
    }

    GrandChild(int z) {
        super(z);
        System.out.println("child class parameter constructor is called and y value is " + this.z);
    }
}

class Phone {
    
    public void ring() {
        System.out.println("Phone ring");
    }

    public void call() {
        System.out.println("call takes place");
    }
}

class Smartphone extends Phone {
    
    @Override
    public void ring() {
        System.out.println("Smartphone rings");
    }

    public void playMusic() {
        System.out.println("Music is playing");
    }
}


public class inheritance {

    public static void main(String args[]) {
        //GrandChild gChild = new GrandChild(20);
        
        // Dynamic Dispatch
        /*
            In dynamic dispatch, we create object of sub-class and make a reference of Super-class.
            Due to this, we are able to call each and every method of Super-class, but override methods
            should be called from sub-class. This is because object create at runtime and this thing
            is decided during the runtime. This is runtime polymorphism.
        */
        Phone phone = new Smartphone();

        phone.ring();
        phone.call();
    }
}