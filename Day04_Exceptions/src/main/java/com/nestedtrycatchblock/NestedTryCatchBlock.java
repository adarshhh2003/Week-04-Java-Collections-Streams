package com.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the size: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the " + size + " elements: ");

            for(int i=0; i<size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Enter the retrieve index: ");
            int index = scanner.nextInt();

            try {
                System.out.println("The element at index: " + index + " is: " + arr[index]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid array index! " + e.getMessage());
            }

            try {
                System.out.println("Dividing the element: " + arr[index] + " by zero");
                int result = arr[index]/0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero! " + e.getMessage());
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
