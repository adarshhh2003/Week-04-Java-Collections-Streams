package com.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the numerator: ");
            int a = input.nextInt();

            System.out.println("Enter the denominator: ");
            int b = input.nextInt();
            int result = a/b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Number can not be divided by zero: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input should be integer: " + e.getMessage());
        }

        System.out.println("Program Finished");
    }
}
