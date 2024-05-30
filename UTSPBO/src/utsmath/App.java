package utsmath;

public class App {
    public static void main(String[] args) {
        // Menguji kelas Shape
        Shape shape = new Shape("Triangle", 20.0, (short) 3);
        shape.displayInfo();
        shape.setName("Square");
        System.out.println("Nama baru bentuk: " + shape.name);
        System.out.println("Keliling bentuk: " + shape.calculatePerimeter());

        // Menguji kelas Circle (subclass dari Shape)
        Circle circle = new Circle();
        circle.displayInfo();
        circle.calculateArea(5.0);
        System.out.println("Luas lingkaran dengan radius 5.0: " + circle.area);
        System.out.println("Apakah ini lingkaran? " + circle.isCircle());
        System.out.println("Diameter lingkaran: " + circle.getDiameter());

        Circle circleWithParams = new Circle("MyCircle", 78.5, (short) 0);
        circleWithParams.displayInfo();

        // Menguji kelas Equation
        Equation equation = new Equation("x^2 + 5x + 6 = 0", 0.0, (short) 2);
        equation.showEquation();
        equation.setRoot1(3.0);
        System.out.println("Akar pertama dari persamaan: " + equation.solve());

        // Menguji kelas QuadraticEquation (subclass dari Equation)
        QuadraticEquation quadEq = new QuadraticEquation();
        quadEq.showEquation();
        quadEq.calculateRoots(1, -3, 2);
        System.out.println("Akar pertama dari persamaan kuadrat: " + quadEq.getRoot1());
        System.out.println("Apakah persamaan memiliki akar real? " + quadEq.hasRealRoots());

        QuadraticEquation quadEqWithParams = new QuadraticEquation("x^2 - 4x + 4 = 0", 0.0, (short) 2);
        quadEqWithParams.showEquation();
        quadEqWithParams.calculateRoots(1, -4, 4);
        System.out.println("Akar pertama dari persamaan kuadrat dengan parameter: " + quadEqWithParams.getRoot1());
    }
}
