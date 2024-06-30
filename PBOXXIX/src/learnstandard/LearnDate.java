package learnstandard;

import java.util.Date;
public class LearnDate {
    public static void main(String[] args) {
        Date date = new Date();
        long milisecond = date.getTime();
        System.out.println(date);
        System.out.println(milisecond);
    }
}
