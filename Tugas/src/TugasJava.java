public class TugasJava {
    public static void main(String[] args) {
        int mesin1_awal = 100;
        int mesin2_awal = 200;
        int tambah_per_jam = 50;
        int cetak_per_jam = 100;
        int jam = 5;

        int total_kertas = mesin1_awal + mesin2_awal + (tambah_per_jam * jam);
        int kali_cetak = jam / 2;
        int total_cetak = kali_cetak * cetak_per_jam;

        int sisa_mesin1 = total_kertas - total_cetak;
        int sisa_mesin2 = sisa_mesin1;

        System.out.println("Sisa kertas di mesin pertama pada jam kelima: " + sisa_mesin1);
        System.out.println("Sisa kertas di mesin kedua pada jam kelima: " + sisa_mesin2);

    }
}