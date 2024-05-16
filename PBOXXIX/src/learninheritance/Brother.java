package learninheritance;

public class Brother extends Dad{
    int moneyBCA = 1;
    int moneyBNI = 10;
    int kos = 5;

    Brother() {
        super();
        System.out.println("Tapi kini saya jadi suku Batak");
    }

    int hitungSaldo() {
        return moneyBCA + super.moneyBCA + moneyBNI;
    }

    int getUangKontrakanKos() {
        int uangKontrakan = super.getUangKOntrakan();
        int uangKos = kos * 3;
        return uangKontrakan + uangKos;
    }



}
