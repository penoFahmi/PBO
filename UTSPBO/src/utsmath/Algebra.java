package utsmath;

public class Algebra {
    String expression;
    double value;
    short variables;

    public Algebra(String expression, double value, short variables) {
        this.expression = expression;
        this.value = value;
        this.variables = variables;
    }

    public void displayExpression() {
        System.out.println("Expression: " + expression + ", Value: " + value + ", Variables: " + variables);
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double evaluateExpression(double x) {
        return x + value;
    }
}
