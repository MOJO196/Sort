public class Timer {
    static long startTime;

    public static void startTimer() {
       startTime = System.currentTimeMillis();
    }

    public static long stopTimer() {
        return System.currentTimeMillis() - startTime;
    }
}
