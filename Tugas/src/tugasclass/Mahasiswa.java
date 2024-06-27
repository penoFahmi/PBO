package tugasclass;

public class Mahasiswa {
    private String nama;
    private double IP;
    private int angkatan;

    public Mahasiswa(String nama, double IP, int angkatan) {
        this.nama = nama;
        this.IP = IP;
        this.angkatan = angkatan;
    }

    public Mahasiswa() {
        this("Fulan", 0.0, 2000);
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("IP: " + IP);
        System.out.println("Angkatan: " + angkatan);
    }

    public void tampilkanSisaMasaStudi() {
        int tahunSekarang = java.time.Year.now().getValue();
        int sisaMasaStudi = 4 - (tahunSekarang - angkatan);
        System.out.println("Sisa Masa Studi: " + sisaMasaStudi + " tahun");
    }

    public void tampilkanPredikat() {
        if (IP > 3) {
            System.out.println("Predikat: Dengan Pujian");
        } else {
            System.out.println("Predikat: Tidak Dengan Pujian");
        }
    }
}
