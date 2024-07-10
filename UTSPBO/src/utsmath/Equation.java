package utsmath;

public class Equation extends Algebra {
    String type;
    double coefficient;
    short degree;

    public Equation() {
        super("Equation", 0.0, (short) 0);
        this.type = "Linear";
        this.coefficient = 1.0;
        this.degree = 1;
    }

    public Equation(String expression, double value, short variables, String type, double coefficient, short degree) {
        super(expression, value, variables);
        this.type = type;
        this.coefficient = coefficient;
        this.degree = degree;
    }

    public void displayExpression() {
        super.displayExpression();
        System.out.println("Type: " + type + ", Coefficient: " + coefficient + ", Degree: " + degree);
    }

    public void setType(String type) {
        this.type = type;
    }

    public double evaluateExpression(double x) {
        double result = 0;
        int count = 0;
        do {
            result += x * coefficient;
            count++;
        } while (count < degree);
        return result;
    }
}
