package learnstandard;

import java.util.Random;

public class LearnRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println(randomInt);
        int randomIntZeroToNine = random.nextInt(9);
        System.out.println(randomInt);
    }
}