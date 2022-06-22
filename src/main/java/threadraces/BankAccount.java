package threadraces;

public class BankAccount {
    //Code W4-15

    private double balance = 0;
    public void setBalance(double amount) {
        balance = amount;
    }
    //Code W4-15.3

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit2(double amount) {
        // Code W14-5
        if (amount < 0) {
            return;
        }
        System.out.println("despositing " + amount);
        synchronized (this) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
