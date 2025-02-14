package com.finallyblockexecution;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator: ");
            int a = scanner.nextInt();

            System.out.println("Enter the denominator: ");
            int b = scanner.nextInt();

            int result = a/b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operation completed");
        }

    }
}
