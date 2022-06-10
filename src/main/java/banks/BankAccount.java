package banks;

import banks.exceptions.NegativeBalanceException;
import banks.exceptions.NullArgumentException;

import java.lang.IllegalArgumentException;

import java.util.List;


public class BankAccount {
    // Code W4-7
    private double balance = 0;

    //Code W4-7.1
    public static final int NULL_ARGUMENT = -1;
    public static final int NEGATIVE_BALANCE = 2;
    public static final int SUCCESS = 0;
    private DataSource dataSource;

    public BankAccount(double initBalance) {
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    // retire
    public void withdraw(double amount) {
        double newBalance = this.balance - amount;
        if (newBalance >= 0) {
            this.balance = newBalance;
        }
    }

    //deposit
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void transfer(BankAccount other, double amount) {
        this.deposit(amount);
        other.withdraw(amount);
    }

    //code W4-7.1
    public int transfer2(BankAccount other, double amount) {
        if (other == null) {
            return BankAccount.NULL_ARGUMENT;
        } else if (this.balance < 0){
            return BankAccount.NEGATIVE_BALANCE;
        }
        this.deposit(amount);
        other.withdraw(amount);
        return BankAccount.SUCCESS;
    }

    //code W4-7.2
    public void transfer3(BankAccount other, double amount) {
        if (other == null) {
            throw new IllegalArgumentException("BalanceAccount is null");
        } else if (this.balance < 0) {
            throw new IllegalStateException("Balance is negative");
        }
        this.deposit(amount);
        other.withdraw(amount);
    }
    
    //Code W4-7.3
    public void transfer4(BankAccount other, double amount)
        throws NullArgumentException, NegativeBalanceException {
        if (other == null) {
            throw new NullArgumentException();
        } else if (this.balance < 0) {
            throw new NegativeBalanceException();
        }
        this.deposit(amount);
        other.withdraw(amount);
    }

    //Code w4-7.4
    public void transfer5(BankAccount other, double amount) {
        assert other != null;
        assert this.balance > 0;
        this.deposit(amount);
        other.withdraw(amount);
    }

    //Code W4-7.5
    public void transfer6(BankAccount other, double amount) {
        if (other == null) {return;}
        if (this.balance < 0) {return;}
        if (amount < 0) {return;}
        this.deposit(amount);
        other.withdraw(amount);
        assert this.balance >= 0;
    }

    //Code W4-7.6
    public int countMatcher(char letter) {
        int count = 0;
        List<String> names = dataSource.getAllNames();
        if  (names == null) {
            //We don't know what dataSource.getAllNames() do
            throw new IllegalStateException();
        }
        for (String name : names) {
            if (name == null) {
                //avoid to use null objects
                continue;
            }
            if (name.charAt(0) == letter) {
                count++;
            }
        }
        return count;
    }
}
