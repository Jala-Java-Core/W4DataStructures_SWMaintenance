package threadraces;

public class MyThread1 extends Thread {
    //Code W4-14.1
    private BankAccount account;
    public MyThread1(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit2(100);
    }

    /*public void run() {
        account.setBalance(100);
    }*/



}
