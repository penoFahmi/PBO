public class Perulangan {
    public static void main(String[] args) {

        for (
                byte i = 1; i <= 10; i++) {
            System.out.println("Loncatan : " + i);
        }
        for (byte i = 20; i >= 10; i--) {
            System.out.println("Loncatan ke " + i);
        }
        for (byte i = 22; i <= 27; i++) {
            if (i == 24 ) {
                continue;
            }
            System.out.println("Loncatan ke " + i);
        }
        for (byte i = 5; i <= 13; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Hitungan ke " + i);
        }
        for (byte i = 1; i <= 20; i++) {
            if (i >=5 && i <= 15) {
                if (i % 2 == 0) {
                    continue;
                }
            }
            System.out.println("Hitungan ke " + i);
        }

        //while & dowhile
        byte angkaWhile = 1;
        while (angkaWhile <= 5) {
            System.out.println("WHILE ke : " + angkaWhile);
            angkaWhile++;
        }

        byte angkaDowWhile = 1;
        do {
            System.out.println("DO WHILE ke : " + angkaDowWhile);
            angkaWhile++;
        }while (angkaWhile <= 5);

        //array
        String[] students = {"ari","ida","tri"};
        byte[] ages = {18, 32, 23};
        char[] grades = {'A', 'C','B'};
        boolean[] genders = {true, false, true};
        int [] uangJajan = {100000, 150000, 20000};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        for (String student : students){
            System.out.println("Variabel siswa kali ini valuenye : " + student);
        }
        for (byte age : ages) {
            System.out.println(age);
        }
        for (char grade : grades) {
            System.out.println(grade);
        }
        for (boolean gender : genders) {
            System.out.println(gender);
        }
        for (int jajan : uangJajan ) {
            System.out.println(jajan);
        }


    }
}
