package com.bankingsystem;
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return accountNumber + ": $" + balance;
    }
}