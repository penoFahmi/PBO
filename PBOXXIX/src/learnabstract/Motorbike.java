package learnabstract;

public class Motorbike { // Outer

    static boolean engineUp;

    static void getEngineSound() {
        System.out.println("Brrmmmm");
    }

    static class Engine { // Inner

        boolean raiseEngineUp() {
            return engineUp;
        }

        void getMoreEngineSound() {
            getEngineSound();
        }
    }
}
