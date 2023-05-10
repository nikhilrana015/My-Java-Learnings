package ObjectOrientedProgramming;


class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public void printDetails() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

}

class CellPhone {
    
    public void ring() {
        System.out.println("ringing");
    }

    public void vibrate() {
        System.out.println("vibrating");
    }

}

class Square {
    private int side;
    
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void getArea() {
        System.out.println("Area is: " + side*side);
    }

    public void getPerimeter() {
        System.out.println("Perimeter is: " + 4*side);
    }


}

public class CreateOwnClass {

    public static void main(String[] args) {
        Employee nikhiEmployee = new Employee(1, "Nikhil Rana", 20);
        nikhiEmployee.printDetails();
        nikhiEmployee.setName("Ajay");
        nikhiEmployee.printDetails();

        CellPhone myPhone = new CellPhone();
        myPhone.vibrate();
        myPhone.ring();

        Square mySquare = new Square();
        mySquare.setSide(3);
        mySquare.getArea();
        mySquare.getPerimeter();
        
    }

}
