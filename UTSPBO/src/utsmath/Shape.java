package utsmath;

public class Shape {
    public String name;
    public double area;
    protected short sides;

    public Shape(String name, double area, short sides) {
        this.name = name;
        this.area = area;
        this.sides = sides;
    }

    public void displayInfo() {
        System.out.println("Shape Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Sides: " + sides);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePerimeter() {
        return sides * area;
    }
}
