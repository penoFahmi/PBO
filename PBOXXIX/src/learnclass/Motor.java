package learnclass;

public class Motor {
    String merk;
    String jenis;
    int harga;
    boolean isCash;

    int getHarga() {
        if (isCash) {
            harga -= 700000;
        }
        return harga;
    }
}
