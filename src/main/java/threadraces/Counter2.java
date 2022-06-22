package threadraces;

public class Counter2 {
    private int count1 = 0;
    private int count2 = 0;

    private Object lock1 = new Object();
    private Object lock2 = new Object();


    public void incrementCount1() {
        synchronized (lock1) {
            count1++;
        }
    }

    public void incrementCount2() {
        synchronized (lock2) {
            count2++;
        }
    }
}
