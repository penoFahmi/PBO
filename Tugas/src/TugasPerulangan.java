public class TugasPerulangan {
    public static void main(String[] args) {
        // Soal 1
        System.out.println("Deretan angka 5, 7, 9, 13, 15:");
        for (int i = 5; i <= 15; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Soal 2
        int totalJumlah = 0;
        System.out.println("Deretan angka 10, 9, 7, 6, 5:");
        for (int i = 10; i >= 5; i--) {
            System.out.print(i + " ");
            totalJumlah += i;
        }
        System.out.println("\nTotal penjumlahan: " + totalJumlah);

        // Soal 3
        int totalKali = 1;
        System.out.println("Deretan angka 2, 4, 8, 16, 32, 64:");
        for (int i = 2; i <= 64; i *= 2) {
            System.out.print(i + " ");
            totalKali *= i;
        }
        System.out.println("\nTotal perkalian: " + totalKali);

        // Soal 4
        int duaPuluh = 20, tigaPuluh = 30;
        int fpb = 1;
        for (int i = 1; i <= duaPuluh && i <= tigaPuluh; i++) {
            if (duaPuluh % i == 0 && tigaPuluh % i == 0) {
                fpb = i;
            }
        }
        System.out.println("Faktor Persekutuan Terbesar dari 20 dan 30: " + fpb);

        // Soal 5
        int kpt = 1;
        while (!(kpt % duaPuluh == 0 && kpt % tigaPuluh == 0)) {
            kpt++;
        }
        System.out.println("Kelipatan Persekutuan Terkecil dari 20 dan 30: " + kpt);
    }
}
