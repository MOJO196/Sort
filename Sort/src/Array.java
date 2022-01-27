import java.util.concurrent.ThreadLocalRandom;

public class Array {
    public static int[] New(int length, int max) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = 0 + (int) (Math.random() * max);
        }

        return array;
    }


    public static void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static float GetAverage(int[] array) {
        float value = 0;

        for (int i = 0; i < array.length; i++) {
            value += array[i];
        }
        return value / array.length;
    }
}
