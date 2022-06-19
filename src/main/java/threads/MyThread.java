package threads;

public class MyThread extends SomethingElse implements Runnable {
    // Code W4-13
    private int howMany;

    public MyThread(int howMany) {
        this.howMany = howMany;
    }

    public void run() {
        for (int i = 0 ; i< howMany; i++) {
            System.out.println(i);
        }
    }
}
