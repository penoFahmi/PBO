package learnabstract;

public class App {
    public static void main(String[] args) {
        //Employee employee1 = new Employee();
        Manager manager1 = new Manager(100000);
        manager1.getLevel();

        Car car1 = new Car(); // 1. Membuat object outer
        Car.Engine engine1 = car1.new Engine(); // 2. Membuat object inner

        Motorbike.Engine engine2 = new Motorbike.Engine(); // 1. Membuat object inner
    }
}
