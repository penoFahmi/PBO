package utsmath;

public class Equation extends Algebra {
    public Equation() {
        super("Equation", 0.0, (short)0); // Default values
    }

    public Equation(String expression, double result, short variables) {
        super(expression, result, variables);
    }

    @Override
    public void displayExpression() {
        super.displayExpression();
        System.out.println("This is an equation.");
    }

    @Override
    public void setExpression(String expression) {
        super.setExpression(expression);
    }

    @Override
    public double evaluateExpression(double x) {
        double sum = 0;
        do {
            sum += x;
            x--;
        } while (x > 0);
        return sum + result;
    }
}
