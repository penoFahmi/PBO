package utsmath;

public class Geometry {
    protected String name;
    protected double area;
    protected short sides;

    // Parameterized constructor
    public Geometry(String name, double area, short sides) {
        this.name = name;
        this.area = area;
        this.sides = sides;
    }

    // Method 1: No parameter
    public void displayInfo() {
        System.out.println("Name: " + name + ", Area: " + area + ", Sides: " + sides);
    }

    // Method 2: With parameter
    public void setName(String name) {
        this.name = name;
    }

    // Method 3: Return value
    public double calculatePerimeter(double sideLength) {
        return sideLength * sides;
    }
}
