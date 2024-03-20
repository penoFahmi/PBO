public class TugasJava1 {
    public static void main(String[] args) {

        // Soal 1
        //Deklarasi
        int lembarKertasMesin1 = 100;
        int lembarKertasMesin2 = 200;
        int tambahKertasPerJam = 50;
        int cetakKertasSetiap2Jam = 100;

        // Perhitungan kertas pada jam kelima
        int jam = 5;
        int totalLembarMesin1 = lembarKertasMesin1 + (jam - 1) * tambahKertasPerJam;
        int totalLembarMesin2 = lembarKertasMesin2 + (jam - 1) * tambahKertasPerJam;
        int sisaKertasMesin1 = totalLembarMesin1 - (jam / 2) * cetakKertasSetiap2Jam;
        int sisaKertasMesin2 = totalLembarMesin2 - (jam / 2) * cetakKertasSetiap2Jam;
        System.out.println("Sisa kertas pada mesin pertama : " + sisaKertasMesin1);
        System.out.println("Sisa kertas pada mesin kedua: " + sisaKertasMesin2);

        // Soal 2
        // Jumlah buku yang dibaca setiap minggu
        int buku_senin = 3;
        int buku_rabu = 2;
        int buku_sabtu = 4;

        // Menghitung rerata buku per hari
        int total_buku_per_minggu = buku_senin + buku_rabu + buku_sabtu;
        double rerata_buku_per_hari = (double) total_buku_per_minggu / 7;

        // Menghitung jumlah buku dalam sebulan
        int buku_per_bulan = total_buku_per_minggu * 4;

        // Menampilkan hasil
        System.out.println("Rerata buku per hari yang dibaca: " + rerata_buku_per_hari);
        System.out.println("Jumlah buku yang berhasil dibaca dalam sebulan: " + buku_per_bulan);

        // Soal 3
        // Usia Ani, Adam, dan Ari
        int usia_ani = 17;
        int usia_adam = 21;
        int usia_ari = 5;

        // Mengecek perbandingan usia
        boolean ani_lebih_tua_dari_ari = usia_ani > usia_ari;
        boolean adam_lebih_muda_dari_ani = usia_adam < usia_ani;

        // Menghitung usia Ani sekarang
        int usia_ani_sekarang = usia_ani + 5;

        // Mengecek perbandingan usia Ani dengan Adam + Ari
        boolean ani_lebih_tua_dari_adam_ari = (usia_adam + usia_ari) < usia_ani;

        // Menampilkan hasil
        System.out.println("Apakah Ani lebih tua dari Ari? " + ani_lebih_tua_dari_ari);
        System.out.println("Apakah Adam lebih muda dari Ani? " + adam_lebih_muda_dari_ani);
        System.out.println("Usia Ani sekarang: " + usia_ani_sekarang);
        System.out.println("Apakah total usia Adam dan Ari lebih kecil dari usia Ani? " + ani_lebih_tua_dari_adam_ari);

        // Soal 4
        // Deklarasi variable
        int harga_kertas = 100;
        double diskon_kertas = 0.1;
        int stok_kertas = 1000;
        int jumlah_kertas_dibeli = 200;

        // Menghitung total harga dengan diskon
        double total_harga = harga_kertas * jumlah_kertas_dibeli * (1 - diskon_kertas);

        // Menampilkan hasil
        System.out.println("Anda harus membayar sebesar " + total_harga + " rupiah untuk " + jumlah_kertas_dibeli + " lembar kertas.");

        // Soal 5
        // Deklarasi variable dan casting
        String harga_buku_str = "15000";
        int harga_buku_int = Integer.parseInt(harga_buku_str);
        String diskon_buku_str = "0.15";
        double diskon_buku_double = Double.parseDouble(diskon_buku_str);

        // Menghitung harga buku setelah mendapat diskon
        double harga_setelah_diskon = harga_buku_int * (1 - diskon_buku_double);

        // Menampilkan hasil
        System.out.println("Harga buku setelah mendapat diskon: " + harga_setelah_diskon);
    }
}
