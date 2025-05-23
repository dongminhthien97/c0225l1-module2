package StopWatch;

import java.util.Random;

public class StopWatchTest {
    public static void main(String[] args) {
        int[] arrs = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = r.nextInt(100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i < arrs.length -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[j] < arrs[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arrs[i];
            arrs[i] = arrs[minIndex];
            arrs[minIndex] = tmp;
        }
        stopWatch.stop();

        System.out.println("Thoi gian thuc thi Selection Sort cho 100000 so la: " +
                stopWatch.getElapsedTime() + " milliseconds");
    }
}

