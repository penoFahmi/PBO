package learninheritance;

public class App {
    public static void main(String[] args) {
        Dad dad1 = new Dad();
        System.out.println("Dad punya mall sebanyak" + dad1.mall);
        System.out.println("Dad punya uang di BCA sebanyak " + dad1.moneyBCA);
        System.out.println("Dad mengambil uang kontrakan dari penyewa pertahun sebesar " + dad1.getUangKOntrakan());
        Brother bro1 = new Brother();
        System.out.println("Brother punya ruko sebanyak " + bro1.ruko);
        System.out.println("Brother punya uang di BCA sebanyak " + bro1.moneyBCA);
        System.out.println("Brother punya uang di BNI sebanyak " + bro1.moneyBNI);
        System.out.println("Brother punya saldo di Bank Sebanyak " + bro1.hitungSaldo());
        System.out.println("Brother mengambil uang kontrakan dari penyewa pertahun sebesar " + bro1.getUangKOntrakan());
        System.out.println("Brother mengambil uang kontrakan dan kos dari penyewa pertahun sebesar " + bro1.getUangKontrakanKos());
        //Sister sis1 = new Sister();
        //System.out.println("Brother punya uang di BCA sebanyak " + sis1.moneyBCA);
        //System.out.println("Dad mengambil uang kontrakan dari penyewa pertahun sebesar " + sis1.getUangKOntrakan());
    }
}
