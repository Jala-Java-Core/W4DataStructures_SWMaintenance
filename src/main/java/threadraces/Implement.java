package threadraces;

public class Implement {
    BankAccount myAccount;

    public void setBalance() {
        myAccount = new BankAccount();
        MyThread1 t1 = new MyThread1(myAccount);
        MyThread2 t2 = new MyThread2(myAccount);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myAccount.getBalance());
    }
}
