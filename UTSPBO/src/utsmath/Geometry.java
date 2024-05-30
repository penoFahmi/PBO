package utsmath;

public class Geometry {
    protected String name;
    protected double area;
    protected short sides;

    public Geometry(String name, double area, short sides) {
        this.name = name;
        this.area = area;
        this.sides = sides;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Area: " + area + ", Sides: " + sides);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePerimeter(double sideLength) {
        return sideLength * sides;
    }
}
