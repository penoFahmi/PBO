public class ifStatement {
    public static void main(String[] args) {
        //IF Statement
        if (false) {
            System.out.println("Kode di baris ini dieksekusi");
        }

        boolean hariIniHujan = false;
        if (hariIniHujan) {
            System.out.println("Saya siapkan mantel!");
        }

        byte usiaSaya = 17;
        byte usiaDia = 19;
        if (usiaSaya == usiaDia) {
            System.out.println("Saya dan dia seumuran");
        }

        boolean sayaSukaDia = true;
        boolean diaSukaSaya = true;
        if (sayaSukaDia == diaSukaSaya)  {
            System.out.println("Kami jadian");
        }

        byte jumlahBeli = 10;
        float diskon;
        if (jumlahBeli >= 10) {
            diskon = .1f;
            float jumlahBayar = (jumlahBeli * 100000) - (jumlahBeli * 100000 * diskon);
            System.out.println(jumlahBayar);
        }

        byte jumlahPesanan = 10;
        boolean bungkus = false;
        int hargaPesanan = 100000;
        float diskonPesanan = .25f;
        if (jumlahPesanan > 3) {
            if (bungkus) {
                float jumlahBayar = (jumlahPesanan * hargaPesanan) - (jumlahPesanan * hargaPesanan * diskonPesanan);
                System.out.println(jumlahBayar);
            }
        }

        boolean adaMakul =true;
        if (adaMakul == false) {
            System.out.println("Yuk, ke kampus");
        } else {
            System.out.println("Kita mabar di reformasi");
        }

        char nilaiPBO = 'A';
        if (nilaiPBO == 'A') {
            System.out.println("Luar biasa");
        } else if (nilaiPBO == 'B'){
            System.out.println("Bagus sekali");
        } else if (nilaiPBO == 'C'){
            System.out.println("Cukup");
        } else if (nilaiPBO == 'D'){
            System.out.println("Kurang");
        } else if (nilaiPBO == 'E'){
            System.out.println("Gagal");
        } else {
            System.out.println("Error! Masukan huruf nilai yang benar");
        }

        //Peno
        int jarakTempuh = 50000;
        if (jarakTempuh > 5000) {
            System.out.println("Silahkan servis motor anda!");
        } else if (jarakTempuh < 5000) {
            System.out.println("Tidak perlu servis motor anda!");
        }

        boolean oliKering = true;
        if (oliKering == true) {
            System.out.println("Silahkan ganti oli anda!");
        } else {
            System.out.println("Tidak perlu ganti oli!");
        }

        //tenary if
        byte nilaiAngkaPBO = 70;
        String keputusanMakul= ( nilaiAngkaPBO >= 50) ? "Lulus" : "Gagal";
        System.out.println("PBO" + keputusanMakul);

        boolean punyaKTP = false;
        int kemungkinanUsia = (punyaKTP) ? 17 : 16;
        System.out.println("Kemungkinan usia yang punya : " + kemungkinanUsia);

        boolean punyaMobil = false;
        boolean dariKeluargaMenengahKebawah = (punyaMobil) ? false : true;
        System.out.println("Dari keluarga menengah kebawah : " + dariKeluargaMenengahKebawah);

        char nilaiHurufPWL = 'A';
        switch (nilaiHurufPWL) {
            case 'A' :
                System.out.println("Sempurna");
                break;
            case 'B' :
                System.out.println("Baik");
                break;
            case 'C' :
                System.out.println("Cukup");
                break;
            case 'D' :
                System.out.println("Kurang");
                break;
            case 'E' :
                System.out.println("Gagal");
                break;
            default :
                System.out.println("Huruf Salah");
        }

    }
}
