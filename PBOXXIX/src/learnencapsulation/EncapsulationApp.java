package learnencapsulation;

public class EncapsulationApp {
    public static void main(String[] args) {
        User admin = new User();
        admin.setUsername("Administrator");
        String adminUsername = admin.getUsername();
    }
}
