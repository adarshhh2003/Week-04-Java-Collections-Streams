package com.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the size: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the " + size + " number: ");

            for(int i=0; i<size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Enter the index to retrieve value: ");
            int index = scanner.nextInt();

            System.out.println("Value at index: " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized! " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
