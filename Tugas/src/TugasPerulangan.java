public class TugasPerulangan {
    public static void main(String[] args) {
        // Soal 1
        for (int i = 5; i <= 15; i += 2) {
            if (i == 11)continue;
            System.out.println("Deretan ke " + i);
        }
        System.out.println();

        // Soal 2
        int totalJumlah = 0;
        for (int i = 10; i >= 5; i--) {
            if (i == 8)continue;
            System.out.print(i + " ");
            totalJumlah += i;
        }
        System.out.println("\nTotal Jumlah: " + totalJumlah);
        System.out.println();

        // Soal 3
        int totalKali = 1;
        for (int i = 2; i <= 64; i *= 2) {
            System.out.print(i + " ");
            totalKali *= i;
        }
        System.out.println("\nTotal Kali: " + totalKali);
        System.out.println();

        // Soal 4
        int duaPuluh = 20;
        int tigaPuluh = 30;
        int fpb = 1;
        for (int i = 1; i <= duaPuluh && i <= tigaPuluh; i++) {
            if (duaPuluh % i == 0 && tigaPuluh % i == 0) {
                fpb = i;
            }
        }
        System.out.println("Faktor Persekutuan Terbesar dari 20 dan 30 adalah " + fpb);
        System.out.println();

        // Saol 5
        int kpk = (duaPuluh * tigaPuluh) / fpb;
        System.out.println("Kelipatan Persekutuan Terkecil dari 20 dan 30 adalah " + kpk);
    }
}
