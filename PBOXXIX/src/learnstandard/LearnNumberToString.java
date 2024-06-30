package learnstandard;

public class LearnNumberToString {
    public static void main(String[] args) {
        Double angka = Double.valueOf(1000);
        System.out.println(angka.getClass());
        String tulisanAngka = String.valueOf(angka);
        System.out.println(tulisanAngka.getClass());
    }
}
