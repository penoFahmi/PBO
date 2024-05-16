package learninheritance;

import java.sql.SQLOutput;

public class Dad extends GrandPa{
    int moneyBCA = 1000;
    byte kontrakan = 30;

    Dad() {
        System.out.println("Saya berasal dari suku Melayu");
    }

    int getUangKOntrakan() {
        int uangKontrakan = 50;
        return uangKontrakan * kontrakan;
    }

}
