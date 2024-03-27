public class TugasControlFlow {
    public static void main(String[] args) {

        //Soal 1
        int usiaAni = 17;
        boolean punyaKTP = true;
        if (usiaAni >= 17) {
            System.out.println("Apakah Ani punya KTP " + punyaKTP);
        } else {
            System.out.println("Ani belum punya KTP");
        }

        //Soal 2
        int bilanganBulat = 7;
        if (bilanganBulat % 2 == 0) {
            System.out.println("Ini bilangan genap");
        } else {
            System.out.println("Ini bilangan ganjil");
        }

        //Soal 3
        double hargaBarang = 150000;
        int jumlahBeli = 10;
        String pesanError;
        if (jumlahBeli <= 0) {
            pesanError = "Minimal pesan satu";
        } else {
            double totalBiaya = hargaBarang * jumlahBeli;
            System.out.println("Total biaya yang harus dibayar: " + totalBiaya);
        }

        //Soal 4
        String statusAngka = (bilanganBulat % 2 != 0) ? "Ini bilangan ganjil." : "Ini bilangan genap.";
        String pesan = (jumlahBeli <= 0) ? "Minimal pesan satu" : ("Total biaya yang harus dibayar: " + (hargaBarang * jumlahBeli));
        System.out.println("Status angka: " + statusAngka);
        System.out.println("Pesan: " + pesan);


        //Soal 5
        int nilaiAngka = 89;
        String pesanNilai;
        if (nilaiAngka <= 49) {
            pesanNilai = "Buruk";
        } else if (nilaiAngka <= 60) {
            pesanNilai = "Baik";
        } else {
            pesanNilai = "Sangat Baik";
        }
        System.out.println("Pesan untuk nilai " + nilaiAngka + ": " + pesanNilai);
    }

}
