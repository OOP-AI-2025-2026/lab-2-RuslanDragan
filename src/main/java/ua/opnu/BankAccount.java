package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    double getBalance() {
        return balance;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) { // >= важливо
            balance -= amount + transactionFee;
            return true;
        }
        return false;
    }


    boolean transfer(BankAccount receiver, double amount) {
        if (amount > 0 && balance >= amount + transactionFee) { // >= важливо
            balance -= amount + transactionFee;
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}