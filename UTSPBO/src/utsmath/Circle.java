package utsmath;

public class Circle extends Geometry {
    double radius;
    String color;
    short diameter;

    public Circle() {
        super("Circle", 0.0, (short) 0);
        this.radius = 1.0;
        this.color = "Red";
        this.diameter = 2;
    }

    public Circle(String name, double radius, short sides, String color, double area, short diameter) {
        super(name, area, sides);
        this.radius = radius;
        this.color = color;
        this.diameter = diameter;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius + ", Color: " + color + ", Diameter: " + diameter);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
