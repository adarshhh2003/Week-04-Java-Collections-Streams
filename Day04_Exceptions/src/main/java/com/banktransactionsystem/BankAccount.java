package com.banktransactionsystem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!", (amount-balance));
        }
        if(amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        balance -= amount;
        System.out.println("Withdrawal Amount: " + amount);
    }

    public void deposit(double deposit) throws IllegalArgumentException {
        if(deposit < 0) {
            throw new IllegalArgumentException("Invalid balance!");
        }
        balance += deposit;
        System.out.println("Deposited Amount: " + deposit);
    }

    public double getBalance() {
        return balance;
    }
}
