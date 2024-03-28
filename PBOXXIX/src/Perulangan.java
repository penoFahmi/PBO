public class Perulangan {
    public static void main(String[] args) {

        for (
                byte i = 1; i <= 10; i++) {
            System.out.println("Loncatan : " + i);
        }
        for (byte i = 20; i >= 10; i--) {
            System.out.println("Loncatan ke " + i);
        }
        for (byte i = 22; i <= 27; i++) {
            if (i == 24 ) {
                continue;
            }
            System.out.println("Loncatan ke " + i);
        }
        for (byte i = 5; i <= 13; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Loncatan ke " + i);
        }
        for (byte i = 1; i <= 20; i++) {
            if (i >=5 && i <= 15) {
                if (i % 2 == 0) {
                    continue;
                }
            }
            System.out.println("Loncatan ke " + i);
        }
    }
}
