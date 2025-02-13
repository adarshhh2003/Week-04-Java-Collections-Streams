package com.queueinterface.stackusingqueue;


public class StackUsingQueue {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);
        stack.push(8);

        System.out.println("Remove Element: " + stack.pop());

        System.out.println("Top Element: " + stack.top());
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nIsEmpty: " + stack.isEmpty());
    }
}
