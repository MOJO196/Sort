public class Main {
    public static void main(String[] args) {
        int[] newArray = Array.New(100, 100);

        newArray = BubbleSort.Sort(newArray);
        Array.Print(newArray);
        System.out.println(Array.GetAverage(newArray));
    }
}
