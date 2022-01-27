public class Main {
    public static void main(String[] args) {
        int[] array = ArrayManager.New(50000, 100);

        MergeSort.mergeSort(array, 0, array.length-1);
        //ArrayManager.Print(array);
    }
}
