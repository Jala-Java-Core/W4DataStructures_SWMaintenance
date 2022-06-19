package threads;

public class SimpleThread extends Thread {
    // Code W4-13
    private int howMany;

    public SimpleThread(int howMany) {
        this.howMany = howMany;
    }

    public void run() {
        for (int i = 0 ; i < howMany; i++) {
            System.out.println(i);
        }
    }
}
