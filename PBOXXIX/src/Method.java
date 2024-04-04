public class Method {

    static void greeting() {
        System.out.println("Hai!");
    }
    static void greetingWithnName(String name) {
        System.out.println("Hai!" + name);
    }
    static void greetingWithDay(String name, String day) {
        System.out.println("God" + day + " ," + name);
    }
    static int countAge(int birthYear) {
        int age = 2022 - birthYear;
        return age;
    }

    static void countAge(String name, int birtYear){
        int age = 2022 - birtYear;
        System.out.println(name + " age is" + age);
    }
    public static void main(String[] args) {
        System.out.println(countAge(1994));
        countAge("John", 1999);

    }
}
