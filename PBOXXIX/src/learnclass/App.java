package learnclass;

public class App {
    public static void main(String[] args) {
        House bintangHouse = new House();
        bintangHouse.houseNumber = "F4";
        bintangHouse.numberOFRooms = 3;
        bintangHouse.landArea = 200;
        bintangHouse.price = 200000000;
        bintangHouse.isCredit = false;
        bintangHouse.showInfo();
        System.out.println(bintangHouse.getPrice());

        House arisHouse = new House();
        arisHouse.houseNumber = "G4";
        arisHouse.numberOFRooms = 4;
        arisHouse.landArea = 389;
        arisHouse.price = 200000000;
        arisHouse.showInfo();
        arisHouse.isCredit = true;
        System.out.println(arisHouse.getPrice());

        Motor motorPCX = new Motor();
        motorPCX.jenis = "Matic";
        motorPCX.merk = "Yamaha";
        motorPCX.harga = 32000000;
        motorPCX.isCash = true;
        System.out.println(motorPCX.getHarga());

        Motor motorXmax = new Motor();
        motorXmax.jenis = "Matic";
        motorXmax.merk = "Yamaha";
        motorXmax.harga = 60000000;
        motorXmax.isCash = false;
        System.out.println(motorXmax.getHarga());

        Kosmetik namaBedak = new Kosmetik();
        namaBedak.merk = "Wardah";
        namaBedak.jenis = "Sensitive";
        namaBedak.harga = 25000;
        System.out.println(namaBedak.harga);

        Kosmetik namalipstik = new Kosmetik();
        namalipstik.merk = "Manasui";
        namalipstik.jenis = "lip Mate";
        namalipstik.harga = 15000;
        System.out.println(namalipstik.harga);

    }
}
