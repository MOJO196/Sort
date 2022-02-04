public class Search extends Timer {
    public static int BinarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length;
        int index = -1;

        for (; low <= high; ) {
            int mid = low + (high - low) / 2;
            if (array[mid] < value) {
                low = mid + 1;
            } else if (array[mid] > value) {
                high = mid - 1;
            } else if (array[mid] == value) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int LinarSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) if (i == value) return i;
        return  -1;
    }
}
