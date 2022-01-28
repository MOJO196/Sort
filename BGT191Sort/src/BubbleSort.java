public class BubbleSort extends Timer{

    public static int[] Sort(int[] array) {

        startTimer();

        int smaller;
        int bigger;
        boolean run = true;

        for (int i = 0; i < array.length && run == true; i++) {
            run = false;

            for (int y = 0; y < array.length - 1; y++) {
                if (array[y] > array[y + 1]) {
                    bigger = array[y];
                    smaller = array[y + 1];
                    array[y] = smaller;
                    array[y + 1] = bigger;
                    run = true;
                }
            }
        }
        System.out.println(Long.toString(stopTimer()));
        return array;
    }
}
