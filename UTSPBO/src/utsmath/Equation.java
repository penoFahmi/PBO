package utsmath;

public class Equation {
    protected String equation;
    protected double root1;
    protected short degree;

    public Equation(String equation, double root1, short degree) {
        this.equation = equation;
        this.root1 = root1;
        this.degree = degree;
    }

    public void showEquation() {
        System.out.println("Equation: " + equation);
    }

    public void setRoot1(double root1) {
        this.root1 = root1;
    }

    public double solve() {
        return root1;
    }
}
