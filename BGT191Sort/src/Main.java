public class Main {
    public static void main(String[] args) {
        //cases
        //int[] array = ArrayManager.DefaultCase(10000000);
        int[] array = ArrayManager.BestCase(100000000);
        //int[] array = ArrayManager.WorstCase(100000000);

        //debug array
        //ArrayManager.Print(array);
        //System.out.println("\n----- \n");

        BinarySearch.Search(array, 56);

        //sorting-algorithms
        //BubbleSort.Sort(array);
        //MergeSort.Sort(array, 0, array.length-1);
        //CountingSort.Sort(array, array.length);

        //bogo
        //int[] array = ArrayManager.DefaultCase(10);
        //BogoSort.Sort(array); //array length should be lower than 12!

        //debug
        //ArrayManager.Print(array);
    }
}