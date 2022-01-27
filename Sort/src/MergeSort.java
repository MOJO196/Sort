import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] newArray = {8, 5, 4, 2, 9, 11, 14, 2};

        Sort(newArray);
    }

    static int[] Sort(int[] array) {
        List<int[]> Layers = new ArrayList();

        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length; i += 2) {
                Layers.add(new int[]{array[i], array[i + 1]});
            }
        } else {

        }


        for (int i = 0; i < array.length; i++) {

        }

        return array;
    }
}
