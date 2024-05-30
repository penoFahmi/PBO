package utsmath;

public class Circle extends Geometry {
    public Circle() {
        super("Circle", 0.0, (short)0); // Default values
    }

    public Circle(String name, double area, short sides) {
        super(name, area, sides);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a circle.");
    }


    @Override
    public void setName(String name) {
        super.setName(name);
    }


    @Override
    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
