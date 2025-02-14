package com.customexception;

import java.util.Scanner;

public class CustomException {
    public static void validateAge(int age) throws InvalidAgeException{

        if(age<18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Accesss granted!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
