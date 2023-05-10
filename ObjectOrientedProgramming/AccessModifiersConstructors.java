package ObjectOrientedProgramming;

class Cylinder { 
    
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void getArea() {
        System.out.println("Area of Cylinder is: " + (double)(Math.PI * (double)radius * (double)radius * (double)height));
    }
}


public class AccessModifiersConstructors {

    public static void main(String args[]) {
        Cylinder c = new Cylinder(9, 12);
        c.getArea();
    }   
}
