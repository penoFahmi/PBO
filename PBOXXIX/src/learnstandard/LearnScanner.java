package learnstandard;

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tanggal lahir: ");
        int tanggalLahir = scanner.nextInt();
        int usia = 2022 - tanggalLahir;
        System.out.println("Usia Anda " + usia);
    }
}
