package threads;

import java.util.Arrays;

public class Implement {
    // Code W4-13
    public void execution() {
        MyThread mt = new MyThread(10);
        Thread t = new Thread(mt);
        t.start(); // launches new thread and invokes mt.run();
        // .. this code continues while mt.run() executes in parallel
        System.out.println("parallel");
    }
    // Code W4-13
    public void executionSimpleThread() {
        SimpleThread t = new SimpleThread(10);
        t.start();
    }

    //Code W4-14
    public int addArray(int[] array) {
        int midpoint = array.length / 2;

        //split array half
        int [] firstHalf = Arrays.copyOfRange(array, 0, midpoint);
        int [] secondHalf = Arrays.copyOfRange(array, midpoint, array.length);

        AdderThread firstAdder = new AdderThread(firstHalf);
        AdderThread secondAdder = new AdderThread(secondHalf);

        firstAdder.start();
        secondAdder.start();

        try {
            firstAdder.join();
            secondAdder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int firstSum = firstAdder.getSum();
        int secondSum = secondAdder.getSum();

        return firstSum += secondSum;
    }
}
