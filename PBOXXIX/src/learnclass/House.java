package learnclass;

public class House {
    //Field
    String houseNumber;
    byte numberOFRooms;
    int landArea;
    int price;
    boolean isCredit;

    int getPrice() {
        if (isCredit) {
            price += (price * .25);
        }
        return price;
    }


    void showInfo() {
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Room: " + numberOFRooms);
        System.out.println("Land Area: " + landArea);
    }
}