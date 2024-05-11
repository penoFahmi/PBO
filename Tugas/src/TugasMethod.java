public class TugasMethod {
    public static void main(String[] args) {
        // Deklarasi Method
        int angka1 = 5;
        int angka2 = 8;
        int angka3 = 9;
        int angka4 = 44;

        System.out.println("Soal nomor 1");
        System.out.println("Apakah " + angka2 + " bilangan prima? " + (isPrima(angka2) ? "Ya" : "Tidak"));
        System.out.println("Soal nomor 2");
        System.out.println("Total digit dari " + angka4 + " adalah " + countDigits(angka4));

        double mean = calculateMean(angka1, angka2, angka3);
        int total = calculateTotal(angka1, angka2, angka3);
        int min = findMin(angka1, angka2, angka3);
        int max = findMax(angka1, angka2, angka3);

        System.out.println("Soal nomor 3");
        System.out.println("Nilai mean: " + mean );
        System.out.println(" total: " + total );
        System.out.println(" min: " + min);
        System.out.println(" max: " + max);

        System.out.println("Soal nomor 4");
        int hari = 1;
        System.out.println("Hari ke-" + hari + " adalah " + getNamaHari(hari));

        System.out.println("Soal nomor 5");
        int angka = 12345;
        System.out.println("Angka " + angka + " setelah dibalik: " + balikAngka(angka));
    }

    // Method untuk menentukan apakah sebuah angka merupakan bilangan prima
    public static boolean isPrima(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method untuk menghitung total digit suatu bilangan
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method untuk menghitung nilai mean dari tiga angka
    public static double calculateMean(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
    // Method untuk menghitung total dari tiga angka
    public static int calculateTotal(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    // Method untuk mencari nilai mindari tiga angka
    public static int findMin(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
    // Method untuk mencari nilai max dari tiga angka
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    // Menampilkan nama hari berdasarkan angka 1-7. Misal: input 1 output Senin.
    public static String getNamaHari(int hari) {
        switch (hari) {
            case 1:
                return "Senin";
            case 2:
                return "Selasa";
            case 3:
                return "Rabu";
            case 4:
                return "Kamis";
            case 5:
                return "Jumat";
            case 6:
                return "Sabtu";
            case 7:
                return "Minggu";
            default:
                return "Hari tidak valid";
        }
    }

    // Memutarbalikkan angka. Misal: input 12345 output 54321.
    public static int balikAngka(int angka) {
        int balik = 0;
        while (angka != 0) {
            int digit = angka % 10;
            balik = balik * 10 + digit;
            angka /= 10;
        }
        return balik;
    }
}
