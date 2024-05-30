package utsmath;

public class Algebra {
    protected String expression;
    protected double result;
    protected short variables;

    public Algebra(String expression, double result, short variables) {
        this.expression = expression;
        this.result = result;
        this.variables = variables;
    }

    public void displayExpression() {
        System.out.println("Expression: " + expression + ", Result: " + result + ", Variables: " + variables);
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double evaluateExpression(double x) {
        return x + result;
    }
}
