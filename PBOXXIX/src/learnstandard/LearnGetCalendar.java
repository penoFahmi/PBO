package learnstandard;


import java.util.Calendar;

public class LearnGetCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println("Tanggal " + calendar.get(Calendar.DATE));
        System.out.println("Bulan " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun " + calendar.get(Calendar.YEAR));
    }
}
