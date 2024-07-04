package learngeneric;

public class LearnGenericMethod {
    public static void main(String[] args) {
        String[] arrayOfString = {"Lorem", "Ipsum", "Dolor"};
        System.out.println(ArrayHelper.count(arrayOfString));
        Integer[] arrayOfInt = {1, 2, 3};
        System.out.println(ArrayHelper.count(arrayOfInt));
    }
}
