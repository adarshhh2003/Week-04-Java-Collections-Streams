package com.banktransactionsystem;

public class InsufficientBalanceException extends Exception{
    private double amount;

    public InsufficientBalanceException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
