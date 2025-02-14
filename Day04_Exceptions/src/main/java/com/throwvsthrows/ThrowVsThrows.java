package com.throwvsthrows;

import java.io.IOException;
import java.util.Scanner;

public class ThrowVsThrows {
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if(amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: amount and rate must be positive");
        }

        double interest = amount * rate * years / 100.0 ;
        System.out.println("The interest for the amount: " + amount + " is: " + interest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the amount: ");
            double amount = scanner.nextDouble();

            System.out.println("Enter the rate: ");
            double rate = scanner.nextDouble();

            System.out.println("Enter the number of years: ");
            int years = scanner.nextInt();

            calculateInterest(amount, rate, years);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
