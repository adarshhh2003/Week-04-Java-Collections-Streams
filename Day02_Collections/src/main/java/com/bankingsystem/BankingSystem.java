package com.bankingsystem;

import java.util.*;
public class BankingSystem {
    // HashMap to store customer accounts (AccountNumber -> Balance)
    private Map<String, BankAccount> accounts = new HashMap<>();

    // Queue to process withdrawal requests
    private Queue<String> withdrawalQueue = new LinkedList<>();

    // Add account to the system
    public void addAccount(String accountNumber, double balance) {
        BankAccount account = new BankAccount(accountNumber, balance);
        accounts.put(accountNumber, account);
    }

    // Request withdrawal
    public void requestWithdrawal(String accountNumber) {
        withdrawalQueue.add(accountNumber);
        System.out.println("Withdrawal request for account " + accountNumber + " added to the queue.");
    }

    // Process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            BankAccount account = accounts.get(accountNumber);
            if (account != null) {
                System.out.println("Processing withdrawal for account: " + accountNumber);
                account.withdraw(50); // Withdraw fixed amount of $50
            }
        }
    }

    // Display all accounts
    public void displayAccounts() {
        System.out.println("\nAll Accounts:");
        for (BankAccount account : accounts.values()) {
            System.out.println(account);
        }
    }

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();

        // Add some accounts
        system.addAccount("A001", 500.00);
        system.addAccount("A002", 1000.00);
        system.addAccount("A003", 150.00);

        // Display accounts
        system.displayAccounts();

        // Request withdrawals
        system.requestWithdrawal("A001");
        system.requestWithdrawal("A002");
        system.requestWithdrawal("A003");

        // Process withdrawals
        system.processWithdrawals();

        // Display accounts after withdrawals
        system.displayAccounts();
    }
}