package utsmath;

public class App {
    public static void main(String[] args) {
        Geometry geometry = new Geometry("Square", 25, (short)4);
        geometry.displayInfo();
        geometry.setName("Rectangle");
        System.out.println("Perimeter: " + geometry.calculatePerimeter(7));

        Circle circle = new Circle("Circle", 75, (short)0);
        circle.displayInfo();
        circle.setName("New Circle");
        System.out.println("Circumference: " + circle.calculatePerimeter(10));

        Algebra algebra = new Algebra("x + y", 10, (short)2);
        algebra.displayExpression();
        algebra.setExpression("x - y");
        System.out.println("Evaluation: " + algebra.evaluateExpression(5));

        Equation equation = new Equation("x + x", 5, (short)1);
        equation.displayExpression();
        equation.setExpression("x * x");
        System.out.println("Summation: " + equation.evaluateExpression(3));
    }
}
