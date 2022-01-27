public class BogoSort extends Timer
{
    static void Sort(int[] arr)
    {
        startTimer();

        for(;!isSorted(arr);)
            shuffle(arr);

        System.out.println(Long.toString(stopTimer()));
    }

    static void shuffle(int[] arr)
    {
        //Standard Fisher-Yates shuffle algorithm
        int i=arr.length-1;
        while(i>0)
            swap(arr,i--,(int)(Math.random()*i));
    }

    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static boolean isSorted(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
            if(arr[i]<arr[i-1])
                return false;
        return true;
    }
}