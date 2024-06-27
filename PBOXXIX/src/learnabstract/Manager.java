package learnabstract;

public class Manager
        extends Employee
    implements Task{
    Manager(int salary) {
        super(salary);
    }

    @Override
    void getLevel() {
        System.out.println("Gaji :" + super.level);
    }

    @Override
    public void logIn() {
        System.out.println("saya absen masuk");
    }

    @Override
    public void typing() {
        System.out.println("saya sedang mengetik");
    }

    @Override
    public void printing() {
        System.out.println("saya sedang mencetak");
    }

    @Override
    public void logOut() {
        System.out.println("saya absen keluar");
    }
}
