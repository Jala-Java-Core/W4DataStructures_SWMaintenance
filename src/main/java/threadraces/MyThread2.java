package threadraces;

public class MyThread2 extends Thread {
    //Code W4-14-1
    private BankAccount account;
    public MyThread2(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit2(200);
    }

    /*public void run() {
        account.setBalance(200);
    }*/


}
