package learnabstract;

abstract class Employee {
    private int salary;
    String level;
    Employee(int salary) {
        this.salary = salary;
    }
    int getSalary() {
        return salary;
    }
    abstract void getLevel();
}
