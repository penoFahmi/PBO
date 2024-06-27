package tugasclass;

public class Rekening {
    private double saldo;
    private String namaPemilik;

    public Rekening(double saldo, String namaPemilik) {
        this.saldo = saldo;
        this.namaPemilik = namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }
}
