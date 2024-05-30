package utsmath;

public class QuadraticEquation extends Equation {

    public QuadraticEquation() {
        super("x^2 + bx + c = 0", 0.0, (short) 2);
    }

    public QuadraticEquation(String equation, double root1, short degree) {
        super(equation, root1, degree);
    }

    public void calculateRoots(double a, double b, double c) {
        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            this.root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        } else if (determinant == 0) {
            this.root1 = -b / (2 * a);
        } else {
            this.root1 = Double.NaN; // Roots are not real
        }
    }

    public boolean hasRealRoots() {
        double determinant = equation.charAt(2) * equation.charAt(2) - 4 * equation.charAt(0) * equation.charAt(4);
        return determinant >= 0;
    }

    public double getRoot1() {
        return root1;
    }
}
