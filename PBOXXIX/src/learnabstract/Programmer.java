package learnabstract;

public class Programmer extends Employee implements Task{
    Programmer(int salary) {
        super(salary);
    }

    @Override
    void getLevel() {
        System.out.println("Saya adalah programmer");
    }
    @Override
    public void logIn() {
        System.out.println("Saya hadir di Zoom");
    }

    @Override
    public void typing() {
        System.out.println("Saya menulis kode");
    }
    @Override
    public void printing() {
        System.out.println("Saya push di Github");
    }

    @Override
    public void logOut() {
        System.out.println("Saya absen di Zoom");
    }
}