package utsmath;

public class Circle extends Shape {

    public Circle() {
        super("Circle", 0.0, (short) 0);
    }

    public Circle(String name, double area, short sides) {
        super(name, area, sides);
    }

    public void calculateArea(double radius) {
        this.area = Math.PI * radius * radius;
    }

    public boolean isCircle() {
        return sides == 0;
    }

    public double getDiameter() {
        double diameter = 0;
        do {
            diameter = Math.sqrt(area / Math.PI) * 2;
        } while (diameter <= 0);
        return diameter;
    }
}
