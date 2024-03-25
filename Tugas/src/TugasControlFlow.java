public class TugasControlFlow {
    public static void main(String[] args) {

        //Soal 1
        int usiaAni = 15;
        boolean punyaKTP = true;
        if (usiaAni >= 17) {
            System.out.println("Ani punya KTP " + punyaKTP);
        } else {
            System.out.println("Ani belum punya KTP");
        }

        //Soal 2
        int bilanganBulat = 7;
        if (bilanganBulat % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Ini bilangan ganjil");
        }

        //Soal 3
        int hargaBarang = 150000;
        int jumlahBeli = 10;
        int total = hargaBarang * jumlahBeli;
        if ( total > 0) {
            System.out.println("Total belanja kamu adalah : " + total);
        } else {
            System.out.println("mohon beli dulu barang yang ada");
        }

        //Soal 4
        //Soal 5
    }

}
