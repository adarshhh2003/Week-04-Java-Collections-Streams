package com.queueinterface.generatebinarynumber;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public static String generateBinary(int num) {
        StringBuilder sb = new StringBuilder();

        while(num>0) {
            int temp = num%2;
            sb.append(temp);
            num /= 2;
        }

        return sb.reverse().toString();
    }

    public static void generateBinaryNumbers(Queue<String > queue, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++) {
            String binary = generateBinary(i);
            queue.add(binary);
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int n=5;

        generateBinaryNumbers(queue, n);
        System.out.println("Binary number from 1 to " + n + " is: " + queue);
    }
}
