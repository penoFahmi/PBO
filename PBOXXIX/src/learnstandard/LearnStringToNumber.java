package learnstandard;

public class LearnStringToNumber {
    public static void main(String[] args) {
        String tulisanBilangan = "123";
        System.out.println(tulisanBilangan.getClass());
        Integer bilangan = Integer.valueOf(tulisanBilangan);
        System.out.println(bilangan.getClass());
    }
}
