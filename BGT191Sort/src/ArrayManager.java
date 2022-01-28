public class ArrayManager {

    public static int[] DefaultCase(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = 0 + (int) (Math.random() * length);
        }
        return array;
    }

    public static int[] BestCase(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] WorstCase(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = length-i-1;
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
