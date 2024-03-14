public class IntroJava {
    public static void main(String[] args) {
        System.out.println("Aplikasi Basis Data Buku");

        //Deklarasi Variabel

        String judulBuku;
        judulBuku = "Dragon Ball Volume 1"; //Inisiasi
        int hargaBuku = 27000; //Deklarasi atau inisiasi atau penetapan
        byte stokBuku = 100; //
        boolean bukuTersedia = true;
        float diskonBuku = .1f;
        char gradeBuku = 'A';

        String warnaBaju = "Hitam";
        int hargeBaju = 150000;
        float diskonBaju = .2f;
        char ukuranBaju = 'M';

        //Operasi Aritmatika
        byte five = 5;
        byte twelve = 12;
        System.out.println(five + twelve);
        System.out.println(five + 23);
        System.out.println(156 + 23);
        byte seventeen = (byte) (five + twelve);
        System.out.println(seventeen);

        int hargaKomik = 20000;
        int hargaMajalah = 15000;
        int selisihHarga = hargaKomik - hargaMajalah;
        System.out.println(selisihHarga );

        int hargaIphone = 28000000;
        byte jumlahBeli = 3;
        float diskon = .1f;
        int hargaBayar = hargaIphone * jumlahBeli;
        System.out.println(hargaBayar);
        int setelahDiskon = (int) (hargaBayar - (hargaBayar * diskon));
        System.out.println(setelahDiskon);

        //Operasi Perbandingan

        byte usiaDina = 17;
        byte usiaRocky = 23;
        System.out.println(usiaDina > usiaRocky);
        System.out.println(usiaDina < usiaRocky);
        byte usiaSheila = 23;
        System.out.println(usiaSheila == usiaRocky);
        System.out.println(usiaSheila != usiaRocky);
        System.out.println(usiaSheila >= usiaRocky);

        //Operasi Logika
        boolean hariIniHujan = false;
        boolean macetDiJalan = true;
        System.out.println(hariIniHujan && macetDiJalan);
        System.out.println(hariIniHujan || macetDiJalan);
        System.out.println(!hariIniHujan);

        //String concetenation
        String firstName = "Joko";
        String lastName = "Widodo";
        int usia = 56;
        boolean masihHidup = true;
        System.out.println(firstName + "" + lastName + usia + masihHidup);

    }
}
