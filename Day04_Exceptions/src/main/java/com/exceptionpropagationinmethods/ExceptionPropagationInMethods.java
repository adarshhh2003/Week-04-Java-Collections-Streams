package com.exceptionpropagationinmethods;

import java.util.Scanner;

public class ExceptionPropagationInMethods {
    public static void method1(int numerator, int denominator) {
        int result = numerator/denominator;
        System.out.println(result); // It will not print when divide by zero
    }

    public static void method2(int numerator, int denominator) {
        method1(numerator, denominator);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.println("Enter the denominator: ");
            int denominator = scanner.nextInt();

            method2(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
