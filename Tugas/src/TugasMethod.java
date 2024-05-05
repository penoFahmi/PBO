public class TugasMethod {
    public static void main(String[] args) {
        // Contoh penggunaan method
        int angka1 = 5;
        int angka2 = 8;
        int angka3 = 9;

        System.out.println("Apakah " + angka1 + " bilangan prima? " + (isPrime(angka1) ? "Ya" : "Tidak"));
        System.out.println("Total digit dari " + angka1 + " adalah " + countDigits(angka1));

        double mean = calculateMean(angka1, angka2, angka3);
        int total = calculateTotal(angka1, angka2, angka3);
        int min = findMin(angka1, angka2, angka3);
        int max = findMax(angka1, angka2, angka3);

        System.out.println("Nilai mean: " + mean + " total: " + total + " min: " + min + " max: " + max);

        int hari = 1;
        System.out.println("Hari ke-" + hari + " adalah " + getDayName(hari));

        int angka = 12345;
        System.out.println("Angka " + angka + " setelah dibalik: " + reverseNumber(angka));
    }

    // Method untuk menentukan apakah sebuah angka merupakan bilangan prima
    public static boolean isPrime(int number) {
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

    // Method untuk mencari nilai minimum dari tiga angka
    public static int findMin(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // Method untuk mencari nilai maksimum dari tiga angka
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    // Method untuk mendapatkan nama hari berdasarkan angka 1-7
    public static String getDayName(int day) {
        switch (day) {
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

    // Method untuk memutarbalikkan angka
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
