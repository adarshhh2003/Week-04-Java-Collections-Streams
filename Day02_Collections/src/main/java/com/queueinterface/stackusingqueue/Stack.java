package com.queueinterface.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

class Stack {
    private Queue<Integer> queue1;
    private  Queue<Integer> queue2;

    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int value) {
        queue1.add(value);
    }

    public int pop() {
        if(!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }

            int lastElement = queue1.poll();

            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }

            return lastElement;
        } else {
            throw new IndexOutOfBoundsException("No element in the stack");
        }
    }

    public int top() {
        if(!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }

            int lastElement = queue1.poll();
            queue1.add(lastElement);

            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }

            return lastElement;
        } else {
            throw new IndexOutOfBoundsException("Stack is Empty");
        }
    }

    public boolean isEmpty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
