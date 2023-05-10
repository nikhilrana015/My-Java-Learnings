package ObjectOrientedProgramming;


abstract class Nikhil {
    
    public Nikhil() {
        System.out.println("This is nikhil");
    }

    void sayHello() {
        System.out.println("Hello");
    }
}

abstract class Parent {
    
    public Parent() {
        System.out.println("This is Abstract class Parent");
    }

    public void sayHello() {
        System.out.println("Hello from Parent");
    }

    abstract public void greet();
    abstract public void greet2();
}

// Concrete class 
class Child1 extends Parent {

    public Child1() {
        System.out.println("This is concrete class extending from parent");
    }

    // @Override
    // public void sayHello() {
    //     System.out.println("Hello from Child1");
    // }

    @Override
    public void greet() {
        System.out.println("Namaste");
    }

    @Override
    public void greet2() {
        System.out.println("Kon'nichiwa");
    }
    
}

// abstract class extends the abstract parent class
abstract class Child2 extends Parent {
    
    public Child2() {
        System.out.println("This is abstract class child2 extends from parent");
    }

    public void sayHello() {
        System.out.println("Hello from child2");
    } 

    public void greet() {
        System.out.println("Greetings from child2");
    }
}

class Child3 extends Child2 {
    
    public Child3() {
        System.out.println("This is concrete class child3 extends from abstarct class child2");
    }

    public void sayHello() {
        System.out.println("Hello from child3");
    } 

    public void greet() {
        System.out.println("Greetings from child3");
    }

    public void greet2() {
        System.out.println("Greetings from child3");
    }

}


public class AbstractClass {
    public static void main(String args[]) {
        
        // Child1 obj = new Child1();
        // obj.greet();
        // obj.greet2();
        // obj.sayHello();
        
        // creating the object of concrete class child and providing reference of abstract class parent
        // Parent p = new Child1();

        // p.sayHello();
        // p.greet();
        // p.greet2();

        Child3 child3 = new Child3();

        child3.greet();
        child3.greet2();
        child3.sayHello();
        
    }   
}
