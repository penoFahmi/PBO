public class TugasJava1 {
    public static void main(String[] args) {

        // Soal 1
        int lembarKertasMesin1 = 100;
        int lembarKertasMesin2 = 200;
        int tambahanKertasPerJam = 50;
        int cetakKertasSetiapDuaJam = 100;

        int jam = 5;
        int totalKertasMesin1 = lembarKertasMesin1 + (jam - 1) * tambahanKertasPerJam;
        int totalKertasMesin2 = lembarKertasMesin2 + (jam - 1) * tambahanKertasPerJam;
        int sisaKertasMesin1 = totalKertasMesin1 - (jam / 2) * cetakKertasSetiapDuaJam;
        int sisaKertasMesin2 = totalKertasMesin2 - (jam / 2) * cetakKertasSetiapDuaJam;

        System.out.println("Sisa kertas pada mesin pertama : " + sisaKertasMesin1);
        System.out.println("Sisa kertas pada mesin kedua : " + sisaKertasMesin2);

        // Soal 2
        int bukuSenin = 3;
        int bukuRabu = 2;
        int bukuSabtu = 4;

        int totalBukuPerMinggu = bukuSenin + bukuRabu + bukuSabtu;
        double rerataBukuPerHari = (double) totalBukuPerMinggu / 7;
        int bukuPerBulan = totalBukuPerMinggu * 4;

        System.out.println("Rerata buku per hari yang dibaca: " + rerataBukuPerHari);
        System.out.println("Jumlah buku yang berhasil dibaca dalam sebulan: " + bukuPerBulan);

        // Soal 3
        int usiaAni = 17;
        int usiaAdam = 21;
        int usiaAri = 5;

        boolean aniLebihTuaDariAri = usiaAni > usiaAri;
        boolean adamLebihMudaDariAni = usiaAdam < usiaAni;
        int usiaAniSekarang = usiaAni + 5;
        boolean usiaAdamAriLebihTuaDariAni = (usiaAdam + usiaAri) > usiaAni;

        System.out.println("Apakah Ani lebih tua dari Ari? " + aniLebihTuaDariAri);
        System.out.println("Apakah Adam lebih muda dari Ani? " + adamLebihMudaDariAni);
        System.out.println("Usia Ani sekarang: " + usiaAniSekarang);
        System.out.println("Apakah total usia Adam dan Ari lebih tua dari Ani? " + usiaAdamAriLebihTuaDariAni);

        // Soal 4
        int hargaKertas = 100;
        float diskonKertas = 0.1f;
        int stokKertas = 1000;
        int jumlahKertasDibeli = 200;
        int totalHarga = (int) (hargaKertas * jumlahKertasDibeli * (1 - diskonKertas));

        System.out.println("Anda harus membayar sebesar " + totalHarga + " rupiah untuk " + jumlahKertasDibeli + " lembar kertas.");

        // Soal 5
        String hargaBuku = "15000";
        int hargaBukuInt = Integer.parseInt(hargaBuku);
        System.out.println("Casting String ke int : " + hargaBukuInt);

        String diskonBuku = "0.15f";
        float diskonBukuFloat = Float.parseFloat(diskonBuku);
        System.out.println("Casting String ke Double :" + diskonBukuFloat);

        float hargaSetelahDiskon = hargaBukuInt * (1 - diskonBukuFloat);
        System.out.println("Harga buku setelah diskon: " + hargaSetelahDiskon);
    }
}
