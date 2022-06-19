package threads;

import java.util.Arrays;

public class AdderThread extends Thread {
    // Code w4-14
    private int[] array;
    private int sum;

    public AdderThread(int[] array) {
        this.array = array;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    public void run() {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    }
}
