package utsmath;

public class Circle extends Geometry {
    public Circle() {
        super("Circle", 0.0, (short)0);
    }

    public Circle(String name, double area, short sides) {
        super(name, area, sides);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a circle.");
    }

    public void setName(String name) {
        super.setName(name);
    }

    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
