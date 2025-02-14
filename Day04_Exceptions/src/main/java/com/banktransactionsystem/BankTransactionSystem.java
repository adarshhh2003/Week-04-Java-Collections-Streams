package com.banktransactionsystem;

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            System.out.println("Depositing: 50");
            account.deposit(50.0);
            System.out.println("New Balance: " + account.getBalance());
            System.out.println();

            System.out.println("Withdrawing: 200");
            account.withdraw(200.0);
            System.out.println("Withdrawl successful \nNew Balance: " + account.getBalance());

        } catch (InsufficientBalanceException e) {
            System.out.println("Shortfall: " + e.getAmount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
