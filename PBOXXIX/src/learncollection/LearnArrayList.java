package learncollection;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Student> class1A = new ArrayList<>();
        class1A.add(new Student("Adi"));
        class1A.add(new Student("Bisma"));
        class1A.add(new Student("Cantika"));
        for(Student student: class1A) {
            System.out.println(student.getName());
        }
    }
}
