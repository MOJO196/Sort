public class BinarySearch extends Timer{
    public static int Search(int[] array, int value) {
        startTimer();

        int index = (int)(array.length-1);
        int newSize = array.length;

        for (;;) {
            newSize /= 2;
            if          (array[index] < value) index += newSize;
            else if     (array[index] > value) index -= newSize + 1;
            else break;
        }

        System.out.println(stopTimer());
        return index;
    }
}
