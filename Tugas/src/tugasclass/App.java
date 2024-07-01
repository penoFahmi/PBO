package tugasclass;

public class App {
    public static void main(String[] args) {
        // Inisialisasi obyek dari class Rekening
        Rekening rekening = new Rekening(1000000.0, "Budi");
        System.out.println("Nama Pemilik Rekening: " + rekening.getNamaPemilik());
        System.out.println("Saldo Rekening: " + rekening.getSaldo());

        // Inisialisasi obyek dari class Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Alice", 3.5, 2020);
        Mahasiswa mahasiswa2 = new Mahasiswa("Bob", 2.8, 2019);

        // Menampilkan informasi mahasiswa
        mahasiswa1.tampilkanInfo();
        mahasiswa1.tampilkanSisaMasaStudi();
        mahasiswa1.tampilkanPredikat();
        mahasiswa2.tampilkanInfo();
        mahasiswa2.tampilkanSisaMasaStudi();
        mahasiswa2.tampilkanPredikat();
    }
}
